package com.ustglobal.hashcode;

public class MainStudent {
	
	public static void main(String args[]) {
		Student s = new Student(1,"ranjeet",77);
		s.pritn();
		System.out.println(s.hashCode());
		System.out.println(s);
	}
}
