package org.wipro.automation.aumw.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.wipro.automation.aumw.basePkg.InitiateBrowser;
import org.wipro.automation.aumw.dataGenerator.TestDataGenarators;
import org.wipro.automation.aumw.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test(dataProvider="dd2",dataProviderClass=TestDataGenarators.class)
	public void tc01_validatesignup_validfirstnamelastname(String fname, String lname) throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewaccountbttn();
		sign.enter_firstname(fname);
		sign.enter_lastname(lname);
		
		driver.findElement(By.name("reg_email__")).sendKeys("modisantosh@gmail.com");
		
		sign.select_dob_day("20");
		sign.click_gender_male();
		sign.click_signupBttn();
	}
	
	
	
	
	
}
