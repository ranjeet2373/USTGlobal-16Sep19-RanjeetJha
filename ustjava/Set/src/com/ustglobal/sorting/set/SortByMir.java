package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByMir implements Comparator<Bank> {

	@Override
	public int compare(Bank b1, Bank b2) {
		if(b1.mir>b1.mir)
			return 1;
			else if(b1.mir<b2.mir)
				return -1;
			else 
				return 0;
	}
	
	

}
