package com.gsmart.test.automation.base;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.gsmart.test.automation.listener.GsmartListner;
import com.gsmart.test.automation.pages.base.BasePage;
import com.gsmart.test.automation.utils.PropertyReader;

@Listeners(GsmartListner.class)
public class GsmartBaseTest {

	public static final Logger logger = LogManager.getLogger(GsmartBaseTest.class);

	// WebDriver
	// default
	public WebDriver driver;
	public String url;

	// based on the user input ... browser session will be created
	@BeforeSuite
	public void init() {
		String browserValue = PropertyReader.getEnvProperty("browser");
		logger.info(" Browser is " + browserValue);
		url = PropertyReader.getEnvProperty("url");
		logger.info(" Launching the URL " + url);

		// If the browser value is Chrome

		if (browserValue.equals("chrome")) {
			String localChromPath = PropertyReader.getEnvProperty("chromePath");
			System.setProperty("webdriver.chrome.driver", localChromPath);

			logger.info(" Launching chrome browser using the path " + localChromPath);
			driver = new ChromeDriver();
		}

		else if (browserValue.equals("edge")) {
			String localEdgePath = PropertyReader.getEnvProperty("edgePath");
			System.setProperty("webdriver.edge.driver", localEdgePath);
			logger.info(" Launching Edge browser using the path " + localEdgePath);
			driver = new EdgeDriver();
		}

		else if (browserValue.equals("firefox")) {
			String localFirefoxPath = PropertyReader.getEnvProperty("firefoxPath");
			System.setProperty("webdriver.gecko.driver", localFirefoxPath);
			logger.info(" Launching Firefox browser using the path " + localFirefoxPath);
			driver = new FirefoxDriver();

		}

		else if (browserValue.equals("safari")) {
			String localSafariPath = PropertyReader.getEnvProperty("safariPath");
			System.setProperty("webdriver.safari.driver", localSafariPath);
			logger.info(" Launching Safari browser using the path " + localSafariPath);
			driver = new SafariDriver();

		}

		driver.manage().timeouts().implicitlyWait(21, TimeUnit.SECONDS);
		// Once the driver is loaded with the browser, give it to listener
		GsmartListner.driver = driver;
		BasePage.driver = driver;

	}

	@AfterSuite
	public void teardown() {
		logger.info(" Closing the session ");
		driver.quit();

	}

}
