package pageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Login_page_Objects {
	WebDriver driver;
	public Login_page_Objects(WebDriver driver){ 		 
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}	
	
	
	//Username field 
	@FindBy(how = How.ID , using = "txtUsername")
	public static WebElement txtbx_UserName;
	
	//Password field
	@FindBy(how = How.ID, using = "txtPassword")	 
	public static WebElement txtbx_Password;

	//Login Button
	@FindBy(how = How.ID, using = "btnLogin")	 
	public static WebElement btn_Login ;
	
	//Span Message - Invalid Credentials
	@FindBy(how = How.ID, using = "spanMessage")	 
	public static WebElement spanMessageInvalid ;
	
	public  void setUsername(String userName) {
		txtbx_UserName.sendKeys(userName);		
	}
	public  void setPassword(String password) {
		txtbx_Password.sendKeys(password);		
	} 
	public  void loginClick() {
		btn_Login.click();
	} 
}
