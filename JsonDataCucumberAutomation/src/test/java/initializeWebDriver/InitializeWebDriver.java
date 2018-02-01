package initializeWebDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class InitializeWebDriver
{

    public static WebDriver getDriver ()
    {
        return driver;
    }

    public static WebDriver driver;

    @Before
    /**
     * Delete all cookies at the start of each scenario to avoid shared state
     * between tests
     */
    public static void openBrowser () throws MalformedURLException
    {
        System.out.println("Called openBrowser");
        System.setProperty("webdriver.chrome.driver",
            "C:/Users/c5261355/Documents/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public static void closeBrowser ()
    {
        driver.quit();
        driver = null;
    }

}
