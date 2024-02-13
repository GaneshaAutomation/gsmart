package com.gsmart.test.automation.pspi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.exercise.ExercisePage;
import com.gsmart.test.automation.pages.home.HomePage;

public class ExerciseAndFooterGaneshTest extends GsmartBaseTest {
	public static final Logger logger = LogManager.getLogger(ExerciseAndFooterGaneshTest.class);
	HomePage homePage;
	ExercisePage exercisePage;

	@Test
	public void launchTest() {
		logger.info("launching url" + url);
		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isMainHeaderPresent(), "main Header is not present");
	}

	@Test(dependsOnMethods = "launchTest")
	public void exercisePageTest() {
		logger.info("verifying Exercise link");
		homePage.isExerciseLinkPresent();
		Assert.assertTrue(homePage.isExerciseLinkPresent(), "exerciselink  is not present");
		exercisePage = homePage.clickOnExercise();
		Assert.assertTrue(exercisePage.isCorpInfoPresent(), "CorpInfo  is not present");
	}

	@Test(dependsOnMethods = "exercisePageTest")
	public void footerGaneshTest() {
		logger.info("verifying Ganesh automation text");
		exercisePage.isfooterGaneshTextPresent();
		Assert.assertTrue(exercisePage.isfooterGaneshTextPresent(), "ganesh automation text  is not present");
	}
}
