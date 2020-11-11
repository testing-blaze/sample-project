package com.automation.sample.steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * This class generates runner classes durin runtime. Make sure to add your package instead of "com.automation.sample.steps"
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"setup","com.automation.sample.steps","com.testingblaze.actionsfactory.gherkin","com.testingblaze.register"},
        features = {"target/parallel/features/[CUCABLE:FEATURE].feature"},
        plugin = {"json:target/cucumber-report/[CUCABLE:RUNNER].json","com.testingblaze.controller.ReportingLogsPlugin"},
        tags = {"not @wip"},
        monochrome = true,
        strict = true
)
public class RuntimeRunnerGenerator {

}

