package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Feature", //corrected path from feature folder
		glue = "steDefinition2", //corrected package name from step definition 
				plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"}
		
		
		
		)



public class MyRunner2 extends AbstractTestNGCucumberTests {

}
