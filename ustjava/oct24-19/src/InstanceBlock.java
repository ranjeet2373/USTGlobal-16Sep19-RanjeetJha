public class InstanceBlock {
	static int b;
	int a;
	{
		a = 10;
		b = 20;
		System.out.println("non static block1");
	}
	public static void main(String[] args) {
		System.out.println("main started");
		InstanceBlock i1 = new InstanceBlock();
		InstanceBlock i2 = new InstanceBlock();
		System.out.println("main ended");
		
	}
	{
		System.out.println("non static block 2");
	}
		
	
}
