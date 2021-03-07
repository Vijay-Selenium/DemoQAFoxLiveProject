package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {

	public LoginPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-email")
	public static WebElement emailAddress;
	
	@FindBy(id="input-password")
	public static WebElement password;
	
	@FindBy(xpath="//*[@class='btn btn-primary' and @value='Login']")
	public static WebElement loginButton;
	
	@FindBy(xpath="//*[@class='alert alert-danger alert-dismissible']")
	public static WebElement invalidLoginWarning;
	
	@FindBy(xpath="//*[@class='form-group']/a[contains(text(),'Forgotten Password')]")
	public static WebElement forgottenPassword;
	
	public static void doLogin(String email, String password)
	{
		try {
			
			Elements.TypeText(LoginPage.emailAddress,email);
			Elements.TypeText(LoginPage.password, password);
			Elements.click(LoginPage.loginButton);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
