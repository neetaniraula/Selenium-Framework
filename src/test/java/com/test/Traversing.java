package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversing {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[type = 'submit']")).click();
		//https://prokabaddi.com/standings/
		//driver.findElement(By.name("q")).sendKeys("iphone");
		//driver.findElement(By.cssSelector("[type = 'submit']")).click();
		//String matchesWon =  driver.findElement(By.xpath("//p[text() ='Haryana Steelers']/../../../..//div[@class = 'table-data matches-won']")).getText();
	
		//System.out.println("Total number of matches won ---> " + matchesWon );
		
		//String matchesLost = driver.findElement(By.xpath("//p[text() ='Haryana Steelers']/../../../..//div[@class = 'table-data matches-lost']")).getText();
		//System.out.println("Total number of matches won ---> " + matchesLost );

	}

}
