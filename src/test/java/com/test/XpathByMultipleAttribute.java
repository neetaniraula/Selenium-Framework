package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultipleAttribute {

	public static void main(String[] args) {
		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text' and @aria-label='Search Amazon.in']")).sendKeys("iphones");
		
		//driver.close();
	}

}

