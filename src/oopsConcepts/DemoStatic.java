package oopsConcepts;

public class DemoStatic 
{
	static String name = "Java";
	
	static int x = 50;
	
	public static void printVal()
	{
		
		System.out.println(x);
	}
	
	public void nonstatic()
	{
		System.out.println("this is non static method");
	}

	public static void main(String[] args)
	{
		DemoStatic ds = new DemoStatic();
		ds.nonstatic();
		
		printVal();
		
		System.out.println(name);

	}

}
