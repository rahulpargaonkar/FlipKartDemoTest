package com.test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {
	private WebDriver driver;

	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void TestInvalidLogin() {
		HomePage homePage = new HomePage(driver);
	//	homePage.moveToLoginWindow();
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertFalse(loginPage.isLoginSucessfull("invalid1234@gmail.com", "testpwd"));

	}

	@AfterSuite
	public void teardown() {
		driver.quit();
	}

}
