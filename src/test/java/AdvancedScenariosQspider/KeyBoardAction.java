package AdvancedScenariosQspider;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.xpath("//input[@name = 'q']"));
		searchBox.click();
		List<WebElement> autoSg = driver.findElements(By.xpath("(//div[@class = 'lnnVSe'])[1]"));
		
			for(WebElement allSugg : autoSg) {
			System.out.println(allSugg.getText());
		}
		
			
		
		
		//WebElement searchBox = driver.findElement(By.xpath("//textarea[@name ='q']"));
		//searchBox.sendKeys("Selenium",Keys.ENTER);
		//driver.findElement(By.xpath("//span[text() ='Selenium']")).click();
		//System.out.println("Typed Selenium at  " + java.time.LocalDate.now());
		
		
	}

}
