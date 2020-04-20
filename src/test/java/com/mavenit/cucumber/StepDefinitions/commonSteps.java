package com.mavenit.cucumber.StepDefinitions;

import com.mavenit.cucumber.PageObject.HomePage;
import com.mavenit.cucumber.PageObject.ResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;

public class commonSteps {
    private HomePage homePage = new HomePage();
    private ResultsPage resultsPage = new ResultsPage();

    @Given("^I am on homepage$")
    public void i_am_on_homepage() {
        String actual = homePage.getCurrentUrl();
        assertThat(actual, endsWith("co.uk/"));
    }

    @When("^I search for product \"([^\"]*)\"$")
    public void i_search_for_product(String SearchTerm) {
        homePage.doSearch(SearchTerm);
    }

    @When("^I select a product \"([^\"]*)\"$")
    public void i_select_a_product(String product) {
        resultsPage.selectAProduct(product);
    }

    @When("^I click account$")
    public void i_click_account() {
        homePage.clickAccount();
    }
}