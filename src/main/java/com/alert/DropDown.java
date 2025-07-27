package com.alert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5);
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(5);
		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
		
		Select select = new Select(dropdown);
		select.selectByVisibleText("Blue");
		
		List<WebElement> allElements =select.getOptions();
		for(WebElement e : allElements) {
			System.out.println(e.getText());
			
			driver.close();
		
		
		}
		
		
			

	}

}
