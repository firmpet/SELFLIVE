package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.FamSelfCalculationsPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class FamSelfCalculations_step extends DriverInstance {
    private FamSelfCalculationsPO calcu = new FamSelfCalculationsPO(driver);;
    private Assert testAssert;

    @When("^I click on Cta Calculations Process$")
    public void iClickOnCtaCalculationsProcess() throws Throwable {
        calcu.calculationsProcessLink();
    }

    @Then("^Calculations Form page is displayed with Contains column$")
    public void calculationsFormPageIsDisplayedWithContainsColumn() {
        calcu.calculationsColumn();
    }

    @When("^I enter Footpath, Park, Road and Cycle Track in the field$")
    public void iEnterFootpathParkRoadAndCycleTrackInTheField() {
        calcu = new FamSelfCalculationsPO(driver);
        calcu.insertText();
    }

    @Then("^IF statement column is displayed with Extended IF statement as title$")
    public void ifStatementColumnIsDisplayedWithExtendedIFStatementAsTitle() {
        calcu.pageTitle();
    }

    @And("^I select Yes from all the three dropdown fields$")
    public void iSelectYesFromAllTheThreeDropdownFields() throws Throwable {
        calcu.inputField();
        Thread.sleep(2000);
        calcu.insertText1();
        Thread.sleep(2000);
        calcu.inputField1();
        Thread.sleep(2000);
        calcu.insertText2();
        Thread.sleep(2000);
        calcu.inputField2();
        Thread.sleep(2000);
        calcu.insertText3();
    }

    @And("^I click Nextlink$")
    public void iClickNextlink() {
        calcu.nextbtn();
    }

    @Then("^String Manipulation column page is displayed$")
    public void stringManipulationColumnPageIsDisplayed() {
        calcu.stringManSection();
    }

    @And("^Select Nextlink$")
    public void selectNextlink() {
        calcu.nextBtn();
    }

    @Then("^Subforms column page is displayed$")
    public void subformsColumnPageIsDisplayed() {
        calcu.subforms();
    }

    @And("^I click Cta Add Record$")
    public void iClickCtaAddRecord() throws Throwable {
        Thread.sleep(2000);
        calcu.recordBtn();
        Thread.sleep(3000);
    }

    @And("^I entered value in the field$")
    public void iEnteredValueInTheField() throws Throwable {
        Thread.sleep(2000);
        calcu.textField();
        Thread.sleep(5000);
        calcu.addRecordBtn();
    }

    @And("^Total sum of the record is displayed$")
    public void totalSumOfTheRecordIsDisplayed() {
        calcu.sum();
    }

    @And("^I click Cta Submit$")
    public void iClickCtaSubmit() throws Throwable {
        Thread.sleep(5000);
        calcu.submitBtn();
    }

    @Then("^Submission page is displayed$")
    public void submissionPageIsDisplayed() {
        calcu.submitPage();
    }



}
