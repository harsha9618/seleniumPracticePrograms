package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		
		Alert simpleA=driver.switchTo().alert();
		System.out.println(simpleA.getText());
		//Thread.sleep(3000);
		simpleA.accept();
		//Thread.sleep(3000);
		driver.quit();
		

	}

}
