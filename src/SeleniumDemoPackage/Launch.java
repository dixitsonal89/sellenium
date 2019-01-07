package SeleniumDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Select drpDate = new Select(driver.findElement(By.name("birthday_day")));
		drpDate.selectByIndex(30);
		Select drpMonth = new Select(driver.findElement(By.name("birthday_month")));
		drpMonth.selectByVisibleText("Aug");
		Thread.sleep(5000);
		Select drpYear = new Select(driver.findElement(By.name("birthday_year")));
		drpYear.selectByVisibleText("2000");

	}

}
