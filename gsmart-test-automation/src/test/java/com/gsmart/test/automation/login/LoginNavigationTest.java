package com.gsmart.test.automation.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;
import com.gsmart.test.automation.pages.login.LoginPage;

public class LoginNavigationTest extends GsmartBaseTest {
	public static final Logger logger = LogManager.getLogger(LoginNavigationTest.class);

	HomePage homePage;
	LoginPage loginPage;

	@Test
	public void launchAndNavigateToLoginTest() {

		logger.info("Launching the url");
		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isLoginLinkPresent(), "login link not displayed");
		logger.info("Navigating to Login page");
		loginPage = homePage.clickOnLoginLink();
		Assert.assertTrue(loginPage.isLoginHeaderPresent(), "Login headernot present ");
	}

	@Test(dependsOnMethods = "launchAndNavigateToLoginTest")
	public void navigateToHomeTest() {
		logger.info("clicking home link");
		homePage = loginPage.clickOnLogo();
		Assert.assertTrue(homePage.isAddToCartBtnPresent(), "addToCart button is not present ");
	}

}
