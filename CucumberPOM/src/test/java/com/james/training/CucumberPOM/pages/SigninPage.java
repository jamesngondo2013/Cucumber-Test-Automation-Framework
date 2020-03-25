package com.james.training.CucumberPOM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage extends BasePage{

	WebDriver driver;
	
	public SigninPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	private By emailTxt = By.id("email");
	private By passwordTxt = By.id("passwd");
	private By submitBtn = By.id("SubmitLogin");

	public void enterEmail(String email) {
		
		enter(email, emailTxt);
		
	}
	
	public void enterPassword(String passwd) {
		
		enter(passwd, passwordTxt);
		
	}
	
	public DashboardPage clickSubmitBtn() {
		
		click(submitBtn);
		
		return new DashboardPage(driver);
		
	}

}
