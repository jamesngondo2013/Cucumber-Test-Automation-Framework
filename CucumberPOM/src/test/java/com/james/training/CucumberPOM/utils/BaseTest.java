package com.james.training.CucumberPOM.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseTest {

	protected WebDriver webDriver;
	private static Properties prop;
	public static WebDriverWait wait;
	
	public BaseTest() {
		
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\i350380\\eclipse-workspace\\CucumberPOM\\src\\test\\java\\com\\james\\training\\CucumberPOM\\config\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	
	//@Before
	public void initialize() {
		webDriver = BrowserDriverFactory.createDriver(prop);
		webDriver.get(prop.getProperty("url"));
		
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		webDriver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(webDriver, 5);
	}
	
	//@After
	public void afterScenario() {
	    //takeScreenshot();
	    //closeBrowser();
		webDriver.close();
		webDriver.quit();
	}
	
	
}
