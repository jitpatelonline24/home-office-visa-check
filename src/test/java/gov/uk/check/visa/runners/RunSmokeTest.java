package gov.uk.check.visa.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",    // content path of features folder
        glue =  "com/nopcommerce/demo/steps",       // sources path from steps folder
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@regression and not @smoke"

)
public class RunCukeTest extends AbstractTestNGCucumberTests {
}
