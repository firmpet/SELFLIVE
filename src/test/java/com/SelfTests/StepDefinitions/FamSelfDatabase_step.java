package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.FamSelfDatabasePO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;


public class FamSelfDatabase_step extends DriverInstance {
    private FamSelfDatabasePO dataB;


    @And("^I select test from dropdown field and I enter email address in text (\\d+) field in Select List Check column$")
    public void iSelectTestFromDropdownFieldAndIEnterEmailAddressInTextFieldInSelectListCheckColumn(int arg0) {
        dataB = new FamSelfDatabasePO(driver);
        dataB.DropdownField();
        dataB.Test_Select();
        dataB.Clear_Field();
        dataB.EnterEmail();
    }

    @When("^I fill in firstaname, lastname and email in the fields$")
    public void iFillInFirstanameLastnameAndEmailInTheFields() {
        dataB = new FamSelfDatabasePO(driver);
        dataB.FirstName();
        dataB.LastName();
        dataB.Email();

    }
}
