package stepsdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class background_common {

	@Given("testcase1")
	public void testcase1() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("common testcase:");
	    //throw new io.cucumber.java.PendingException();
	}

	@When("testcase2")
	public void testcase2() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when testcase 2");
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("testcase3")
	public void testcase3() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then testcase3");
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("testcase4")
	public void testcase4() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then testcase4");
	   // throw new io.cucumber.java.PendingException();
	}


}
