package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainPen {
	
	public static void main(String[] args) {
		ArrayList<Pen> al=new ArrayList<>();
		Pen p1 = new Pen(150, "cello");
		Pen p2 = new Pen(10, "doms");
		Pen p3 = new Pen(100, "jeter");
		Pen p4 = new Pen(5, "montex");
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		displayPenDetails(al);
		System.out.println("after sorting----------------");
		Collections.sort(al);
		displayPenDetails(al);
	}
	
	static void displayPenDetails(ArrayList<Pen> l) {
		Iterator<Pen> i =l.iterator();
		while(i.hasNext()) {
			Pen p=i.next();
			System.out.println("price of pen is :"+p.price);
			System.out.println("brand of pen is:"+p.brand);
		}
	}

}
