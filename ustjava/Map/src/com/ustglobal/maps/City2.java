package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class City2 {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
		lh.put("Bangalore", 560068);
		lh.put("Haryana", 135480);
		lh.put("patna", 800002);
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key is "+key+ "------"+"value "+value);
			System.out.println("======================");
		}
	}

}
