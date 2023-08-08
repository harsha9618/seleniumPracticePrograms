package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitMethods {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		String eTitle="Demo Guru99 Page";
		
		driver.get("http://demo.guru99.com/test/guru99home/");;
		
		/*
		 * The Implicit Wait in Selenium is used to tell the web driver to wait for a
		 * certain amount of time before it throws a “No Such Element Exception”. The
		 * default setting is 0. Once we set the time, the web driver will wait for the
		 * element for that time before throwing an exception.
		 */
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		String title=driver.getTitle();
		if(title.equals(eTitle)) {
			System.out.println("Teste Passed");
		}else {
			System.out.println("Teste Failed");
		}
		
		
		driver.quit();
		

	}

}
