package basicPkg;

public class FirstClass 
{
	 int a=20;   // global variable
	 
	 public static void main(String[] args) 
		{
			FirstClass abc = new FirstClass();
			abc.variableType();
			abc.printval();
			
		}
	
	 public void printval()
	{
		final int a=10;   // local variable
		// a=100;
		 
			float b = 10.5f;
			String c="Java";
			char d = 'A';
			boolean e = true;
			
		System.out.println(a);  //10
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	 
	 public void variableType()
	 {
		 System.out.println(a);  //20
	 }
	
	
	
	
	
	
	
	
}
