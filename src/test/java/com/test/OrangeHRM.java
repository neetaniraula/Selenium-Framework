package com.test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name = 'username']")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name ='password']")).sendKeys("admin123");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[type = 'submit']")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links are : " +links.size());
		
	}

}
