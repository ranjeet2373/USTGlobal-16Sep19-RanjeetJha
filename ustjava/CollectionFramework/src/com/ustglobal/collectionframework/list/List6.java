package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class List6 {
	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(34.5);
		al.add(23.5);
		al.add(87.6);
		al.add(12.3);
		al.add(34.5);
		al.add(null);
		al.add(null);
		System.out.println(al);
		al.add(2,54.6);
		System.out.println("After add in 2nd index "+al);
		al.remove(3);
		System.out.println("reomove 3rd index"+al);
		al.remove(null);
		System.out.println("remove null value"+al);
		Double val = al.get(4);
		System.out.println("object at 4th index "+val);
		al.set(2, 77.6);
		System.out.println("replace the 2nd index element"+al);
		boolean b=al.contains(54.6);
		System.out.println("its element avialble "+b);
		
		List<Double> al1 = new ArrayList<>();
		al1.add(12.3);
		al1.add(23.4);
		al1.add(34.5);
		al1.add(34.5);
		al.addAll(al1);
		System.out.println("Merge to ArrayList "+al);
		
		boolean contain = al.containsAll(al1);
		System.out.println("contain all of al1 "+contain);
		
		boolean res = al.removeAll(al1);
		System.out.println("remove all of al1 "+res);
		System.out.println("after remove "+al);
	}

}
