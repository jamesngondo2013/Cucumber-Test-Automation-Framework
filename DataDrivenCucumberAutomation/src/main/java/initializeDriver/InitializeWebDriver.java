package initializeDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class InitializeWebDriver
{

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

    // @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot (Scenario scenario)
    {

        if (scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                // byte[] screenshot = getScreenshotAs(OutputType.BYTES);
                byte[] screenshot =
                    ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            }
            catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }

        }
        driver.quit();

    }

    @After
    public static void closeBrowser ()
    {
        driver.quit();
    }
}
