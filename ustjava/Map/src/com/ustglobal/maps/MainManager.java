package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MainManager {
	
	public static void main(String[] args) {
		
		ManagerEmployeeRelation m1 = new ManagerEmployeeRelation(5, "amrit", 20000);
		ManagerEmployeeRelation m2 = new ManagerEmployeeRelation(2, "gajendra", 70000);
		ManagerEmployeeRelation m3 = new ManagerEmployeeRelation(1, "ranjeet", 80000);
		ManagerEmployeeRelation m4 = new ManagerEmployeeRelation(15, "kirti", 25000);
		ManagerEmployeeRelation m5 = new ManagerEmployeeRelation(20, "guru", 40000);
		ManagerEmployeeRelation m6 = new ManagerEmployeeRelation(3, "nishad", 50000);
		ManagerEmployeeRelation m7 = new ManagerEmployeeRelation(6, "raj", 60000);
		ManagerEmployeeRelation m8 = new ManagerEmployeeRelation(25, "rahul", 20000);
		ManagerEmployeeRelation m9 = new ManagerEmployeeRelation(10, "raju", 30000);
		
		
		ArrayList<ManagerEmployeeRelation> al1 = new ArrayList<>();
		al1.add(m1);
		al1.add(m2);
		al1.add(m3);
		
		ArrayList<ManagerEmployeeRelation> al2 = new ArrayList<>();
		al2.add(m4);
		al2.add(m5);
		al2.add(m6);
		
		ArrayList<ManagerEmployeeRelation> al3 = new ArrayList<>();
		al3.add(m7);
		al3.add(m8);
		al3.add(m9);
		
		HashMap<String, ArrayList<ManagerEmployeeRelation>> hm = new HashMap<>();
		hm.put("Manager1", al2);
		hm.put("Manager2", al2);
		hm.put("Manager", al3);
		
	ArrayList<ManagerEmployeeRelation> first=hm.get("Manager1");
	Iterator<ManagerEmployeeRelation> it =first.iterator();
	System.out.println("manager 1 all employee");
	while(it.hasNext()) {
		ManagerEmployeeRelation m = it.next();
		System.out.println("id is "+m.id);
		System.out.println("name is "+m.name);
		System.out.println("salary is " +m.salary);
		System.out.println("===================");
	}
	}

}
