package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	private WebDriver driver;

	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void WaitForElement(WebElement element, int time) {
		WebDriverWait wait =  new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
