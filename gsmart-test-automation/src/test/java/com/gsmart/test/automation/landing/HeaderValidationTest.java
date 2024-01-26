package com.gsmart.test.automation.landing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;

public class HeaderValidationTest extends GsmartBaseTest{
	
	public static final Logger logger = LogManager.getLogger(HeaderValidationTest.class);
	
	@Test
	public void launchAndValidateLogoTest() {
		logger.info("Executing launchAndValidateLogoTest ");
		logger.info(" Launching the URL "+url);
		driver.get(url);
		logger.info(" validating Logo link ");
		WebElement logoLink = driver.findElement(By.linkText("Shopping Center"));
		Assert.assertTrue(logoLink.isDisplayed(), "Logo link not displayed");
		logger.info(" launchAndValidateLogoTest is successful");

	}
	
	@Test(dependsOnMethods = "launchAndValidateLogoTest")
	public void validateExerciseAndLoginlinksTest() {
		logger.info("Executing validateExerciseAndLoginlinksTest ");
		
		logger.info(" validating Exercise link ");
		WebElement exerciseLink = driver.findElement(By.linkText("Exercise"));
		Assert.assertTrue(exerciseLink.isDisplayed(), "Exercise link not displayed");
		
		logger.info(" validating Login link ");
		WebElement loginLink = driver.findElement(By.linkText("login"));
		Assert.assertTrue(loginLink.isDisplayed(), "login link not displayed");
		
		logger.info(" validateExerciseAndLoginlinksTest is successful");

	}
	

}