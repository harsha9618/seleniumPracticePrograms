package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventsUsingActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/text-box");

		Actions action = new Actions(driver);

		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("Harsha Reddy");

		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("HarshaReddy@gmail.com");

		WebElement cAddress = driver.findElement(By.id("currentAddress"));
		cAddress.sendKeys("PragathiNAgar,Hyderabad");

		// Select the Current Address CTRL+A
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();

		// Select the Current Address CTRL+c
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		//Press the TAB Key to Switch Focus to Permanent Address
	      action.sendKeys(Keys.TAB);
	      action.build().perform();
	    
	   // Select the Current Address CTRL+V
			action.keyDown(Keys.CONTROL);
			action.sendKeys("V");
			action.keyUp(Keys.CONTROL);
			action.build().perform();
	      

		WebElement pAddress=driver.findElement(By.id("permanentAddress"));
//		pAddress.sendKeys("SaiNagar, anantapur");
		//assertEquals(cAddress.getAttribute("value").pAddress.getAttribute("value"));
		Boolean bol = pAddress.equals(cAddress);
		System.out.println(bol);
		
		WebElement er=driver.findElement(By.xpath("//button[@id='submit']"));
		er.click();
		System.out.println(er);
		
		WebElement ele=driver.findElement(By.id("output"));
		System.out.println(ele);
		
		
	}

}
