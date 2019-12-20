package com.ustglobal.stockManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockManagement.dao.StockDAO;
import com.ustglobal.stockManagement.dto.Product_Info;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockDAO dao;
	@Override
	public boolean addProduct(Product_Info bean) {
		return dao.addProduct(bean);
		
	}

	@Override
	public boolean updateProduct(Product_Info bean) {
		return dao.updateProduct(bean);
	}

	@Override
	public Product_Info searchProductByName(String name) {
		
		return dao.searchProductByName(name);
	}

	@Override
	public Product_Info searchProductByCategory(String category) {
		return dao.searchProductByCategory(category);
	}

	@Override
	public Product_Info searchProductByCompany(String company) {
		return dao.searchProductByCompany(company);
	}

}
