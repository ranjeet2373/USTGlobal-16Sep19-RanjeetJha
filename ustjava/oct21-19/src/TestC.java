public class TestC {
	

	public static void main(String[] args) {
		Person p=new Person();
		p.name ="Ranjeet";
		Person.color="fair";
		p.age=23;
		System.out.println("name of person "+p.name);
		System.out.println("color of person "+Person.color);
		System.out.println("age of person is "+p.age);
		p.walk();
		p.eat();
		Person.sleep();
		System.out.println("***************");
		Person p1=new Person();
		p1.name ="kirti";
		Person.color="fair";
		p1.age=20;
		System.out.println("name of person "+p1.name);
		System.out.println("color of person "+Person.color);
		System.out.println("age of person is "+p1.age);
		p1.walk();
		p1.eat();
		Person.sleep();
		
		
		
	}

}
