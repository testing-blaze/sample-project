package com.automation.sample.workflows;

import com.automation.sample.Commons;
import com.testingblaze.actionsfactory.api.ByUsing;
import com.testingblaze.register.I;

/**
 * Handles all home page based methods and locators for Project.
 * This is a sample project structure and it's not mandatory to use it.
 *
 */
public class HomePage extends Commons {

    public void enterSearchText(String searchText) {
        I.amPerforming().textInput().in(ByUsing.xpath("//input[@aria-label='Search']"), searchText);
    }

}
