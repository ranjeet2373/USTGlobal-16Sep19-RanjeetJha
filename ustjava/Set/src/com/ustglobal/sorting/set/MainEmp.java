package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MainEmp {
	
	public static void main(String[] args) {
		
		Comparator<Emp> comp =(e1,e2)-> {
			if(e1.height>e2.height)
				return 1;
			else if(e1.height<e2.height)
				return -1;
			else 
				return 0;
		};
		
		
		TreeSet<Emp> ts = new TreeSet<>(comp);
		Emp e1 = new Emp(4, "Ranjeet", 5.6);
		Emp e2 = new Emp(1, "baskar", 5.2);
		Emp e3 = new Emp(5, "suresh",5.1);
		Emp e4 = new Emp(2, "dinesh", 4.5);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println("********using Itertaor***********");
		Iterator<Emp> it = ts.iterator();
		while(it.hasNext()) {
			Emp e = it.next();
			System.out.println("name is "+e.name);
			System.out.println("id is "+e.id);
			System.out.println("height is "+e.height);
			System.out.println("====================");
		}
	}

}
