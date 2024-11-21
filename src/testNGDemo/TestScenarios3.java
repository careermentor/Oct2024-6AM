package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenarios3 
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is my first test case");
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("this is my second test case");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("this is my third test case");
		Assert.assertEquals(true, false);
	}
	
	@Test(dependsOnMethods="third_testcase")
	public void forth_testcase()
	{
		System.out.println("this is my forth test case");
	}
	
	@Test(groups="Smoke")
	public void fifth_testcase()
	{
		System.out.println("this is my fifth test case");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("this is my sixth test case");
	}
	
	@Test(groups="Sanity")
	public void seventh_testcase()
	{
		System.out.println("this is my seventh test case");
	}
}
