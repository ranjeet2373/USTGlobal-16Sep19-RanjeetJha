package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MainLaptop {
	public static void main(String[] args) {
		LinkedList<Laptop> ll = new LinkedList<>();
		Laptop lp1 = new Laptop(25000, 4, "HP");
		Laptop lp2 = new Laptop(35000, 6, "Dell");
		Laptop lp3 = new Laptop(28000, 12, "Mac");
		Laptop lp4 = new Laptop(55000, 8, "Asus");
		
		ll.add(lp1);
		ll.add(lp2);
		ll.add(lp3);
		ll.add(lp4);
		ll.add(new Laptop(20000,2,"acer"));
		displayLaptopDetails(ll);
		System.out.println("After sorting-----------------");
		Collections.sort(ll);
		displayLaptopDetails(ll);
		
		
	}
	static void displayLaptopDetails(LinkedList<Laptop> l) {
		Iterator<Laptop> i =l.iterator();
		while(i.hasNext()) {
			Laptop lp = i.next();
			System.out.println("Brand is "+lp.name);
			System.out.println("price is "+lp.price);
			System.out.println("Ram is "+lp.ram);
		}
	}

}
