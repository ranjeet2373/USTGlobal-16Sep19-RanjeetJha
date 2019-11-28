public class Blocks {
	static int a;
	int b;
	static {
		a=10;
		System.out.println("static block 1 "+a);
	}
	Blocks(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		Blocks b1 = new Blocks();
		Blocks b2 = new Blocks();
		System.out.println(a);
		System.out.println(a);
		}
		static {
			
			a=20;
			System.out.println("static block 2");
		}
		static {
			a=30;
			System.out.println("static block 3");
		}
		
	
}
