public class CnstructrOverlMain {
	public static void main(String[] args) {
		ConstructorOverloading co1 =new ConstructorOverloading(111,"bhavya");
		co1.printDetails();
		ConstructorOverloading co2 = new ConstructorOverloading("divya",234);
		co2.printDetails();
		ConstructorOverloading co3 = new ConstructorOverloading("priya",678,8768);
		co3.printDetails();
	}
	

}
