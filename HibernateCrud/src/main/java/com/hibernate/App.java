package com.hibernate;

import java.util.List;
import java.util.ListIterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class App 
{
    public static void main( String[] args )
    {
    	
    	SessionFactory factory = HibernateUtil.getSessionFactory();   
        Session session = factory.openSession();
        
        //Student save/create
		/*
		 * Student student = new Student(); student.setName("Karan");
		 * student.setEmail("karan@gmail.com"); student.setAddress("India");
		 * student.setCollegeName("MVJ College");
		 * 
		 * Student student2 = new Student(); student2.setName("Kiran");
		 * student2.setEmail("kiran@gmail.com"); student2.setAddress("India");
		 * student2.setCollegeName("MVJ College");
		 * 
		 * Transaction tx = session.beginTransaction(); session.save(student);
		 * session.save(student2);
		 * 
		 * tx.commit(); System.out.println("Student registered successfully");
		 */
        
        //read/get student data
		/*
		 * List<Student> list =
		 * session.createQuery("from Student",Student.class).list(); list.forEach(e ->
		 * System.out.println(e));
		 */
        
        
        //read/get student by id
		/*
		 * Student st = session.get(Student.class, 1); System.out.println(st);
		 */
        
        //update student data
		/*
		 * Student st1 = session.get(Student.class, 1); st1.setName("Karan u");
		 * st1.setEmail("karanu@gmail.com"); st1.setAddress("India u");
		 * st1.setCollegeName("MVJ College"); Transaction tx =
		 * session.beginTransaction(); session.saveOrUpdate(st1);
		 * 
		 * 
		 * tx.commit(); System.out.println("data updated successfully");
		 */
        
        //delete student data
		/*
		 * Student st2 = session.get(Student.class, 1); Transaction tx
		 * =session.beginTransaction(); session.delete(st2); tx.commit();
		 * System.out.println("data deleted successfully");
		 */
        
        session.close();
        factory.close();
    }
}
