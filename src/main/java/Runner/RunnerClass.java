package Runner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = "src/main/java/FeatureFile",        // location of feature files
		glue = {"StepDef"},				  //  location of step definition files 
		plugin = {"pretty","html:test-out",
				  "junit:junit_xml/junit.xml",
				"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent_Test_report.html"},                          // PlugIn that is used to generate different type of report
		monochrome = true,						//  to get the result in to the console
		dryRun = false,                         // used for mapping the feature files steps with all the methods of step definition
		strict = true               // it will fail the execution if all the steps of feature file don't have their step definition method
//		tags = {"@WrongRegistration"}
		)

public class RunnerClass extends AbstractTestNGCucumberTests {
	

}
