package com.gsmart.test.automation.pages.exercise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.gsmart.test.automation.pages.base.BasePage;

public class ExercisePage extends BasePage {

	public static final Logger logger = LogManager.getLogger(ExercisePage.class);

	// WebElements
	// Validation
	// Actions, Navigations
	@FindBy(xpath = "//button[contains(text(),'Cor')]")
	WebElement corpInfo;

	@FindBy(xpath = " //button[contains(text(),\"SocialMedia\")]")
	WebElement socialMedia;

	@FindBy(id = "location")
	WebElement cityDropDown;

	@FindBy(id = "vehicle")
	WebElement carDropDown;

	@FindBy(id = "generation")
	WebElement ageDropDown;

	public boolean isCarDropDownPresent() {
		logger.info("Verifying car dropdown");
		boolean isPresent = carDropDown.isDisplayed();
		return isPresent;
	}

	public boolean isCityDropDownPresent() {
		logger.info("Verifying city dropdown");
		boolean isPresent = cityDropDown.isDisplayed();
		return isPresent;
	}

	public boolean isCorpInfoPresent() {
		logger.info("Verifying Corp info tab");
		boolean isPresent = corpInfo.isDisplayed();
		return isPresent;
	}

	public boolean isSocialMediaPresent() {
		logger.info("Verifying Social Media Button");
		boolean isPresent = socialMedia.isDisplayed();
		return isPresent;
	}

	public boolean isAgeDropDownPresent() {
		logger.info("Verifying age dropdown");
		boolean isPresent = ageDropDown.isDisplayed();
		return isPresent;
	}

	public void selectCityDd(String city) {

		logger.info("Selecting City from Dropdown");
		Select cityDropdown = new Select(cityDropDown);
		cityDropdown.selectByVisibleText(city);

	}

	public void selectCarDd(String car) {

		logger.info("Selecting Car from Dropdown");
		Select carDropdown = new Select(carDropDown);
		carDropdown.selectByVisibleText(car);

	}

	public void selectAgeDd(int age) {

		logger.info("Selecting Age from Dropdown");
		Select ageDropdown = new Select(ageDropDown);
		ageDropdown.selectByIndex(age);

	}
}
