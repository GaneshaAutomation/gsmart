package com.gsmart.test.automation.pages.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.gsmart.test.automation.pages.base.BasePage;
import com.gsmart.test.automation.pages.home.HomePage;

public class LoginPage extends BasePage {

	// All Elements of the page

	// Elements validations

	// Actions(type, click) and Navigations
	public static final Logger logger = LogManager.getLogger(LoginPage.class);

	@FindBy(xpath = "//h2[contains(text(),'Login Form')]")
	WebElement loginHeader;
	
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement loginButton;

	@FindBy(name = "username")
	WebElement userNameField;
	
	@FindBy(id = "home1")
	WebElement localHomeLink;

	@FindBy(name = "password")
	WebElement passwordField;

	@FindBy(xpath = "//label[contains(text(),'Username')]")
	WebElement userNameHeader;

	@FindBy(xpath = "//label[contains(text(),'Password')]")
	WebElement passwordHeader;

	@FindBy(xpath = "//label[contains(text(),'Login As')]")
	WebElement loginAsHeader;
	
	@FindBy(id = "userrole")
	WebElement userRole;
	
	public boolean isUserRoleDropDownPresent() {

		logger.info("Verifying UserRoleDropDown");
		boolean isPresent = userRole.isDisplayed();
		return isPresent;
	}
	public void selectAdminFromDropdown() {
		logger.info("selecting selectAdminFromDropdown");
		Select userRoleDropdown = new Select(userRole);
		userRoleDropdown.selectByVisibleText("ADMIN");
	
	
	}
	public boolean isLoginHeaderPresent() {

		logger.info("Verifying loginHeader");
		boolean isPresent = loginHeader.isDisplayed();
		return isPresent;

	}
	
	public void clickOnLoginButton() {
		logger.info("Clicking on login btn");
		loginButton.click();
	}

	public boolean isUserNameHeaderPresent() {

		logger.info("Verifying username header");
		boolean isPresent = userNameHeader.isDisplayed();
		return isPresent;

	}

	public boolean isPasswordHeaderPresent() {

		logger.info("Verifying password header");
		boolean isPresent = passwordHeader.isDisplayed();
		return isPresent;

	}

	public boolean isLoginAsHeaderPresent() {

		logger.info("Verifying loginAS header");
		boolean isPresent = loginAsHeader.isDisplayed();
		return isPresent;

	}

	public boolean isUserNameFieldPresent() {

		logger.info("Verifying username field");
		boolean isPresent = userNameField.isDisplayed();
		return isPresent;

	}

	public boolean isPasswordFieldPresent() {

		logger.info("Verifying password field");
		boolean isPresent = passwordField.isDisplayed();
		return isPresent;

	}

	public void typeUsername(String username) {
		logger.info("Typing Username field");
		userNameField.sendKeys(username);

	}

	public void clearUsername() {
		logger.info("Clearing Username field");
		userNameField.clear();

	}

	public void typePassword(String password) {
		logger.info("Typing Password field");
		passwordField.sendKeys(password);
	}

	public void clearPassword() {
		logger.info("Clearing Password field");
		passwordField.clear();

	}
	public HomePage clickInternalHome() {
		logger.info("clicking the internal home link ");
		HomePage homePage = new HomePage();
		localHomeLink.click();
		return homePage;
	}
}
