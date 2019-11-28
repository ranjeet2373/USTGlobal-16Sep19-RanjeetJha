package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop>{
	
	double price;
	int ram;
	String name;
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}

//	@Override
//	public int compareTo(Laptop l) {
//		if(this.ram>l.ram)
//		return 1;
//		else if(this.ram<l.ram)
//			return -1;
//		else 
//			return 0;
//	}
//	
	
	
//	@Override
//	public int compareTo(Laptop l) {
//		Double i =this.price;
//		Double j = l.price;
//		return i.compareTo(j);
//	}
	
	
	@Override
	public int compareTo(Laptop o) {
		return this.name.compareTo(o.name);
	}
	

}
