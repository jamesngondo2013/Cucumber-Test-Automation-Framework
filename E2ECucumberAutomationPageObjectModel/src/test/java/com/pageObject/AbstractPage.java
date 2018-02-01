package com.pageObject;

import org.openqa.selenium.WebDriver;

import com.pageObject.facebook.FacebookLandingPage;

public class AbstractPage
{

    protected WebDriver driver;

    public AbstractPage (WebDriver driver)
    {
        this.driver = driver;
    }

    public LandingPage navigateToWebApp ()
    {
        driver.navigate().to("http://www.thetestroom.com/webapp");
        return new LandingPage(driver);
    }

    public FacebookLandingPage navigateToFBWebApp ()
    {
        driver.navigate().to("http://www.facecbook.com");
        return new FacebookLandingPage(driver);
    }

    public void closeBrowser ()
    {
        driver.quit();
    }

}
