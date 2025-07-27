package AdvancedScenariosQspider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyboardStrokes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		/*case 1:
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		WebElement PassWord = driver.findElement(By.name("password"));
		PassWord.sendKeys("secret_sauce");
		PassWord.sendKeys(Keys.ENTER);
		OR
		PassWord.sendKeys("secret_sauce",Keys.ENTER);
		CASE 2
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce",Keys.ENTER);*/
		
		/*Case 3
		WebElement USERNAME = driver.findElement(By.name("user-name"));
		USERNAME.sendKeys("standard_user");
		USERNAME.sendKeys(Keys.TAB,"secret_sauce",Keys.ENTER);
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		control key
	WebElement USERNAME = driver.findElement(By.name("user-name"));
		USERNAME.sendKeys("Qspider",Keys.CONTROL +"a");
		USERNAME.sendKeys(Keys.CONTROL + "c");
		USERNAME.sendKeys(Keys.TAB, Keys.CONTROL+"v");*/
		driver.findElement(By.name("user-name")).sendKeys("neeta",Keys.CONTROL +"a",Keys.CONTROL + "c",Keys.TAB, Keys.CONTROL+"v");

	}

}
