package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class App 
{
    public static void main( String[] args )
    {
    	EntityTransaction entityTransaction = null;
    	EntityManager entityManager = null;
    	
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
    	entityManager = entityManagerFactory.createEntityManager();
//    	Product product = entityManager.getReference(Product.class, arg1);//
    	
    	Product product = entityManager.find(Product.class, 102);
    	System.out.println(product.getClass());
    	
    	System.out.println("Id is="+product.getPid());
    	System.out.println("Name is="+product.getPname());
    	System.out.println("Quantity is="+product.getQuantity());

    }
}
