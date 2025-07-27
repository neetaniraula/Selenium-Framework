package AdvancedScenariosQspider;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@placeholder = 'Search for Products...'])[2]")).sendKeys("mangoes");
		
	Thread.sleep(3000);
	List<WebElement> allMgs= 	driver.findElements(By.xpath("//span[@class ='Label-sc-15v1nk5-0 QuickSearch___StyledLabel-sc-rtz2vl-6 gJxZPQ EjzzL']"));
	Thread.sleep(3000);
	int count = 0;
	for(WebElement mgs : allMgs) {
		System.out.println(mgs.getText());
		
		count++;
		if(mgs.getText().contains("Alphonso Mango - Badami")) {
			mgs.click();
		}
			}
	System.out.println("total  "+  count);
	
	}

}
