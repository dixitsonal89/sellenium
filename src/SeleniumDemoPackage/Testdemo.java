package SeleniumDemoPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Testdemo {
	WebDriver driver;	
  @Test
  public void loginCheck() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://www.facebook.com/");
	  driver.findElement(By.name("email")).sendKeys("Sonaldixit_19@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("sonald");
  }
	@Test
	public void resgistration() {
		driver.findElement(By.id("u_0_j")).sendKeys("Sazz");
		driver.findElement(By.name("lastname")).sendKeys("Don");
		driver.findElement(By.name("reg_email__")).sendKeys("9845673219");
		driver.findElement(By.name("reg_passwd__")).sendKeys("sonald");
  }
  @BeforeTest
  public void launchbrowser() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
  }
  @AfterTest
  public void closebrowser() {
	  driver.quit();
  }
}