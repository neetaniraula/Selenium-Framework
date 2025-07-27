package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ancestor {

	public static void main(String[] args) {
	
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().window().maximize();
		
		String  won = driver.findElement(By.xpath("//p[text() ='Haryana Steelers']/ancestor::div[@class='row-head']//div[@class ='table-data matches-won']")).getText();
		
		System.out.println("number of matches won "  + won);
		driver.close();
	}

}
