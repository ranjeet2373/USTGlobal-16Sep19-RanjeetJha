package com.ustglobal.objectclass;

public class TestB {
	
	public static void main(String[] args) {
		Pen p =  new Pen();
		System.out.println(p);
		System.out.println("hashcode of p ="+p.hashCode());
		
		Pen q = new Pen();
		System.out.println("hashcode of q="+q.hashCode());
		
		
	}

}
