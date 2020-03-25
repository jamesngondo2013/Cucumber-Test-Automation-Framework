package com.james.training.CucumberPOM.pages;

import org.openqa.selenium.WebDriver;

public class DashboardPage extends SigninPage{

	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

}
