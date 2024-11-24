package org.xyz.automation.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestScenario 
{
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	
	}
	
	
	public void tc01_validateSignupfunc()
	{
		
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
	}
	
	@Test
	public void tc02_validateLoginfunc()
	{
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("user1@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("pass1234");
		//driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
	}
	
}
