package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementsFindOut {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Harsha");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Reddy");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("hreddy715@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9876543210");
		WebElement male = driver.findElement(By.xpath("//input[@value='Male']"));
		WebElement feMale = driver.findElement(By.xpath("//input[@value='FeMale']"));
		male.click();
		Thread.sleep(2000);
		feMale.click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox3']")).click();

		WebElement sel = driver.findElement(By.xpath("//div[@id='msdd'][1]"));
		sel.click();

		List<WebElement> values = driver
				.findElements(By.xpath("//multi-select/div/ul/li*- "));
		System.out.println(values.size());
		//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li

		/*
		 * for (int i = 0; i <= values.size(); i++) { if
		 * (values.get(i).getText().contains("German")) { values.get(i).click(); break;
		 * } }
		 */
		for(int i=0;i<=10;i++) {
			values.get(i).click();
		}
		
		Thread.sleep(2000);
		/*
		 * for(int i=0;i<values.size();i++) { if(values.get(i).isSelected()) {
		 * values.get(i).click(); break; } }
		 */
		
		for(WebElement chck:values) {
			if(chck.isSelected()) {
				chck.click();
			}
		}
		

		Select selOne = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		selOne.selectByIndex(5);

		Select selTwo = new Select(driver.findElement(By.xpath("//select[@id='countries']")));
		selTwo.selectByIndex(0);

		Select selcountry = new Select(driver.findElement(By.id("country")));
		selcountry.selectByValue("India");

		Select year = new Select(driver.findElement(By.id("yearbox")));
		year.selectByValue("1997");

		Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		month.selectByIndex(1);

		Select day = new Select(driver.findElement(By.id("daybox")));
		day.selectByValue("29");

		driver.findElement(By.id("firstpassword")).sendKeys("poiuytrewq");
		driver.findElement(By.id("secondpassword")).sendKeys("poiuytrewq");
		Thread.sleep(2000);
		
		

	}

}//*[@id="msdd"]//div/span
