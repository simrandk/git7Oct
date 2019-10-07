package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefofrunner {
	@Given("^I want to write a step with$")
	public void i_want_to_write_a_step_with() throws Throwable {
	    System.out.println("on sign in page");
	}

	@When("^I check for the sd(\\d+) and name(\\d+) in step$")
	public void i_check_for_the_sd_and_name_in_step(int arg1, int arg2) throws Throwable {
	  System.out.println("enter username");
	}

	@When("^I check for the sdfsfawefawe(\\d+) and name(\\d+) in step$")
	public void i_check_for_the_sdfsfawefawe_and_name_in_step(int username, int password) throws Throwable {
	   System.out.println("enter password");
	}
	@Then("^login$")
	public void login() throws Throwable {
	   System.out.println("enter login");
	}

}
