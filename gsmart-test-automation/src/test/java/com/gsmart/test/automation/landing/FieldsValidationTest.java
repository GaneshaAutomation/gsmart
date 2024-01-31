package com.gsmart.test.automation.landing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;

public class FieldsValidationTest extends GsmartBaseTest {
	
	// Test should not have WebElements
	
	HomePage homePage;
	public static final Logger logger = LogManager.getLogger(FieldsValidationTest.class);

    
	@Test
	public void launchTest() {
		logger.info(" Execution started for - launchTest ");
		logger.info(" Launching the URL " + url);
		driver.get(url); 
		homePage = new HomePage();
		logger.info(" Verifying the header text");
		Assert.assertTrue(homePage.isHeaderPresent(), "Header is not loaded");
		logger.info(" launchTest is successful ");
	}

	
	@Test(dependsOnMethods = "launchTest")
	public void fieldsValidationTest() {
		logger.info(" Execution started for - fieldsValidationTest "); 
		logger.info(" Verifying the header text");
		Assert.assertTrue(homePage.isHeaderPresent(), "Header is not loaded");
		logger.info(" Verifying the Search box");
		Assert.assertTrue(homePage.isSearchBoxPresent(), "Search is not loaded");
		
		logger.info(" fieldsValidationTest is successful ");

		
	}
}
