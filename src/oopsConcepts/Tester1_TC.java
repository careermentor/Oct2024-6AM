package oopsConcepts;

public class Tester1_TC extends AbsClassDemo
{

	
	public void mypass()
	{
		System.out.println("this is T1 username and password");
		
	}

	public static void main(String[] args)
	{
		
		Tester1_TC t1 = new Tester1_TC();
		t1.meth1();
		t1.meth2();
		t1.meth3();
		t1.mypass();
		
	}
	
}
