public class Student {
	String name;
	int usn;
	int age;
	int id;
	String city;
	Student(String name,int usn,int age,int id,String city){
		this.name=name;
		this.usn=usn;
		this.age=age;
		this.id=id;
		this.city=city;
	}
	void display() {
		System.out.println("Name of student is "+name);
		System.out.println("USN of student is "+usn);
		System.out.println("Age of student is "+age);
		System.out.println("student ID is "+id);
		System.out.println("student city is "+city);
	}
	public static void main(String[] args) {
		Student s1=new Student("ranjeet",101,22,1,"patna");
		s1.display();
		System.out.println("********************");
		Student s2=new Student("rahul",102,21,2,"hajipur");
		s2.display();
		System.out.println("********************");
		Student s3=new Student("guru",103,60,3,"madhubani");
		s3.display();
		System.out.println("********************");
		Student s4=new Student("amrit",104,24,4,"kolkata");
		s4.display();
		System.out.println("********************");
		Student s5=new Student("kirti",105,25,5,"delhi");
		s5.display();
		System.out.println("********************");
		Student s6=new Student("anuj",106,22,6,"patna");
		s6.display();
		System.out.println("********************");
		Student s7=new Student("sivik",107,24,7,"purnia");
		s7.display();
		System.out.println("********************");
		Student s8=new Student("raj",108,20,8,"mujharpur");
		s8.display();
	}

}
