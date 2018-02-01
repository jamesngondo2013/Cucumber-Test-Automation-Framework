/**
 * 
 */
package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author C5261355
 */
public class ContactConfirmPagePage extends AbstractPage
{

    public ContactConfirmPagePage (WebDriver driver)
    {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public String getPageTitle ()
    {
        return driver.findElement(By.cssSelector(".content h1")).getText();

    }

}
