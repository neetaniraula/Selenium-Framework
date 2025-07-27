package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Herouapp {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/forgot_password");
		
		WebElement email = driver.findElement(By.name("email"));
		boolean emailValue = email.isDisplayed();
		System.out.println("IsDisplayed status is "+ emailValue);
		
		boolean ifEnabled = email.isEnabled();
		System.out.println("isEnabled status is: " + ifEnabled);
		
		email.sendKeys("sselenium@test.com");
		
		String enteredValue = email.getAttribute("value");
		
		System.out.println("entered test is "+ enteredValue);
		

	}

}
