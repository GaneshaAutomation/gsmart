package com.gsmart.test.automation.landing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;

public class HeaderValidationTest extends GsmartBaseTest{
	
	@Test
	public void launchAndValidateLogoTest() {
		System.out.println("Executing launchAndValidateLogoTest ");
		System.out.println(" Launching the URL "+url);
		driver.get(url);
		System.out.println(" validating Logo link ");
		WebElement logoLink = driver.findElement(By.linkText("Shopping Center"));
		Assert.assertTrue(logoLink.isDisplayed(), "Logo link not displayed");
		System.out.println(" launchAndValidateLogoTest is successful");

	}
	
	@Test(dependsOnMethods = "launchAndValidateLogoTest")
	public void validateExerciseAndLoginlinksTest() {
		System.out.println("Executing validateExerciseAndLoginlinksTest ");
		
		System.out.println(" validating Exercise link ");
		WebElement exerciseLink = driver.findElement(By.linkText("Exercise"));
		Assert.assertTrue(exerciseLink.isDisplayed(), "Exercise link not displayed");
		
		System.out.println(" validating Login link ");
		WebElement loginLink = driver.findElement(By.linkText("login"));
		Assert.assertTrue(loginLink.isDisplayed(), "login link not displayed");
		
		System.out.println(" validateExerciseAndLoginlinksTest is successful");

	}
	

}
