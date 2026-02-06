package Attributes;
import org.testng.annotations.Test;
public class Attributes_Describe {
	
	@Test(description= "IS IT DESCRIBTION ")
	public void D1() {
		System.out.println("Excuted");
	}
	@Test
	public void D2() {
		System.out.println("It is Excuted");
	}
}
