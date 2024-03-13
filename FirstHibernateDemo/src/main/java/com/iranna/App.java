package com.iranna;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		/*
		 * Configuration cfg = new Configuration(); cfg.configure(); SessionFactory
		 * factory = cfg.buildSessionFactory();
		 */
      //  SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        
        SessionFactory factory = HibernateUtil.getSessionFactory();
        System.out.println(factory);
        
		/*
		 * Student student = new Student(); student.setId(1); student.setName("Irann");
		 * student.setEmail("iranna@gmail.com"); student.setAddress("India");
		 * 
		 * Session session = factory.openSession(); 
		 * Transaction tx =
		 * session.beginTransaction(); session.save(student); tx.commit();
		 * session.close();
		 */
        Employee emp = new Employee();
        emp.setEmpName("Anil");
        emp.setSalary(45000.00);
        emp.setEmail("anil77@gmail.com");
        emp.setJoiningDate(new Date());
        emp.setStatus(true);
        emp.setToken("2344abcd");
        
         Session session = factory.openSession(); 
		  Transaction tx =session.beginTransaction();
		  session.save(emp);
		  tx.commit();
		 session.close();
        
         
    }
}
