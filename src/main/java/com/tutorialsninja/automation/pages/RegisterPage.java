package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage {

	public RegisterPage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-firstname")
	public static WebElement firstName;
	
	@FindBy(id="input-lastname")
	public static WebElement lastName;
	
	@FindBy(id="input-email")
	public static WebElement eMail;
	
	@FindBy(id="input-telephone")
	public static WebElement telePhone;
	
	@FindBy(id="input-password")
	public static WebElement password;
	
	@FindBy(id="input-confirm")
	public static WebElement confirmPassword;
	
	@FindBy(name="agree")
	public static WebElement privacy;
	
	@FindBy(xpath="//*[ @value='Continue']")
	public static WebElement continueButton;
	
	@FindBy(xpath="//*[@class='breadcrumb']/li/a[contains(text(),'Register')]")
	public static WebElement registerBreadcrumb;
	
	@FindBy(xpath="//*[@class='text-danger' and contains(text(),'First Name')]")
	public static WebElement firstNameWarning;
	
	@FindBy(xpath="//*[@class='text-danger' and contains(text(),'Last Name')]")
	public static WebElement lastNameWarning;
	
	@FindBy(xpath="//*[@class='text-danger' and contains(text(),'E-Mail')]")
	public static WebElement emailWarning;
	
	@FindBy(xpath="//*[@class='text-danger' and contains(text(),'Telephone')]")
	public static WebElement telephoneWarning;
	
	@FindBy(xpath="//*[@class='text-danger' and contains(text(),'Password')]")
	public static WebElement passwordWarning;
	
	@FindBy(xpath="//div[contains(text(),' Warning: You must agree to the Privacy Policy!')]")
	public static WebElement privacyWarning;
	
	@FindBy(xpath="//input[@name='newsletter' and @value='1']")
	public static WebElement subscribeNewsLetter;
	
	@FindBy(xpath="//div[contains(text(),' Warning: E-Mail Address is already registered!')]")
	public static WebElement alreadyRegisteredWarning;
	
	public static void  enterAllDetails(DataTable dataTable,String detailstype)
	{
		
		Map<String, String> map=dataTable.asMap(String.class, String.class);
		Elements.TypeText(RegisterPage.firstName, map.get("FirstName"));
		Elements.TypeText(RegisterPage.lastName, map.get("LastName"));
		Elements.TypeText(RegisterPage.telePhone, map.get("Telephone"));
		Elements.TypeText(RegisterPage.password, map.get("Password"));
		Elements.TypeText(RegisterPage.confirmPassword, map.get("Password"));
		
		if(detailstype.equalsIgnoreCase("duplicate"))
		{
			Elements.TypeText(RegisterPage.eMail, map.get("Email"));
		}
		else
		{
			Elements.TypeText(RegisterPage.eMail, System.currentTimeMillis()+map.get("Email"));
		}
	}
	
}
