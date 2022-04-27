package com.hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {
	public static void main(String[]args) {
SessionFactory factory= new Configuration().configure().buildSessionFactory();
  	
	Session ses= factory.openSession();
	Transaction tx=ses.beginTransaction();
	Learner l=new Learner();
	l.setLid(11);
	l.setLname("Samyu");
	l.setLcourse("Java");
	ses.save(l);

	tx.commit();
	ses.close();
	factory.close();
		}
}
