package com.gsmart.test.automation.landing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;

public class HomeCentralFieldValidationTest extends GsmartBaseTest{
	
	public static final Logger logger = LogManager.getLogger(HeaderValidationTest.class);
	
	HomePage homePage;
	
	@Test
	public void launchHomeTest() {
		
		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isHeaderPresent(), "Header is not present");
		
	}

	@Test(dependsOnMethods = "launchHomeTest")
	public void validationTest() {
		
		Assert.assertTrue(homePage.isSearchBoxPresent(), "Search box is not present");
		Assert.assertTrue(homePage.isSearchButtonPresent(), "Search btn is not present");
		Assert.assertTrue(homePage.isAddToCartBtnPresent(), "AddTocart btn is not present");
	}

}
