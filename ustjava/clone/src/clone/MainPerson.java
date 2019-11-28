package clone;

public class MainPerson {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		person p1 = new person(12,"ravi");
		 System.out.println("p1 id is "+p1.id);
		 System.out.println("p1 name "+p1.name);
		 
		 Object o = p1.clone();
		 person p2 = (person) o;
		 System.out.println("p2 id is "+p2.id);
		 System.out.println("p2 name is "+p2.name);
		 
		 p2.id=200;
		 p2.name= "surya";
		 
		 System.out.println("p1 id "+p1.id);
		 System.out.println("p1 name is "+p1.name);
		 System.out.println("p2 id is "+p2.id);
		 System.out.println("p2 name is "+p2.name);
	}

}
