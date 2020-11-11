package com.automation.sample.steps;

import com.testingblaze.register.EnvironmentFactory;
import com.testingblaze.report.CSS;
import io.cucumber.java.Before;

/**
 * This class personalizes the reporting information.
 */
public class setup {
    private static CSS report;

    @Before(order = 2)
    public void setupReport() {
        if(report == null) {
            this.report = new CSS();
            EnvironmentFactory.setProjectName("Project Name");
            EnvironmentFactory.setOrgName("Organization Name");
            EnvironmentFactory.setProjectPath(System.getProperty("user.dir"));
            report.reportConfigWriteUp();
        }
    }
}
