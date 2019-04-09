package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.FamSelfDateTestPO;
import com.SelfTests.TestAssert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FamSelfDateTest_step extends DriverInstance {
    private FamSelfDateTestPO dateT;
    private TestAssert testAssert;


    @When("^I click on Cta Date Fields Manual Test$")
    public void iClickOnCtaDateFieldsManualTest() {
        dateT.DateFieldsManual();
    }

    @Then("^Date Fields Manual Test Form page is displayed$")
    public void dateFieldsManualTestFormPageIsDisplayed() {
        dateT.DateFieldPage();
    }

    @When("^I enter date From, date To and time in the fields$")
    public void iEnterDateFromDateToAndTimeInTheFields() {
        dateT.DateFrom();
        dateT.DateTo();
        dateT.Time();
    }

    @And("^I click Cta submit$")
    public void iClickCtaSubmit() {
        dateT.SubmitForm();
    }

    @Then("^Submission page should displayed with submitted data$")
    public void submissionPageShouldDisplayedWithSubmittedData() {
        dateT.SubmissionPage();
        Assert.assertTrue(testAssert.validateElementExistByXpath(driver, "//*[@id=\"page\"]/section/section/div/div[1]/p[2]"));
    }
}
