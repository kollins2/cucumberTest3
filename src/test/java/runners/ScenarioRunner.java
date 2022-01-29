package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features ="classpath:features",

		glue ="steps",
	 tags ="@scenario1,@scenarios2",
		monochrome = true,
		dryRun = false,
		plugin = {
				"pretty",
				"html:targer/cucumber",
				"json:target/cucumber.json"
		}
		
		
		)
public class ScenarioRunner {

}
