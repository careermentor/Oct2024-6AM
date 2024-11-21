package org.wipro.automation.aumw.dataGenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenarators 
{

	@DataProvider(name="dd1")
	public Object[][] testdata1()
	{
		//String name = "java";
		//Object[] data1 = {"user1", "pass1"};  //1-dimensional array
		Object[][] data2 = {{"user1", "pass1"},{"user2", "pass2"},{"user3", "pass3"}};  //2-dimensional array
		return data2;
	}
	
	
	
	@DataProvider(name="dd2")
	public Object[][] testdata2()
	{
		//String name = "java";
		//Object[] data1 = {"user1", "pass1"};  //1-dimensional array
		Object[][] data2 = {{"fname1", "lname1"},{"fname2", "lname2"},{"fname3", "lname3"}};  //2-dimensional array
		return data2;
	}
	
}
