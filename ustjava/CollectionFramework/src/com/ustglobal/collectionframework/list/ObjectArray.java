package com.ustglobal.collectionframework.list;

public class ObjectArray {
	public static void main(String[] args) {
		Object obj[] = {"Ranjeet",10,'A',25.25,true,1};
		System.out.println("**********Using for loop**********");
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		System.out.println("*********using for each loop*********");
		for (Object e : obj) {
			System.out.println(e);
			
		}
	}

}
