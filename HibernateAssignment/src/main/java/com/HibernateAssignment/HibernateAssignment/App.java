package com.HibernateAssignment.HibernateAssignment;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
      //  System.out.println( "Hello World!" );
    	//Configuration class object created
    	Configuration cfg=new Configuration();
    	cfg.configure("Hibernate.cfg.xml");
        //SessionFactory created
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Student s=new Student();
    	//set value
    	s.setId(102);
    	s.setName("Pooja");
    	
    	Laptop l=new Laptop();
    	l.setId(1012);
    	l.setName("HP");
    	
    	s.setLaptop(l);
    	l.setStudent(s);
    	

   	 Session session=factory.openSession();
   	 //begin the transaction
        Transaction tx=session.beginTransaction();
    	//Save student class and Laptop class object
        session.save(s);
        session.save(l);
       
        
        tx.commit();
        //close session and factory
        session.close();
        factory.close();
    	
    	
    }
}
