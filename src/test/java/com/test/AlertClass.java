package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		// swich the focus
		Alert al = driver.switchTo().alert();
		String textAlert = al.getText();
		System.out.println("Alert text is :" + textAlert);

		// Click on OK

		al.accept();
		Thread.sleep(2000);
		driver.close();
	}

}
