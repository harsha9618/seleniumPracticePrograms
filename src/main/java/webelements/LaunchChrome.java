package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) {
		//ChromeOptions op = new ChromeOptions();
		
		
//		String browserPath=SeleniumManager.getInstance().getDriverPath(op, false).browserPath;
//		String driverPath=SeleniumManager.getInstance().getDriverPath(op, false).driverPath;
//		
//		System.out.println(browserPath);
//		System.out.println(driverPath);
//		
		//op.setBinary("D:\\DeskTopApps\\Udemy_Pavan_Notes\\HDFDP_Ecommerce\\chrome-win64\\chrome-win64\\chrome.exe");
		//op.setBrowserVersion("116");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Naveen automationlabs");
		System.out.println(driver.getTitle());
	}

}
