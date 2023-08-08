package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/edit");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		String currentURL=driver.getCurrentUrl();
		

		System.out.println(title);
		System.out.println(currentURL);
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Product")).click();
		String title1=driver.getTitle();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		String title2=driver.getTitle();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		String title3=driver.getTitle();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		String title4=driver.getTitle();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		String title5=driver.getTitle();
		driver.manage().window().maximize();
		
		System.out.println(title1);
		System.out.println(title2);
		System.out.println(title3);
		System.out.println(title4);
		System.out.println(title5);
		
		
		driver.quit();

	}

}
