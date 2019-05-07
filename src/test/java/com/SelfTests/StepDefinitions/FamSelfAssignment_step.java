package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.FamSelfAssignmentPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FamSelfAssignment_step extends DriverInstance {
    private FamSelfAssignmentPO assign = new FamSelfAssignmentPO(driver);


    @When("^I click on Cta Dashboard and Assignment Process$")
    public void iClickOnCtaDashboardAndAssignmentProcess() throws Throwable {
        assign.dashboardAndAssignmentProcessLink();
    }

    @And("^New Form page is displayed$")
    public void newFormPageIsDisplayed() {
        assign.formPage();
    }

    @And("^I enter test summary date$")
    public void iEnterTestSummaryDate() {
        assign.clearField();
        assign.enterText();
    }

    @And("^I select email and group from the dropdown fields$")
    public void iSelectEmailAndGroupFromTheDropdownFields() throws Throwable{
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
        assign.submitBtn();
    }

    @Then("^successful form submission page is displayed$")
    public void successfulFormSubmissionPageIsDisplayed() {
        assign.formSubmit();
    }
}
