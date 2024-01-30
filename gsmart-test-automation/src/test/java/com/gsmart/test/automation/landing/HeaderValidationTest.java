package com.gsmart.test.automation.landing;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;

public class HeaderValidationTest extends GsmartBaseTest {

	public static final Logger logger = LogManager.getLogger(HeaderValidationTest.class);

	@FindBy(linkText = "Shopping Center")
	WebElement logoLink;
	
	@FindBy(linkText = "Exercise")
	WebElement exerciseLink;
	
	@FindBy(linkText = "login")
	WebElement loginLink;
	
	@Test
	public void launchAndValidateLogoTest() throws IOException {
		PageFactory.initElements(driver, this);
		logger.info(" Launching the URL " + url);
		driver.get(url);
		logger.info(" validating Logo link ");
		Assert.assertTrue(logoLink.isDisplayed(), "Logo link not displayed");

	}

	
	@Test(dependsOnMethods = "launchAndValidateLogoTest")
	public void validateExerciseAndLoginlinksTest() {
		logger.info(" validating Exercise link ");
		Assert.assertTrue(exerciseLink.isDisplayed(), "Exercise link not displayed");
		logger.info(" validating Login link ");
		Assert.assertTrue(loginLink.isDisplayed(), "login link not displayed");

	}

}
