package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.SelfCaseViewPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class SelfCaseView_step extends DriverInstance {
    private SelfCaseViewPO selfCase;


    @When("^I navigate to Case View page$")
    public void iNavigateToCaseViewPage() {
        driver.navigate().to("https://releasetesting-self.achieveservice.com/service/Case_View_Test");
    }

    @Then("^Case View should displayed$")
    public void caseViewShouldDisplayed() {
        selfCase = new SelfCaseViewPO(driver);
        selfCase.casePage();
    }

    @When("^I enter credentials in the fields$")
    public void iEnterCredentialsInTheFields() throws Throwable{
        selfCase = new SelfCaseViewPO(driver);
        selfCase.caseName();
        selfCase.numbers();

        //Upload File from C drive
        driver.findElement(By.className("resumable-browse-file")).sendKeys("C:\\Users\\Joshua Ayoade\\Pictures\\IP ss.PNG");
        Thread.sleep(2000);
        //driver.findElement(By.className("upload-button")).click();
    }

    @Then("^Submission with reference page is displayed$")
    public void submissionWithReferencePageIsDisplayed() {
        selfCase = new SelfCaseViewPO(driver);
        selfCase.submitOutcoume();
    }

    @When("^I click Cta MyRequests VThree$")
    public void iClickCtaMyRequestsVThree() {
        selfCase = new SelfCaseViewPO(driver);
        selfCase.requestV3Link();
    }

    @And("^Searched for reference$")
    public void searchedForReference() {
        selfCase = new SelfCaseViewPO(driver);
        selfCase.refTable();
    }

    @And("^click Cta Continue$")
    public void clickCtaContinue() {
        selfCase = new SelfCaseViewPO(driver);
        selfCase.continueBtn();
    }

    @Then("^Case view page is displayed$")
    public void caseViewPageIsDisplayed() {
        selfCase = new SelfCaseViewPO(driver);
        selfCase.caseView();
    }

    @When("^I enter new credentials in the fields$")
    public void iEnterNewCredentialsInTheFields() throws Throwable {
        Thread.sleep(3000);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)", "");

        Thread.sleep(3000);

        selfCase = new SelfCaseViewPO(driver);
        Thread.sleep(3000);
        selfCase.textField();
        Thread.sleep(3000);
        selfCase.numberField();

        //Upload File from C drive
        driver.findElement(By.className("resumable-browse-file")).sendKeys("C:\\Users\\Joshua Ayoade\\Pictures\\IP ss.PNG");
        Thread.sleep(3000);
    }

    @And("^Searched for case reference$")
    public void searchedForCaseReference() {
        selfCase = new SelfCaseViewPO(driver);
        
    }

    @Then("^results page is displayed with stages number$")
    public void resultsPageIsDisplayedWithStagesNumber() {

        selfCase = new SelfCaseViewPO(driver);
    }



}
