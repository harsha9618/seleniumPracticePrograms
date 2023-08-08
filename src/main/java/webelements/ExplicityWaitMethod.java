package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicityWaitMethod {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		String eTitle="Demo guru99 Page";
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		/*
		 * WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
		 * .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
		 */
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		String aTitle=driver.getTitle();
		
		
		WebElement guru99seleniumlink=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div/h4/a")));
		guru99seleniumlink.click();
		
		if(aTitle.equalsIgnoreCase(eTitle) ) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}

	}

}
