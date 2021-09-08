package com.rmcgo.hibernate.helloworld;

import com.rmcgo.hibernate.entity.News;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.jdbc.Work;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
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

	@Test
	public void testDoWork() {
		session.doWork(new Work() {
			public void execute(Connection connection) throws SQLException {
				System.out.println(connection);
			}
		});
	}

	@Test
	public void testEvict() {
		News news = session.get(News.class, 1);
		News news2 = session.get(News.class, 4);
		news.setTitle("news1");
		news2.setTitle("news2");
		session.evict(news);
	}

	@Test
	public void testDelete() {
//		News news = new News("helloworld", "rmcgo", new Date());
//		news.setId(3);
		News news = session.find(News.class, 2);
		session.delete(news);
	}

	// 临时对象用save，游离态用update（有OID）
	@Test
	public void testSaveOrUpdate() {
		News news = new News("CCC", "rmc", new Date());
		news.setId(199);
		session.saveOrUpdate(news);
	}

	// 更新游离态时需要使用update，持久化的不用，因为commit操作之前会执行一次flush操作
	@Test
	public void testUpdate() {
		News news = session.get(News.class, 1);

		transaction.commit();
		session.close();

		session = sessionFactory.openSession();
		transaction = session.beginTransaction();

		news.setAuthor("oracle");
		session.update(news);
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
