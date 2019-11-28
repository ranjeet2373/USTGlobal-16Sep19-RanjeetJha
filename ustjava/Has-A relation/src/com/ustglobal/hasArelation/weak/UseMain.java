package com.ustglobal.hasArelation.weak;

public class UseMain {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "ranjeet";
		System.out.println(p.name);
		p.sleep();
		p.eat();
		System.out.println("++++++++++++++");
		System.out.println(p.m.color);// Has-A relation 
		p.m.write();
		
	}

}
