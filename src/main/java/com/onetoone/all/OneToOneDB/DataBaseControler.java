package com.onetoone.all.OneToOneDB;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetoone.all.OneToOne.Address;
import com.onetoone.all.OneToOne.Student;

public class DataBaseControler {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Student se = new Student();
		se.setGroup("Group");
		se.setName("Vinaysaii");
		se.setSid(101);

		Address ad = new Address();
		ad.setAddid(1);
		ad.setPlace("HYD");
		ad.setParent(se);
		Transaction t = session.beginTransaction();
		System.out.println("no");
		session.save(ad);

		t.commit();
		System.out.println("Yes");

	}
}
