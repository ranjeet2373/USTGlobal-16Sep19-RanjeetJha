package com.ustglobal.equalsmethod;

public class MainEmployee {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"ranjeet",250000);
		Employee e2 = new Employee(2,"amrit",250000);
		Employee e3 = new Employee(1,"gajendra",250000);
		Employee e4 = new Employee(1,"ranjeet",250000);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
	}

}
