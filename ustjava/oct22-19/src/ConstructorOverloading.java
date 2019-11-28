public class ConstructorOverloading {
	String name;
	int eid;
	long aadharno;
	
	ConstructorOverloading(String name,int eid,long aadharno){
		this.name=name;
		this.eid=eid;
		this.aadharno = aadharno;
	}
	ConstructorOverloading(String name,int eid){
		this.name = name;
		this.eid = eid;
	}
	ConstructorOverloading(int eid,String name){
		this.name= name;
		this.eid=eid;
	}
	void printDetails() {
		System.out.println("Hi "+name+ " welcome to ust global");
	}
	
}
