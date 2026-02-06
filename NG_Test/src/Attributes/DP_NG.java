package Attributes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP_NG {
	@DataProvider(name = "Sowmya")
	public Object[][] DP(){
		return new Object[][] {{"1 , SOw"},{"2, Sri"}
		};
		}
		
		
	@Test(dataProvider = "Sowmya")
	public void testMethod(String Data){
		
		System.out.println("Data: " + Data);
		
	}

}


//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import org.openqa.
//public class DP_NG{
//	@DataProvider(name = "Check")
//	public Object[][] Dp(){
//		return new Object[][] {
//			{"standard_user , secret_sauce"},
//			{"locked_out_user,locked_out_user"}};
//	}
//	
//	@Test(dataProvider = "Check")
//	public void login(String user, String Pass) {
//		WebDriver Driver = new ChromeDriver();
//		Driver.navigate().to("https://www.saucedemo.com/");
//		
//	}
//}


