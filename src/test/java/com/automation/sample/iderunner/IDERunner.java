package com.automation.sample.iderunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * This class can be used to run/debug the tests from IDE.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"setup","com.automation.sample.steps","com.testingblaze.actionsfactory.gherkin","com.testingblaze.register"},
        features = {"src/test/resources/features"},
        plugin = {"json:target/cucumber-report/cucumber.json","html:target/cucumber-html","com.testingblaze.controller.ReportingLogsPlugin"},
        tags = {"@testTag"},
        monochrome = true
)

public class IDERunner {

}

