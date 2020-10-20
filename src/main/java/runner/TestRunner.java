package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//the path of the feature files
		features = "src/main/java/features/login.feature", 
		//the path of the step definition files
		glue={"stepDefinition"}
)
public class TestRunner {

}
