package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		//Mouse over on submit button
		Actions action=new Actions(driver);
		WebElement btn=driver.findElement(By.id("idOfButton"));
		action.moveToElement(btn).perform();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
