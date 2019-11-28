package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MainStudent {
	
	public static void main(String[] args) {
		Student s1 = new Student(2,"divya", 67.89);
		Student s2 = new Student(5,"ambika", 56.67);
		Student s3 = new Student(12,"kiran", 45.67);
		Student s4 = new Student(34,"dinesh", 78.67);
		Student s5 = new Student(1,"chinu", 35.67);
		Student s6 = new Student(8,"sonu", 67.67);
		Student s7 = new Student(4,"sweety", 89.9);
		Student s8 = new Student(45,"dimple", 33.2);
		Student s9 = new Student(7,"monu", 76.25);
		
		ArrayList<Student> al1 = new ArrayList<>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		
		ArrayList<Student> al2 = new ArrayList<>();
		al2.add(s4);
		al2.add(s5);
		al2.add(s6);
		
		ArrayList<Student> al3 = new ArrayList<>();
		al3.add(s7);
		al3.add(s8);
		al3.add(s9);
		
		HashMap<String ,ArrayList<Student>> hm = new HashMap<>();
		hm.put("first", al1);
		hm.put("second", al2);
		hm.put("third", al3);
		
		ArrayList<Student> first = hm.get("second");
		
		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.perc);
			System.out.println("======================");
		}
	}

}
