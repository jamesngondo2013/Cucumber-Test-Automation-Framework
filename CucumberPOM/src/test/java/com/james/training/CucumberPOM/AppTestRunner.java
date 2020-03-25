package com.james.training.CucumberPOM;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

//@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\i350380\\eclipse-workspace\\CucumberPOM\\src\\test\\java\\com\\james\\training\\CucumberPOM\\features\\cucumber.feature", 
    glue = { "com/james/training/CucumberPOM/stepDefinitions" },
    dryRun=false,
    strict=true,
    monochrome=true,
    plugin = { "pretty", "html:target/cucumber-html-report" })
public class AppTestRunner extends AbstractTestNGCucumberTests
{
   
}
