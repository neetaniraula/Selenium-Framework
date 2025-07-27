package AdvancedScenariosQspider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 Actions act = new Actions(driver);
		 
		 //Method 1: double click Method
		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//WebElement e =  driver.findElement(By.xpath("//button[text() ='Double-Click Me To See Alert']"));
		//Actions act = new Actions(driver);
		//act.doubleClick(e).perform();
		//Right click
		
		// method2:-moveToElement() take curoser to the element/hoover
		 //driver.get("https://www.amazon.in");	
		//WebElement ele = driver.findElement(By.xpath("//div[text()='EN']"));
		// act.moveToElement(ele).perform();
		 
		 //Method 3: Context click right click
		 // driver.get("https://www.amazon.in");	
		//WebElement ele =  driver.findElement(By.linkText("Mobiles"));
		 //Actions act = new Actions(driver);name
		 //act.contextClick(ele).perform();
		
		//Method 4 : drag and drop
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement dragFrom = driver.findElement(By.cssSelector("#draggable"));
		WebElement dropTo = driver.findElement(By.cssSelector("#droppable"));
		act.dragAndDrop(dragFrom, dropTo).perform();
		
		
		

	}

}
