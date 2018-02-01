/**
 * 
 */
package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author james.ngondo
 */
public class ContactPage extends AbstractPage
{

    public ContactPage (WebDriver driver)
    {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public ContactPage setNameField (String value)
    {
        driver.findElement(By.name("name_field")).sendKeys(value);
        return new ContactPage(driver);
    }

    public ContactPage setAddressField (String value)
    {
        driver.findElement(By.name("address_field")).sendKeys(value);
        return new ContactPage(driver);
    }

    public ContactPage setPostcodeField (String value)
    {
        driver.findElement(By.name("postcode_field")).sendKeys(value);
        return new ContactPage(driver);
    }

    public ContactPage setEmailField (String value)
    {
        driver.findElement(By.name("email_field")).sendKeys(value);
        return new ContactPage(driver);

    }

    public ContactConfirmPagePage submitForm ()
    {
        driver.findElement(By.id("submit_message")).click();
        return new ContactConfirmPagePage(driver);
    }

}
