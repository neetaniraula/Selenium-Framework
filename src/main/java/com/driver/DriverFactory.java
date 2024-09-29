package com.driver;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	//Create driverfactory  class as thread safe
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	//Create Singleton Constructor
	private DriverFactory() {
	}
	//Create object of the class
	private static DriverFactory instance = new DriverFactory();
	
	public static DriverFactory getInstance() {
		return instance;
	}
	public void setDriver(WebDriver driverobj) {
		driver.set(driverobj);
	}
	
	public WebDriver getDriver() {
		return driver.get();
	}
	

}
