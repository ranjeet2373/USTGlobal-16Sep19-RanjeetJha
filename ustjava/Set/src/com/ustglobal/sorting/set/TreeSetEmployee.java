package com.ustglobal.sorting.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEmployee {
	public static void main(String[] args) {
		TreeSet<Employee> ts = new TreeSet<>();
		Employee e1 = new Employee(12, "sweety", 45000);
		Employee e2 = new Employee(34, "teju", 50000);
		Employee e3 = new Employee(5, "giri", 25000);
		Employee e4 = new  Employee(25, "sheela", 10000);
		Employee e5 = new  Employee(25, "sheela", 10000);
		
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		System.out.println("**********usimg iterator**********");
		Iterator<Employee> i=ts.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println("id is "+e.id);
			System.out.println("name is "+e.name);
			System.out.println("salary is "+e.salary);
			System.out.println("*****************");
		}
		
	}

}
