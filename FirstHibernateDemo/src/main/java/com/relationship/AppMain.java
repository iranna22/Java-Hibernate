package com.relationship;

import org.hibernate.SessionFactory;

import com.iranna.HibernateUtil;

public class AppMain {

	public static void main(String[] args) {

		 SessionFactory factory = HibernateUtil.getSessionFactory();
	        System.out.println(factory);
	        factory.close(); 
		
	}

}
