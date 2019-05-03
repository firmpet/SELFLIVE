package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.SelfInterfaceCheckPO;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelfInterfaceCheck_step extends DriverInstance {
    private SelfInterfaceCheckPO inter = new SelfInterfaceCheckPO(driver);


    @When("^I click Cta FAQs$")
    public void iClickCtaFAQs() throws Throwable{
        inter.faqsBtn();
    }

    @Then("^FAQs dashboard is displayed$")
    public void faqsDashboardIsDisplayed() throws Throwable {
        Thread.sleep(3000);
        inter.contentPage();
    }

    @When("^I click on Cta Services$")
    public void iClickOnCtaServices() {
        inter.serviceBtn();
    }

    @Then("^Services dashboard is displayed$")
    public void servicesDashboardIsDisplayed() {
        inter.pagecontents();
    }

    @When("^I click on Cta Dashboard$")
    public void iClickOnCtaDashboard() {
        inter.dashbtn();
    }

    @Then("^The Dashboard page is displayed$")
    public void theDashboardPageIsDisplayed() throws Throwable{
        inter.casesTable();
    }

    @When("^I click on Cta MyRequests V$")
    public void iClickOnCtaMyRequestsV() {
        inter.requestLink();
    }

    @Then("^MyRequests V page is displayed$")
    public void myrequestsVPageIsDisplayed() {
        inter.casesLog();
    }

    @When("^I click on Cta Capita Connect V$")
    public void iClickOnCtaCapitaConnectV() {
        inter.connectNav();
    }

    @Then("^the Capita Connect V page is displayed$")
    public void theCapitaConnectVPageIsDisplayed() {
        inter.serviceLists();
    }

}
