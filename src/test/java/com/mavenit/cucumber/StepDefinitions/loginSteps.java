package com.mavenit.cucumber.StepDefinitions;

import com.mavenit.cucumber.PageObject.AccountPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class loginSteps {
    private AccountPage accountPage= new AccountPage();

    @When("^I enter password \"([^\"]*)\"$")
    public void i_enter_password(String password) {
        accountPage.enterPassword(password);
    }

    @When("^I click Sign In Securely$")
    public void i_click_Sign_In_Securely()  {
        accountPage.signInSecurely();
    }

    @Then("^I should be logged in successfully$")
    public void i_should_be_logged_in_successfully() {
        String actual = accountPage.getWelcomeName();
    }
    @Then("^I should not be able to log in successfully$")
    public void i_should_not_be_able_to_log_in_successfully() {
        accountPage.errorMessage();
    }
}
