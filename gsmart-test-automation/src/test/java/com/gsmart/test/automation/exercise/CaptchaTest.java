package com.gsmart.test.automation.exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.exercise.ExercisePage;
import com.gsmart.test.automation.pages.home.HomePage;

public class CaptchaTest extends GsmartBaseTest{
	
	HomePage homePage;
	ExercisePage exercisePage;
	
	@Test
	public void launchAndNavigateToExerciseTest() {
		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isAddToCartBtnPresent(), "Home not loaded");
		exercisePage = homePage.clickOnExercise();
		Assert.assertTrue(exercisePage.isCorpInfoPresent(), "Exercise page is not loaded");
	}
	
	@Test(dependsOnMethods = "launchAndNavigateToExerciseTest")
	public void enterCaptchaTest() {
		// Challenge : There is a scenario where user has to enter the captcha code
		// But that cannot be automated since it changes the code in every session(refresh)
		// Reason - generates a different code every time to avoid automation
		// Solution - Developers provided a bypass key that works only in QA environments
		exercisePage.enterCaptchaCode("8888888");
		
	}

}
