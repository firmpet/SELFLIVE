package com.SelfTests.StepDefinitions;

import com.SelfTests.*;
import com.SelfTests.DriverInstance;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FAMDatabaseTest_step extends DriverInstance {
    private FAMDatabaseTestPO data;


    @And("^I click on Cta Database Integration Test$")
    public void iClickOnCtaDatabaseIntegrationTest() {
        data = new FAMDatabaseTestPO(driver);
        data.ClickDatabaseIntegration();
    }

    @And("^Database Integration Form One page is displayed$")
    public void databaseIntegrationFormOnePageIsDisplayed() {
        data = new FAMDatabaseTestPO(driver);
        data.DatabaseIntegrationPage();
    }

    @And("^I select select (\\d+) from dropdown field and I enter text (\\d+) in text (\\d+) field in Select List Check column$")
    public void iSelectSelectFromDropdownFieldAndIEnterTextInTextFieldInSelectListCheckColumn(int arg0, int arg1, int arg2) {
        data = new FAMDatabaseTestPO(driver);
        data.Select1_click();
        data.Test_click();
        data.Email_input();
    }

    @Then("^I click Cta Next$")
    public void iClickCtaNext() {
        data = new FAMDatabaseTestPO(driver);
        data.Next_click();
    }

    @And("^Read Only SubForm column is displayed$")
    public void readOnlySubFormColumnIsDisplayed() {
        data = new FAMDatabaseTestPO(driver);
        data.ReadOnlySubformPage();
    }

    @And("^I click Cta Next(\\d+)$")
    public void iClickCtaNext(int arg0) {
        data = new FAMDatabaseTestPO(driver);
        data.Next1_click();
    }

    @Then("^Add a Entry column is displayed$")
    public void addAEntryColumnIsDisplayed() {
        data = new FAMDatabaseTestPO(driver);
        data.AddAEntryPage();
    }

    @When("^I fill in text(\\d+), FirstNameadd and emailadd fields$")
    public void iFillInTextFirstNameaddAndEmailaddFields(int arg0) {
        data = new FAMDatabaseTestPO(driver);
        data.EnterText1();
        data.EnterFirstName();
        data.EnterEmail();
    }

    @And("^I click Cta Submit button$")
    public void iClickCtaSubmitButton() {
        data = new FAMDatabaseTestPO(driver);
        data.Submit_click();
    }

    @Then("^Successful submission page is displayed$")
    public void successfulSubmissionPageIsDisplayed() {
        data = new FAMDatabaseTestPO(driver);
        data.SubmissionSuccessfulPage();
    }


}
