package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class MainEmployee2 {
	
	public static void main(String[] args) {
		Vector<Employee2> v = new Vector<Employee2>();
		
		Employee2 e1 = new Employee2(1, "Ranjeet", "UST");
		Employee2 e2 = new Employee2(2, "Dhiraj", "wipro");
		Employee2 e3 = new Employee2(3, "Anil", "TCS");
		v.add(e1);
		v.add(e2);
		v.add(e3);
		
		System.out.println("*******Using for loop************");
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println("*********Using for each loop*********");
		
		for (Employee2 emp : v) {
			System.out.println(emp);
			
		}
		System.out.println("*********using Iterator************");
		Iterator<Employee2> i = v.iterator();
		while(i.hasNext()) {
			Employee2 e = i.next();
			System.out.println(e);
		}
		
		System.out.println("************Using ListIterator*********");
		
		ListIterator<Employee2> li =v.listIterator();
		while(li.hasNext()) {
			Employee2 e =li.next();
			System.out.println(e);
		}
		
		
	}

}
