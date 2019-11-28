class Ternary
{
	public static void main(String args[])
	{
		int a=10;
		int b=5;
		int c=15;
		int d =a>b ? (a>c ? a: c) :(b>c ?b:c);
		System.out.println(d);
	}
}