package com.ustglobal.stockManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockManagement.dto.Product_Info;
import com.ustglobal.stockManagement.dto.StockResponse;
import com.ustglobal.stockManagement.service.StockService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class StockController {

	@Autowired
	private StockService service;
	
	@Autowired
	private StockResponse response;
	
	@PostMapping(path="/addproduct", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse addProduct(@RequestBody Product_Info bean) {
		if(service.addProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("product added in the db");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("product not added to the db");
	 }
		return response;
		}
	
	
	@PutMapping(path="/updateproduct" , consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse updateproduct(@RequestBody Product_Info bean ) {
		if(service.updateProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("product updated in the db");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("product not updated in the db");
		}
		return response;
	}
	
	@GetMapping(path="/searchbyname" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse searchByName(@RequestParam("name") String name) {
		Product_Info bean = service.searchProductByName(name);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("product are present in the db");
			response.setInfo(bean);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("product are not present in the db");
		}
		return response;
	}
	
	@GetMapping(path="/searchbycategory" , produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse searchbycategory(@RequestParam("category") String category) {
		Product_Info bean = service.searchProductByCategory(category);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("product are present in the db");
			response.setInfo(bean);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("product are not present in the db");
		}
		return response;
	}
	
	
	@GetMapping(path="/searchbycompany" , produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse searchByCompany(@RequestParam("company") String company) {
		Product_Info bean = service.searchProductByCompany(company);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("product are present in the db");
			response.setInfo(bean);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("product are not present in the db");
		}
		return response;
		
	}
	
}
