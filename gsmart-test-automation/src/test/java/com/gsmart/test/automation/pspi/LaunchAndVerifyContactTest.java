package com.gsmart.test.automation.pspi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.gsmart.test.automation.base.GsmartBaseTest;
import com.gsmart.test.automation.pages.home.HomePage;

public class LaunchAndVerifyContactTest extends GsmartBaseTest {

	public static final Logger logger = LogManager.getLogger(LaunchAndVerifyContactTest.class);
	HomePage homePage;
    
	@Test
	public void footerContactTest() {
		logger.info("launching Url" + url);
		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isContactFooterPresent(), "contact footer not present");
		Assert.assertTrue(homePage.isWeLoveFooterPresent(),"contact footer not present");
	}
	@Test(dependsOnMethods = "footerContactTest")
	public void typingAndClearTest() throws InterruptedException {
		logger.info("Typing comment");
		Thread.sleep(3000);
		homePage.typingFooterComment("Priyanka's First comment");
		Thread.sleep(3000);
		homePage.clearCommentsFooterBox();
	}	
}
