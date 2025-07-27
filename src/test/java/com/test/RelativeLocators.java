package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/ ");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Log in")).click();
		//driver.findElement(By.xpath("//input[@value ='Log in']")).click();
		
		//String errorMessage = driver.findElement(By.xpath("//span[starts-with(text(), 'Login was')]")).getText();
		//System.out.println(errorMessage);
		
		//WebElement ele = driver.findElement(By.xpath("//input[#@value ='submit']"));
		//driver.findElement(RelativeLocator.with(By.tagName("input")).near(ele)).click();
		
		//WebElement searchIcon = driver.findElement(By.xpath("//input[@type='submit']"));
		//driver.findElement(RelativeLocator.with(By.tagName("input")).near(searchIcon)).sendKeys("Book");
		
		//WebElement searchBox = driver.findElement(By.xpath("//input[@value = 'Search store']"));
		//driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(searchBox)).click();
		
		//WebElement searchButton = driver.findElement(By.xpath("//input[@type = 'submit']"));
		//driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(searchButton)).sendKeys("Mobiles");
				
		driver.findElement(By.linkText("Log in")).click();
		WebElement ref = driver.findElement(By.id("Email"));
		//driver.findElement(RelativeLocator.with(By.tagName("input")).above(ref)).sendKeys("abc@gmail.com");
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(ref)).sendKeys("12344");
	}

}
