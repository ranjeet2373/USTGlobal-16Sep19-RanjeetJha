class Bmi
{	
	public static void main(String args[])
	{
		double weight = 62;
		double height = 5.7;
		double bmi=(weight / Math.pow(height,2)) *10;
		if(bmi<18.5)
		{
		System.out.println("you r in undr weigth");
		}
		else if(bmi>=18.5&&bmi<=24.9)
		{
		System.out.println("u r in the healthy weight range");
		}
		else if(bmi>=25&&bmi<=29.9)
		{
		System.out.println("u r in over weight");
		}
		else if(bmi>=30&&bmi<=39.9)
		{
		System.out.println("u r in the obese range");
		}
	}
}
