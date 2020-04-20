package com.mavenit.cucumber.StepDefinitions;

import com.mavenit.cucumber.PageObject.trolleyPage;
import cucumber.api.java.en.When;

public class reserveAndPayInstore {
    private trolleyPage trolleyPage = new trolleyPage();

    @When("^I enter Postcode\"([^\"]*)\"$")
    public void i_enter_Postcode(String expected) {
        trolleyPage.enterPostcode(expected);
    }

    @When("^I click collection$")
    public void i_click_collection() {
        trolleyPage.clickCollection();
    }

    @When("^I click continue$")
    public void i_click_continue() {
        trolleyPage.clickContinueWithCollection();
    }

    @When("^I click Reserve And Pay in-store$")
    public void i_click_Reserve_And_Pay_in_store() {
        trolleyPage.payInStore();
    }

    @When("^I check availability \"([^\"]*)\"$")
    public void i_check_availability(String postcode) {
        trolleyPage.checkAvailability(postcode);
    }

    @When("^I select a store$")
    public void i_select_a_store() {
        trolleyPage.selectStore();
    }
}