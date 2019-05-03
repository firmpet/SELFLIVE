package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.MyRequestDateCheckPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyRequestDateCheck_step extends DriverInstance {
    private MyRequestDateCheckPO dateCheck = new MyRequestDateCheckPO(driver);


    @When("^I enter text field$")
    public void iEnterTextField() {
    }

    @And("^I clicked Cta Submit$")
    public void iClickedCtaSubmit() {
    }

    @Then("^Reference and submission successful message is displayed$")
    public void referenceAndSubmissionSuccessfulMessageIsDisplayed() {
    }

    @When("^I click Cta Continue$")
    public void iClickCtaContinue() {
    }

    @Then("^Survey page is displayed$")
    public void surveyPageIsDisplayed() {
    }

    @When("^I click top nav MyRequests VThree$")
    public void iClickTopNavMyRequestsVThree() {
    }

    @And("^my My Request page is displayed$")
    public void myMyRequestPageIsDisplayed() {

    }

    @And("^I enter into searchField$")
    public void iEnterIntoSearchField() {

    }

    @And("^I clicked search$")
    public void iClickedSearch(){

    }

    @Then("^the result is displayed$")
    public void theResultIsDisplayed() {

    }



}
