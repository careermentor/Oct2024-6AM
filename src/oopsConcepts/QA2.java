package oopsConcepts;

public class QA2 extends QA1 
{
	
	int x = 100;
	
	
	public void printVal()
	{
		final int x = 200;
		//x=300;
		System.out.println(x); //200
		System.out.println(this.x);  //100
		System.out.println(super.x);
		
		super.sum(20, 30);
	}
	

	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
	}
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("sub of a&b: " + c);
	
	}	
	public static void main(String[] args) 	{
	
	//	QA1 q21 = new QA1();
	//	q21.sum(20, 30);
		
		QA2 q2= new QA2();
		//q2.sub(20, 30);
		q2.sum(20, 30);
		
		q2.printVal();
		
		
		
	}

	
	public void qa1im() 
	{
		
		System.out.println("this method from QA1M");
	}
	
}
