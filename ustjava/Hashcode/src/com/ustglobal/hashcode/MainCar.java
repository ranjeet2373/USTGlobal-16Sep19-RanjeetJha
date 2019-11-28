package com.ustglobal.hashcode;

public class MainCar {
	
	public static void main(String[] args) {
		Car c1 = new Car(2500000,"honda","red");
		Car c2 = new Car(6500000,"swift","black");
		Car c3 = new Car(7800000,"audi","white");
		System.out.println(c1.hashCode());
		System.out.println(c1);
		System.out.println("**************");
		System.out.println(c2.hashCode());
		System.out.println(c2);
		System.out.println("**************");
		System.out.println(c3.hashCode());
		System.out.println(c3);
	}

}
