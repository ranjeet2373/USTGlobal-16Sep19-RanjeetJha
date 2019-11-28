package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Set6 {
	public static void main(String[] args) {
		
		TreeSet<String > ts = new TreeSet<>();
		ts.add("roopa");
		ts.add("jaya");
		ts.add("sushma");
		ts.add("munni");
		ts.add("sheela");
		
		System.out.println("**********using for each************");
		for (String s : ts) {
			System.out.println(s);
			
		}
		System.out.println("******using Iterator************");
		Iterator<String> i =ts.iterator();
		while(i.hasNext()) {
			String s = i.next();
			System.out.println(s);
		}
		
	}

}
