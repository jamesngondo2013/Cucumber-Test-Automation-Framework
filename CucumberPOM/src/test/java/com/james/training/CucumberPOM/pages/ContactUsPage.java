package com.james.training.CucumberPOM.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage extends BasePage{

	WebDriver driver;
	
	private By pageHeader = By.xpath("//*[@class='page-heading bottom-indent']");
	
	public ContactUsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public String pageHeading() {
		WebElement element = findElement(pageHeader);
		String header = element.getText();
		 return header;
	}

}
