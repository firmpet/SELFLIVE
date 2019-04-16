package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.FamSelfDatabasePO;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;


public class FamSelfDatabase_step extends DriverInstance {
    private FamSelfDatabasePO dataB;


    @When("^I select test from dropdown field and I enter email address in text field in Select List Check column$")
    public void iSelectTestFromDropdownFieldAndIEnterEmailAddressInTextFieldInSelectListCheckColumn() throws Throwable {
        dataB = new FamSelfDatabasePO(driver);
        dataB.optionsField();
        dataB.insertText();
        dataB.clear();
        dataB.insertEmail();
    }

    @And("^I fill in firstaname, lastname and email in the fields$")
    public void iFillInFirstanameLastnameAndEmailInTheFields() {
        dataB = new FamSelfDatabasePO(driver);
        dataB.fName();
        dataB.lName();
        dataB.emailField();

    }
}
