package Attributes;
import org.testng.annotations.Test;
import org.testng.SkipException;
public class Attribute_Skip {
	boolean flag = true;
	
	@Test 
	public void S() {
		if(flag)
			throw new SkipException("Custom error,Skip the test ");
		System.out.println("Hello");
	}

}
