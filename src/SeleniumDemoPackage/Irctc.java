package SeleniumDemoPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Irctc{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-home/app-header/div[2]/div[2]/div[2]/nav/ul/li[6]/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		WebElement element1=driver.findElement(By.xpath("/html/body/app-root/app-home/app-header/div[2]/div[2]/div[2]/nav/ul/li[6]/ul/li[1]/a/span"));
		element1.click();
	}

}
