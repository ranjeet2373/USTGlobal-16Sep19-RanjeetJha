package com.ustglobal.stockManagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="orderInfo")
public class OrderInfo {

	@Id
	@Column
	int id;
	@Column
	double total_price;
	@Column
	double total_price_with_gst;
}
