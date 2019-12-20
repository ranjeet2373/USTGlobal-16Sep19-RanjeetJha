package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestOneToOne {
	
	public static void main(String[] args) {
		
		VoterCard vc =new VoterCard();
		vc.setVid(10);
		vc.setVname("Ram");
		
		
		Person p = new Person();
		p.setPid(1);
		p.setPname("Ram");
		p.setVotercard(vc);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			VoterCard vcard = entityManager.find(VoterCard.class, 10);
			System.out.println(vcard.getPerson().getPid());
			System.out.println(vcard.getPerson().getPname());
			System.out.println(vc.getVid());
			System.out.println("record saved");
			
//			entityManager.persist(p);
			entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
		finally {
			entityManager.close();
		}
	}

}
