package NG.NG_Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Bef_aft {
  @Test
  public void f() {
	  System.out.println("----Test Annotation------");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("-------before -------");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("---------After-------");
  }

}
