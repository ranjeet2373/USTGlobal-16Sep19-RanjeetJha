package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class MainStudent {
	private static String perc;

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101, "ankitha", 45.55);
		Student s2 = new Student(102,"salman" , 56.88);
		Student s3 = new Student(103, "sharukh", 78.99);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(int i=0;i<al.size();i++) {
			Student s=al.get(i);
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+perc);
		}
		
		System.out.println("===for each=====");
		for (Student stu : al) {
			System.out.println(stu);
			
		}
	}

}
