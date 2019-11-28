package com.ustglobal.collectionframework.list;

public class EmployeeLinkedList {
	
	int id;
	String name;
	String location;
	public EmployeeLinkedList(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "EmployeeLinkedList [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	

}
