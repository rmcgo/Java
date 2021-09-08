package com.rmcgo.hibernate.helloworld;

import com.rmcgo.hibernate.entity.Customer;
import com.rmcgo.hibernate.entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManyToOneTest {
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;

	@Before
	public void init() {
		Configuration configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
	}

	@After
	public void destory() {
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void testUpdate() {
		Order order = session.get(Order.class, 1);
		order.getCustomer().setCustomerName("rmcgo2");

	}

	@Test
	public void testManyToOne2() {
		Order order = session.find(Order.class, 1);
		System.out.println(order.getCustomer().getCustomerName());

		System.out.println("----------");

		Customer customer = session.find(Customer.class, 1);
		System.out.println(customer);
	}

	@Test
	public void testManyToOne(){
		Customer customer = new Customer();
		customer.setCustomerName("rmcgo");
		Order order = new Order();
		Order order1 = new Order();
		order.setOrderName("order");
		order1.setOrderName("order1");
		order.setCustomer(customer);
		order1.setCustomer(customer);

		session.save(customer);
		session.save(order);
		session.save(order1);
	}
}
