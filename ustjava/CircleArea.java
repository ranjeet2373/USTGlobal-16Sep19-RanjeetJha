class CircleArea
{
	public static void main(String args[])
	{
		double r=10.0;
		double pi=3.14;
		double ar =area(r,pi);
		System.out.println(ar);
		double circum1 =circum(r,pi);
		System.out.println(circum1);
		int num =5;
		boolean oe = oddEven(num);
		System.out.println(oe);
		int num1 = 5;
		int fact1 =fact(num1);
		System.out.println( "factorial of " +num1 + "= "+fact1);
	}	
	static double area(double r1,double p)
	{
		double arr =p*r1*r1;
		return arr;
	}
	static double circum(double r1,double p)
		{
			double cir =2*p*r1;
			return cir;
		}
	static boolean oddEven(int num)
	{
		if(num%2==0)
		{
			return true;
		}
		else{
	
		return false;}

	}
	static int fact(int num1)
		{
			int f=1;
			for(int i=num1;i>=1;i--)
			{
				f=f*i;
			}
		return f;
		}

	
}
