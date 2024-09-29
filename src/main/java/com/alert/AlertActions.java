package com.alert;

//import java.util.logging.LogManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.driver.DriverFactory;
import com.report.ExtentFactory;
import com.report.ExtentReportListener;

public class AlertActions {
	
	 private Logger logger = LogManager.getLogger(AlertActions.class);
	
	private Alert alert;
	
	public void switchToAlert() {
		try {
		alert = DriverFactory.getInstance().getDriver().switchTo().alert();
		logger.info("Switched to alert");
		ExtentFactory.getInstance().passTest("Switched to Alert");
	}
		catch (NoAlertPresentException e) {
			logger.error("Exception occured while switching to alert");
	}

}
	public void acceptAlert() {
		try {
		this.alert.accept();
		logger.info("Clicked in OK button");
		ExtentFactory.getInstance().passTest("Clicked on Ok button");
		}
		catch(Exception e) {
			logger.error("Exception occured while clicking on OK button");
			ExtentFactory.getInstance().failTest("Exception occured while clicking on OK button");
		}
	}
	
	public void cancelAlert() {
		try {
		this.alert.dismiss();
		logger.info("Clicked in cancel button");
		ExtentFactory.getInstance().passTest("Clicked on cancel button");
		}
		catch(Exception e) {
			logger.error("Exception occured while clicking on cancel button");
			ExtentFactory.getInstance().failTest("Exception occured while clicking on cancel button");
		}
	}
}
