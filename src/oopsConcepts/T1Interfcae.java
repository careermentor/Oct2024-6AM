package oopsConcepts;

public class T1Interfcae implements DemoInterface
{

	
	public void m4() 
	{
		System.out.println("this is interface method4");
		
	}

	
	public void m5() 
	{
	
		System.out.println("this is interface method4");
	}

	public static void main(String[] args) {
		
		T1Interfcae t1 = new T1Interfcae();
		t1.m4();
		t1.m5();
	}
	
}
