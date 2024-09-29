package com.javascript;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.driver.DriverFactory;
import com.report.ExtentFactory;

public class JavaScriptActions {
	
	private Logger logger = LogManager.getLogger(JavaScriptActions.class);
	
	public void click(WebElement element) {
		
		try {
		JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
		js.executeScript("arguments[0].click(),element");
		
		logger.info("Element is clicked");
		ExtentFactory.getInstance().passTest("Element is clicked using JavaScript");
			}
		
		catch(Exception e) {
			logger.error("Exception occured while clicking on the element using JS" + e.getMessage());
			ExtentFactory.getInstance().failTest("Exception occured while clicking on the element using JS");
		}
}
public void sendKeys(WebElement element, String value) {
		
		try {
		JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
		js.executeScript("arguments[0].value=" + " ' " + value + " ' ", element);
		
		logger.info(value+ " is entered");
		ExtentFactory.getInstance().passTest(value+ " is entered");
			}
		
		catch(Exception e) {
			logger.error("Exception occured while entering value using JS" + e.getMessage());
			ExtentFactory.getInstance().failTest("Exception occured while entering value using JS");
		}
	
	}

public void scrollPageToViewElement(WebElement element) {
	
	try {
	JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
	js.executeScript("arguments[0].scrollIntoView(true)", element);
	
	logger.info("Element is visible on Screen");
	ExtentFactory.getInstance().passTest("Element is visible on Screen");
		}
	
	catch(Exception e) {
		logger.error("Exception occured while scroling the page " + e.getMessage());
		ExtentFactory.getInstance().failTest("Exception occured while scroling the page ");
	}

}

public void scrollTillEndOfPage(){
	
	try {
	JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
	js.executeScript("window.scrollTo(0 , document.body.scrollHeight)");
	
	logger.info("Page is scrolled till end");
	ExtentFactory.getInstance().passTest("page is scrolled till end");
		}
	
	catch(Exception e) {
		logger.error("Exception occured while scroling the page til end" + e.getMessage());
		ExtentFactory.getInstance().failTest("Exception occured while scroling the page till end");
	}

}








		}
