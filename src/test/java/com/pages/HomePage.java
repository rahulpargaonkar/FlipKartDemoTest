package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

	private WebDriver driver;
	
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement loginButton;
	
	@FindBy(xpath="//span[contains(text(),'Get access to your Orders, Wishlist and Recommendations')]")
	WebElement loginText;
	

	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver= driver;
		
		driver.get("https://www.flipkart.com/");
	}
	
	public void moveToLoginWindow() {
		WaitForElement(loginButton, 5);
		loginButton.click();
		WaitForElement(loginText, 5);
		
	}
	

}
