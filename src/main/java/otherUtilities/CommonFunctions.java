package otherUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions{


	public void explicitWait(WebElement webel , int d,WebDriver driver) 
	{
		System.out.println("Explicit Waiting for " +d);
		WebDriverWait wait = new WebDriverWait(driver,d);
		wait.until(ExpectedConditions.visibilityOf(webel));
	}


}
