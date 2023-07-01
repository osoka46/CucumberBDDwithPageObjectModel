package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "/Users/osmanbozdag/IdeaProjects/CucumberBDDwithPageObjectModel/src/test/java/resources/features",
        glue ="stepDefinitions",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:target/cucumber-reports/cucumber-report.html"})
public class TestNgRunner extends AbstractTestNGCucumberTests {

}
