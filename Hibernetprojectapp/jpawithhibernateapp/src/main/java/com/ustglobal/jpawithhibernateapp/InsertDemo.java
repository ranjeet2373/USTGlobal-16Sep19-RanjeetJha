package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class InsertDemo {
	
	public static void main(String[] args) {
		
		Product product = new Product();
		product.setPid(103);
		product.setPname("pencil");
		product.setQuantity(20);
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTranscation = entityManager.getTransaction();
		
		entityTranscation.begin();
		entityManager.persist(product);
		System.out.println("Record saved");
		entityTranscation.commit();
		entityManager.close();
		
		
	}//end of main method
	
	

}