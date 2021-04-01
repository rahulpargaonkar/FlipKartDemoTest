package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends BasePage{

	@FindBy(xpath="//span[contains(text(),'Enter Email/Mobile number')]/ancestor::div/input")
	WebElement emailTextField;
	
	@FindBy(xpath="//span[contains(text(),'Enter Password')]/ancestor::div/input")
	WebElement pwdTextField;
	
	@FindBy(xpath="//span[contains(text(),'Login')]/parent::button")
	WebElement loginButton;
	
	
	@FindBy(xpath="//span[contains(text(),'Looks like')]")
	WebElement invalidLogintext;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void verifyLoginSucessfull(String email,String pwd) {
		// TODO Auto-generated method stub
		
		
		
	}

	public boolean isLoginSucessfull(String email, String pwd) {
		// TODO Auto-generated method stub
		WaitForElement(emailTextField, 5);
		emailTextField.sendKeys(email);
		pwdTextField.sendKeys(pwd);
		loginButton.click();
		WaitForElement(invalidLogintext, 5);
		if(!invalidLogintext.isDisplayed()) {
		return true;
		}
		else {
			return false;
		}
	}

}
