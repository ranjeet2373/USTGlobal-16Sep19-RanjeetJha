package swipe_app;
public class TestF {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add();
		c.mul();
		System.out.println("****************");
		ScientificCalculator sc=new ScientificCalculator();
		sc.add();
		sc.mul();
		sc.sin();
		sc.cos();
	}

}
