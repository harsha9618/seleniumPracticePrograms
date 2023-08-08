package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleAlert {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		
		//WebElement alertText = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		/*
		 * Actions action = new Actions(driver); JavascriptExecutor js =
		 * (JavascriptExecutor) driver;
		 */
		WebElement drg = driver.findElement(By.linkText("SwitchTo"));
		drg.click();
		
		WebElement ale=driver.findElement(By.linkText("Alerts"));
		ale.click();
		
		Thread.sleep(2000);
		
		/*
		 * WebElement
		 * ale1=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		 * ale1.click();
		 */
		/*
		 * Alert alert= driver.switchTo().alert(); String alertMsg =
		 * driver.switchTo().alert().getText(); System.out.println(alertMsg);
		 * alert.accept();
		 */
		
		WebElement alertCancel = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		alertCancel.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Alert alert = driver.switchTo().alert();
		String alertMsg1 = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		System.out.println(alertMsg1);
		String confmMsg = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(confmMsg);
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
