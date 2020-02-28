package com.mavenit.cucumber.StepDefinitions;

import com.mavenit.cucumber.PageObject.HomePage;
import com.mavenit.cucumber.PageObject.ResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.core.Every.everyItem;


public class FilterSteps {

    private ResultsPage resultsPage = new ResultsPage();

    @When("^I apply filter review \"([^\"]*)\"$")
    public void i_apply_filter_review(String filter){
    resultsPage.selectFilter(filter);
    }

    @Then("^I should be able to see refined results review \"([^\"]*)\"$")
    public void i_should_be_able_to_see_refined_results_review(double expected) {
        List<Double> actual= resultsPage.getProductRating();
        assertThat(actual, everyItem(is(greaterThanOrEqualTo(expected))));
    }
    @When("^I apply filter category \"([^\"]*)\"$")
    public void i_apply_filter_category(String categoryOption) {
       resultsPage.selectCategoryFilter(categoryOption);
    }

    @Then("^I should be able to see refined results category \"([^\"]*)\"$")
    public void i_should_be_able_to_see_refined_results_category(String categoryExpected) {
       List<String> actual= resultsPage.getCategoryFilter();
       assertThat(actual, everyItem(containsString(categoryExpected)));
    }
    @When("^I apply filter type \"([^\"]*)\"$")
    public void i_apply_filter_type(String typeOption){
        resultsPage.selectTypeFilter(typeOption);
    }

   @Then("^I should see refined results of type \"([^\"]*)\"$")
    public void i_should_see_refined_results_of_type(String typeExpected) {
        List <String> actual= resultsPage.getTypeFilter();
        assertThat(actual, everyItem(Matchers.containsString(typeExpected)));

    }
    @When("^I apply filter backpackCapacity \"([^\"]*)\"$")
    public void i_apply_filter_backpackCapacity(String capacityOption) {
        resultsPage.selectCapacityFilter(capacityOption);
    }

    @Then("^I should be able to see refined results of backpack capacity \"([^\"]*)\"$")
    public void i_should_be_able_to_see_refined_results_of_backpack_capacity(String capacityExpected)  {
        List<String> actual= resultsPage.getCapacityFilter();
        assertThat(actual, everyItem(containsString(capacityExpected)));

    }
}
