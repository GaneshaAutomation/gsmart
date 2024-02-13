package com.gsmart.test.automation.kspn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;
import com.gsmart.test.automation.pages.register.RegisterPage;

public class SimpleRegister2Test extends GsmartBaseTest{
	public static final Logger logger = LogManager.getLogger(SimpleRegisterTest.class);
	HomePage homePage;
	RegisterPage registerPage;
	@Test
	public void launchTest() {
		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isMainHeaderPresent(), "Main header not loaded, test failed");
	}
	@Test(dependsOnMethods = "launchTest")
	public void registerTest() {
		registerPage = homePage.clickOnRegister();
		Assert.assertTrue(registerPage.isRegHeaderPresent(), "Register page not laoaded");

	}
	@Test(dependsOnMethods = "registerTest")
	public void nameEmailAddValidationTest() {
		Assert.assertTrue(registerPage.isnameFieldPresent(), "NameField is not Present");
		Assert.assertTrue(registerPage.isEmailFieldPresent(), "EmailField is not Present");
		Assert.assertTrue(registerPage.isAddressFieldPresent(), "addressField is not Present");
	}
	
}
