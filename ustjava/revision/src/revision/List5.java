package revision;

import java.util.ArrayList;
import java.util.Collections;

public class List5 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("ranjeet");
		al.add("amit");
		al.add("suresh");
		al.add("bobby");
		
		System.out.println("before sorting "+al);
		Collections.sort(al);
		
		System.out.println("after sorting "+al);
	}

}
