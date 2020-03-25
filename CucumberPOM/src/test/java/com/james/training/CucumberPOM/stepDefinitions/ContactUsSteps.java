package com.james.training.CucumberPOM.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.james.training.CucumberPOM.pages.ContactUsPage;
import com.james.training.CucumberPOM.pages.LandingPage;
import com.james.training.CucumberPOM.utils.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContactUsSteps extends BaseTest{
	
	LandingPage lp;
	ContactUsPage cp;
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		initialize();
	}

	@Then("^user is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
	   //assert that user is on the landing page
	}

	@Then("^user clicks contact us$")
	public void user_clicks_contact_us() throws Throwable {
	  lp = new LandingPage(webDriver);
	  lp.clickContactUs();
	}

	@Then("^contact us page is displayed$")
	public void contact_us_page_is_displayed() throws Throwable {
	  //assert that contact page is displayed
	}

	@Then("^validate contact us page title$")
	public void validate_contact_us_page_title() throws Throwable {
	  cp = new ContactUsPage(webDriver);
	  String title = cp.getCurrentPageTitle();
	  System.out.println("Title: "+ title);
	  Assert.assertEquals("Contact us - My Store",title);
	}

	@Then("^validate contact us page heading$")
	public void validate_contact_us_page_heading() throws Throwable {
		 cp = new ContactUsPage(webDriver);
		 String pageHeading = cp.pageHeading();
		System.out.println(pageHeading);
		Assert.assertEquals("CUSTOMER SERVICE - CONTACT US",pageHeading);
	}
	
	@Then("^the browser is closed$")
	public void the_browser_is_closed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

}
