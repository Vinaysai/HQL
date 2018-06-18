package com.onetoone.all.OneToOneDB;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetoone.all.OneToOne.Student;

public class DataBaseControler {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		/* Selecting all objects(records) start_______________________ */

		Query qry = session.createQuery("from Student");

		List l = qry.list();
		System.out.println("Total Number Of Records : " + l.size());
		Iterator it = l.iterator();

		while (it.hasNext()) {
			Object o = (Object) it.next();
			Student p = (Student) o;
			System.out.println("Student id : " + p.getSid());

			System.out.println("----------------------");
		}

	}
}
