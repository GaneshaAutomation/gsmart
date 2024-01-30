package com.gsmart.test.automation.landing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;

public class FieldsValidationTest extends GsmartBaseTest {
	
	public static final Logger logger = LogManager.getLogger(FieldsValidationTest.class);

    @FindBy(xpath = "//h2[contains(text(),'GS Mart')]")
    WebElement header;
    
    @FindBy(name = "search")
    WebElement searchBox;
    
	@Test
	public void launchTest() {
		PageFactory.initElements(driver, this);
		logger.info(" Execution started for - launchTest ");
		logger.info(" Launching the URL " + url);
		driver.get(url); 
		logger.info(" Verifying the header text");
		Assert.assertTrue(header.isDisplayed(), "Header is not loaded");
		logger.info(" launchTest is successful ");
	}

	
	@Test(dependsOnMethods = "launchTest")
	public void fieldsValidationTest() {
		logger.info(" Execution started for - fieldsValidationTest "); 
		logger.info(" Verifying the header text");
		Assert.assertTrue(header.isDisplayed(), "Header is not loaded");
		logger.info(" Verifying the Search box");
		Assert.assertTrue(searchBox.isDisplayed(), "Search is not loaded");
		
		logger.info(" fieldsValidationTest is successful ");

		
	}
}
