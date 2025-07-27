package AdvancedScenariosQspider;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Iframes {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		driver.get("https://demo.automationtesting.in/Frames.html ");
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("SingleFrame");
		WebElement e = driver.findElement(By.xpath("//iframe[@name ='SingleFrame']"));
		driver.switchTo().frame(e);
	
		Thread.sleep(2000);
		
		WebElement input = driver.findElement(By.xpath("//input[@type = 'text']"));
		input.sendKeys("12345");
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()= 'Iframe with in an Iframe']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
