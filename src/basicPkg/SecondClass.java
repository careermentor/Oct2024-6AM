package basicPkg;

public class SecondClass 
{

	public static void main(String[] args)
	{
		int a=10;
		float b = 10.5f;
		String c="Java";
		char d = 'A';
		boolean e = true;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		FirstClass abc = new FirstClass();
		abc.printval();
	}

}
