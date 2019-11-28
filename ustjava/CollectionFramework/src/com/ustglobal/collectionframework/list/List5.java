package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class List5 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("ranjeet");
		
		Object o = al.get(0);
		String name = (String)o;
		name = name.toUpperCase();
		System.out.println(name);
	}

}
