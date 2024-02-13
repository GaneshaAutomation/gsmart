package com.gsmart.test.automation.pages.home;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gsmart.test.automation.pages.base.BasePage;
import com.gsmart.test.automation.pages.login.LoginPage;

public class HomePage  extends BasePage{

	// All Elements of the page

	// Elements validations

	// Actions(type, click) and Navigations

	

	public static final Logger logger = LogManager.getLogger(HomePage.class);

	@FindBy(xpath = "//h2[contains(text(),'GS Mart')]")
	WebElement header;

	@FindBy(name = "search")
	WebElement searchBox;

	
	
	@FindBy(id = "home2")
	WebElement localHomeLink;
	
	@FindBy(xpath = "//input[@value='Search']")
	WebElement searchButton;

	@FindBy(xpath = "//button[contains(text(),'Add to Cart')]")
	WebElement addToCartBtn;

	@FindBy(xpath = "//div[contains(text(),'Showing')]")
	WebElement successMessageForSearch;

	@FindBy(xpath = "//button[contains(text(),'Buy Now')]")
	WebElement buyNowButton;

	public boolean isSuccessMessageForSearchPresent() {
		logger.info("Verifying successMessageForSearch");
		boolean present = successMessageForSearch.isDisplayed();
		return present;
	}

	public boolean isAddToCartBtnPresent() {
		logger.info("Verifying addToCartBtn");
		boolean present = addToCartBtn.isDisplayed();
		return present;
	}

	public boolean isSearchButtonPresent() {
		logger.info("Verifying searchButton");
		boolean present = searchButton.isDisplayed();
		return present;
	}

	public boolean isHeaderPresent() {
		logger.info("Verifying Header");
		boolean present = header.isDisplayed();
		return present;
	}

	public boolean isSearchBoxPresent() {
		logger.info("Verifying Search box");
		boolean present = searchBox.isDisplayed();
		return present;
	}

	public void searchForProduct(String productText) {
		logger.info("Searching for " + productText);
		searchBox.sendKeys(productText);
	}

	public void clearSearchBox() {
		logger.info("Clearing the search ");
		searchBox.clear();
	}

	public void clickOnSearchButton() {
		logger.info("Clicking on Search btn");
		searchButton.click();
	}

	public boolean isBuyNowButtonPresent() {
		logger.info("Verifying buynowButton ");
		boolean present = buyNowButton.isDisplayed();
		return present;

	}

	public LoginPage clickOnBuyNowButton() {
		logger.info("Clicking on buyNowbtn");
		buyNowButton.click();
		LoginPage loginPage = new LoginPage();
		return loginPage;
	}
	public void clickOnAddToCartButton() {
		logger.info("Clicking on add to cart");
		addToCartBtn.click();
		
		
	}

	@Override
	public HomePage clickInternalHome() {
		logger.info("clicking the internal home link ");
		HomePage homePage = new HomePage();
		localHomeLink.click();
		return homePage;
	}
}