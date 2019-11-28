package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByColor implements Comparator<Marker>{

	@Override
	public int compare(Marker m1, Marker m2) {
		String s1 = m1.color;
		String s2 = m2.color;
		return s1.compareTo(s2);
	}
	
	

}
