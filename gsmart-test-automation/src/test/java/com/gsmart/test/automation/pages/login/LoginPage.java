package com.gsmart.test.automation.pages.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gsmart.test.automation.pages.base.BasePage;

public class LoginPage extends BasePage{

	// All Elements of the page

	// Elements validations

	// Actions(type, click) and Navigations
	public static final Logger logger = LogManager.getLogger(LoginPage.class);

	@FindBy(xpath = "//h2[contains(text(),'Login Form')]")
	WebElement loginHeader;

	public boolean isLoginHeaderPresent() {

		logger.info("Verifying loginHeader");
		boolean isPresent = loginHeader.isDisplayed();
		return isPresent;

	}

}
