package com.ustglobal.java8features;

import java.util.ArrayList;

public class MainStudent2 {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		
		Student s1 = new Student(5, "vikram", 56.7);
		Student s2 = new Student(3, "vijay", 37.8);
		Student s3 = new Student(6, "yash", 35.7);
		Student s4 = new Student(2, "akshay", 65.7);
		Student s5 = new Student(1, "aishu", 90.7);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		Helper h = new Helper();
//		h.displayAllStudent(al);
		h.displayFaildStudent1(al);
		
		
	}

}
