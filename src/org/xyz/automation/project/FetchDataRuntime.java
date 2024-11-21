package org.xyz.automation.project;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRuntime 
{
	WebDriver driver;
	
	@Test
	public void otherfields() throws Exception
	{
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		
		String expURL = "https://www.facebook.com/";
		
		driver.get(expURL);
		
		String actURL = driver.getCurrentUrl();
		System.out.println(actURL);
		
		//Assert.assertEquals(actURL, expURL);  //hard assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actURL, expURL); //soft assertion
		
		String expTitle = "Facebook – log in or sign up";
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		
		sa.assertEquals(actTitle,expTitle, "page title did not match");
		
		String expUsernametextbox = "Email address or phone number";
		String actUsernametextbox = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(actUsernametextbox);
		sa.assertEquals(actUsernametextbox, expUsernametextbox);
		
		String expLoginButton = "Log in";
		String actLoginButton = driver.findElement(By.name("login")).getText();
		System.out.println(actLoginButton);
		
		sa.assertEquals(actLoginButton, expLoginButton);
		
		Point loginloc = driver.findElement(By.name("login")).getLocation();
		System.out.println(loginloc);
		
		//System.out.println(driver.getPageSource());
		
		boolean actLoginEnabled= driver.findElement(By.name("login")).isEnabled();
		
		System.out.println(actLoginEnabled);
		sa.assertEquals(actLoginEnabled, true);
		
		driver.quit();
		
		sa.assertAll();
	}
	
	
	
}
