package com.ustglobal.maps;

import java.util.Hashtable;

public class MapHashtable {
	public static void main(String[] args) {
		
		Hashtable<Integer ,String> ht = new Hashtable<>();
		
		ht.put(101, "ajay");
		ht.put(102, "vijay");
		ht.put(100, "sonu");
		ht.put(109, "ranjeet");
		ht.put(209, "raj");
		ht.put(309, "rahul");
//		ht.put(null, "john");// NullpointerException
//		ht.put(105, null);//NullPointerException
		
		
		System.out.println("data "+ht);
	}

}
