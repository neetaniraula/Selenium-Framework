package AdvancedScenariosQspider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelectClass {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		//Select by index
		//selct by value
		//select by visible text
		WebElement dateList = driver.findElement(By.id("day"));
		Select select = new Select(dateList); 
		List<WebElement > allOpts = select.getOptions();
		for(WebElement opt : allOpts) {
			System.out.println(opt.getText());
		}
		//select.selectByIndex(13);
		//WebElement monhtList = driver.findElement(By.id("month"));
		
		//Select select1 = new Select(monhtList);
		//select1.selectByValue("30");
//----------------------------------------------------------
	
	}

}
