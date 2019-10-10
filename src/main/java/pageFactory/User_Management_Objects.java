package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class User_Management_Objects {
	WebDriver driver;



	@FindBy(how = How.ID , using = "menu_admin_viewAdminModule")
	public WebElement home_AdminModule;
	
	@FindBy(how = How.NAME , using = "btnAdd")
	public WebElement userman_Add;
	
	
	public User_Management_Objects(WebDriver driver){ 		 
		this.driver = driver; 
		PageFactory.initElements(driver, this);

	} 


}
