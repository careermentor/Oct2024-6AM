package org.xyz.automation.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TheTestingWorld 
{
	WebDriver driver;
	
	@Test
	public void otherfields() throws Exception
	{
		driver= new EdgeDriver();
		
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement uid = driver.findElement(By.name("fld_username"));
		uid.sendKeys("user1");
		
		driver.findElement(By.name("fld_username")).clear();
		driver.findElement(By.name("fld_username")).sendKeys("user2");
		
		driver.findElement(By.id("datepicker")).sendKeys("07/18/1981");
		driver.findElement(By.xpath("//a[text()='18']")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		//gen.selectByIndex(1);  //Male
		//gen.selectByValue("2");  //Female
		gen.selectByVisibleText("Male");
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		//con.selectByVisibleText("India");
		//con.deselectByVisibleText("United States");
		//con.deselectAll();
		//con.selectByVisibleText("United Kingdom");
		
		Select st = new Select(driver.findElement(By.name("state")));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));	
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Arizona"));
		st.selectByVisibleText("Florida");
		
		Select ct = new Select(driver.findElement(By.name("city")));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("cityId")), "Dania"));
		ct.selectByVisibleText("Beach");
		
		
		driver.findElement(By.name("terms")).click();
		//driver.findElement(By.className("displayPopup")).click();
		
		//driver.findElement(By.className("close")).click();
		
	}
	
	@Test(enabled=false)
	public void launchBrowser() throws Exception
	{
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://thetestingworld.com/testings/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		driver.close(); //one window will close
		driver.quit();  //all window will close 
	}
	
}
