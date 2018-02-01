package com.pageObject.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageObject.AbstractPage;

public class FBLoginPage extends AbstractPage
{

    public FBLoginPage (WebDriver driver)
    {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public FBLoginPage setUsernameAndPassword (String value)
    {
        driver.findElement(By.id("email")).sendKeys(value);
        return new FBLoginPage(driver);
    }

    public FBLoginPage setPassword (String value)
    {
        driver.findElement(By.id("pass")).sendKeys(value);
        return new FBLoginPage(driver);
    }

    public FBDashboardPage loginToDashboardPage ()
    {
        driver.findElement(By.id("loginbutton")).click();
        return new FBDashboardPage(driver);
    }

}
