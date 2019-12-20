package com.ustglobal.stockManagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product_Info")
public class Product_Info {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	int id;
	
	@Column
	String name;
	
	@Column
	String category;
	
	@Column
	String company;
	@Column
	int quantity;
	@Column
	double price;

}
