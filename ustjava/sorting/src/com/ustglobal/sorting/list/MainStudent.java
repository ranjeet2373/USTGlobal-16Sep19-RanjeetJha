package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainStudent {
	
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		
		Student s1 = new Student(12, "Dimple", 35.6);
		Student s2 = new Student(2, "sweety", 30.6);
		Student s3 = new Student(34, "jimy", 68.6);
		Student s4 = new Student(5, "Tummy", 76.5);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		displayStudentDetails(al);
		
		Collections.sort(al);
		System.out.println("After sorting --------");
		displayStudentDetails(al);
		
	}
	
	static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it =al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("ID is "+s.id);
			System.out.println("Name is "+s.name);
		System.out.println("Percentage is "+s.perc);
			System.out.println("++++++++++++++++");
			
		}
	}

}
