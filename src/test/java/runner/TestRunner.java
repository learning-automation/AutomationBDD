package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
                glue = {"steps"},
                tags = "@testingwitData",
                plugin = {"pretty","html:target/reports/"},
                publish = true)
public class TestRunner {
    //tags
    //outline
    //background
    //report
    // options - dryrun = true -> it ensures that all the steps are implemented
              // monochrome ->  true -> it makes the console output more readable
    //data sharing between the steps
}
