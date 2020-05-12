package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import selenium.Wait;

public class ProductListingPage {
	
	WebDriver driver;

	public ProductListingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = "button.single_add_to_cart_button")
	private WebElement btn_AddToCart;
	
	@FindBy(how = How.ID, using = "pa_size")
	private WebElement size_dropdown;
	
	@FindBy(how = How.ID, using = "pa_color")
	private WebElement color_dropdown;

	@FindAll(@FindBy(how = How.CSS, using = ".noo-product-inner"))
	private List<WebElement> prd_List;

	public void clickOn_AddToCart() {
		
		btn_AddToCart.click();
		Wait.untilJqueryIsDone(driver);
		
	}
	
	public void select_ProductColor() {
		Select color = new Select(color_dropdown);
		color.selectByVisibleText("White");
		Wait.untilJqueryIsDone(driver);
	}
	
	public void select_ProductSize() {
		Select color = new Select(size_dropdown);
		color.selectByVisibleText("Small");
		Wait.untilJqueryIsDone(driver);
	}

	public void select_Product(int productNumber) {
		prd_List.get(productNumber).click();
	}
	
	public String getProductName(int productNumber) {
		return prd_List.get(productNumber).findElement(By.cssSelector("h3")).getText();
	}
}
