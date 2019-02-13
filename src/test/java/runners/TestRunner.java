package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FunctionalTests", glue = { "stepDefinitions" }, plugin = { "pretty",
		"html:target/cucumber-reports" }, tags = {"~@E2ETest"})
public class TestRunner {

}
