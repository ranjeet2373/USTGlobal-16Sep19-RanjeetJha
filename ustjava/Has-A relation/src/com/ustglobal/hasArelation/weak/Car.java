package com.ustglobal.hasArelation.weak;

public class Car {
	String name = "BMW";
	String color = "black";
	long cost = 90000000l;
	
	MusicSystem m = new MusicSystem();
	
	void drive() {
		System.out.println("drive the Car");
	}

}
