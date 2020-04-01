package com.mavenit.cucumber.StepDefinitions;

import com.mavenit.cucumber.PageObject.AccountPage;
import com.mavenit.cucumber.PageObject.HomePage;
import com.mavenit.cucumber.PageObject.ResultsPage;
import com.mavenit.cucumber.PageObject.trolleyPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class registrationSteps {
    private HomePage homePage = new HomePage();
    private ResultsPage resultsPage = new ResultsPage();
    private trolleyPage trolleyPage = new trolleyPage();
    private AccountPage accountPage = new AccountPage();

    @When("^I click Register$")
    public void i_click_Register() {
        accountPage.clickRegister();
    }

    @When("^I enter Email Address \"([^\"]*)\"$")
    public void i_enter_Email_Address(String email) throws InterruptedException {
        accountPage.enterEmail(email);
    }

    @When("^I click EmailSubmitButton$")
    public void i_click_EmailSubmitButton() throws InterruptedException {
        accountPage.clickEmailSubmit();
    }

    @When("^I choose \"([^\"]*)\"from drop down$")
    public void i_choose_from_drop_down(String title) {
        accountPage.title(title);
    }

    @When("^I enter \"([^\"]*)\" as first Name$")
    public void i_enter_as_first_Name(String firstName) {
        accountPage.firstName(firstName);
    }

    @When("^I enter \"([^\"]*)\" as Last Name$")
    public void i_enter_as_Last_Name(String lastName) {
        accountPage.lastName(lastName);
    }

    @When("^I enter PostcodeInput \"([^\"]*)\"$")
    public void i_enter_PostcodeInput(String postcode) {
        accountPage.postcode(postcode);
    }

    @When("^I click save and continue$")
    public void i_click_save_and_continue() {
        accountPage.saveAndContinue();
    }

    @When("^I enter new password \"([^\"]*)\"$")
    public void i_enter_new_password(String password) {
        accountPage.enterNewPassword(password);
    }

    @When("^I retype new password \"([^\"]*)\"$")
    public void i_retype_new_password(String password) {
        accountPage.retypeNewPassword(password);
    }

    @Then("^I should be able to register successfully with argos$")
    public void i_should_be_able_to_register_successfully_with_argos() {
        accountPage.welcomeMessage();

    }
}
