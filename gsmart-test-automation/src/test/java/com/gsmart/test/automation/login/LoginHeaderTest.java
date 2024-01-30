package com.gsmart.test.automation.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;

public class LoginHeaderTest extends GsmartBaseTest {

	public static final Logger logger = LogManager.getLogger(LoginHeaderTest.class);
	// Trying to find locator before application is launched
	
	// Launch and verify login link
	
	// WebDriver provides a solution - PageFactory annotations
	// Initailly these Webelements will be null
	@FindBy(linkText = "login")
	WebElement loginLink;
	
	@FindBy(xpath = "//h2[contains(text(),'GS Mart')]")
	WebElement logo;
	
	@FindBy(xpath="//h2[contains(text(),'Login Form')]")
	WebElement loginHeader;
	
	@Test
	public void launchAndVerifyLoginLinkTest() {
		// Helps you to avoid null pointer exceptions for the global varibale
		PageFactory.initElements(driver, this);
		logger.info("Launching the URL " + url);
		driver.get(url);
		logger.info("Verifying the logo ");
		Assert.assertTrue(logo.isDisplayed(), "Logo not loaded, test failed");
		Assert.assertTrue(loginLink.isDisplayed(), "login Link not loaded, test failed");
		
	}

	
	// Navigate to Login page
	@Test(dependsOnMethods = "launchAndVerifyLoginLinkTest")
	public void navigateToLoginTest() {
		logger.info("Clicking on Loign link ");
		loginLink.click();
		Assert.assertTrue(loginHeader.isDisplayed(), "Login header not loaded, test failed");
	}
	
	
	
}
