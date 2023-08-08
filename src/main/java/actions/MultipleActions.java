package actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleActions {
	
	
	/*  How to performe below operations using Selenium WebDriver?
	MoveToElement or MouseHover,
	Click,
	Double Click,
	Right click or Context Click
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		action.contextClick(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']")));
		
		driver.findElement(By.xpath("//li[.='Edit']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		driver.quit();

	}

}
