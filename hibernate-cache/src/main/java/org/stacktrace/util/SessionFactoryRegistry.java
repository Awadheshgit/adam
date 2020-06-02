package org.stacktrace.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
	private static SessionFactory sessionFactory;
	static {
		try {
			Configuration configuration = new Configuration().configure("E://codebase//adam//hibernate-cache//src//main//resources//employee.hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void closeSessionFactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
