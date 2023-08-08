package datepicker;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateTimePicker {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("http://demo.guru99.com/test/");

		// Find the Element
		WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
		dateBox.click();
		dateBox.sendKeys("29May1997");
		dateBox.sendKeys(Keys.TAB);
		dateBox.sendKeys("0245PM");
	}

}
