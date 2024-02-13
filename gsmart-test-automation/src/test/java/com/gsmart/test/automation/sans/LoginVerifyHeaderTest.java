package com.gsmart.test.automation.sans;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;
import com.gsmart.test.automation.pages.login.LoginPage;

public class LoginVerifyHeaderTest extends GsmartBaseTest{
	//3. Launch, Login, verify header texts (username, password and Login As)
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
	public void verifyHeadersTest() {
		
		Assert.assertTrue(loginPage.isUserNameHeaderPresent(), "Username Header is not present");
		Assert.assertTrue(loginPage.isPasswordHeaderPresent(), "Password Header is not present");
		Assert.assertTrue(loginPage.isLoginAsHeaderPresent(), "LoginAs Header is not present");
	}
}
