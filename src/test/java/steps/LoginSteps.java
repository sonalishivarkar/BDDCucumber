package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	
@Given("I am at the login page")
public void gotoLoginPage()
{
	System.out.println("given statement");
}
@When("I enter username")
public void enteringUsername()
{
	System.out.println("entering username");
	}

@When("I enter password")
public void enteringPassword()
{
	System.out.println("entering password");
}
@When("I click on login button")
public void loginToApp()
{
	System.out.println("Login to app");
}
@Then("I should get logged into application")
public void validateLogin()
{
	System.out.println("validating login");

}

@Then("I should see the title")
public void validateTitle()
{
System.out.println("validating title");
}


}
