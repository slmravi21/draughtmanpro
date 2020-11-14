package hellocucumber;

import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.CucumberOptions;
import courgette.api.junit.Courgette;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Courgette.class)
@CourgetteOptions(
    threads = 1,
    runLevel = CourgetteRunLevel.FEATURE,
    rerunFailedScenarios = false,
    rerunAttempts = 1,
    showTestOutput = true,
    reportTitle = "DraughtsmanPro",
    reportTargetDir = "build ",
    environmentInfo = "browser=chrome; git_branch=master",
    cucumberOptions =
        @CucumberOptions(
            features = "src/test/resources/hellocucumber",
//            glue = "src/test/java/hellocucumber",
            tags = {"@test"},
            publish = false,
            plugin = {
              "pretty",
              "json:build/cucumber-report/cucumber.json",
              "html:build/cucumber-report/cucumber.html",
              "junit:build/cucumber-report/cucumber.xml"
            }))
public class RunCucumberTest {}
