package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.FamSelfAssignmentPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FamSelfAssignment_step extends DriverInstance {
    private FamSelfAssignmentPO assign;


    @When("^I click on Cta Dashboard and Assignment Process$")
    public void iClickOnCtaDashboardAndAssignmentProcess() throws Throwable {
        assign = new FamSelfAssignmentPO(driver);
        assign.dashboardAndAssignmentProcessLink();
    }

    @And("^New Form page is displayed$")
    public void newFormPageIsDisplayed() {
        assign = new FamSelfAssignmentPO(driver);
        assign.formPage();
    }

    @And("^I enter test summary date$")
    public void iEnterTestSummaryDate() {
        assign = new FamSelfAssignmentPO(driver);
        assign.clearField();
        assign.enterText();
    }

    @And("^I select email and group from the dropdown fields$")
    public void iSelectEmailAndGroupFromTheDropdownFields() throws Throwable{
        assign = new FamSelfAssignmentPO(driver);
        Thread.sleep(3000);
        assign.userField();
        Thread.sleep(3000);
        assign.enterEmail();
        Thread.sleep(3000);
        assign.groupField();
        Thread.sleep(3000);
        assign.groupName();
    }

    @And("^click Cta Submit$")
    public void clickCtaSubmit() {
        assign = new FamSelfAssignmentPO(driver);
        assign.submitBtn();
    }

    @Then("^successful form submission page is displayed$")
    public void successfulFormSubmissionPageIsDisplayed() {
        assign = new FamSelfAssignmentPO(driver);
        assign.formSubmit();
    }
}
