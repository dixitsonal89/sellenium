package SeleniumDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	String a = driver.getTitle();
	System.out.println(a);
	driver.findElement(By.id("email")).sendKeys(a);
	driver.findElement(By.xpath("//*[@id=\"js_0\"]/ul/li[20]/a")).click();
	}
}