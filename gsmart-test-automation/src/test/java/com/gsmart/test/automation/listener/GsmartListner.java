package com.gsmart.test.automation.listener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class GsmartListner extends TestListenerAdapter {

	public static final Logger logger = LogManager.getLogger(GsmartListner.class);

	public static WebDriver driver;

	// When a test execution starts

	public void onTestStart(ITestResult result) {

		ITestNGMethod currentMethod = result.getMethod();
		String testCaseName = currentMethod.getMethodName();

		logger.info(testCaseName + " - execution started ");
	}

	public void onTestSuccess(ITestResult tr) {

		ITestNGMethod currentMethod = tr.getMethod();
		String testCaseName = currentMethod.getMethodName();

		logger.info(testCaseName + " - Successful ");
		// step1: code to take a screenshot of current browser page and store it in a
		// file
		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// step2: copy the screenshot file to project folder
		try {
			FileUtils.copyFile(screenShot, new File("screenshots/" + testCaseName + "-Success.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult tr) {

		ITestNGMethod currentMethod = tr.getMethod();
		String testCaseName = currentMethod.getMethodName();

		logger.info(testCaseName + " - Failed ");
		// step1: code to take a screenshot of current browser page and store it in a
		// file
		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// step2: copy the screenshot file to project folder
		try {
			FileUtils.copyFile(screenShot, new File("screenshots/" + testCaseName + "-Failed.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult tr) {

		ITestNGMethod currentMethod = tr.getMethod();
		String testCaseName = currentMethod.getMethodName();

		logger.info(testCaseName + " - SKipped ");

		// step1: code to take a screenshot of current browser page and store it in a
		// file
		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// step2: copy the screenshot file to project folder
		try {
			FileUtils.copyFile(screenShot, new File("screenshots/" + testCaseName + "-Skipped.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
