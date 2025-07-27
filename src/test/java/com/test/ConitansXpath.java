package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ConitansXpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath[contains(@ attritbutename, attriubte value));
		//driver.findElement(By.xpath("//a[contains(text(), 'Amazon Pay')]")).click();
		driver.findElement(By.xpath("//a[contains(text(). 'MX']")).click();
		

	}
	
}