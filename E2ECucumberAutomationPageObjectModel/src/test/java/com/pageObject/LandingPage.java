/**
 * 
 */
package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author james.ngondo
 */
public class LandingPage extends AbstractPage
{

    /**
     * 
     */
    public LandingPage (WebDriver driver)
    {
        super(driver);
    }

    public ContactPage navigateToContactPage (String link)
    {
        // id=contact_link
        driver.findElement(By.id(link.toLowerCase() + "_link")).click();
        return new ContactPage(driver);
    }

}
