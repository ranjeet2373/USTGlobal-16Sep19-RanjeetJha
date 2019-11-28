package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Helper {
	
	
	void displayAllStudent(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.perc);
			System.out.println("====================");
		}
		

	}
	 void displayFaildStudent1(ArrayList<Student> al) {
		List<Student> l = al.stream().filter(i -> i.perc<40).collect(Collectors.toList());
	
	 Iterator<Student> it = l.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.perc);
			System.out.println("====================");
		}
	 }
}
		
	


