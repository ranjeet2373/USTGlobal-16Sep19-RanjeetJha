package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
				EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Product productDetail=entityManager.find(Product.class, 102);
		System.out.println("ID ="+productDetail.getPid());
		System.out.println("Name ="+productDetail.getPname());
		System.out.println("Quantity="+productDetail.getQuantity());
		
		entityManager.close();
		
	}//end of main method

}
