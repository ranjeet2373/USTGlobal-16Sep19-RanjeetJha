package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set3 {
	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet<>();
		ls.add(34);
		ls.add("nikitha");
		ls.add(89.9);
		ls.add(34);
		ls.add("bhavya");
		ls.add(null);
		ls.add(null);
		
		System.out.println("***********using for each***********");
		for (Object o : ls) {
			System.out.println(o);
			
		}
		
		System.out.println("*************using iterator***********");
		Iterator i= ls.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
			
		}
	}

}
