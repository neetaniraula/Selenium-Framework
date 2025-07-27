package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupByIndex {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//synatx (xpath0 [index value]
		driver.findElement(By.xpath("(//img[@class = '_2puWtW _3a3qyb'][1]")).click();
		
		
	}
	

}
