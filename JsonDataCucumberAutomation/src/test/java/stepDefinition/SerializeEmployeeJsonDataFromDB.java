package stepDefinition;

import CucumberAutomation.SerialiseDeserialiseJson;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SerializeEmployeeJsonDataFromDB {

	@When("^I serialize database employee object to json$")
	public void i_serialize_database_employee_object_to_json() throws Throwable {
		  SerialiseDeserialiseJson.serializeEmployeeJsonDataFromDB();
	}
	
	@Then("^I read the employee json file$")
	public void i_read_the_employee_json_file() throws Throwable {
	    // Write code to read the json
	   
	}

	@Then("^I verify that the objects are serialized properly$")
	public void i_verify_that_the_objects_are_serialized_properly() throws Throwable {
	   //assert that employees are properly serialized
	}
}
