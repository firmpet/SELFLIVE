package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.FamSelfHTTPLookUpPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FamSelfHTTPLookUp_step extends DriverInstance {
    private FamSelfHTTPLookUpPO http;


    @When("^I click on Cta HTTP Examples and Testing$")
    public void iClickOnCtaHTTPExamplesAndTesting() {
        http = new FamSelfHTTPLookUpPO(driver);
        http.httpTesting();
    }


    @Then("^HTTP Testing and Example page is displayed$")
    public void httpTestingAndExamplePageIsDisplayed() {
        http = new FamSelfHTTPLookUpPO(driver);
        http.testingPage();
    }

    @When("^I click Cta LookUp in HTTP Get No Token column$")
    public void iClickCtaLookUpInHTTPGetNoTokenColumn() {
        http = new FamSelfHTTPLookUpPO(driver);
        http.lookUpBtn();
    }

    @And("^click Next btn$")
    public void clickNextBtn() {
        http = new FamSelfHTTPLookUpPO(driver);
        http.nextBtn();
    }

    @Then("^I enter Breedname in the field$")
    public void iEnterBreednameInTheField() {
        http = new FamSelfHTTPLookUpPO(driver);
        http.clearField();
        http.insertname();
    }

    @And("^I click Cta LookUp$")
    public void iClickCtaLookUp() {
        http = new FamSelfHTTPLookUpPO(driver);
        http.lookUpbtn();
    }

    @And("^click Next$")
    public void clickNext() {
        http = new FamSelfHTTPLookUpPO(driver);
        http.nextcta();
    }

    @Then("^I click Cta LookUp to fill up the fields$")
    public void iClickCtaLookUpToFillUpTheFields() throws Throwable {
        http = new FamSelfHTTPLookUpPO(driver);
        http.fillForm();

        Thread.sleep(3000);
    }

    @And("^I click on Cta Submit$")
    public void iClickOnCtaSubmit() {
        http = new FamSelfHTTPLookUpPO(driver);
        http.submitLink();
    }

    @Then("^Successful submission page is displayed with reference$")
    public void successfulSubmissionPageIsDisplayedWithReference() {
        http = new FamSelfHTTPLookUpPO(driver);
        http.submitInfo();
    }
}
