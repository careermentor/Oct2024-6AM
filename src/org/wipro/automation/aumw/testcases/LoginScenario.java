package org.wipro.automation.aumw.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.aumw.basePkg.InitiateBrowser;
import org.wipro.automation.aumw.dataGenerator.TestDataGenarators;
import org.wipro.automation.aumw.pages.LoginPage;
import org.wipro.automation.aumw.utiltiesPkg.ReadPropFiles;

public class LoginScenario extends InitiateBrowser
{

	//@Test(dataProvider="dd1",dataProviderClass=TestDataGenarators.class)
	public void tc01_validateloginfunc_validCredential(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
		//because "this.driver" is null
		
	}
	
	@Test
	public void tc02_validateloginfunc_validCredential() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(ReadPropFiles.readdata("username"));
		login.enter_password(ReadPropFiles.readdata("password"));
		login.click_loginbttn();
		
		
	
	}
	
}
