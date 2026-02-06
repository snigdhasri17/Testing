package stepsdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class multiple_tags {

	@Given("The Annotation given scenario")
	public void the_annotation_given_scenario() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("given statement is printed");
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("it is excuted")
	public void it_is_excuted() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("excuting the then statement");
	    //throw new io.cucumber.java.PendingException();
	}

	@When("the given the printed")
	public void the_given_the_printed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("test when is printed");
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("all comments are excuted")
	public void all_comments_are_excuted() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("validate then is printed");
	   // throw new io.cucumber.java.PendingException();
	}


}
