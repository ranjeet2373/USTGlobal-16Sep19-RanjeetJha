package com.ustglobal.java8features;

import java.util.function.Predicate;

public class MainStudent {
	
	public static void main(String[] args) {
		
		Predicate<Student> p = s ->{
			if(s.perc>=35)
				return true;
			else
				return false;
		};
		Student s = new Student(1, "anup", 45.6);
		boolean res =p.test(s) ;
		System.out.println(res);
	}

}
