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
@Table(name="order_history_info")
public class orderHistory {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	int order_id;
	

}
