package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Set5 {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add(34);
		ts.add(45);
		ts.add(14);
		ts.add(9);
		ts.add(13);
		ts.add(13);//duplicate not allowed
		ts.add(null);// null pointer exception or not allowed
		
		System.out.println("************using for each***********");
		for (Object o : ts) {
			System.out.println(o);
			
		}
		System.out.println("************using Itreator************");
		Iterator i = ts.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
			
		}
	}

}
