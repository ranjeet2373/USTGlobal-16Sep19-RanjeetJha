package com.ustglobal.maps;

import java.util.HashMap;

public class Map1 {
	
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("kuku", 998014);
		hm.put("mala", 678425);
		hm.put("sheela", 254782);
		hm.put(null,15478);
		hm.put(null, 25478);
		System.out.println("data "+hm);
		
		hm.put("mala", 124587);
		System.out.println("after modify "+hm);
		
		hm.put("dimple", 124587);
		System.out.println("after dimple "+hm);
		
		System.out.println("==================");
		System.out.println("after adding duplicate null "+hm);
		
		Object phoneno = hm.get("sheela");
		System.out.println("value "+phoneno);
		
		Object phoneno1 = hm.get("ranjeet");
		System.out.println("value "+phoneno1);
		
		Object value = hm.remove("kuku");
		System.out.println("value "+value);
		
		System.out.println("after remove "+hm);
	}

}
