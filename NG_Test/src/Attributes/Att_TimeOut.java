package Attributes;

import org.testng.annotations.Test;

public class Att_TimeOut {
@Test
public void ts() {
	System.out.println("Test case 1 is passed");
}
@Test(timeOut=300)
public void ts1() throws InterruptedException{
	System.out.println("test case 2 is passed");
	Thread.sleep(400);
}
@Test
public void ts2(){
	System.out.println("Test case 3 is passed");
}
}
