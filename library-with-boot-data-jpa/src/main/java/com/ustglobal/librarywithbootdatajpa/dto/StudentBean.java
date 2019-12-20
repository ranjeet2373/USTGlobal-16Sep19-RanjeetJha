package com.ustglobal.librarywithbootdatajpa.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class StudentBean {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int rollno;
	
	@Column
	private String name;
	
	@Column
	private String department;
	
	@Column
	private String gender;
	
	@Column
	private String password;

}
