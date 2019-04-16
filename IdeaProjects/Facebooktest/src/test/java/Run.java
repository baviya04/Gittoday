

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features =".", tags = {"@regressionpack1"},dryRun = true, strict = false)

public class Run {
}
