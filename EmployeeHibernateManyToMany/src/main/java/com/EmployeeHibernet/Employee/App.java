package com.EmployeeHibernet.Employee;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
      //System.out.println( "Hello World!" );
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	//is the session factory closed?
    	//System.out.println(factory.isClosed());
    	
    	Student s1=new Student();
    	s1.setId(1);
    	s1.setName("pratiksha");
    	
    	
    	Student s2=new Student();
    	s1.setId(2);
    	s1.setName("pratiksha");
    	
    	
    	Course c1=new Course();
    	c1.setCid(60);
    	c1.setCname("c");
    	
    	
    	Course c2=new Course();
    	c2.setCid(61);
    	c2.setCname("Advance java");
    	
    	Course c3=new Course();
    	c3.setCid(62);
    	c3.setCname("css");
    	
    	
    	List<Course> cour1=new ArrayList<Course>();
    	List<Student> stu1=new ArrayList<Student>();
    	cour1.add(c1);
    	cour1.add(c2);
    	cour1.add(c3);
    	s1.setCourse(cour1);
    	stu1.add(s1);
    	stu1.add(s2);
    	c1.setStudent(stu1);
    	
    	
    	
        Session session=factory.openSession();
        //begin the transaction
        Transaction tx=session.beginTransaction();
        session.save(s1);
        session.save(s2);
        session.save(c1);
        session.save(c2);
        session.save(c3);
        
        tx.commit();
        session.close();
        factory.close();
    	
    }
}
