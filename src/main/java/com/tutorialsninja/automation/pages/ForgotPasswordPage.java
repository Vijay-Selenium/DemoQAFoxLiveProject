package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class ForgotPasswordPage {

	public ForgotPasswordPage()
	{
		PageFactory.initElements(Base.driver, this);
		
	}
	@FindBy(id="input-email")
	public static WebElement forgotEmailAddress;
	
	@FindBy(xpath="//*[@class='btn btn-primary']")
	public static WebElement forgotContinueButton;
	
	@FindBy(xpath="//*[@class='alert alert-success alert-dismissible' and contains(text(),' An email with a confirmation link has been sent your email address.')]")
	public static WebElement passwordResetMessage;
	
}
