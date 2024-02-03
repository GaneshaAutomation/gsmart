package com.gsmart.test.automation.pspi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;
import com.gsmart.test.automation.pages.register.RegisterPage;

public class RegisterPageStudentFooterTest extends GsmartBaseTest {
	public static final Logger logger = LogManager.getLogger(RegisterPageStudentFooterTest.class);
	HomePage homePage;
	RegisterPage registerPage;

	@Test
	public void launchTest() {
		logger.info("Launching url" + url);
		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isHeaderPresent(), "Header is not launched");
	}

	@Test(dependsOnMethods = "launchTest")
	public void registerTest() {
		logger.info("Verifying Register Link");
		homePage.isRegisterLinkPresent();
		logger.info("Clicking on Register Link");
		registerPage = homePage.clickOnRegister();
		Assert.assertTrue(registerPage.isRegHeaderPresent(), "Register Header is not present");
	}

	@Test(dependsOnMethods = "registerTest")
	public void studentNoteFooterTest() {
		logger.info("Verifying student Footer note");
		registerPage.isStudentNoteFooterPresent();
		Assert.assertTrue(registerPage.isStudentNoteFooterPresent(),
				"Student note footer is not present in registerpage");
	}
}
