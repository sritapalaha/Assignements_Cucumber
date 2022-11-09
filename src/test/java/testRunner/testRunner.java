package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src/test/java/features",
		glue = {"stepDefinition","hooks"},
		tags={"@login"}, 
		monochrome = true,
		dryRun = false,
		plugin = {"pretty" ,"html:target/htmlreport","json:target/report.json", "junit:target/cucumber-reports/Cucumber.xml"}
		
		
		)
public class testRunner {

}
