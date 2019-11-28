public class TestA {
	public static void main(String[] args) {
		Pen p=new Pen();
		p.cost=100;
		p.color ="red";
		p.brand = "cello";
		System.out.println("cost is "+p.cost);
		System.out.println("color of pen is "+p.color);
		System.out.println("brand of pen is "+p.brand);
		p.write();
		System.out.println("*********************");
		Van v =new Van();
		v.cost =5000000;
		v.color = "black";
		System.out.println("cost of car is "+v.cost);
		System.out.println("color of the car is "+v.color);
		v.move();
		System.out.println("*************************");
		Van v1=new Van();
		v1.cost=4000000;
		v1.color ="white";
		System.out.println("cost of the car is "+v1.cost);
		System.out.println("color of the car is "+v1.color);
		v1.move();
		System.out.println("*********************");
		Cow c=new Cow();
		c.name="cow";
		c.color ="brown";
		System.out.println("name of cow is ="+c.name);
		System.out.println("color of cow is ="+c.color);
		c.eat();
		c.sleep();
		System.out.println("*********************");
		Cow c1=new Cow();
		c1.name ="ganga";
		c1.color ="black";
		System.out.println("cow c1 name is "+c1.name);
		System.out.println("cow c1 color is "+c1.color);
		c1.eat();
		c1.sleep();

	}

}
