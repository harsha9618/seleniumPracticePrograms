package draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		Actions act = new Actions(driver);

		WebElement button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));

		act.contextClick(button).perform(); // Right click on the button

		driver.close();

	}

}
