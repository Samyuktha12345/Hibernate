package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class AppMain {
public static void main( String[] args )
    {
    	SessionFactory factory= new Configuration().configure().buildSessionFactory();
      	
    	Session ses= factory.openSession();
    	/*Employee item1=new Employee();
    	item1.setid(1);
    	//item1.setname("Samyuktha");
    	//item1.setcity("Hyderabad");*/
    	
    	/*Employee item2=new Employee();
    	item2.setid(4);
    	item2.setname("Hari");
    	item2.setcity("Sainikpuri");*/
    	
    	//List<Employee> l1=new ArrayList<Employee>();
    	//l1.add(item1);
    	//l1.add(item2);
    	
    	
   // Transaction tx=ses.beginTransaction();
    	//ses.save(item1);
    	//ses.delete(item1);
    	//ses.save(item2);
    	Employee e = (Employee)ses.get(Employee.class, 3);
    	e.setcity("Neredmet");
    	e.setname("Priya");
    	System.out.println("Updated successfully");
    	ses.getTransaction().commit();

    	
    	//tx.commit();
        ses.close();
    	factory.close();
    	
    	
    }

	
} 

