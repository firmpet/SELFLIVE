package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.MyRequestDateCheckPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyRequestDateCheck_step extends DriverInstance {
    private MyRequestDateCheckPO dateCheck;


    @When("^I enter text field$")
    public void iEnterTextField() {
        dateCheck = new MyRequestDateCheckPO(driver);
    }

    @Then("^Reference and submission successful message is displayed$")
    public void referenceAndSubmissionSuccessfulMessageIsDisplayed() {
        dateCheck = new MyRequestDateCheckPO(driver);
    }

    @When("^I click Cta Continue$")
    public void iClickCtaContinue() {
        dateCheck = new MyRequestDateCheckPO(driver);

    }

    @Then("^Survey page is displayed$")
    public void surveyPageIsDisplayed() {
        dateCheck = new MyRequestDateCheckPO(driver);

    }

    @When("^I click top nav MyRequests VThree$")
    public void iClickTopNavMyRequestsVThree() {
        dateCheck = new MyRequestDateCheckPO(driver);

    }

    @And("^my My Request page is displayed$")
    public void myMyRequestPageIsDisplayed() {
        dateCheck = new MyRequestDateCheckPO(driver);
    }

    @And("^I enter into searchField$")
    public void iEnterIntoSearchField() {
        dateCheck = new MyRequestDateCheckPO(driver);

    }

    @Then("^the result is displayed$")
    public void theResultIsDisplayed() {
        dateCheck = new MyRequestDateCheckPO(driver);
    }
}
