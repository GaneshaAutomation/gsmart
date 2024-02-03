package com.gsmart.test.automation.sans;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;
import com.gsmart.test.automation.pages.login.LoginPage;

public class LoginUserNameVerificationTest extends GsmartBaseTest{

//	1. Launch, Login, username and pwd fields
	
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
