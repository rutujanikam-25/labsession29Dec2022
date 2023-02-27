package com.HibernateAssignment1.DepartmentEmployeeManyToOne;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Department d=new Department();
        d.setId(101);
        d.setName("computer");
        
        Employee t1=new Employee();
        t1.setId(111);
        t1.setName("pranjali");
        
        Employee t2=new Employee();
        t2.setId(112);
        t2.setName("pooja");
        
       List<Employee> employee=new ArrayList<Employee>();
       employee.add(t1);
       employee.add(t2);
       
       d.setEmployee(employee);
       t1.setDepartment(d);
       t2.setDepartment(d);
       
       Session session=factory.openSession();
       Transaction  tx=session.beginTransaction();
       session.save(t1);
       session.save(t2);
       session.save(d);
       
       tx.commit();
       session.close();
       factory.close();
   	
    }
}
