package com.iranna.manytomany;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = HibernateUtil.getSessionFactory();   
        Session session = factory.openSession();
         
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        e1.setName("Raj");
        e2.setName("Rahul");
        
        Project p1 = new Project();
        Project p2 = new Project();
        
        p1.setProjectName("E-commerce app");
        p2.setProjectName("Payment app");
        
        List<Employee> eList = new ArrayList<Employee>();
        List<Project> pList = new ArrayList<Project>();
        
        eList.add(e1);
        eList.add(e2);
        
        pList.add(p1);
        pList.add(p2);
        
        e1.setProjects(pList);
        p1.setEmployees(eList);
        
        
        Transaction tx = session.beginTransaction(); 
        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);
       
        
        tx.commit();
        factory.close();
    }
}
