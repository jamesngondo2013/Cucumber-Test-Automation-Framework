package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import enums.Context;
import pageObjects.ProductListingPage;

public class ProductPageSteps {

	TestContext testContext;
	ProductListingPage productListingPage;

	public ProductPageSteps(TestContext context) {
		testContext = context;
		productListingPage = testContext.getPageObjectManager().getProductListingPage();
	}

	@When("^choose to buy the first item$")
	public void choose_to_buy_the_first_item() throws Throwable {
		String productName = productListingPage.getProductName(0);
		System.out.println(productName);
		testContext.scenarioContext.setContext(Context.PRODUCT_NAME, productName);
		
		productListingPage.select_Product(0);
		productListingPage.select_ProductColor();
		productListingPage.select_ProductSize();
		productListingPage.clickOn_AddToCart();
	}
}
