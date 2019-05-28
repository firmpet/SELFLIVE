package com.SelfTests.StepDefinitions;

import com.SelfTests.*;
import com.SelfTests.DriverInstance;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;

public class Escalations_step extends DriverInstance {
    private EscalationsPO esca = new EscalationsPO(driver);
    private LoginPO hp = new LoginPO(driver);
    private TestAssert testAssert;


    @Given("^I login with valid credentials$")
    public void iLoginWithValidCredentials() {
    hp.Login();
    }

    @When("^I click on Cta Escalation Test Process$")
    public void iClickOnCtaEscalationTestProcess() throws Throwable{
        esca.escalations();
    }

    @Then("^Escalation Form One is displayed$")
    public void escalationFormOneIsDisplayed() throws Throwable {
        Assert.assertFalse(testAssert.validateElementExistByXpath(driver, "//*[text()='Escalation Form One']"));
        //Thread.sleep(1000);
    }

    @When("^I entered Testing in the Text field$")
    public void iEnteredReferenceNumberInTheTextField() throws Throwable {
        esca.enterTest();
    }

    @And("^I click Cta Submit1$")
    public void iClickCtaSubmit() {
        esca.submitBtn();
    }

    @Then("^Submission successful page is displayed$")
    public void submissionSuccessfulPageIsDisplayed() throws Throwable{
        esca.submissionPage();
    }

    @When("^I click on Cta MyRequests VThree$")
    public void iClickOnCtaMyRequestsVThree() throws Throwable {
        esca.myRequestsV3Link();
    }

    @Then("^My Request page is displayed with Data logs$")
    public void myRequestPageIsDisplayedWithDataLogs() throws Throwable{
        Thread.sleep(1000);
        Assert.assertFalse(testAssert.validateElementExistById(driver, "My Requests"));
        //Thread.sleep(1000);
        Assert.assertFalse(testAssert.validateElementExistById(driver, "MyRequestTable"));
    }

    @And("^I enter Case ID in the Search field$")
    public void iEnterCaseIDInTheSearchField() throws Throwable {
        esca.searchField();
    }

//    @And("^I click search$")
//    public void iClickSearch() {
//        esca.searchBtn();
//    }

    @Then("^The case log info is display with stages indicated$")
    public void theCaseLogInfoIsDisplayWithStagesIndicated() throws Throwable {
        esca.caseLogsPage();
    }


}
