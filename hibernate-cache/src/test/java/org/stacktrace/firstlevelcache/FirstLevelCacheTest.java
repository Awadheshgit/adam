package org.stacktrace.firstlevelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.stacktrace.util.SessionFactoryRegistry;

@RunWith(JUnit4.class)
public class FirstLevelCacheTest {

	@Test
	public void testEmployee() {
		boolean flag = true;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			// Get employee id=1
			Employee employee = (Employee) session.load(Employee.class, 1);

			flag = true;
		} finally {
			if(session!=null && transaction!=null) {
				if(flag) {
					transaction.commit();
				}else {
					transaction.rollback();
				}
				session.close();
			}
			SessionFactoryRegistry.closeSessionFactory();
		}

	}
}
