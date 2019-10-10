package managers;

import org.openqa.selenium.WebDriver;

import pageFactory.Home_page_Objects;
import pageFactory.Login_page_Objects;

public class PageObjectManager {

	private WebDriver driver;
	private Login_page_Objects loginPage;
	private Home_page_Objects homePage;	
	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}
	public Login_page_Objects getLoginPage(){
		return (loginPage == null) ? loginPage = new Login_page_Objects(driver) : loginPage;
	}
	public Home_page_Objects getHomePage(){
		return (homePage == null) ? homePage = new Home_page_Objects(driver) : homePage;
	}
	/*	public HomePage getHomePage(){
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}
	public ProductListingPage getProductListingPage() {
		return (productListingPage == null) ? productListingPage = new ProductListingPage(driver) : productListingPage;
	}
	public CartPage getCartPage() {
		return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;
	}
		public CheckoutPage getCheckoutPage() {

		return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;

	}*/

}