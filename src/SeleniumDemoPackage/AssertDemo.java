package SeleniumDemoPackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;

public class AssertDemo {
	String actualTitle = "SONAL";
	String expectedTitle = "SONAL";
	
	String actualTitle1 = "SAZZ";
	String expectedTitle1 = "SONAL";
    SoftAssert softassert = new SoftAssert();
	
  @Test
  public void method1() {
	  System.out.println("Before Assert");
	  Assert.assertEquals(actualTitle, expectedTitle);
	  System.out.println("After Assert");
  }
  @Test
  public void method2() {
	  System.out.println("Before Assert");
	  Assert.assertEquals(actualTitle1, expectedTitle1);
	  System.out.println("After Assert");
  }
  @Test
  public void method3() {
	  System.out.println("Before Assert");
	  softassert.assertEquals(actualTitle, expectedTitle);
	  System.out.println("After Assert");
	  softassert.assertAll();
  }
}
