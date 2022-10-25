package Lab2;

public class Lab2
{
	private static int add(int value1, int value2)
	{
		return value1 + value2;
	}
	
	private static int sub(int value1, int value2)
	{
		return value1 - value2;
	}
	
	private static double multiply(double value1, double value2)
	{
		return value1 * value2;
	}
	
	private static double divide(double value1, double value2)
	{
		return value1 / value2;
	}
	
	public static void main(String args[])
	{	
		int sum = Lab2.add(1, 2);
		int difference = Lab2.sub(1, 2);
		double product = Lab2.multiply(1.0, 2.0);
		double quotient = Lab2.divide(1.0, 2.0);
		
		System.out.println("Sum = " + sum);
		System.out.println("Difference = " + difference);
		System.out.println("Product = " + product);
		System.out.println("Quotient = " + quotient);
	}

}
