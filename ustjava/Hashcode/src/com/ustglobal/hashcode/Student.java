package com.ustglobal.hashcode;

public class Student {
	
	int id;
	String name;
	double percentage;
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	
	void pritn() {
		System.out.println("name is "+name+ " percentage is "+percentage+ "id is "+id);
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	

}
