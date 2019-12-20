package com.ustglobal.hibernateMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.hibernateMapping.onetoone.Employee_info;
import com.ustglobal.hibernateMapping.onetoone.Employee_other_info;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Employee_info empinfo=new Employee_info();
    	empinfo.setId(102);
    	empinfo.setName("Ranjeet");
    	empinfo.setEmail("ranjeet@gmail.com");
    	
    	Employee_other_info empothrinfo = new Employee_other_info();
    	empothrinfo.setEid(1);
    	empothrinfo.setFname("ramesh");
    	empothrinfo.setPanno("1245678");
    	empothrinfo.setEmp(empinfo);
    	EntityManager manager=null;
    	EntityTransaction transaction = null;
    	try {
    		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mapping-unit");
    		manager=factory.createEntityManager();
    		transaction = manager.getTransaction();
    		transaction.begin();
    		manager.persist(empothrinfo);
    		transaction.commit();
    		System.out.println("Record saved");
    		
    		
    	}catch (Exception e) {
    		e.printStackTrace();
    		transaction.rollback();
		}
    	finally {
    		manager.close();
    	}
    	
    }
}
