package com.iranna.onetomany;


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
         
        Question q1 =new Question();
        q1.setQuestion("What is Spring");
        
        Answer a1 = new Answer();
        a1.setAnswer("Spring is Java Framework for Java programming lanhuage");
        a1.setQuestion(q1);
        
        Answer a2 = new Answer();
        a2.setAnswer("Spring helps to build web app");
        a2.setQuestion(q1);
        
        Answer a3 = new Answer();
        a3.setAnswer("Spring is most popular framework");
        a3.setQuestion(q1);
        
        List<Answer> list = new  ArrayList<Answer>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        q1.setAnswers(list);
        
        
        Transaction tx = session.beginTransaction(); 
          //save
        session.save(q1);
       session.save(a1);
       session.save(a2);
       session.save(a3);
        
       //get question and answers
		/*
		 * Question question = session.get(Question.class, 1);
		 * System.out.println(question.getQuestion());
		 * 
		 * for(Answer a: question.getAnswers()) { System.out.println(a.getAnswer()); }
		 */
        
        tx.commit();
        factory.close();
    }
}
