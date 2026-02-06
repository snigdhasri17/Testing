package Attributes;
import org.testng.annotations.Test;
public class Attribute_Priority {
@Test(priority=2)
public void P1() {
	System.out.println("first");
}
@Test(priority=1)
public void P2() {
	System.out.println("Second");
}
@Test(priority=3)
public void P3()
{
	System.out.println("Third");
}
}
