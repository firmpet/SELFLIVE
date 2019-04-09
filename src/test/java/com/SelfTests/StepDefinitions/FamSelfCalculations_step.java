package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.FamSelfCalculationsPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FamSelfCalculations_step extends DriverInstance {
    private FamSelfCalculationsPO Calcu;

    @Given("^Services dashboard is displayed$")
    public void servicesDashboardDisplayed() {
        Calcu = new FamSelfCalculationsPO(driver);
        Calcu.Dashboard();
    }

    @When("^I click on Cta Calculations Process$")
    public void iClickOnCtaCalculationsProcess() {
        Calcu = new FamSelfCalculationsPO(driver);
        Calcu.CalculationsProcess_click();
    }

    @Then("^Calculations Form page is displayed with Contains column$")
    public void calculationsFormPageIsDisplayedWithContainsColumn() {
        Calcu = new FamSelfCalculationsPO(driver);
        Calcu.CalculationsForm();
    }

    @When("^I enter Footpath, Park, Road and Cycle Track in the field$")
    public void iEnterFootpathParkRoadAndCycleTrackInTheField() {
        Calcu = new FamSelfCalculationsPO(driver);
        Calcu.ContainsField();
    }

    @Then("^IF statement column is displayed with Extended IF statement as title$")
    public void ifStatementColumnIsDisplayedWithExtendedIFStatementAsTitle() {
        Calcu = new FamSelfCalculationsPO(driver);
        Calcu.PageTitle();
    }

    @And("^I select Yes from all the three dropdown fields$")
    public void iSelectYesFromAllTheThreeDropdownFields() {
        Calcu = new FamSelfCalculationsPO(driver);
        Calcu.TreeDropdownField();
        Calcu.TreeDropdownField_click();
        Calcu.BenchDropdownField();
        Calcu.BenchDropdownField_click();
        Calcu.LamppostField();
        Calcu.LamppostField_click();
    }

    @Then("^String Manipulation column page is displayed$")
    public void stringManipulationColumnPageIsDisplayed() {
        Calcu = new FamSelfCalculationsPO(driver);
        Calcu.StringManipulationColumn();
    }

    @And("^I select Cta Next(\\d+)$")
    public void iSelectCtaNext(int arg0) {
        Calcu = new FamSelfCalculationsPO(driver);
        Calcu.Next_click();
    }

    @Then("^Subforms column page is displayed$")
    public void subformsColumnPageIsDisplayed() {
        Calcu = new FamSelfCalculationsPO(driver);
        Calcu.SubformsColumn();
    }

    @And("^I click Cta Add Record$")
    public void iClickCtaAddRecord() {
        Calcu = new FamSelfCalculationsPO(driver);
        Calcu.AddRecord();
    }

    @And("^I entered £(\\d+) in the field$")
    public void iEntered£InTheField(int arg0) {
        Calcu = new FamSelfCalculationsPO(driver);
        Calcu.AmountField();
        Calcu.ClickAddRecord();
    }

    @And("^Total sum of the record is displayed$")
    public void totalSumOfTheRecordIsDisplayed() {
        Calcu = new FamSelfCalculationsPO(driver);
        Calcu.TotalSum();
    }

    @And("^I click Cta Submit$")
    public void iClickCtaSubmit() {
        Calcu = new FamSelfCalculationsPO(driver);
        Calcu.Submit();
    }

    @Then("^Submission page is displayed$")
    public void submissionPageIsDisplayed() {
        Calcu = new FamSelfCalculationsPO(driver);
        Calcu.SubmissionSuccessfulPage();
    }
}
