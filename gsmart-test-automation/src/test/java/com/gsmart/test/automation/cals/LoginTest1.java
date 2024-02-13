package com.gsmart.test.automation.cals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;
import com.gsmart.test.automation.pages.login.LoginPage;

public class LoginTest1 extends GsmartBaseTest {
	HomePage homePage;
	LoginPage loginPage;

	@Test

	public void launchTest() {
		homePage = new HomePage();
		driver.get(url);
		Assert.assertTrue(homePage.isBuyNowButtonPresent(), "buy now button is not loaded");

	}
	
	@Test(dependsOnMethods ="launchTest" )
	public void goToLoginpage() {
		loginPage=homePage.clickOnLoginLink();
		Assert.assertTrue(loginPage.isLoginHeaderPresent(), "login header is not loaded");
		loginPage.clickOnLoginButton();
		
		
		
	}

}
