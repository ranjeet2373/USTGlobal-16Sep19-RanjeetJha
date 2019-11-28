package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Generics {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("ranjeet");
		al.add("sabita");
		al.add("amrit");
		al.add("kirti");
		
		String name=al.get(0);
		System.out.println(name.toUpperCase());
		System.out.println("----------->Using Iterator------------->");
		Iterator<String> li =al.iterator();
		while(li.hasNext()) {
			String s = li.next();
			System.out.println(s);
		}
		
		System.out.println("------------>using ListIterator------------>");
		
		ListIterator<String> l =al.listIterator();
		while(l.hasNext()) {
			String s =l.next();
			System.out.println(s);
		}
		
	}

	
	
}
