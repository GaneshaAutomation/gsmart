package com.gsmart.test.automation.search;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;

public class EraseAndSearchAgainTest extends GsmartBaseTest {

	public static final Logger logger = LogManager.getLogger(EraseAndSearchAgainTest.class);

	HomePage homePage;

	// Test1 - launch and verify header
	@Test
	public void launchAndVerifyHeaderTest() {

		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isHeaderPresent(), "Header is not loaded");

	}

	// Test2 - type and erase
	@Test(dependsOnMethods = "launchAndVerifyHeaderTest")
	public void typeAndEraseTest() {
		homePage.searchForProduct("Mango");
		// Erase
		homePage.clearSearchBox();
	}

	// Test3 - search for Google
	@Test(dependsOnMethods = "typeAndEraseTest")
	public void searchForGoogleTest() {
		homePage.searchForProduct("Google");
		homePage.clickOnSearchButton();
		Assert.assertTrue(homePage.isSuccessMessageForSearchPresent(), "Search failed");
	}

}
