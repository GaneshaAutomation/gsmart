package com.gsmart.test.automation.landing;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;

public class HeaderValidationTest extends GsmartBaseTest {

	public static final Logger logger = LogManager.getLogger(HeaderValidationTest.class);
	
	// Page object Model
	// Test should not have the WebElements
     HomePage homePage;
	
	@Test
	public void launchAndValidateLogoTest() throws IOException {
		logger.info(" Launching the URL " + url);
		driver.get(url);
		logger.info(" validating Logo link ");
		homePage = new HomePage();
		Assert.assertTrue(homePage.isLogoLinkPresent(), "Logo link not displayed");

	}

	
	@Test(dependsOnMethods = "launchAndValidateLogoTest")
	public void validateExerciseAndLoginlinksTest() {
		logger.info(" validating Exercise link ");
		Assert.assertTrue(homePage.isExerciseLinkPresent(), "Exercise link not displayed");
		logger.info(" validating Login link ");
		Assert.assertTrue(homePage.isLoginLinkPresent(), "login link not displayed");

	}

}
