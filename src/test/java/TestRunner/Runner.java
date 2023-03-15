package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports1.html",
                "junit:target/xml-report/cucumber1.xml"
        },
        features = "src/test/resources/features",
        glue={"stepdefinitions","hooks"},
        tags= "@nevzat",
        dryRun =false
)
public class Runner {

}
