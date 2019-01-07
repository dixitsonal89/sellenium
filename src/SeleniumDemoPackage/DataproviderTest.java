package SeleniumDemoPackage;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataproviderTest {
  private static final boolean Two = false;

@Test(dataProvider = "dp")
  public void dataTest(String a, String s, Integer d, Double g) {
  }

  @DataProvider(parallel = Two)
  public Object[][] dp() {
	  Object[][] obj = new Object [4][4];
	  obj[0][0] = "SONAL";
	  obj[0][1] = "DELHI";
	  obj[0][2] = 189239;
	  obj[0][3] = 9899189239.0;
	  
	  obj[1][0] = "GIRISH";
	  obj[1][1] = "KANPUR";
	  obj[1][2] = 9467;
	  obj[1][3] = 9410017022.0;
	  
	  obj[2][0] = "GAURAV";
	  obj[2][1] = "NOIDA";
	  obj[2][2] = 4678;
	  obj[2][3] = 989968354.0;
	  
	  obj[3][0] = "GAURAV";
	  obj[3][1] = "NOIDA";
	  obj[3][2] = 4678;
	  obj[3][3] = 989968354.0;
    return obj;
  }
}
