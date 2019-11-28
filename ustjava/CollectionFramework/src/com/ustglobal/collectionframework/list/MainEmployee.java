package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MainEmployee {
	
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 =new Employee(101, "Ranjeet", 45000);
		Employee e2 =new Employee(102, "Rahul", 30000);
		Employee e3 =new Employee(103, "Sivik", 40000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		System.out.println("********For loop********");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("*********For Each loop*********");
		for (Employee emp : al) {
			System.out.println(emp);
			
		}
		
		System.out.println("*********Iterator*********");
		
		Iterator<Employee> i = al.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println(e);
		}
		
		System.out.println("********List Iterator***********");
		
		ListIterator<Employee> li =al.listIterator();
		
		while(li.hasNext()) {
			Employee e =li.next();
			System.out.println(e);
		}
		
		
		
	}

}
