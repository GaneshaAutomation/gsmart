package com.gsmart.test.automation.landing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;

public class FieldsValidationTest extends GsmartBaseTest {
	
	public static final Logger logger = LogManager.getLogger(FieldsValidationTest.class);


	@Test
	public void launchTest() {
		logger.info(" Execution started for - launchTest ");
		logger.info(" Launching the URL " + url);
		driver.get(url);
		WebElement header = driver.findElement(By.xpath("//h2[contains(text(),'GS Mart')]")); 
		logger.info(" Verifying the header text");
		Assert.assertTrue(header.isDisplayed(), "Header is not loaded");
		
		logger.info(" launchTest is successful ");


	}

	
	@Test(dependsOnMethods = "launchTest")
	public void fieldsValidationTest() {
		logger.info(" Execution started for - fieldsValidationTest ");
		WebElement header = driver.findElement(By.xpath("//h2[contains(text(),'GS Mart')]")); 
		logger.info(" Verifying the header text");
		Assert.assertTrue(header.isDisplayed(), "Header is not loaded");

		WebElement searchBox = driver.findElement(By.name("search")); 
		logger.info(" Verifying the Search box");
		Assert.assertTrue(searchBox.isDisplayed(), "Search is not loaded");
		
		logger.info(" fieldsValidationTest is successful ");

		
	}
}
