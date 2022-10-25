package Lab1;

public class Lab1
{
	private static double getRoundedPI(int decimalPlaces)
	{
		double decimalMultiplier = 1.0;
		
		for (int decimalPlace = 0; decimalPlace < decimalPlaces; decimalPlace++)
			decimalMultiplier *= 10.0;
		
		return Math.round(Math.PI * decimalMultiplier) / decimalMultiplier;
	}
	
	public static void main(String args[])
	{
		boolean boo = true;
		byte maxByte = Byte.MAX_VALUE;
		short minShort = Short.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		long javaFlex = 3_000_000_000L;
		float pie = (float) getRoundedPI(5);
		double doubleYum = 2.0 * getRoundedPI(5);
		
		System.out.println("boo = " + boo);
		System.out.println("maxByte = " + maxByte);
		System.out.println("minShort = " + minShort);
		System.out.println("maxInt = " + maxInt);
		System.out.println("javaFlex = " + javaFlex);
		System.out.println("pie = " + pie);
		System.out.println("doubleYum = " + doubleYum);
		
	}
}

