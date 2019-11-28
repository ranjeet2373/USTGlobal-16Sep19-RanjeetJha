public class Employee1 {
	String name;
	int eid;
	
	public Employee1(String name,int eid){
		this.name = name;
		this.eid = eid;
	}
	void printDetail() {
		System.out.println("employee name is "+name);
		System.out.println("employe id is "+eid);
		this.sayHello();
	}
	void sayHello() {
		System.out.println("Hello "+name+ " Welcome to the UST global company");
	}
	public static void main(String[] args) {
		Employee1 e1 = new Employee1("kirti",1);
		e1.printDetail();
		System.out.println("***************");
		Employee1 e2 = new Employee1("anuj",2);
		e2.printDetail();
		System.out.println("***************");
		Employee1 e3 = new Employee1("om",3);
		e3.printDetail();
		
		
	}

}
