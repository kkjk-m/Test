package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on NetBanking landing page");
	}
	@When("User login into application")
	public void user_login_into_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User login into application");
	}
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Home Page is displayed");
	}
	@Then("Cards are displyed")
	public void cards_are_displyed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displyed");
	}
	@When("User login into application with {string} and Psassword {string}")
	public void user_login_into_application_with_and_psassword(String Username, String Password) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(Username + "and Password is " + Password);
	}
	@When("^User login into application with (.+) and Password (.+) combination$")
	public void user_login_into_application_with_and_psassword_combination(String Username, String Password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(Username + "and Password is " + Password);
	}
	
	@When("User signup into application")
	public void user_signup_into_application(List<String> data) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(data.get(0));
	    System.out.println(data.get(1));
	    System.out.println(data.get(2));
	    System.out.println(data.get(3));
	}

}
