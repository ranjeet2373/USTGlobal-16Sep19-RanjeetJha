package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import jpawithhibernate.app.manytomany.Course;
import jpawithhibernate.app.manytomany.Student;

public class TestManyToMany {
	
	public static void main(String[] args) {
		
		Course c = new Course();
		c.setCid(11);
		c.setCname("java");
		
		Course c2 = new Course();
		c2.setCid(20);
		c2.setCname("sql");
		
		ArrayList<Course> alCourses = new ArrayList<Course>();
		alCourses.add(c);
		alCourses.add(c2);
		
		
		Student s = new Student();
		s.setSid(1);
		s.setSname("Ranjeet");
		s.setCourse(alCourses);
		
		

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			entityManager.persist(s);
			entityTransaction.commit();
			System.out.println("record saved");
			
	}catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
		finally {
			entityManager.close();;
		}
	}
}
