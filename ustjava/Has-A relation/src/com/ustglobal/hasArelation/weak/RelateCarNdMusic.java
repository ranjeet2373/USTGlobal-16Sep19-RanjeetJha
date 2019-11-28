package com.ustglobal.hasArelation.weak;

public class RelateCarNdMusic {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.name);
		System.out.println(c.color);
		System.out.println(c.cost);
		c.drive();
		System.out.println("Music system information");
		
		System.out.println(c.m.songName);
		System.out.println(c.m.cost);
		c.m.play();
		
	}

}
