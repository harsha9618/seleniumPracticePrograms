package draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		//Element which need to drag
		WebElement ele= driver.findElement(By.xpath("//*[@id='products']//div[1]//ul[1]//li[2]"));
		
		Actions act= new Actions(driver);
		act.dragAndDropBy(ele,135, 40).build().perform();
		//driver.quit();
	}

}
