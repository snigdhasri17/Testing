package Attributes;
import org.testng.annotations.Test;

public class Attribute_grp {
	@Test(groups = {"Grouping"})
	public void G1() {
		System.out.println("First");
	}
	
	@Test(groups={"Grouping"})
	public void G2() {
		System.out.println("Second");
	}
	@Test (groups = {"Group"})
	public void G3() {
		System.out.println("Third");
	}
	@Test(groups = {"Group"})
	public void G4() {
		System.out.println("Four");
	}
	

}
