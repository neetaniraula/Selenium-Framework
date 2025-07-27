package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspider {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[type = 'submit']")).click();
		
		
		List<WebElement> products = driver.findElements(By.cssSelector("a.CGtC98"));
	
		
		for(WebElement name : products) {	
			String title = name.findElement(By.cssSelector(".KzDlHZ")).getText();
			String priceText = name.findElement(By.cssSelector(".hl05eU")).getText();  // "₹72,990"

			try {
			    String cleaned = priceText.replaceAll("[^\\d]", "").trim(); // Removes ₹ , etc.
			    long price = Long.parseLong(cleaned);

			    if (price > 70000) {
			        System.out.println(title + " - ₹" + price);
			    }
			} catch (NumberFormatException e) {
			    System.out.println("Couldn’t parse price for: " + title + " → " + priceText);
			}
					
	}
		}
}

	

		
		//driver.close();		
		

	


