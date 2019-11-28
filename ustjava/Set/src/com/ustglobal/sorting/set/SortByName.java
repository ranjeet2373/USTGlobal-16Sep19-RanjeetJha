package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByName implements Comparator<Bank>{

	@Override
	public int compare(Bank a, Bank b) {
		return a.name.compareToIgnoreCase(b.name);
		
	}
	
	

}
