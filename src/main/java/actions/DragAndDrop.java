package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		driver.get("https://jqueryui.com");
		
		driver.findElement(By.xpath("//li[a='Draggable']")).click();
		driver.switchTo().frame(0);
		
		WebElement draganddrop=driver.findElement(By.id("draggable"));
		action.dragAndDropBy(draganddrop, 400, 0).build().perform();
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
