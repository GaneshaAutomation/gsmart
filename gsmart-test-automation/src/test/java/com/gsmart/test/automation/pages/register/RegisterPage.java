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
	
	@FindBy(xpath = "//button[contains(text(),'Regist')]")
	WebElement registerButton;
	

	@FindBy(xpath = "//button[contains(text(),'Reset')]")
	WebElement resetButton;

	@FindBy(xpath = "//button[contains(text(),'Register')]")
	WebElement registerButton;

	@FindBy(id = "first_name")
	WebElement nameField;

	@FindBy(id = "last_name")
	WebElement emailField;

	@FindBy(name = "address")
	WebElement addressField;

	@FindBy(name = "mobile")
	WebElement mobileField;

	@FindBy(name = "pincode")
	WebElement pincodeField;

	@FindBy(name = "password")
	WebElement passwordField;

	@FindBy(name = "confirmPassword")
	WebElement confirmPasswordField;

	public boolean isConfirmPasswordFieldPresent() {
		logger.info("Verifying the ConfirmpasswordField ");
		boolean isPresent = confirmPasswordField.isDisplayed();
		return isPresent;
	}

	public boolean isPasswordFieldPresent() {
		logger.info("Verifying the passwordField ");
		boolean isPresent = passwordField.isDisplayed();
		return isPresent;
	}

	public boolean isPincodeFieldPresent() {
		logger.info("Verifying the pincodeField ");
		boolean isPresent = pincodeField.isDisplayed();
		return isPresent;
	}

	public boolean isMobileFieldPresent() {
		logger.info("Verifying the MobileField ");
		boolean isPresent = mobileField.isDisplayed();
		return isPresent;
	}

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
	
	public void clickOnRegisterButton() {
		logger.info("Clicking on Register btn");
		registerButton.click();
	}

	public void enterName(String name) {
		logger.info("enter the name");
		nameField.sendKeys(name);

	}

	public void enterEmail(String email) {
		logger.info("enter the email");
		emailField.sendKeys(email);
	}
	public void clickResetButton() {
		logger.info("Clicking on ResetButton");
		resetButton.click();
	}
	
	
	
	

}
