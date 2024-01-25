package com.gsmart.test.automation.landing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.utils.PropertyReader;

public class FieldsValidationTest extends GsmartBaseTest {

	@Test
	public void launchTest() {
		System.out.println(" Launching the URL " + url);
		driver.get(url);
		WebElement header = driver.findElement(By.xpath("//h2[contains(text(),'GS Mart')]")); 
		System.out.println(" Verifying the header text");
		Assert.assertTrue(header.isDisplayed(), "Header is not loaded");

	}

	
	@Test(dependsOnMethods = "launchTest")
	public void fieldsValidationTest() {
		WebElement header = driver.findElement(By.xpath("//h2[contains(text(),'GS Mart')]")); 
		System.out.println(" Verifying the header text");
		Assert.assertTrue(header.isDisplayed(), "Header is not loaded");

		WebElement searchBox = driver.findElement(By.name("search")); 
		System.out.println(" Verifying the Search box");
		Assert.assertTrue(searchBox.isDisplayed(), "Search is not loaded");
		
	}
}
