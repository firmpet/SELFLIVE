package com.SelfTests.StepDefinitions;

import com.SelfTests.*;
import com.SelfTests.DriverInstance;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Escalations_step extends DriverInstance {
    private EscalationsPO esca;
    //private LoginPO hp;

    /*
    @Given("^I login with valid credentials$")

    public void iLoginWithValidCredentials() {
    hp = new LoginPO(driver);
    hp.Login();
    }
    */

    @And("^I click on Cta Escalation Test Process$")
    public void iClickOnCtaEscalationTestProcess() {
        esca = new EscalationsPO(driver);
        esca.escalations();
    }

    @Then("^Escalation Form One is displayed$")
    public void escalationFormOneIsDisplayed() {
        esca = new EscalationsPO(driver);
        esca.formPage();
    }

    @When("^I entered Testing in the Text field$")
    public void iEnteredReferenceNumberInTheTextField() {
        esca = new EscalationsPO(driver);
        esca.enterTest();
    }

    @And("^I click Cta Submit1$")
    public void iClickCtaSubmit() {
        esca = new EscalationsPO(driver);
        esca.submitBtn();
    }

    @Then("^Submission successful page is displayed$")
    public void submissionSuccessfulPageIsDisplayed() {
        esca = new EscalationsPO(driver);
        esca.submissionPage();
    }

    @When("^I click on Cta MyRequests VThree$")
    public void iClickOnCtaMyRequestsVThree() {
        esca = new EscalationsPO(driver);
        esca.myRequestsV3Link();
    }

    @Then("^My Request page is displayed with Data logs$")
    public void myRequestPageIsDisplayedWithDataLogs() {
        esca = new EscalationsPO(driver);
        esca.myRequestFormPage();
        esca.myRequestFormTable();
    }

    @And("^I enter Case ID in the Search field$")
    public void iEnterCaseIDInTheSearchField() {
        esca = new EscalationsPO(driver);
        esca.searchField();
    }

    @And("^I click search$")
    public void iClickSearch() {
        esca = new EscalationsPO(driver);
        esca.searchBtn();
    }

    @Then("^The case log info is display with stages indicated$")
    public void theCaseLogInfoIsDisplayWithStagesIndicated() {
        esca = new EscalationsPO(driver);
        esca.caseLogsPage();
    }



}
