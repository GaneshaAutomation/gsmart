package com.gsmart.test.automation.pspi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;
import com.gsmart.test.automation.pages.login.LoginPage;

public class LaunchLoginAndEmailPartTest extends GsmartBaseTest {
	public static final Logger logger = LogManager.getLogger(LaunchLoginAndEmailPartTest.class);
	HomePage homePage;
	LoginPage loginPage;

	@Test
	public void launchTest() {
		logger.info("launching the url" + url);
		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isHeaderPresent(), "Header is not launched");
	}

	@Test(dependsOnMethods = "launchTest")
	public void loginAndNavigationTest() {
		logger.info("Verifying loginLink");
		homePage.isLoginLinkPresent();
		logger.info("Clicking on login Link");
		loginPage = homePage.clickOnLoginLink();
		Assert.assertTrue(loginPage.isLoginHeaderPresent(), "login Header is not present");

	}

	@Test(dependsOnMethods = "loginAndNavigationTest")
	public void emailBoxTest() {
		logger.info("Verifying emailBoxFooter");
		loginPage.isEmailFooterBoxPresent();
		Assert.assertTrue(loginPage.isEmailFooterBoxPresent(), "email footer box  is not present");

	}

}
