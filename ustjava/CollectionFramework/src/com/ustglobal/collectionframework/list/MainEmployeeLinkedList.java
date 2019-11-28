package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MainEmployeeLinkedList {
	public static void main(String[] args) {
		
		LinkedList<EmployeeLinkedList> ll = new LinkedList<EmployeeLinkedList>();
		EmployeeLinkedList el1 = new EmployeeLinkedList(1, "Rohit", "patna");
		EmployeeLinkedList el2 = new EmployeeLinkedList(2, "Raju","Raju");
		EmployeeLinkedList el3 = new  EmployeeLinkedList(3, "Ramesh", "pune");
		
		ll.add(el1);
		ll.add(el2);
		ll.add(el3);
		
		System.out.println("***********using for loop*************");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("***********using for each loop*********");
		
		for (EmployeeLinkedList e : ll) {
			System.out.println(e);
			
		}
		
		System.out.println("***********using Iterator************");
		
		Iterator<EmployeeLinkedList> i = ll.iterator();
		while(i.hasNext()) {
			EmployeeLinkedList el = i.next();
			System.out.println(el);
		}
		
		System.out.println("**********using List Itreator**********");
		
		ListIterator<EmployeeLinkedList> li = ll.listIterator();
		while(li.hasNext()) {
			EmployeeLinkedList e2 = li.next();
			System.out.println(e2);
		}
		
	}

}
