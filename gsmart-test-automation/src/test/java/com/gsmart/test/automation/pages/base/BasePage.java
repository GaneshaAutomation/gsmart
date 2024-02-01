package com.gsmart.test.automation.pages.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gsmart.test.automation.pages.home.HomePage;
import com.gsmart.test.automation.pages.register.RegisterPage;

public class BasePage {

	// ALl common components for pages wil l be added here

	public static WebDriver driver;
	public static final Logger logger = LogManager.getLogger(BasePage.class);

	public BasePage() {
		super();
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "Shopping Center")
	WebElement logoLink;
	
	@FindBy(linkText = "Register")
	WebElement registerLink;

	public boolean isLogoLinkPresent() {
		logger.info("Verifying Logo link");
		boolean present = logoLink.isDisplayed();
		return present;
	}
	
	public boolean isRegisterLinkPresent() {
		logger.info("Verifying registerLink ");
		boolean present = registerLink.isDisplayed();
		return present;
	}

	public HomePage clickOnLogo() {
		logger.info("Clikcing on Logo ");
		logoLink.click();
		HomePage homePage = new HomePage();
		return homePage;
	}
	
	public RegisterPage clickOnRegister() {
		logger.info("Clikcing on Register link ");
		registerLink.click();
		RegisterPage registerPage = new RegisterPage();
		return registerPage;
	}

}
