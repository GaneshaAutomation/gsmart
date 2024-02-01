package com.gsmart.test.automation.search;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;

public class BuyNowTest extends GsmartBaseTest {

	public static final Logger logger = LogManager.getLogger(BuyNowTest.class);

	HomePage homePage;

	@Test
	public void launchAndVerifySearchBoxTest() {
		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isSearchBoxPresent(), "Search box is not present");

	}

	@Test(dependsOnMethods = "launchAndVerifySearchBoxTest")
	public void searchForProductTest() {
		homePage.searchForProduct("Canon");
		homePage.clickOnSearchButton();
		Assert.assertTrue(homePage.isSuccessMessageForSearchPresent(), "search product is not present");

	}

	@Test(dependsOnMethods = "searchForProductTest")
	public void buyNowTest() {
		homePage.clickOnBuyNowButton();

	}

}
