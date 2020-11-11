package com.automation.sample.steps;
import com.automation.sample.workflows.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

/**
 * This is a sample class to hold all steps related to Home page.
 * This is a sample project structure and it's not mandatory to use it.
 */
public class HomePageSteps {
    private HomePage homePage;

    /**
     * The home page work flow is initialized using Dependency Injection here.
     * @param homePage use for DI.
     */
    public HomePageSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Given("I enter {string} in search box")
    public void i_enter_in_search_box(String searchTerm) {
        homePage.enterSearchText(searchTerm);
    }

    @When("I click on {string}")
    public void i_click_on(String string) {
        // Too be implemented
    }



}
