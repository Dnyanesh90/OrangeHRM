package TestRunnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeaturesFiles"},
		glue= {"StepDefination"},
		dryRun=false,
		tags= "@All"
		)
public class TestRunner {

}
