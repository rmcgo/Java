package com.rmcgo.hibernate.helloworld;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * rmcgo 2021/9/5
 */
public class HibernateTest {
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

	//lazy
	//没有的记录，如果用到了返回exception
	@Test
	public void testLoad() {
		News news = session.load(News.class, 10);
		System.out.println(news.getClass().getName());
		System.out.println(news);
	}

	//eager
	//没有的记录，返回null
	@Test
	public void testGet() {
		News news = session.get(News.class, 10);
		System.out.println(news);
	}

	//和save方法的区别：persist之前如果已经有id了，则不会执行insert操作
	@Test
	public void testPersist() {
		News news = new News();
		news.setAuthor("xiaohei");
		news.setDate(new Date());
		news.setTitle("xiaohei 学习计划");
		news.setId(100);
		System.out.println(news);
		session.persist(news);
		System.out.println(news);
	}

	//游离变为持久
	//为对象分配id
	//持久化的id是不能修改的
	@Test
	public void testSave() {
		News news = new News();
		news.setAuthor("rmcgo");
		news.setDate(new Date());
		news.setTitle("rmc 学习计划");
		System.out.println(news);

		session.save(news);
		System.out.println(news);
	}

	@Test
	public void test() {
		News news = session.get(News.class, 1);
		news.setAuthor("Oracle");
	}

}
