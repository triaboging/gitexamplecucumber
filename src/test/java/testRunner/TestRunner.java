package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/search.feature" },
        glue = "stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html",
        "json:target/cucumber-reports.json"},
        monochrome = true,
        tags = "@positive"
)
public class TestRunner {
}
