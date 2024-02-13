package com.gsmart.test.automation.cals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;

public class CanonProductSearchTest extends GsmartBaseTest {
	HomePage homePage;

	@Test

	public void launchTest() {
		homePage = new HomePage();
		driver.get(url);
		Assert.assertTrue(homePage.isBuyNowButtonPresent(), "buy now button is not loaded");

	}

	@Test(dependsOnMethods = "launchTest")
	public void searchProductTest() {
		Assert.assertTrue(homePage.isMainHeaderPresent(), "Main Header is not loaded");
		homePage.searchForProduct("Canon");
		homePage.clickOnSearchButton();
		Assert.assertTrue(homePage.isSuccessMessageForSearchPresent(), "search product is not present");

	}

	@Test(dependsOnMethods = "searchProductTest")
	public void buyNowTest() {
		homePage.isAddToCartBtnPresent();
		Assert.assertTrue(homePage.isAddToCartBtnPresent(), "Add to cart button is not present");

		homePage.clickOnAddToCartButton();

	}
}
