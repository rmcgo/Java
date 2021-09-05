package com.rmcgo.hibernate.helloworld;

import javassist.compiler.Javac;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.Date;

/**
 * rmcgo 2021/9/5
 */
public class NewsTest {
	@Test
	public void test() {
		//评价：真麻烦啊！
		// 1. 创建SessionFactory
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory ourSessionFactory = configuration.buildSessionFactory();
		// 2. 创建Session
		Session session = ourSessionFactory.openSession();

		// 3. 开启事务
		Transaction transaction = session.beginTransaction();

		// 4.执行保存操作
		News news = new News("java", "rmcgo", new Date(new Date().getTime()));
		session.save(news);

		// 5.提交事务
		transaction.commit();

		// 6. 关闭Session
		session.close();

		// 7. 关闭SessionFactory
		ourSessionFactory.close();
	}

}

