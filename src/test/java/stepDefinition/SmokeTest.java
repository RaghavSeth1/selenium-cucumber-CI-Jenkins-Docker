package stepDefinition;


import otherUtilities.*;
import pageFactory.Login_page_Objects;
import pageFactory.Home_page_Objects;
import org.openqa.selenium.WebDriver;


import cucumber.api.*;
import cucumber.api.java.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
public class SmokeTest  {
	WebDriver driver;	
	TestContext testContext;
	Home_page_Objects homePage;
	Login_page_Objects loginPage;
	Screenshots shot = new Screenshots();	
	//Home_page_Objects homePage;
	PageObjectManager pageObjectManager; 	
	WebDriverManager webDriverManager;

/*	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}*/

	@Before
	public void beforeScenario(){

		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		FileReaderManager.getInstance().getConfigReader().getImplicitlyWait();
	}
	@After
	public void afterScenario(Scenario scenario) 
	{
		System.out.println("Quit Browser after test completion");
		if (scenario.isFailed()){
			Screenshots.captureScreenShot(driver);
		}
		driver.quit();
	}	
	/*@When("^Start application$")
	public void startApplication(){
		configFileReader= new ConfigFileReader();	
		driver.navigate().to(configFileReader.getApplicationUrl());
	}*/

	@Then("^Correct title should be displayed$")
	public void validateCorrectTitle() throws Throwable {
		//AssertJUnit.assertTrue(driver.getTitle().contains("OrangeHRM"));

	}

	@Given("^Login Page Navigated$")
	public void navigateLoginPage() {
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	@Given("^I enter \"([^\"]*)\" and \"([^\"]*)\" on Login page and click login button$")
	public  void loginwithAdmin(String userName, String password) {
		pageObjectManager = new PageObjectManager(driver);

		loginPage=pageObjectManager.getLoginPage();
		loginPage.setUsername(userName);
		loginPage.setPassword(password);
		loginPage.loginClick();
	}

	@Then("^I should see the Dashboard Page$")
	public void validateLoginSuccessfull(){	

		homePage=pageObjectManager.getHomePage();

		if(homePage.home_welcomeIcon.isDisplayed()== true){
			System.out.println("User Successfully Logged in");
		}
	}
	@Then("^Logout of the Application$")
	public void logoutApplication() {

		homePage=pageObjectManager.getHomePage();		
		homePage.logoutClick();		
	}

	@Then("^Invalid Credentials Error is displayed$")
	public void UserDeniedAccess()  {
		loginPage=pageObjectManager.getLoginPage();

		if(Login_page_Objects.spanMessageInvalid.isDisplayed()== true){
			System.out.println("User denied access - Invalid Credentials");
		}

	}



}
