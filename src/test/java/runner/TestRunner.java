package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;
import otherUtilities.*;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions
(
		jsonReport = "target/cucumber.json",
		retryCount = 1, // Number of times retry should happen in case of failure
		detailedReport = true,
		detailedAggregatedReport = true,
		overviewReport = true,
		jsonUsageReport = "target/cucumber-usage.json",
		usageReport = true,
		toPDF = true,
		excludeCoverageTags = {"" },//Tags which need to excluded from coverage Report
		includeCoverageTags = {"@passed" },//Tags which need to included into coverage Report
		outputFolder = "target")

@CucumberOptions(
		plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html", 
				"html:target/cucumber-html-report",
				"json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
				"usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
		features = { "resources/features" },
		glue = { "stepDefinition" },
		tags = {"@RS"}
		)

/*@RunWith(Cucumber.class)
@CucumberOptions
(
		plugin=	{
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
				"rerun:target/rerun.txt"
		},
		features={"resources/features"},
		glue="stepDefinition",
		monochrome = true,
		tags={"@RS"}

		)*/

public class TestRunner {
	@AfterClass
	public static void writeExtentReport() {
		//ConfigFileReader conf=new ConfigFileReader();
		//Reporter.loadXMLConfig(new File(conf.getReportConfigPath()));
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		//System.out.println("Test system COnfig");
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.7.0");
		Reporter.setSystemInfo("Maven", "3.5.2");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");

	}
	

}
