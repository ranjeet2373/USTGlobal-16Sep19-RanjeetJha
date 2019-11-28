package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LnkLst {
	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		li.add(12);
		li.add(34.5);
		li.add("more");
		li.add(true);
		li.add(null);
		
		System.out.println("=======using for loop========");
		for(int i=0;i<li.size();i++) {
			Object obj = li.get(i);
			System.out.println(obj);
		}
		
		System.out.println("=======using for each loop");
		
		for (Object obj : li) {
			System.out.println(obj);
			
		}
		
		System.out.println("=========using iterator=========");
		
		Iterator i =li.iterator();
		while(i.hasNext()) {
			Object o1 = i.next();
			System.out.println(o1);
		}
		
		System.out.println("=======using List Iterator=========");
		
		ListIterator l = li.listIterator();
		while(l.hasNext()) {
			Object o2 = l.next();
			System.out.println(o2);
		}
	}

}
