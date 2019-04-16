package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.FamSelfHTTPLookUpPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class FamSelfHTTPLookUp_step extends DriverInstance {
    private FamSelfHTTPLookUpPO http;


    @When("^I click on Cta HTTP Examples and Testing$")
    public void iClickOnCtaHTTPExamplesAndTesting() throws Throwable {
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
        Thread.sleep(3000);
        http.fillForm();
    }

    @And("^I click on Cta Submit$")
    public void iClickOnCtaSubmit() throws Throwable{

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)", "");
        http = new FamSelfHTTPLookUpPO(driver);
        Thread.sleep(3000);
        http.submitLink();
    }

    @Then("^Successful submission page is displayed with reference$")
    public void successfulSubmissionPageIsDisplayedWithReference() {
        http = new FamSelfHTTPLookUpPO(driver);
        http.submitInfo();
    }
}
