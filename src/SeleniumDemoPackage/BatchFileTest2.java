package SeleniumDemoPackage;

import org.junit.Assert;
import org.testng.annotations.Test;

public class BatchFileTest2 {
	  String actualTitle = "SONAL";
		String expectedTitle = "SONAL";
		
		String actualTitle1 = "SAZZ";
		String expectedTitle1 = "SONAL";
		
@Test
public void method1() {
	  System.out.println("Before Assert");
	  Assert.assertEquals(actualTitle1, expectedTitle1);
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
	  Assert.assertEquals(actualTitle, expectedTitle);
	  System.out.println("After Assert");
}
}
