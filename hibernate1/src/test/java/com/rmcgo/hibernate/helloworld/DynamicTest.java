package com.rmcgo.hibernate.helloworld;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.util.Date;

/**
 * rmcgo 2021/9/8
 */
public class DynamicTest {
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
	public void testBlob() throws IOException {

	}

	@Test
	public void testIdGenerator() throws InterruptedException {
		News news = new News("a", "da", new Date());
		session.save(news);
//		Thread.sleep(5000);
	}

	@Test
	public void testDynamicUpdate() {
		News news = session.find(News.class, 4);
		news.setAuthor("121");
	}
}
