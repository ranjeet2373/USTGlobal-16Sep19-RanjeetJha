class TestE
{
	public static void main(String args[])
	{
		char grade = 'A';
		switch(grade)
		{
		case 'Z' :System.out.println("you r in undr weigth");
		case 'A' : System.out.println("FCD");
			break;
		case 'B' :System.out.println("FC");
			break;
		case 'C': System.out.println("SC");
			break;
		case 'D': System.out.println("just pass");
			break;
		case 'E' :System.out.println("Fail");
			break;
		default :System.out.println("Invalid grade");
		}
	}
}