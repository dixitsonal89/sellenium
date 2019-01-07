package SeleniumDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.id("firstName")).sendKeys("sazz");
		driver.findElement(By.id("lastName")).sendKeys("Don");
		driver.findElement(By.id("username")).sendKeys("sazz.don30");
		driver.findElement(By.name("Passwd")).sendKeys("sazzdon30");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("sazzdon30");
		driver.findElement(By.id("accountDetailsNext")).click();	
	}

}
