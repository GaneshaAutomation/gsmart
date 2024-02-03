package com.gsmart.test.automation.sksj;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.exercise.ExercisePage;
import com.gsmart.test.automation.pages.home.HomePage;

public class ExerciseAndSocialMediaTest extends GsmartBaseTest {

	public static final Logger logger = LogManager.getLogger(ExerciseAndSocialMediaTest.class);

	HomePage homePage;
	ExercisePage exercisePage;
	
	@Test
	public void launchTest() {
		
		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isMainHeaderPresent(), "Home page not loaded");
		
	}
	
	@Test(dependsOnMethods = "launchTest")
	public void exerciseNavigationAndVerifyTest() {
		
		exercisePage = homePage.clickOnExercise();
		Assert.assertTrue(exercisePage.isSocialMediaPresent(), "Social Media button is not present");
		homePage = exercisePage.clickOnLogo();
		Assert.assertTrue(homePage.isAddToCartBtnPresent(), "Home page not loaded");
	
	}

}
