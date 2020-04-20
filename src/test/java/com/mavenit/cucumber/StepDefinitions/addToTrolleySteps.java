package com.mavenit.cucumber.StepDefinitions;

import com.mavenit.cucumber.PageObject.ResultsPage;
import com.mavenit.cucumber.PageObject.trolleyPage;
import com.mavenit.cucumber.PageObject.productDescriptionPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class addToTrolleySteps {
    private trolleyPage trolleyPage = new trolleyPage();
    private ResultsPage resultsPage = new ResultsPage();
    private productDescriptionPage productDescriptionPage = new productDescriptionPage();

    @Then("^I should be able to see product \"([^\"]*)\" in trolley$")
    public void i_should_be_able_to_see_product_in_trolley(String product) {
        String actual = trolleyPage.getProductInTrolley();
        assertThat(actual, startsWith(product));
    }

    @When("^I click add to trolley$")
    public void i_click_add_to_trolley() {
        trolleyPage.addToTrolley();
    }

    @When("^I click go to trolley$")
    public void i_click_go_to_trolley() {
        trolleyPage.goToTrolley();
    }

    @When("^I click continue Shopping$")
    public void i_click_continue_Shopping() {
        trolleyPage.continueShopping();
    }

    @When("^I increase the quantity \"([^\"]*)\"$")
    public void i_increase_the_quantity(String expected) {
        trolleyPage.addQuantity(expected);
    }

    @Then("^I should be able to see refined quantity size \"([^\"]*)\"$")
    public void i_should_be_able_to_see_refined_quantity_size(String expected) {
        String actual = trolleyPage.getQuantityInTrolley();
        assertThat(actual, containsString(expected));
    }

    @Then("^I should be able to see \"([^\"]*)\" and \"([^\"]*)\" in Trolley$")
    public void i_should_be_able_to_see_and_in_Trolley(String product1, String product2) {
        trolleyPage.productList();
        hasItems(product1, product2);
    }

    @When("^I increase the quantity on product description page to \"([^\"]*)\"$")
    public void i_increase_the_quantity_on_product_description_page_to(String expected) {
        productDescriptionPage.increaseQuantity(expected);
    }

    @Then("^I should be able to see \"([^\"]*)\" in Trolley$")
    public void i_should_be_able_to_see_in_Trolley(String product) {
        trolleyPage.productList();
        hasItems(product);
    }

    @When("^I search for another product \"([^\"]*)\"$")
    public void i_search_for_another_product(String item) {
        productDescriptionPage.searchAnotherTerm(item);
    }

    @When("^I select a random product$")
    public void i_select_a_random_product()  {
        resultsPage.selectRandomProduct();
    }

    @When("^I remember that name$")
    public void i_remember_that_name() {
        resultsPage.getProductName();
    }

    @Then("^I should be able to see that product in trolley$")
    public void i_should_be_able_to_see_that_product_in_trolley() {
        trolleyPage.getTrolleyList();
        hasItems(1);
    }
}