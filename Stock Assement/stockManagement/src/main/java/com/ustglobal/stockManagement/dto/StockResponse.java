package com.ustglobal.stockManagement.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class StockResponse {

	private int statusCode;
	private String message;
	private String description;
	private Product_Info info;
}
