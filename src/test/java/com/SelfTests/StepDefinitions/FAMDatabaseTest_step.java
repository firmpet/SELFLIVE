package com.SelfTests.StepDefinitions;

import com.SelfTests.*;
import com.SelfTests.DriverInstance;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class FAMDatabaseTest_step extends DriverInstance {
    private FAMDatabaseTestPO data = new FAMDatabaseTestPO(driver);
      private Assert testAssert;


    @When("^I click on Cta Database Integration Test$")
    public void iClickOnCtaDatabaseIntegrationTest() throws Throwable {
        data.databaseIntegrationBtn();
    }

    @And("^Database Integration Form One page is displayed$")
    public void databaseIntegrationFormOnePageIsDisplayed() {
        System.out.println(driver.getTitle());
         //Assert.assertTrue(testAssert.validateElementExistByXpath(driver, "//*[text()='Database Integration Stage One Form']"));
//        data = new FAMDatabaseTestPO(driver);
//        data.dataIntegrationPage();
    }

    @And("^I fill in the dropdown fields$")
    public void iFillInTheDropdownFields() throws Throwable {
        Thread.sleep(3000);
        data.enterText();
        data.testBtn();
        data.enterEmail();
    }

    @Then("^I click Next$")
    public void iClickCtaNext() {
        data.nextBtn();
    }

    @And("^Read Only SubForm column is displayed$")
    public void readOnlySubFormColumnIsDisplayed() {
        data.readOnlySubform();
    }

    @And("^I clicked Cta Next$")
    public void iClickedCtaNext() throws Throwable{
        Thread.sleep(2000);
        data.nextLink();
    }

    @Then("^Add a Entry column is displayed$")
    public void addAEntryColumnIsDisplayed() throws Throwable{
        Thread.sleep(2000);
        data.enterData();
    }

    @When("^I fill the text, FirstNameadd and emailadd fields$")
    public void iFillTheTextFirstNameaddAndEmailaddFields() throws Throwable{
        Thread.sleep(5000);
        data.textField();
        data.nameField();
        data.email();
    }

    @And("^I click Cta Submit button$")
    public void iClickCtaSubmitButton() {
        data.submitBtn();
    }

    @Then("^Successful submission page is displayed$")
    public void successfulSubmissionPageIsDisplayed() {
        data.successPage();
    }



}
