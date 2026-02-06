package Attributes;

import org.testng.annotations.Test;

public class Attributes_enab {
	@Test(enabled = false)
	
	public void t1(){
		System.out.println("the t1 should not be printed");
	}
	@Test
	public void t2() {
		System.out.println("The t2 was passed ");
	}
}
