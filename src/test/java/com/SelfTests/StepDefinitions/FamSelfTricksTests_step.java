package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.FamSelfTricksTestsPO;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FamSelfTricksTests_step extends DriverInstance {
    private FamSelfTricksTestsPO  tricks = new FamSelfTricksTestsPO(driver);


    @When("^I click on Cta Useful Tricks Manual Test$")
    public void iClickOnCtaUsefulTricksManualTest() throws Throwable{
     tricks.tricksManual();
    }

   @Then("^Useful Tricks Forms page is displayed$")
    public void usefulTricksFormsPageIsDisplayed()throws Throwable {
     tricks.formPage();
    }

    @When("^I enter names in the fields$")
    public void iEnterNamesInTheFields() {
     tricks.fName();
     tricks.lName();
    }

    @And("^I select Yes from the dropdown field$")
    public void iSelectYesFromTheDropdownField() {
     tricks.dropdownField();
     tricks.texts();
    }

    @And("^I enter numbers in the fields$")
    public void iEnterNumbersInTheFields() {
     tricks.digit();
     tricks.digits();
    }

    @And("^I select Date of birth in the field$")
    public void iSelectDateOfBirthInTheField() {
        tricks = new FamSelfTricksTestsPO(driver);
        tricks.dob();
    }

    @And("^I enter postcode in the field$")
    public void iEnterPostcodeInTheField() throws Throwable  {
     tricks.postal();
     Thread.sleep(3000);
    }

 @And("^I enter validate text in the field$")
 public void iEnterInTheField() {
  tricks.verifier();
 }




}
