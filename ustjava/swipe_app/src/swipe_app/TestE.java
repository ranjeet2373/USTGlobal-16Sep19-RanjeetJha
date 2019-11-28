package swipe_app;
public class TestE {
	public static void main(String[] args) {
		Student.cname="LNCT";
		Student s1=new Student();
		s1.name="Ranjeet";
		s1.usn=101;
		System.out.println("college name is "+Student.cname);
		System.out.println("Name is "+s1.name);
		System.out.println("ID is "+s1.usn);
		System.out.println("*******************");
		Student s2=new Student();
		s2.name="guru";
		s2.usn=101;
		System.out.println("college name is "+Student.cname);
		System.out.println("Name is "+s2.name);
		System.out.println("ID is "+s2.usn);
	}

}
