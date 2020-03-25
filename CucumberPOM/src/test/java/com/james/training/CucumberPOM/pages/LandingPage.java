package com.james.training.CucumberPOM.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 *
 */
public class LandingPage extends BasePage
{
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	private By contactUsLink = By.cssSelector("a[href='http://automationpractice.com/index.php?controller=contact']");
	private By signInLink = By.cssSelector("a[href='http://automationpractice.com/index.php?controller=my-account']");
	
	public ContactUsPage clickContactUs() {
	
		click(contactUsLink);
		return new ContactUsPage(driver);
	}
	
	public SigninPage clickSignin() {
		
		click(signInLink);
		return new SigninPage(driver);
	}
	
	public String validatePageTitle() {
		
		return driver.getTitle();
	}

	
}
