package com.gsmart.test.automation.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;

public class LoginNaivgationTest extends GsmartBaseTest {

	public static final Logger logger = LogManager.getLogger(LoginNaivgationTest.class);
	
	@Test
	public void launchAndVerifyLoginLinkTest() {
		logger.info("Launching the URL " + url);
		driver.get(url);
		WebElement logo = driver.findElement(By.xpath("//h2[contains(text(),'GSSSSS Mart')]"));
		logger.info("Verifying the logo ");
		Assert.assertTrue(logo.isDisplayed(), "Logo not loaded, test failed");
	}

}
