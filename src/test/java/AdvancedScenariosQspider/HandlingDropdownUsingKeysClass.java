package AdvancedScenariosQspider;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdownUsingKeysClass {

	public static void main(String[] args) {
		
		//Approaches
		//Using keystrokes -- Keyclass and Robot class
		//usingng select class method
		//Using Webelemtns
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement dateList = driver.findElement(By.id("day"));
		dateList.click();
		dateList.sendKeys(Keys.ARROW_UP);
		dateList.sendKeys(Keys.ARROW_DOWN);
		
		WebElement month = driver.findElement(By.id("month"));
		month.click();
		month.sendKeys(Keys.ARROW_UP);
		month.sendKeys(Keys.ARROW_UP);
		month.sendKeys(Keys.ARROW_UP);
		
;		
				
	}

}
