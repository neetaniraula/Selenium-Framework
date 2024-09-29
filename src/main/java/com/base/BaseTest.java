package com.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.driver.BrowserFactory;
import com.driver.DriverFactory;
import com.properties.ConfigLoader;
import com.properties.TestDataLoader;

public class BaseTest {
 
	@BeforeSuite
	public void setUP() {
		
		WebDriver driver = BrowserFactory.createBrowserInstance(ConfigLoader.getInsatnce().getPropertyValue("browser"));
		
		DriverFactory.getInstance().setDriver(driver);
		DriverFactory.getInstance().getDriver().get(TestDataLoader.getInstance().getAppUrl());
			}
	@AfterSuite
	public void tearDown() {
		DriverFactory.getInstance().getDriver().quit();
	}
	
}
