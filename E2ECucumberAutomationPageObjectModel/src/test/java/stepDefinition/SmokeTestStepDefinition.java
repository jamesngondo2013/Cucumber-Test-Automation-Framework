package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageObject.ContactConfirmPagePage;
import com.pageObject.ContactPage;
import com.pageObject.LandingPage;
import com.pageObject.facebook.FBDashboardPage;
import com.pageObject.facebook.FBLoginPage;
import com.pageObject.facebook.FacebookLandingPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTestStepDefinition
{
    WebDriver driver;
    LandingPage landingPage;
    FacebookLandingPage fbLandingPage;
    FBDashboardPage dashboard;
    FBLoginPage fblogin;
    ContactPage contactPage;
    ContactConfirmPagePage confirmPage;

    public SmokeTestStepDefinition ()
    {
        System.setProperty("webdriver.chrome.driver",
            "C:/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        // driver.get("http://www.facecbook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("^Open firefox and start application$")
    public void open_firefox_and_start_application () throws Throwable
    {
        fbLandingPage = new FacebookLandingPage(driver);
        fbLandingPage.navigateToFBWebApp();

    }

    @When("^I enter valid \"(.*?)\"$")
    public void i_enter_valid (String arg1) throws Throwable
    {
        fblogin = new FBLoginPage(driver);
        fblogin.setUsernameAndPassword(arg1);
    }

    @And("^I pass in a valid \"(.*?)\"$")
    public void i_pass_in_a_valid (String arg1) throws Throwable
    {
        fblogin.setPassword(arg1);
    }

    @Then("^User should be able to login successfully$")
    public void user_should_be_able_to_login_successfully () throws Throwable
    {
        dashboard = fblogin.loginToDashboardPage();
    }

    @Then("^Application should close$")
    public void application_should_close () throws Throwable
    {
        dashboard.closeBrowser();
    }

    // ===Scenario 2==============
    @Given("^I am on the zoo site$")
    public void i_am_on_the_zoo_site () throws Throwable
    {
        landingPage = new LandingPage(driver);
        landingPage.navigateToWebApp();
    }

    @When("^I click on \"(.*?)\"$")
    public void i_click_on (String link) throws Throwable
    {
        // id=contact_link ==> link = contact
        contactPage = landingPage.navigateToContactPage(link);
    }

    @When("^I enter \"(.*?)\" into the name field$")
    public void i_enter_into_the_name_field (String value) throws Throwable
    {
        contactPage = new ContactPage(driver);
        contactPage.setNameField(value);
    }

    @When("^I enter \"(.*?)\" into the address field$")
    public void i_enter_into_the_address_field (String value) throws Throwable
    {
        contactPage.setAddressField(value);
    }

    @When("^I enter \"(.*?)\" into the postcode field$")
    public void i_enter_into_the_postcode_field (String value) throws Throwable
    {
        contactPage.setPostcodeField(value);
    }

    @When("^I enter \"(.*?)\" into the email field$")
    public void i_enter_into_the_email_field (String value) throws Throwable
    {
        contactPage.setEmailField(value);
    }

    @When("^I submit the contact form$")
    public void i_submit_the_contact_form () throws Throwable
    {
        confirmPage = contactPage.submitForm();

    }

    @Then("^I check I am on the confirmation page$")
    public void i_check_I_am_on_the_confirmation_page () throws Throwable
    {
        Assert.assertTrue(confirmPage.getPageTitle().contains("We have your message"));
    }

    @Then("^I close the browser$")
    public void i_close_the_browser () throws Throwable
    {
        confirmPage.closeBrowser();
    }

    // ================scenario 3
    @When("^I populate the entire contact form at once$")
    public void i_populate_the_entire_contact_form_at_once () throws Throwable
    {
        contactPage.setNameField("name");
        contactPage.setAddressField("address");
        contactPage.setEmailField("email");
        contactPage.setPostcodeField("postcode");
    }

}
