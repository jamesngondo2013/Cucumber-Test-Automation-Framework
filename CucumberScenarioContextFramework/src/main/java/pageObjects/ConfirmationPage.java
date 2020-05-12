package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {

	WebDriver driver;
	
	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='post-7']/div/div/div/section/table/tbody/tr/td"))
	private List<WebElement> prd_List;	
	
	public List<String> getProductNames() {
		List<String> productNames = new ArrayList<>();
		int counter=0;
		for(WebElement element : prd_List) {
			counter++;
			System.out.println(counter+element.getText());
			productNames.add(element.getText().toUpperCase());
		}
		
		
		return productNames;
	}
}
