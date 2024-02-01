package com.gsmart.test.automation.register;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;
import com.gsmart.test.automation.pages.register.RegisterPage;

public class RegisterNavigationTest extends GsmartBaseTest {

	HomePage homePage;
	RegisterPage registerPage;

	@Test
	public void launchAndNavigateToRegisterTest() {

		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isBuyNowButtonPresent(), "Buy now is missing");

		registerPage = homePage.clickOnRegister();

		Assert.assertTrue(registerPage.isRegHeaderPresent(), "Register page not laoaded");

		homePage = registerPage.clickOnLogo();

		Assert.assertTrue(homePage.isBuyNowButtonPresent(), "Buy now is missing");

	}

}
