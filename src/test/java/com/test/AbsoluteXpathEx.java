package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpathEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		//driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("secret_sauce");
		//driver.findElement(By.xpath("//input[@id = 'login-button']")).click();
		//driver.findElement(By.)
		
		//driver.findElement(By.xpath("//div[@class ='login-box']/form/input[@id='user-name']")).sendKeys("standard_user");
		//driver.findElement(By.xpath("//div[@class ='login-box']/form/input[@id='password']")).sendKeys("secret_sauce");



	}

}
