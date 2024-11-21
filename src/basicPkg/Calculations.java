package basicPkg;

public class Calculations
{
	public int sum(int a, int b)  //with parameter/with arguments, input needed
	{
		int c = a+b;
		System.out.println("This is sum of a&b: " + c);
		return c;
	}
	
	
	public int addition()  //no arguments/no parameter/no input needed
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		
		//float d = 10.5f;
		
		System.out.println("This is addition of a&b: " + c);
		return c;
	}

	
	public static void main(String x)
	{
		System.out.println("main method");
	}
	
	
	public static void main(String[] args)
	{
		
		Calculations cal = new Calculations(40,50); //constructor will be automatically called
		Calculations cal1 = new Calculations();
		
		int x = cal.addition();  //50
		cal1.sum(x, 40);
		
		int y = cal.sum(20,30);
		cal.sum(y, 50);
		
		Calculations.main("Testing");
	
	}
	
	
	
	public Calculations()
	{
		System.out.println("this is constructor type 1");
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("addition using constructor " + c);
		
	}
	
	
	public Calculations(int a, int b)
	{
		System.out.println("this is constructor type 2");
		
		int c = a+b;
		System.out.println("addition using constructor " + c);
		
	}
	
	public Calculations(int a, float b)
	{
		System.out.println("this is constructor type 2");
		
		float c = a+b;
		System.out.println("addition using constructor " + c);
		
	}

}
