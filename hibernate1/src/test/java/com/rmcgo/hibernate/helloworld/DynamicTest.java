package com.rmcgo.hibernate.helloworld;

import com.rmcgo.hibernate.entity.News;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
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
		double sum = 0.0;
		for (double i = 1; i <= 100; i++) {
			sum += 1 / i;
		}
		System.out.println(sum);
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
