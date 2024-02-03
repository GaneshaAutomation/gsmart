package com.gsmart.test.automation.sans;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsmart.test.automation.base.GsmartBaseTest;

import com.gsmart.test.automation.pages.home.HomePage;
import com.gsmart.test.automation.pages.login.LoginPage;

public class LoginAndSelectAdminTest extends GsmartBaseTest {
	
//	4. Launch, Login, select Admin from the dropdown
	HomePage homePage;
	LoginPage loginPage;
	@Test
	public void launchTest() {

		driver.get(url);
		homePage = new HomePage();
		Assert.assertTrue(homePage.isBuyNowButtonPresent(), "Buy now btn is not present");
	}

	@Test(dependsOnMethods = "launchTest")
	public void navigateToLoginPageTest() {

		loginPage = homePage.clickOnLoginLink();
		Assert.assertTrue(loginPage.isLoginHeaderPresent(), "Login Header is not present");
	}
	
	@Test(dependsOnMethods = "launchTest")
		public void selectAdminTest() {	
		Assert.assertTrue(loginPage.isUserRoleDropDownPresent(), "userrole dropdown is not present");
		loginPage.selectAdminFromDropdown();   
	
	}
}

