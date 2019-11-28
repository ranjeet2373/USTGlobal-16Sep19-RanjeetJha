package revision;

import java.util.ArrayList;
import java.util.Iterator;

public class List2 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(45.6);
		al.add("ranjeet");
		al.add(true);
		
		System.out.println("using for each loop");
		
		for (Object object : al) {
			System.out.println(object);
			
		}
		System.out.println("=====using iterator=======");
		ArrayList al2 = new ArrayList<>();
		al2.add(20);
		al2.add(25.6);
		al2.add(false);
		
		Iterator it = al2.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		
	}

}
