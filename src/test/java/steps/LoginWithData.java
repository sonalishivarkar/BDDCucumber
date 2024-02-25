package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithData {
	
	//Ctrl+Shift+O to import all annotation
	@Given("I am at the landing page")
	public void i_am_at_the_landing_page() {
		System.out.println("Given statement");
	    
	}

	@When("I am enter the user name as {string}")
	public void i_am_enter_the_user_name_as(String uname) {
		System.out.println("i enter user name is"+uname);
	   
	}

	@When("I am enter the password as {string}")
	public void i_am_enter_the_password_as(String pass) {
		System.out.println("i enter password is"+pass);
	}

	@When("I will click on submit button")
	public void i_will_click_on_submit_button() {
		System.out.println("click on submit");
	   
	}

	@Then("I should get logged into app")
	public void i_should_get_logged_into_app() {
		System.out.println("user logged in");
	   
	}



}
