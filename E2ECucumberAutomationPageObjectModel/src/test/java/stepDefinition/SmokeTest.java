package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest
{
    WebDriver driver;

    @Given("^Open firefox and start application$")
    public void open_firefox_and_start_application () throws Throwable
    {
        System.setProperty("webdriver.chrome.driver",
            "C:/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.facecbook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
    public void i_enter_valid_and_valid (String arg1, String arg2) throws Throwable
    {
        driver.findElement(By.id("email")).sendKeys(arg1);
        driver.findElement(By.id("pass")).sendKeys(arg2);
    }

    @Then("^User should be able to login successfully$")
    public void user_should_be_able_to_login_successfully () throws Throwable
    {
        driver.findElement(By.id("loginbutton")).click();

    }

    @Then("^Application should close$")
    public void application_should_close () throws Throwable
    {
        driver.quit();
    }

    @Given("^I want to write a step with precondition$")
    public void i_want_to_write_a_step_with_precondition () throws Throwable
    {

    }

    @Given("^some other precondition$")
    public void some_other_precondition () throws Throwable
    {

    }

    @When("^I complete action$")
    public void i_complete_action () throws Throwable
    {

    }

    @When("^some other action$")
    public void some_other_action () throws Throwable
    {

    }

    @When("^yet another action$")
    public void yet_another_action () throws Throwable
    {

    }

    @Then("^I validate the outcomes$")
    public void i_validate_the_outcomes () throws Throwable
    {

    }

    @Then("^check more outcomes$")
    public void check_more_outcomes () throws Throwable
    {

    }

    @Given("^I want to write a step with name(\\d+)$")
    public void i_want_to_write_a_step_with_name (int arg1) throws Throwable
    {

    }

    @When("^I check for the (\\d+) in step$")
    public void i_check_for_the_in_step (int arg1) throws Throwable
    {

    }

    @Then("^I verify the success in step$")
    public void i_verify_the_success_in_step () throws Throwable
    {

    }

    @Then("^I verify the Fail in step$")
    public void i_verify_the_Fail_in_step () throws Throwable
    {

    }

}
