package com.mavenit.cucumber.StepDefinitions;

import com.mavenit.cucumber.PageObject.ResultsPage;
import com.mavenit.cucumber.PageObject.trolleyPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class addToTrolleySteps {
    private trolleyPage trolleyPage = new trolleyPage();
    private ResultsPage resultsPage = new ResultsPage();

    @When("^I select a product \"([^\"]*)\"$")
    public void i_select_a_product(String product) {
        resultsPage.selectRandomProduct(product);
    }

    @When("^I click add to trolley$")
    public void i_click_add_to_trolley() {
        trolleyPage.addToTrolley();
    }

    @Then("^I should be able to see product \"([^\"]*)\" in trolley$")
    public void i_should_be_able_to_see_product_in_trolley(String product) {
        String actual = trolleyPage.getProductInTrolley();
        assertThat(actual, startsWith(product));
    }
}