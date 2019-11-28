public class MainStudent {
	
	public static void main(String[] args) {
		Student s1 = new Student(1,"arya",78.99);
		Student s2 = new Student(2,"ranjeet",67.99);
		Student s3 = new Student(3,"chinku",70.55);
		
		Student[] students = new Students[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		for (Student s : students) {
			System.out.println(s);
		}
		recieve(students);
		
	}
	static void recive(Student[] stu) {
        for (Student s: stu) {
        	System.out.println(s);
        }
			
		}
}
