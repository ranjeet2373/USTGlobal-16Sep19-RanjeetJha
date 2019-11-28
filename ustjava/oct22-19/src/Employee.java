public class Employee {
	String name;
	int eid;
	
	Employee(String empname,int empeid){
		name = empname;
		eid = empeid;
	}
	void printDetail() {
		System.out.println("employee name is "+name);
		System.out.println("employe id is "+eid);
	}
	public static void main(String args[]) {
		Employee e1 = new Employee("ranjeet",1);
		e1.printDetail();
		System.out.println("***************");
		Employee e2 =new Employee("amrit",2);
		e2.printDetail();
		System.out.println("******************");
		Employee e3 =new Employee("rahul",3);
		e3.printDetail();
	}

}
