package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class MainBank {
	public static void main(String[] args) {
		
		
		SortByName sb = new SortByName();
		SortByPincode sp = new SortByPincode();
		SortByMir sm = new SortByMir();
		
		
//		TreeSet<Bank> ts = new TreeSet<>(sb);
//		TreeSet<Bank> ts = new TreeSet<>(sp);
		TreeSet<Bank> ts = new TreeSet<>(sm);
		Bank b1 = new Bank("HDFC", 560068, 6768689);
		Bank b2 = new Bank("SBI", 560071, 9898989);
		Bank b3 = new Bank("CITI", 560054, 765678);
		Bank b4 = new Bank("CANARA", 560076, 123456);
//		Bank b5 = new Bank("CANARA", 560076, 123456);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
//		ts.add(b5);
		
		System.out.println("************using iterator************");
		Iterator<Bank> i = ts.iterator();
		while(i.hasNext()) {
			Bank b = i.next();
			System.out.println("name is "+b.name);
			System.out.println("pincode is "+b.pincode);
			System.out.println("MICR is "+b.mir);
			System.out.println("==================");
		}
	}

}
