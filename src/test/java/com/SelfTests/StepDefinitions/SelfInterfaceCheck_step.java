package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.SelfInterfaceCheckPO;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelfInterfaceCheck_step extends DriverInstance {
    private SelfInterfaceCheckPO inter;


    @When("^I click Cta FAQs$")
    public void iClickCtaFAQs() throws Throwable{
        inter = new SelfInterfaceCheckPO(driver);
        inter.faqsBtn();
    }

    @Then("^FAQs dashboard is displayed$")
    public void faqsDashboardIsDisplayed() throws Throwable {
        inter = new SelfInterfaceCheckPO(driver);
        Thread.sleep(3000);
        inter.contentPage();
    }

    @When("^I click on Cta Services$")
    public void iClickOnCtaServices() {
        inter = new SelfInterfaceCheckPO(driver);
        inter.serviceBtn();
    }

    @Then("^Services dashboard is displayed$")
    public void servicesDashboardIsDisplayed() {
        inter = new SelfInterfaceCheckPO(driver);
        inter.pagecontents();
    }

    @When("^I click on Cta Dashboard$")
    public void iClickOnCtaDashboard() {
        inter = new SelfInterfaceCheckPO(driver);
        inter.dashbtn();
    }

    @Then("^The Dashboard page is displayed$")
    public void theDashboardPageIsDisplayed() throws Throwable{
        inter = new SelfInterfaceCheckPO(driver);
        inter.casesTable();
    }

    @When("^I click on Cta MyRequests V$")
    public void iClickOnCtaMyRequestsV() {
        inter = new SelfInterfaceCheckPO(driver);
        inter.requestLink();
    }

    @Then("^MyRequests V page is displayed$")
    public void myrequestsVPageIsDisplayed() {
        inter = new SelfInterfaceCheckPO(driver);
        inter.casesLog();
    }

    @When("^I click on Cta Capita Connect V$")
    public void iClickOnCtaCapitaConnectV() {
        inter = new SelfInterfaceCheckPO(driver);
        inter.connectNav();
    }

    @Then("^the Capita Connect V page is displayed$")
    public void theCapitaConnectVPageIsDisplayed() {
        inter = new SelfInterfaceCheckPO(driver);
        inter.serviceLists();
    }

}
