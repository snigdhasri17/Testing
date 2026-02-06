package Attributes;

import org.testng.annotations.Test;

public class Attr_dependence {
	@Test
	public void depn() {
		System.out.println("login Sucessfully");
	}
	@Test(dependsOnMethods="depn",alwaysRun=true)//always run this keyword  will run the dependence method if depn method fails.
	public void Dash() {
		System.out.println("Dashboard loaded");
	}

}
