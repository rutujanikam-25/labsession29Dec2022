package com.CourseHibernate.Course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import com.EmployeeHibernet.Employee.Course;
//import com.EmployeeHibernet.Employee.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Student s1=new Student();
    	s1.setId(1);
    	s1.setName("pratiksha");
    	
    	
    	Course c2=new Course();
    	c2.setId(11);
    	c2.setName("java");
    	
    	
    	
    	s1.setCourse(c2);
    	//c2.setStudent(s1);
    	
    	 Session session=factory.openSession();
         //begin the transaction
         Transaction tx=session.beginTransaction();
         session.save(s1);
         
         
         session.save(c2);
        
         
         tx.commit();
         session.close();
         factory.close();
     	
    	
    }
}
