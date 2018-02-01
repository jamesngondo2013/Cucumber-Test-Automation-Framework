package CucumberAutomation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = { "stepDefinition" },
    plugin = { "html:target/cucumber-html-report" })

public class CucumberTestRunner2
{

    // Different kinds of reporting
    /*
     * "json:target/cucumber.json" "pretty:target/cucumber-pretty.txt"
     * "usage:taget/cucumber-usage.json" junit:target/cucumber-results.xml
     */
}
