package AdvancedScenariosQspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HamdlingDropDownUsingSelectClass2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html ");
		driver.manage().window().maximize();
		
		WebElement month = driver.findElement(By.name("Month"));
		
		Select monthList = new Select(month);
		monthList.selectByIndex(2);
		monthList.selectByValue("June");
		monthList.selectByVisibleText("November");
	
	

	}

}
