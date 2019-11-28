package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class List8 {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("girija");
		al.add("ranjeet");
		al.add("amrit");
		al.add("rahul");
		
		System.out.println("before sorting "+al);
		Collections.sort(al);
		
		System.out.println("after sorting "+al);
		
	}

}
