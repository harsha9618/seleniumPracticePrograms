package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlertBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		
		Alert alertConfirm=driver.switchTo().alert();
		System.out.println(alertConfirm.getText());
		//alertConfirm.accept();
		alertConfirm.dismiss();
		driver.quit();

	}

}
