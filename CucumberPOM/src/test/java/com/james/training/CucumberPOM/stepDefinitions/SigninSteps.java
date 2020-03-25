package com.james.training.CucumberPOM.stepDefinitions;

import java.util.List;

import com.james.training.CucumberPOM.pages.LandingPage;
import com.james.training.CucumberPOM.pages.SigninPage;
import com.james.training.CucumberPOM.utils.BaseTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SigninSteps extends BaseTest{

	LandingPage landingPage;
	SigninPage signinPage;
	
	@Given("^user opens the browser$")
	public void user_opens_the_browser() throws Throwable {
		initialize();
	   
	}

	@Then("^user clicks on signin link$")
	public void user_clicks_on_signin_link() throws Throwable {
		 landingPage = new LandingPage(webDriver);
		 landingPage.clickSignin();
	}

	@Then("^signin page is displayed$")
	public void signin_page_is_displayed() throws Throwable {
		//assert that signin page is dispalyed
	}

	@Then("^verify signin page title$")
	public void verify_signin_page_title() throws Throwable {
	   //assert that signin page title is dispalyed
	}
	

	@When("^user login with the following$")
	public void user_login_with_the_following(DataTable table) throws Throwable {
		
		List<List<String>> data = table.raw();
		
		signinPage = new SigninPage(webDriver);
		signinPage.enterEmail(data.get(1).get(0));
		signinPage.enterPassword(data.get(1).get(1)); 
		
		System.out.println(data.get(1).get(0));
		System.out.println(data.get(1).get(1));
	}
	
	
	
	// ==========================================
	// SCENARIO OUTLINE
	// ==========================================
	
	@When("^user enters a valid username \"([^\"]*)\"$")
	public void user_enters_a_valid_username(String username) throws Throwable {
		signinPage = new SigninPage(webDriver);
		signinPage.enterEmail(username); 
	}

	@When("^user enters a valid password \"([^\"]*)\"$")
	public void user_enters_a_valid_password(String pass) throws Throwable {
		signinPage = new SigninPage(webDriver);
		//String password = Integer.toString(pass);
		signinPage.enterPassword(pass); 
	}
	
	@Then("^click login button$")
	public void click_login_button() throws Throwable {
		 signinPage.clickSubmitBtn();
	}

	@Then("^user should see the dashboard page$")
	public void user_should_see_the_dashboard_page() throws Throwable {
		 //assert dashboard is displayed
	}

	@Then("^verify the page title$")
	public void verify_the_page_title() throws Throwable {
	   //assert page title
	}
	
	


}
