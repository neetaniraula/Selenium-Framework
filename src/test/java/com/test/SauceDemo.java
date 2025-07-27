package com.test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SauceDemo {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("input[type = submit]")).click();
		Thread.sleep(3000);
	
		
		driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack")).click();
	
		driver.findElement(By.cssSelector("span.shopping_cart_badge")).click();
		Thread.sleep(3000);
		String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(windowHandle);
		
		
		
		
		
		
		
	}
	

}
