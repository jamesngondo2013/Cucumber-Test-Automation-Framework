package stepDefinition;

import CucumberAutomation.SerialiseDeserialiseJson;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccessJsonFileStepDefinition {
	
	 public String json;
	 public String jsonEmployee;

	 @When("^I create json string from object and write to file$")
	    public void i_create_json_string_from_object_and_write_to_file () throws Throwable
	    {
	        SerialiseDeserialiseJson.serializeJsonData();
	      
	    }
	 
	 @Then("^I print it as a string$")
	    public void i_print_it_as_a_string () throws Throwable
	    {
	        json = SerialiseDeserialiseJson.getJsonString();
	        System.out.println(jsonEmployee);
	    }
	 
	 @When("^I read json string from a file$")
	    public void i_read_json_string_from_a_file () throws Throwable
	    {
	        SerialiseDeserialiseJson.deserializeJsonData();
	        SerialiseDeserialiseJson.deserializeEmployeeJsonData();

	    }


}
