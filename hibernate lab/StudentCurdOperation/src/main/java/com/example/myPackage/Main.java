package com.example.myPackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class Main {
public static void main(String args[])
{
	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	
	Session session = sessionFactory.getCurrentSession();
	
	try
	{
		Student student1=new Student("Jhon","Doe","Jhon@example.com");
		Student student2=new Student("Jhoni","sing","Jhoni@example.com");
		Student student3=new Student("Rohit","Kumar","Rohit@example.com");
		Student student4=new Student("Mohit","Harlee","Mohit@example.com");
		Transaction transection=session.beginTransaction();
		
		session.save(student1);
		session.save(student2);
		session.save(student3);
		session.save(student4);
		
		
		Student retrivedStudent1=session.get(Student.class, 1);
		Student retrivedStudent2=session.get(Student.class, 2);
		
		retrivedStudent2.setFirst_name("Sonal");
		session.update(retrivedStudent2);
		
		//session.delete(retrivedStudent1);
		
		transection.commit();
		
		
	}
	finally
	{
		sessionFactory.close();
	}
}
}