package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.FamSelfAssignmentPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


public class FamSelfAssignment_step extends DriverInstance {
    private FamSelfAssignmentPO assign;


    @And("^I click on Cta Dashboard and Assignment Process$")
    public void iClickOnCtaDashboardAndAssignmentProcess() {
        assign = new FamSelfAssignmentPO(driver);
        assign.CtaDashboardAndAssignmentProcess();
    }

    @And("^New Form (\\d+)-(\\d+)-(\\d+) page is displayed$")
    public void newFormPageIsDisplayed(int arg0, int arg1, int arg2) {
        assign = new FamSelfAssignmentPO(driver);
        assign.FormPage();
    }

    @And("^I enter test summary date$")
    public void iEnterTestSummaryDate() {
        assign = new FamSelfAssignmentPO(driver);
        assign.SummaryField1();
        assign.SummaryField();
    }

    @And("^I select email and group from the dropdown fields$")
    public void iSelectEmailAndGroupFromTheDropdownFields() {
        assign = new FamSelfAssignmentPO(driver);
        assign.SpecificUserField();
        assign.EnterUserEmail();
        assign.SpecificGroup();
        assign.SpecificGroupField();
    }

    @And("^click Cta Submit$")
    public void clickCtaSubmit() {
        assign = new FamSelfAssignmentPO(driver);
        assign.Submit_click();
    }

    @Then("^successful form submission page is displayed$")
    public void successfulFormSubmissionPageIsDisplayed() {
        assign = new FamSelfAssignmentPO(driver);
        assign.SuccessfulSubmissionPage();
    }
}
