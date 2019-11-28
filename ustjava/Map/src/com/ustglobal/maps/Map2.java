package com.ustglobal.maps;

import java.util.HashMap;

public class Map2 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("kuku", 998014);
		hm.put("mala", 678425);
		hm.put("sheela", 254782);
		
		HashMap hm1 = new HashMap();
		hm1.put("deepu", 78452);
		hm1.put("riya", 678909);
		hm1.put("kriti", 467787);
		
		boolean hasKey=hm.containsKey("mala");
		System.out.println("has key "+hasKey);
		
		boolean hasValue = hm.containsValue(467787);
		System.out.println("has value "+hasValue);
		
		hm.putAll(hm1);
		System.out.println("merge two hashMap  "+hm);
		
		System.out.println("size of the map is "+hm.size());
		
		System.out.println("map is empty "+hm.isEmpty());
		
		
		
	}

}
