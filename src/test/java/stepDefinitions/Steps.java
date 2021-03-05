package stepDefinitions;

import cucumber.api.java.en.*;

public class Steps {
	
	
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable
	{
	System.out.println("This Step open the Firefox and launch the application.");
	System.out.println("Chandu");
	}
	 
	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable
	{
	System.out.println("This step enter the Username and Password on the login page.");
	}
	 
	@Then("^Reset the credential$")
	public void Reset_the_credential() throws Throwable
	{
	System.out.println("This step click on the Reset button.");
	}

}
