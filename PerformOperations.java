
  class PerformOperations
{
	private static int subtract(int num1, int num2)
	{
	  int sub=num1-num2;
	  return sub;
	}
	private static int multiply(int num1, int num2)
	{
	  int multi=num1*num2;
	  return multi;
	}
	private static int division(int num1, int num2)
	{
	  int div=num1/num2;
	  return div;
	}
	public static void main(String[] args) 
	{
		int num1=150;
		int num2=75;
	
		int result1=subtract(num1, num2);
		System.out.println("Subtraction : "+result1);

		int result3= multiply(num1,num2);
		System.out.println("multiplication : "+result3);

		int result4= division(num1,num2);
		System.out.println("division : "+result4);
	}
}


