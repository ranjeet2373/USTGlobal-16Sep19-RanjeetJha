package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class Set2 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("vijay");
		hs.add("ajay");
		hs.add("sujay");
		hs.add("drijay");
		hs.add("enjoy");
		
		System.out.println("************using for each***********");
		for (String s : hs) {
			System.out.println(s);
			
		}
		System.out.println("**********using for Iterator************");
		Iterator<String> i=hs.iterator();
		while(i.hasNext()) {
			String s =i.next();
			System.out.println(s);
			
		}
	}

}
