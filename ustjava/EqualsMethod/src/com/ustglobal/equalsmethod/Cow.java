package com.ustglobal.equalsmethod;

public class Cow {
	
	int id;
	String name;
	double cost;
	public Cow(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		Cow c = (Cow) obj;
		if(this.id==c.id) {
			if(this.name.equals(c.name)) {
				if(this.cost==c.cost) {
					return true;
				}
				else {
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}

	}}
