package SeleniumDemoPackage;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTest {
	@AfterTest
	  public void AfterTest() {
		  System.out.println("After Test");
	}
  @Test(priority=1)
  public void z() {
	  System.out.println("Testing A");
  }
  @Test(priority=2)
  public void g() {
	  System.out.println("Testing B");
  }
  @Test(priority=3)
  public void j() {
	  System.out.println("Testing C");
  }
  @Test(priority=4)
  public void d() {
	  System.out.println("Testing D");
  }
  @BeforeTest
  public void BeforeTest() {
	  System.out.println("Before Test");
  }
}
