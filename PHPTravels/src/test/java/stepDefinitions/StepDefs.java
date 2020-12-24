package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import utilities.FunctionalUtilities;

public class StepDefs {
	public FunctionalUtilities f;
	HomePage hp;
	
    @Given("^We have to go the the url of AUT$")
    public void we_have_to_go_the_the_url_of_aut() throws Throwable {
    	f=new FunctionalUtilities();
    	f.hitUrl();
    }

    @When("^User clicks on Destination$")
    public void user_clicks_on_destination() throws Throwable {
    	hp=new HomePage(f.driver());
    	hp.clickonSource();
 
    }

    @Then("^Dropdown is Populated With some values$")
    public void dropdown_is_populated_with_some_values() throws Throwable {
    	System.out.println("Will be doing it");

    }
    public FunctionalUtilities getObject() {
    	return f;
    }
}
