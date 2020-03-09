package com.mavenit.cucumber.StepDefinitions;

import com.mavenit.cucumber.PageObject.trolleyPage;
import cucumber.api.java.en.Then;

import static org.hamcrest.Matchers.hasSize;

public class trolleyProductsCounter {
    private trolleyPage trolleyPage = new trolleyPage();

    @Then("^I should be able to see \"([^\"]*)\" products in trolley$")
    public void i_should_be_able_to_see_products_in_trolley(Integer expected) {
        Integer actual = trolleyPage.trolleySize();
        hasSize(expected);
    }
}
