package com.ustglobal.stockManagement.service;

import com.ustglobal.stockManagement.dto.Product_Info;

public interface StockService {

	public boolean addProduct( Product_Info bean);
	public boolean updateProduct( Product_Info bean);
	
	public Product_Info searchProductByName(String name);
	public Product_Info searchProductByCategory(String category);
	public Product_Info searchProductByCompany(String company);
}
