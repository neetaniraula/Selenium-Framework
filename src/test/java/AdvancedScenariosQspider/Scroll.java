package AdvancedScenariosQspider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/ ");
		
		Actions act = new Actions(driver);
		
		/*scrollDown
		act.scrollByAmount(0,300).perform();
		Thread.sleep(2000);
			//Scroll up
		act.scrollByAmount(0, -300).perform();
		*/
Thread.sleep(3000);
		
WebElement w = driver.findElement(By.xpath("//a[text()= 'Google+']"));
act.scrollToElement(w).perform();
		
		
	}

}
