package com.tutorialsninja.automation.stepdef;

import java.util.Map;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;


public class Register {

	HeaderSection headerSection= new HeaderSection();
	RegisterPage registerPage = new RegisterPage();
	AccountSuccessPage accountSuccessPage=new AccountSuccessPage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application()  {
	    
		Base.driver.get(Base.reader.getUrl());
	}

	@And("^I naviagte to the account registration page$")
	public void i_naviagte_to_the_account_registration_page() {
	    
		Elements.click(HeaderSection.myAccountLink);
		Elements.click(HeaderSection.register);
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable dataTable)  {
		
	   RegisterPage.enterAllDetails(dataTable,"unique");
	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy()  {
	   
		Elements.click(RegisterPage.privacy);
	}

	@And("^I click on the continue button$")
	public void i_click_on_the_continue_button()  {
	   
		Elements.click(RegisterPage.continueButton);
	}

	@Then("^I should see that the user Account has successfully created$")
	public void i_should_see_that_the_user_Account_has_successfully_created()  {
	    
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.successBreadcrumb));
	}

	@Then("^I should see that the User Account is not created$")
	public void i_should_see_that_the_User_Account_is_not_created()  {
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.registerBreadcrumb));
	}

	@Then("^I should see the error messages informing the user to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields()  {
	    
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.firstNameWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.lastNameWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.emailWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.telephoneWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.passwordWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.privacyWarning));
	}

	@When("^I subscribe to Newsletter$")
	public void i_subscribe_to_Newsletter()  {
	    
		Elements.click(RegisterPage.subscribeNewsLetter);
	}
	
	@Then("^I should see that the User Account has successfully created$")
	public void i_should_see_that_the_User_Account_has_successfully_created()  {
		
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.successBreadcrumb));
	}
	@When("^I provide the below duplicate details into the fields$")
	public void i_provide_the_below_duplicate_details_into_the_fields(DataTable dataTable)  {

		 RegisterPage.enterAllDetails(dataTable,"duplicate");
	}

	@Then("^I should see the warning message stating that the user is already created$")
	public void i_should_see_the_warning_message_stating_that_the_user_is_already_created()  {

		Assert.assertTrue(Elements.isDisplayed(RegisterPage.alreadyRegisteredWarning));
	}
}
