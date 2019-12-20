package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.app.manytoone.Pencil;
import com.ustglobal.jpawithhibernate.app.manytoone.PencilBox;

public class TestManyToOne {
	
	public static void main(String[] args) {
		
		PencilBox pb = new PencilBox();
		pb.setBid(1205);
		pb.setBname("Cello");
		
		Pencil p = new Pencil();
		p.setPid(1);
		p.setColor("red");
		
		p.setPencilBox(pb);
		
		Pencil p1 = new Pencil();
		p1.setPid(2);
		p1.setColor("blue");
		p1.setPencilBox(pb);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			
			entityManager.persist(p);
			entityManager.persist(p1);
			entityTransaction.commit();
			
			System.out.println("record saved");
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		finally {
			entityManager.close();
		}
	}

}
