package SeleniumDemoPackage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> list =driver.findElements(By.tagName("a"));
		System.out.println("Your all Links are"+list.size());
		for(WebElement links:list) {
			System.out.println(links.getAttribute("href"));
			System.out.println(links.getText());
		}
		driver.findElement(By.id("u_0_j")).sendKeys("Sazz");
		driver.findElement(By.name("lastname")).sendKeys("Don");
		driver.findElement(By.name("reg_email__")).sendKeys("9845673219");
		driver.findElement(By.name("reg_passwd__")).sendKeys("sonald");
		driver.findElement(By.name("birthday_day")).sendKeys("4");
		driver.findElement(By.name("birthday_month")).sendKeys("jan");
		driver.findElement(By.name("birthday_year")).sendKeys("2000");
		driver.findElement(By.id("u_0_9")).click();
		driver.findElement(By.id("u_0_11")).click();
				}

}
