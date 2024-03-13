package com.iranna.onetoone;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = HibernateUtil.getSessionFactory();   
        Session session = factory.openSession();
         
        Question q1 =new Question();
        q1.setQuestion("What is Spring");
        
        Answer a1 = new Answer();
        a1.setAnswer("Spring is Java Framework for Java programming lanhuage");
        
        q1.setAnswer(a1);
        a1.setQuestion(q1);
        
        Question q2 =new Question();
        q2.setQuestion("What is AWS");
        
        Answer a2 = new Answer();
        a2.setAnswer("AWS is cloud platform");
        
        q2.setAnswer(a2);
        a2.setQuestion(q2);
        
        Transaction tx = session.beginTransaction(); 
       
        session.save(q1);
        session.save(q2);
        session.save(a1); 
        session.save(a2);
        
        tx.commit();
        factory.close();
    }
}
