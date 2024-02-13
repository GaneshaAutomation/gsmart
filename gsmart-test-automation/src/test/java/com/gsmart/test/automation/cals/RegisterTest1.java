package com.gsmart.test.automation.cals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;
import com.gsmart.test.automation.pages.register.RegisterPage;

public class RegisterTest1 extends GsmartBaseTest{
	
	HomePage homePage;
	RegisterPage registerPage;
	
	@Test

	public void launchTest() {
		homePage = new HomePage();
		driver.get(url);
		Assert.assertTrue(homePage.isBuyNowButtonPresent(), "buy now button is not loaded");
	}
	
	@Test(dependsOnMethods = "launchTest")
	public void navigateToRegisterLink() {
		 
			registerPage =homePage.clickOnRegister();
			Assert.assertTrue(registerPage.isRegHeaderPresent(), "register header is not loaded");
			registerPage.clickOnRegisterButton();
			
			}
}
