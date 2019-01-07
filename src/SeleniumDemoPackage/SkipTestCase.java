package SeleniumDemoPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCase {
  @Test
  public void testcase1() {
	  System.out.println("My First Test Case");
  }
  @Test
  public void testcase2() throws Exception {
	  System.out.println("My Second Test Case");
	  throw new SkipException("Message");
  }
  @Test(dependsOnMethods="testcase2")
  public void testcase3() {
	  System.out.println("My Third Test Case");
  }
  @Test(dependsOnMethods= {"testcase2","testcase3"})
  public void testcase4() {
	  System.out.println("My Four Test Case");
  }
  
}
