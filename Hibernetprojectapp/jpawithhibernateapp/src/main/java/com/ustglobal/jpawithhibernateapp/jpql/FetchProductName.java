package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class FetchProductName {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String jpql = "select pname from Product";
		
		Query query = entityManager.createQuery(jpql);
		List<String> list = query.getResultList();
		for (String string : list) {
			
			System.out.println("Name ="+string);
			System.out.println("============");
			
		}
		
		
		
	}

}
