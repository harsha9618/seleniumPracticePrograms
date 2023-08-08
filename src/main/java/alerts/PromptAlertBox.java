package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		
		Alert promptAlert=driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("Harsha");
		
		promptAlert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.quit();

	}

}
