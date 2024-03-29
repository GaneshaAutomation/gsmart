package com.gsmart.test.automation.search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;
import com.gsmart.test.automation.utils.DBReader;

public class SimpleSearchTest extends GsmartBaseTest {

	public static final Logger logger = LogManager.getLogger(SimpleSearchTest.class);

	HomePage homePage;

	// Test1 - Launch and verify search box
	@Test
	public void launchAndVerifySearchBoxTest() {

		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isSearchBoxPresent(), "Search box is not present");

	}

	// Test2 - Search for Redmi and verify the success message
	@Test(dependsOnMethods = "launchAndVerifySearchBoxTest")
	public void searchTest() throws Exception{
		// Type Redmi in the search box
		// This test needs dynamic test data from database
		
		String productName =DBReader.getFirstProduct();
		homePage.searchForProduct(productName);
		homePage.clickOnSearchButton();
		Assert.assertTrue(homePage.isSuccessMessageForSearchPresent(), "Search result is not fetched");

	}

}
