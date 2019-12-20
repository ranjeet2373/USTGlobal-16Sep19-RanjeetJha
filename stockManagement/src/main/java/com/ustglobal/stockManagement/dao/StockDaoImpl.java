package com.ustglobal.stockManagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;
import org.springframework.stereotype.Repository;

import com.ustglobal.stockManagement.dto.Product_Info;

@Repository
public class StockDaoImpl implements StockDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addProduct(Product_Info bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	@Override
	public boolean updateProduct(Product_Info bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Product_Info p =manager.find(Product_Info.class, bean.getId());
			p.setName(bean.getName());
			p.setCategory(bean.getCategory());
			p.setCompany(bean.getCompany());
			p.setPrice(bean.getPrice());
			p.setQuantity(bean.getQuantity());
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public Product_Info searchProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
			String jpql = "from Product_Info where name=:name";
			TypedQuery<Product_Info> query = manager.createQuery(jpql, Product_Info.class);
			query.setParameter("name", name);
			Product_Info productinfo = query.getSingleResult();
			return productinfo;
	}

	@Override
	public Product_Info searchProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product_Info where category=:category";
		TypedQuery<Product_Info> query = manager.createQuery(jpql, Product_Info.class);
		query.setParameter("category", category);
		Product_Info productinfo = query.getSingleResult();
		return productinfo;
		
	}

	@Override
	public Product_Info searchProductByCompany(String company) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product_Info where company=:company";
		TypedQuery<Product_Info> query = manager.createQuery(jpql, Product_Info.class);
		query.setParameter("company", company);
		Product_Info productinfo = query.getSingleResult();
		return productinfo;
		
	}

}
