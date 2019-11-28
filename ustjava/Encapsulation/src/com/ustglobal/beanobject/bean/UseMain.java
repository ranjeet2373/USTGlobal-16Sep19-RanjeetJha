package com.ustglobal.beanobject.bean;

public class UseMain {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(12);
		s.setName("ranjeet");
		s.setRollNo(134);
		Database d = new Database();
		d.receive(s);
	}

}
