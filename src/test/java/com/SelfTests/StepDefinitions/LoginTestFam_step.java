package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.LoginTestFamPO;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestFam_step extends DriverInstance {
    private LoginTestFamPO login;

    @When("^I click on Cta Home$")
    public void iClickOnCtaHome() {
        login = new LoginTestFamPO(driver);
        login.homeBtn();
    }

    @Then("^Home page is displayed$")
    public void homePageIsDisplayed() {
        login = new LoginTestFamPO(driver);
        login.dashboard();
    }

    @When("^I click Cta MyRequests V$")
    public void iClickCtaMyRequestsV() {
        login = new LoginTestFamPO(driver);
        login.myRequestBtn();
    }

    @Then("^MyRequest V page is displayed$")
    public void myrequestVPageIsDisplayed() {
        login = new LoginTestFamPO(driver);
        login.requestCaseTables();
    }
}
