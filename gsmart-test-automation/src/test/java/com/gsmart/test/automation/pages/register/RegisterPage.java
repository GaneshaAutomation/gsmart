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
	
	@FindBy(id="first_name")
	WebElement nameField;
	
	@FindBy(id="last_name")
	WebElement emailField;
	
	@FindBy(name="address")
	WebElement addressField;
	
	public boolean isAddressFieldPresent() {
		logger.info("Verifying the addressField ");
		boolean isPresent = addressField.isDisplayed();
		return isPresent;
	}
	
	
	public boolean isEmailFieldPresent() {
		logger.info("Verifying the emailField ");
		boolean isPresent = emailField.isDisplayed();
		return isPresent;
	}
	
	

	
	public boolean isnameFieldPresent() {
		logger.info("Verifying the nameField ");
		boolean isPresent = nameField.isDisplayed();
		return isPresent;

	}
	
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
