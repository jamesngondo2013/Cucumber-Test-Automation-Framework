/**
 * 
 */
package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import CucumberAutomation.SerialiseDeserialiseJson;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import initializeWebDriver.InitializeWebDriver;

/**
 * @author james.ngondo
 */
public class JSONFrameWorkExample
{
    public String json;
    public String jsonEmployee;

    public JSONFrameWorkExample ()
    {

    }

    @When("^I create json string from object and write to file$")
    public void i_create_json_string_from_object_and_write_to_file () throws Throwable
    {
        SerialiseDeserialiseJson.serializeJsonData();
        SerialiseDeserialiseJson.serializeEmployeeJsonDataFromDB();
    }

    @When("^I read json string from a file$")
    public void i_read_json_string_from_a_file () throws Throwable
    {
        SerialiseDeserialiseJson.deserializeJsonData();
        SerialiseDeserialiseJson.deserializeEmployeeJsonData();

    }

    @Then("^I print it as a string$")
    public void i_print_it_as_a_string () throws Throwable
    {
        json = SerialiseDeserialiseJson.getJsonString();
        jsonEmployee = SerialiseDeserialiseJson.getJsonEmployeeString();
    }

    @When("^I open practiceselenium website$")
    public void i_open_practiceselenium_website () throws Throwable
    {
        InitializeWebDriver.openBrowser();
        InitializeWebDriver.getDriver().get(
            "http://www.practiceselenium.com/practice-form.html");
    }

    @When("^I read the json data file \"(.*?)\"$")
    public void i_read_the_json_data_file (String arg1) throws Throwable
    {
        jsonEmployee = SerialiseDeserialiseJson.getJsonEmployeeString();
    }

    @When("^I fill the form with data from json and submit$")
    public void i_fill_the_form_with_data_from_json_and_submit () throws Throwable
    {
        JsonParser parser = new JsonParser();
        JsonObject myobject = (JsonObject)parser.parse(jsonEmployee);
        JsonArray myarray = myobject.get("emp").getAsJsonArray();
        int arraysize = myarray.size();
        
        for (int i = 0; i < arraysize; i++) {
          //get the 2nd item from jason array
            JsonObject obj = myarray.get(i).getAsJsonObject();
            
            InitializeWebDriver.getDriver().findElement(By.name("firstname")).sendKeys(
                obj.get("firstName").getAsString());
            InitializeWebDriver.getDriver().findElement(By.name("lastname")).sendKeys(
                obj.get("lastName").getAsString());
            InitializeWebDriver.getDriver().findElement(By.id("sex-1")).click();
            InitializeWebDriver.getDriver().findElement(By.id("exp-2")).click();
            InitializeWebDriver.getDriver().findElement(By.id("datepicker")).sendKeys(
                obj.get("date_stopped").getAsString());
            InitializeWebDriver.getDriver().findElement(By.id("tea3")).click();
            InitializeWebDriver.getDriver().findElement(By.id("tool-1")).click();
            Select continents_select =
                new Select(InitializeWebDriver.getDriver().findElement(By.id("continents")));
            continents_select.selectByVisibleText(obj.get("continent").getAsString());
            Select another_select_list =
                new Select(
                    InitializeWebDriver.getDriver().findElement(By.id("selenium_commands")));
            another_select_list.selectByVisibleText(
                obj.get("selenium_commands").getAsString());
            InitializeWebDriver.getDriver().findElement(By.id("submit")).click();
            AssertJUnit.assertEquals("Welcome", InitializeWebDriver.getDriver().getTitle()); 
            
            i_open_practiceselenium_website ();
        }       
        
    }

    @Then("^I close the browser$")
    public void i_close_the_browser () throws Throwable
    {
        InitializeWebDriver.closeBrowser();
    }

}
