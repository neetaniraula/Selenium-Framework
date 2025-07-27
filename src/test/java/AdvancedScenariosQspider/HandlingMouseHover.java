package AdvancedScenariosQspider;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMouseHover {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		Actions a = new Actions(driver);
		a.moveByOffset(10, 20).click().perform();
		
		//Double click
		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//WebElement e = driver.findElement(By.xpath("//button[text() ='Double-Click Me To See Alert']"));
		//a.doubleClick(e).perform();
		
		/*driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(drag, drop).perform();*/
		//Drag and Drop
		//act.clickAndHold(drag).perform();
		//act.release(drop).perform();*/		
		//act.clickAndHold(drag).release(drop).perform();
	
		//Right click
		/*WebElement ele = driver.findElement(By.xpath("//span[text()= 'Mobiles']"));
		act.contextClick(ele).perform();*/
		//mouse hoover
		/*WebElement ele1 = driver.findElement(By.xpath("//span[text()= 'Fashion']"));
		act.moveToElement(ele1).perform();*/
		// Drag and drop
		
		//driver.get("https://www.saucedemo.com/v1/");
		/*WebElement USERNAME = driver.findElement(By.name("user-name"));
		WebElement PASSWORD = driver.findElement(By.name("password"));
		WebElement LOGIN = driver.findElement(By.id("login-button"));
		//Case:1
	Actions act = 	new Actions(driver);
		act.sendKeys(USERNAME,"standard_user").perform();
		act.sendKeys(PASSWORD,"secret_sauce").perform();
		act.click(LOGIN).perform();
	act.sendKeys(USERNAME, "standard_user").sendKeys(PASSWORD, "secret_sauce").click(LOGIN).build().perform();*/

}
}