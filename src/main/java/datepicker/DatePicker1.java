package datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/resources/demos/datepicker/other-months.html");
		driver.findElement(By.id("datepicker")).click();
		WebElement ele = driver.findElement(By.id("ui-datepicker-div"));
		String date = "29-Aug-2028";
		String[] splitedDate = date.split("-");
		String year = ele.findElement(By.className("ui-datepicker-year")).getText();
		boolean flag = false;
		if (Integer.parseInt(splitedDate[2]) < Integer.parseInt(year)) {
			flag = true;
		}
		if (flag) {
			while (flag) {
				if (year.equalsIgnoreCase(splitedDate[2])) {
					flag = selectDate(ele, "Prev", splitedDate, flag);
				} else {
					ele.findElement(By.xpath(".//span[text()='Prev']")).click();
					year = ele.findElement(By.className("ui-datepicker-year")).getText();
				}
			}
		} else {
			while (!flag) {
				if (year.equalsIgnoreCase(splitedDate[2])) {
					flag = selectDate(ele, "Next", splitedDate, flag);
				} else {
					ele.findElement(By.xpath(".//span[text()='Next']")).click();
					year = ele.findElement(By.className("ui-datepicker-year")).getText();
				}
			}
		}

	}

	public static boolean selectDate(WebElement ele, String navigate, String[] splitedDate, boolean flag) {
		boolean sele = false;
		boolean flag1 = false;
		while (!flag1) {
			if (ele.findElement(By.className("ui-datepicker-month")).getText().toLowerCase().trim()
					.contains(splitedDate[1].toLowerCase().trim())) {
				List<WebElement> dates = ele.findElements(By.linkText(splitedDate[0]));
				for (WebElement sDate : dates) {
					if (sDate.isDisplayed()) {
						sDate.click();
						flag1 = true;
						if (flag) {
							sele = false;
						} else {
							sele = true;
						}
						break;
					}
				}
			} else {
				ele.findElement(By.xpath(".//span[text()='" + navigate + "']")).click();
			}
		}
		return sele;
	}

}
