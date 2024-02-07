package com.gsmart.test.automation.search;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;
import com.gsmart.test.automation.utils.ExcelReader;

public class ProductDPSearchTest extends GsmartBaseTest{
	
	HomePage homePage;
	// Use DataProvider
	
	@DataProvider(name="products")
	public Object[][] productData() throws Exception{
		
		Object [][] data = ExcelReader.getData("src/test/resources/testdata/products.xlsx", "products");
		return data;
	}
	
	@Test(dataProvider = "products")
	public void dpSearchTest(String protext) {
		
		driver.get(url);
		homePage = new HomePage();
		homePage.searchForProduct(protext); 
		homePage.clickOnSearchButton();
		Assert.assertTrue(homePage.isSuccessMessageForSearchPresent(),"Search failed");
		
	}
	
	

}
