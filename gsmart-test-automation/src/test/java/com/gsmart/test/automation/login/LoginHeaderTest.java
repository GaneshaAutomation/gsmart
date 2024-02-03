package com.gsmart.test.automation.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;
import com.gsmart.test.automation.pages.login.LoginPage;

public class LoginHeaderTest extends GsmartBaseTest {

	public static final Logger logger = LogManager.getLogger(LoginHeaderTest.class);
	// Trying to find locator before application is launched

	// Launch and verify login link

	// WebDriver provides a solution - PageFactory annotations
	// Initailly these Webelements will be null

	HomePage homePage;
	LoginPage loginpage;

	@Test
	public void launchAndVerifyLoginLinkTest() {
		// Helps you to avoid null pointer exceptions for the global varibale
		logger.info("Launching the URL " + url);
		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isMainHeaderPresent(), "Main header not loaded, test failed");
		Assert.assertTrue(homePage.isLoginLinkPresent(), "login Link not loaded, test failed");

	}

	// Navigate to Login page
	@Test(dependsOnMethods = "launchAndVerifyLoginLinkTest")
	public void navigateToLoginTest() {
		logger.info("Clicking on Loign link ");
		loginpage = homePage.clickOnLoginLink();

		Assert.assertTrue(loginpage.isLoginHeaderPresent(), "Login header not loaded, test failed");
	}

}
