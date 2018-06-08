package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.ComputerDept;
import bean.ElectronicsDept;

public class TablePerConcreteClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("resource/db.config.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		ComputerDept cd = new ComputerDept(103,"Shanaya", 5000, "abec@gmail.com","Spring");
		ElectronicsDept ed =new ElectronicsDept(104, "Vijay", 4000, "xbeddf@gmail.com", 10);

		session.save(cd);
		session.save(ed);

		tx.commit();
		session.close();
		sessionFactory.close();

	}

}
