package com.gsmart.test.automation.pages.register;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gsmart.test.automation.pages.base.BasePage;

public class RegisterPage extends BasePage {

	public static final Logger logger = LogManager.getLogger(RegisterPage.class);

	@FindBy(xpath = "//h2[contains(text(),'Registration Form')]")
	WebElement registerHeader;

	@FindBy(xpath = "//button[contains(text(),'Reset')]")
	WebElement resetButton;
	
	@FindBy(xpath = "//button[contains(text(),'Register')]")
	WebElement registerButton;
	
	
	public boolean isResetButtonPresent() {
		logger.info("Verifying the Reset Button");
		boolean isPresent = resetButton.isDisplayed();
		return isPresent;

	}
	public boolean isRegisterButtonPresent() {
		logger.info("Verifying the Register Button");
		boolean isPresent = registerButton.isDisplayed();
		return isPresent;

	}

	public boolean isRegHeaderPresent() {
		logger.info("Verifying the reg header");
		boolean isPresent = registerHeader.isDisplayed();
		return isPresent;

	}

}
