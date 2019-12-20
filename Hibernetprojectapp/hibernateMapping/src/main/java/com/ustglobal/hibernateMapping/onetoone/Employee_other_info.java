package com.ustglobal.hibernateMapping.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee_other_info {
	
	@Id
	@Column
	private int eid;
	
	@Column
	private String fname;
	
	@Column
	private String panno;
	
	@OneToOne
	@JoinColumn(name="id")
	private Employee_info emp;
	
	
	public Employee_info getEmp() {
		return emp;
	}
	public void setEmp(Employee_info emp) {
		this.emp = emp;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	
	

}
