package otherUtilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	public static void captureScreenShot(WebDriver ldriver) {

		TakesScreenshot ts = (TakesScreenshot)ldriver;

		File sourceFile = (ts).getScreenshotAs(OutputType.FILE);		
		File destinationFile = new File(System.getProperty("user.dir")+"/evidences_screenshots/image_" + System.currentTimeMillis()+ ".png");

		try {
			//now copy the  screenshot to desired location using copyFile method			
			FileUtils.copyFile(sourceFile, destinationFile);
			}	
		catch (IOException e)		 
		{		 
			System.out.println(e.getMessage());
		}

	}

}
