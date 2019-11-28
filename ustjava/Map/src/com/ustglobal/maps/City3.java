package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class City3 {
	public static void main(String[] args) {
		
		TreeMap<String, Integer> lh = new TreeMap<String , Integer>();
		lh.put("patna", 560068);
		lh.put("bangalore", 135480);
		lh.put("haryana", 800002);
//		lh.put(null, 787854);// NUll pointer Exception
		
		for(Map.Entry<String ,Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer values = m.getValue();
			System.out.println("key is  "+key);
			System.out.println("value is "+values);
			System.out.println("===============");
		}
	}

}
