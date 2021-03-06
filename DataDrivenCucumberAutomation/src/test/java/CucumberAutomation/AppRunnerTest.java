package CucumberAutomation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
    features = "features", glue = { "stepDefinition" },
    plugin = { "pretty", "html:target/cucumber-html-report" })
public class AppRunnerTest extends AbstractTestNGCucumberTests
{

}
