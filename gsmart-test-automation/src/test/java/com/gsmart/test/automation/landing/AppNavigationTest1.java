package com.gsmart.test.automation.landing;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.exercise.ExercisePage;
import com.gsmart.test.automation.pages.home.HomePage;
import com.gsmart.test.automation.pages.login.LoginPage;
import com.gsmart.test.automation.pages.register.RegisterPage;

public class AppNavigationTest1 extends GsmartBaseTest {

	// Launch and validate buynow
	HomePage homePage;
	LoginPage loginPage;
	RegisterPage registerPage;
	ExercisePage exercisePage;

	@Test
	public void launchTest() {
		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isBuyNowButtonPresent(), "Buy now not present");
	}

	// Go to loin from home page and verify the login header
	@Test(dependsOnMethods = "launchTest")
	public void navigatToLoginTest() {
		loginPage = homePage.clickOnLoginLink();
		Assert.assertTrue(loginPage.isLoginHeaderPresent(), "Login header not present");
	}

	// Navigate to Register page
	@Test(dependsOnMethods = "navigatToLoginTest")
	public void naigateToRegTest() {
		registerPage = loginPage.clickOnRegister();
		Assert.assertTrue(registerPage.isRegHeaderPresent(), "Register header not present");
	}

	// Navigate to Exercise page
	@Test(dependsOnMethods = "naigateToRegTest")
	public void navigatToExericseTest() {
		exercisePage = registerPage.clickOnExercise();
		Assert.assertTrue(exercisePage.isCorpInfoPresent(), "Corpinfo tab not present");
	}

}
