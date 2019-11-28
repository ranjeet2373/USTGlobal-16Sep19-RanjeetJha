package revision;

import java.util.ArrayList;

public class List3 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		al.add("ranjeet");
		
		Object o = al.get(0);
		System.out.println(o);
		
		String name = (String)o;
		name = name.toUpperCase();
		
		System.out.println(name);
	}

}

