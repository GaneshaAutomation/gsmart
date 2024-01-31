package com.gsmart.test.automation.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;

public class LoginNavigationTest extends GsmartBaseTest {
	public static final Logger logger = LogManager.getLogger(LoginNavigationTest.class);

	@FindBy(linkText = "login")
	WebElement loginLink;

	@FindBy(xpath = "//h2[contains(text(),'Login Form')]")
	WebElement loginHeader;

	@FindBy(xpath = "//a[@href='index.jsp']")
	WebElement homeLink;

	@FindBy(xpath = "//button[contains(text(),'Add to Cart')]")
	WebElement addToCart;

	@Test
	public void launchAndNavigateToLoginTest() {

		logger.info("Launching the url");
		driver.get(url);
		Assert.assertTrue(loginLink.isDisplayed(), "login link not displayed");
		logger.info("Navigating to Login page");
		loginLink.click();
		Assert.assertTrue(loginHeader.isDisplayed(), "Login headernot present ");
	}

	@Test(dependsOnMethods = "launchAndNavigateToLoginTest")
	public void navigateToHomeTest() {
		logger.info("clicking home link");
		homeLink.click();
		Assert.assertTrue(addToCart.isDisplayed(), "addToCart button is not present ");
	}

}
