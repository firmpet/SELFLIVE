package com.SelfTests.StepDefinitions;

import com.SelfTests.*;
import com.SelfTests.DriverInstance;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Escalations_step extends DriverInstance {
    private EscalationsPO esca;


    @When("^I click on Cta Escalation Test Process (\\d+)$")
    public void iClickOnCtaEscalationTestProcess(int arg0) {
        esca = new EscalationsPO(driver);
        esca.EscalationTest();
    }

    @Then("^Escalation Form One is displayed$")
    public void escalationFormOneIsDisplayed() {
        esca = new EscalationsPO(driver);
        esca.EscalationFormOne();
    }

    @When("^I entered Testing in the Text field$")
    public void iEnteredReferenceNumberInTheTextField() {
        esca = new EscalationsPO(driver);
        esca.EnterTest();
    }

    @And("^I click Cta Submit1$")
    public void iClickCtaSubmit() {
        esca = new EscalationsPO(driver);
        esca.ClickSubmit();
    }

    @Then("^Submission successful page is displayed$")
    public void submissionSuccessfulPageIsDisplayed() {
        esca = new EscalationsPO(driver);
        esca.SubmitSuccessfully();
    }

    @When("^I click on Cta MyRequests V(\\d+)$")
    public void iClickOnCtaMyRequestsV(int arg0) {
        esca = new EscalationsPO(driver);
        esca.MyRequestsV3();
    }

    @Then("^My Request page is displayed with Data logs$")
    public void myRequestPageIsDisplayedWithDataLogs() {
        esca = new EscalationsPO(driver);
        esca.MyRequestPage();
        esca.MyRequestTable();
    }

    @And("^I enter Case ID in the Search field$")
    public void iEnterCaseIDInTheSearchField() {
        esca = new EscalationsPO(driver);
        esca.Search();
    }

    @And("^I click search$")
    public void iClickSearch() {
        esca = new EscalationsPO(driver);
        esca.ClickSearch();
    }

    @Then("^the case log info is display with stage (\\d+) indicated$")
    public void theCaseLogInfoIsDisplayWithStageIndicated(int arg0) {
        esca = new EscalationsPO(driver);
        esca.CaseLogs();
    }


}
