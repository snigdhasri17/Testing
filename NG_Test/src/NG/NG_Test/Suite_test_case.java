package NG.NG_Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Suite_test_case {
  @Test
  public void f() {
	  System.out.println("+++++++ MAIN TEST CASE METHOD +++++++");
  }
  @Test
  public void f1() {
	  System.out.println("+=+=+=+=+ f1 Test case +=+=+=+=+ ");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("---------befor test-------------");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("----------After test-------------");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("---------before Suite------------");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("------------After Suite------------");
  }

}
