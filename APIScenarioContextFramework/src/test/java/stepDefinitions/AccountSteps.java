package stepDefinitions;

import apiEngine.model.requests.AuthorizationRequest;
import cucumber.TestContext;
import cucumber.api.java.en.Given;

public class AccountSteps extends BaseStep {
 
	
	private static final String USERNAME = "jaycool";
	private static final String PASSWORD = "Test@123";
    public AccountSteps(TestContext testContext){
     super(testContext);
    }
 
    @Given("^I am an authorized user$")
    public void iAmAnAuthorizedUser() {
        AuthorizationRequest authRequest = new AuthorizationRequest(USERNAME, PASSWORD);
        getEndPoints().authenticateUser(authRequest);
    }
}
