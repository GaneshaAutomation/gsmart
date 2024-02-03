package com.gsmart.test.automation.pages.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gsmart.test.automation.pages.exercise.ExercisePage;
import com.gsmart.test.automation.pages.home.HomePage;
import com.gsmart.test.automation.pages.login.LoginPage;
import com.gsmart.test.automation.pages.register.RegisterPage;

public class BasePage {

	// ALl common components for pages wil l be added here

	public static WebDriver driver;
	public static final Logger logger = LogManager.getLogger(BasePage.class);
	private static final String WebElement = null;

	public BasePage() {
		super();
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "login")
	WebElement loginLink;

	@FindBy(linkText = "Shopping Center")
	WebElement logoLink;

	@FindBy(linkText = "Register")
	WebElement registerLink;

	@FindBy(linkText = "Exercise")
	WebElement exerciseLink;

	@FindBy(xpath = "//h2[contains(text(),'GS Mart')]")
	WebElement mainHeader;

	@FindBy(xpath = "//h3[contains(text(),'Contact')]")
	WebElement contactFooter;

	@FindBy(xpath = "//em[contains(text(),'We')]")
	WebElement weLoveFooter;

	@FindBy(id = "comments")
	WebElement commentsFooter;
	
	@FindBy(xpath = "//p[contains(text(),'Student?')]")
	WebElement studentNoteFooter;
	

	public boolean isCommentsFooterBoxPresent() {
		logger.info("Verifying Comments Footer box ");
		boolean present = commentsFooter.isDisplayed();
		return present;
	}

	public void clearCommentsFooterBox() {
		logger.info("Clearing the Comments footer box ");
		commentsFooter.clear();
	}
	
	public boolean isStudentNoteFooterPresent() {
		logger.info("Verifying Student Note Footer ");
		boolean present = studentNoteFooter.isDisplayed();
		return present;
	}

	
	public void typingFooterComment(String comment) {
		logger.info("Typing the Comments in footer box ");
		commentsFooter.sendKeys(comment);
	}

	public boolean isContactFooterPresent() {
		logger.info("Verifying Contact Footer");
		boolean present = contactFooter.isDisplayed();
		return present;
	}

	public boolean isWeLoveFooterPresent() {
		logger.info("Verifying We Love Footer");
		boolean present = weLoveFooter.isDisplayed();
		return present;
	}

	public boolean isMainHeaderPresent() {
		logger.info("Verifying mainHeader");
		boolean present = mainHeader.isDisplayed();
		return present;
	}

	public boolean isExerciseLinkPresent() {
		logger.info("Verifying exerciseLink");
		boolean present = exerciseLink.isDisplayed();
		return present;
	}

	public boolean isLoginLinkPresent() {
		logger.info("Verifying loginLink");
		boolean present = loginLink.isDisplayed();
		return present;
	}

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

	public ExercisePage clickOnExercise() {
		logger.info("Clikcing on Exercise ");
		exerciseLink.click();
		ExercisePage exercisePage = new ExercisePage();
		return exercisePage;
	}

	public LoginPage clickOnLoginLink() {
		logger.info("Clikcing on login link ");
		loginLink.click();
		LoginPage loginPage = new LoginPage();
		return loginPage;
	}

	public RegisterPage clickOnRegister() {
		logger.info("Clikcing on Register link ");
		registerLink.click();
		RegisterPage registerPage = new RegisterPage();
		return registerPage;
	}

}
