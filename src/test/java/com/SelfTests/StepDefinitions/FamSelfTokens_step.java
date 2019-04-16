package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.FamSelfTokensPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FamSelfTokens_step extends DriverInstance {
    private FamSelfTokensPO token;


    @When("^I click on Cta Tokens Process$")
    public void iClickOnCtaTokensProcess() throws Throwable {
        token = new FamSelfTokensPO(driver);
        token.tokensBtn();
    }

    @Then("^All Tokens Form page is displayed$")
    public void allTokensFormPageIsDisplayed() {
        token = new FamSelfTokensPO(driver);
        token.tokenLists();
    }

    @And("^Click Next btns$")
    public void clickNextBtn() {
        token = new FamSelfTokensPO(driver);
        token.nextBtn();
    }

    @Then("^Assignment Tokens Column is displayed$")
    public void assignmentTokensColumnIsDisplayed() {
        token = new FamSelfTokensPO(driver);
        token.assignmentColumn();
    }

    @When("^I click Next Btn$")
    public void iClickNextBtn() {
        token = new FamSelfTokensPO(driver);
        token.nextbtn();
    }

    @Then("^Case Tokens Column is displayed$")
    public void caseTokensColumnIsDisplayed() {
        token = new FamSelfTokensPO(driver);
        token.caseColumn();
    }

//    @When("^I click Next Cta$")
//    public void iClickNextCta() {
//        token = new FamSelfTokensPO(driver);
//        token.btnNext();
//    }

    @Then("^Citizen and CSA Tokens column is displayed$")
    public void citizenAndCSATokensColumnIsDisplayed() {
        token = new FamSelfTokensPO(driver);
        token.citizenColumn();
    }

//    @When("^Clicks Next$")
//    public void ClicksNext() {
//        token = new FamSelfTokensPO(driver);
//        token.nextLink();
//    }

    @Then("^Date Time Token column is displayed$")
    public void dateTimeTokenColumnIsDisplayed() {
        token = new FamSelfTokensPO(driver);
        token.dateTimeColumn();
    }

    @Then("^Escalation Tokens column is displayed$")
    public void escalationTokensColumnIsDisplayed() {
        token = new FamSelfTokensPO(driver);
        token.escalationColumn();
    }

    @Then("^Form Tokens column is displayed$")
    public void formTokensColumnIsDisplayed() {
        token = new FamSelfTokensPO(driver);
        token.formColumn();
    }

   @Then("^Process Tokens column is displayed$")
    public void processTokensColumnIsDisplayed() {
        token = new FamSelfTokensPO(driver);
        token.processColumn();
    }

    @Then("^Subform Tokens column is displayed$")
    public void subformTokensColumnIsDisplayed() throws Throwable {
        token = new FamSelfTokensPO(driver);
        token.subformColumn();

        Thread.sleep(2000);
    }

    @Then("^Task Tokens column is displayed$")
    public void taskTokensColumnIsDisplayed() {
        token = new FamSelfTokensPO(driver);
        token.taskColumn();
    }

    @Then("^Map Field Tokens column is displayed$")
    public void mapFieldTokensColumnIsDisplayed() throws Throwable {
        token = new FamSelfTokensPO(driver);
        token.mapColumn();

        Thread.sleep(3000);
    }

    @And("^Others column is displayed$")
    public void othersColumnIsDisplayed() {
        token = new FamSelfTokensPO(driver);
        token.othersColumn();
    }


}
