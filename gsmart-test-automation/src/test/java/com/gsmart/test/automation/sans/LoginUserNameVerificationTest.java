package com.gsmart.test.automation.sans;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;
import com.gsmart.test.automation.pages.login.LoginPage;

public class LoginUserNameVerificationTest extends GsmartBaseTest{

//	Team A
//
//	1. Launch, Login, username and pwd fields
//	2. Launch, Login, enter username, pwd and clear
//	3. Launch, Login, verify header texts (username, password and Login As)
//	4. Launch, Login, select Admin from the dropdown
	
	HomePage homePage;
	LoginPage loginPage;
	
	@Test
	public void launchTest() {
		
		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isBuyNowButtonPresent(), "Buy now btn is not present");
	}
	
	@Test(dependsOnMethods = "launchTest")
	public void navigateToLoginPageTest() {
		
		loginPage = homePage.clickOnLoginLink();
		Assert.assertTrue(loginPage.isLoginHeaderPresent(), "Login Header is not present");
	}
	
	@Test(dependsOnMethods = "navigateToLoginPageTest")
	public void assertUserNamePasswordTest() {
		
		Assert.assertTrue(loginPage.isUserNameFieldPresent(), "User Name field is not present");
		Assert.assertTrue(loginPage.isPasswordFieldPresent(), "Password field is not present");
		
	}
	
	
	
	
}
