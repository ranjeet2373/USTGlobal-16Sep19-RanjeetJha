package com.ustglobal.beanobject.bean;

public class UseEmployee {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setDept("cse");
		e.setId(1);
		e.setName("Ranjeet");
		e.setSalary(25000);
		e.setDesignation("software developer");

		EmpDatabase ed = new EmpDatabase();
		ed.recieve(e);
	}

}
