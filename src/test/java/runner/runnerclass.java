package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/reg.feature","src/test/resources/login.feature","src/test/resources/example.feature","src/test/resources/example2.feature"},glue="stepdef")
 
public class runnerclass {

}
