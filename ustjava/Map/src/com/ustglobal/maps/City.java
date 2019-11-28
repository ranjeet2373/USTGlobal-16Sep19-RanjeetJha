package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class City {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
		lh.put("Bangalore", 560068);
		lh.put("Haryana", 135480);
		lh.put("patna", 800002);
		
		System.out.println(lh);
		
		Set<String> s=lh.keySet();
		
		for (String key : s) {
			System.out.println("key "+key);
			
		}
		
		System.out.println("================");
		Collection<Integer> c = lh.values();
		for (Integer i : c) {
			System.out.println("values "+i);
			
		}
	}

}
