package com.ustglobal.predicate;

import java.util.function.Predicate;

//import com.ustglobal.java8features.Student;

public class MainElection {
	public static void main(String[] args) {
		Predicate<Election> p = s ->{
			if(s.vote>=155)
				return true;
			else
				return false;
		};
		Election s = new Election("ranjeet",50,"patna");
		boolean res =p.test(s) ;
		System.out.println(res);
	} 

}
