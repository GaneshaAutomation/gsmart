package com.gsmart.test.automation.sksj;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.exercise.ExercisePage;
import com.gsmart.test.automation.pages.home.HomePage;

public class ExerciseAndCityDd extends GsmartBaseTest {

	public static final Logger logger = LogManager.getLogger(ExerciseAndCityDd.class);

	HomePage homePage;
	ExercisePage exercisePage;

	@Test
	public void launchAndExerciseTabTest() {

		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isMainHeaderPresent(), "Home page not loaded");
		exercisePage = homePage.clickOnExercise();
		Assert.assertTrue(exercisePage.isCorpInfoPresent(), "Exercise page not loaded");

	}

	@Test(dependsOnMethods = "launchAndExerciseTabTest")
	public void cityDDTest() {

		exercisePage.selectCityDd("Gilroy");

	}

}
