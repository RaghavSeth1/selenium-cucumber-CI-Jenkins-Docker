package pageFactory;
import otherUtilities.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class Home_page_Objects {
	WebDriver driver;

	Home_page_Objects homePage;
	//PageObjectManager pageObjectManager; 
	WebDriverManager webDriverManager;
	CommonFunctions common=new CommonFunctions();
	@FindBy(how = How.ID , using = "welcome")
	public WebElement home_welcomeIcon;

	@FindBy(how = How.PARTIAL_LINK_TEXT , using = "Logout")
	public WebElement link_Logout;


	//driver.findElement(By.linkText("View Profile")).click()
	public  void logoutClick() {
		
		home_welcomeIcon.click();
		common.explicitWait(link_Logout, 10, driver);
		link_Logout.click();
	} 

	public Home_page_Objects(WebDriver driver){ 		 
		this.driver = driver; 
		PageFactory.initElements(driver, this);

	} 

}
