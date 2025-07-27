package AdvancedScenariosQspider;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingAutoSuggestion {


	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in//");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("iphone");
		Thread.sleep(3000);
		List <WebElement> allSugg = driver.findElements(By.xpath("//div[@role = 'rowgroup']"));
		
		for (WebElement sugg : allSugg) {
			System.out.println(sugg.getText());
			if(sugg.getText().contains("iphone 16e")) {
				Thread.sleep(3000);
				sugg.click();
			}
		
		}
		
	}
}


