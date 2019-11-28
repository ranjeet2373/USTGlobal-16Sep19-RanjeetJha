package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class List2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(29.7);
		al.add(true);
		al.add("ranjeet");
		
		for (Object obj : al) {
			
			System.out.println(obj);
			
		}
	}

}
