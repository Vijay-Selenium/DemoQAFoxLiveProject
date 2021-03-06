package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;


public class Register {

	@Given("^I launch the application$")
	public void i_launch_the_application()  {
	    
		Base.driver.get(Base.reader.getUrl());
	}

	@And("^I naviagte to the account registration page$")
	public void i_naviagte_to_the_account_registration_page() {
	    
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	   
	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy()  {
	   
	}

	@And("^I click on the continue button$")
	public void i_click_on_the_continue_button()  {
	    
	}

	@Then("^I should see that the user Account has successfully created$")
	public void i_should_see_that_the_user_Account_has_successfully_created()  {
	    
	}


}
