package runner;



import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/features",glue= {"stepDefinitions"},monochrome=true,
plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber-json-report.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }


}
