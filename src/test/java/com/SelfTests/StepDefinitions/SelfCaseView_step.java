package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.SelfCaseViewPO;
import com.SelfTests.TestAssert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import javax.xml.xpath.XPath;

public class SelfCaseView_step extends DriverInstance {
    private SelfCaseViewPO selfCase = new SelfCaseViewPO(driver);
    private TestAssert testAssert;
    public static String caseNumber;

    @When("^I navigate to Case View \"([^\"]*)\"$")
    public void iNavigateToCaseView(String URLpage) throws Throwable {
        Thread.sleep(3000);
        selfCase.caseViewPage(URLpage);
    }
//    @When("^I navigate to Case View page$")
//    public void iNavigateToCaseViewPage() throws Throwable {
//        //Thread.sleep(5000);
//        driver.navigate().to("https://releasetesting-self.achieveservice.com/service/Case_View_Test");
//
//    }
//    @When("^I navigate to Case View page$")
//    public void iNavigateToCaseViewPage() throws Throwable {
//        Thread.sleep(5000);
//        selfCase.caseViewPage();
//       }

    @Then("^Case View should displayed$")
    public void caseViewShouldDisplayed() {
        selfCase.casePage();
    }

    @When("^I enter credentials in the fields$")
    public void iEnterCredentialsInTheFields() throws Throwable{
        selfCase.caseName();
        selfCase.numbers();

        //Upload File from C drive
        driver.findElement(By.className("resumable-browse-file")).sendKeys("C:\\Users\\Joshua Ayoade\\Pictures\\IP ss.PNG");
        Thread.sleep(2000);
        //driver.findElement(By.className("upload-button")).click();
    }

    @Then("^Submission with reference page is displayed$")
    public void submissionWithReferencePageIsDisplayed() throws Throwable {
        Thread.sleep(2000);
        selfCase.submitOutcome();
    }

    @When("^I click Cta MyRequests VThree$")
    public void iClickCtaMyRequestsVThree() {
        selfCase.requestV3Link();
    }

    @And("^Searched for reference$")
    public void searchedForReference() throws Throwable{
        selfCase.refTable();
    }

    @And("^click Cta Continue$")
    public void clickCtaContinue() {
        selfCase.continueBtn();
    }

    @Then("^Case view page is displayed$")
    public void caseViewPageIsDisplayed() throws Throwable {
        Thread.sleep(1000);
        selfCase.caseView();
    }

    @When("^I enter new credentials in the fields$")
    public void iEnterNewCredentialsInTheFields() throws Throwable {
        Thread.sleep(2000);
        selfCase.textField();
        Thread.sleep(2000);
        selfCase.numberField();

        //Upload File from C drive
        driver.findElement(By.className("resumable-browse-file")).sendKeys("C:\\Users\\Joshua Ayoade\\Pictures\\IP ss.PNG");
        Thread.sleep(1000);
    }

    @Then("^Submission reference page is displayed$")
    public void submissionReferencePageIsDisplayed() {
        Assert.assertFalse(testAssert.validateElementExistByXpath(driver, "//*[@id='current-tasks']/div/div[1]/h4"));
    }

    @When("^I click Cta Dashboard$")
    public void iClickCtaDashboard() throws Throwable{
        //selfCase.refPage();
        driver.navigate().to("https://releasetesting-self.achieveservice.com/CommonDashboard");

        Thread.sleep(2000);
    }

    @And("^Searched for case reference$")
    public void searchedForCaseReference() throws Throwable{
        selfCase.searchField();
        Thread.sleep(1000);
        selfCase.nextStage();
        Thread.sleep(1000);
    }

    @Then("^I clicks Cta Continue$")
    public void iClicksCtaContinue() throws Throwable{
        selfCase.continues();
    }

    @When("^I entered credentials in the fields$")
    public void iEnteredCredentialsInTheFields() throws Throwable {
        Thread.sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,5000)", "");

        Thread.sleep(1000);
        selfCase.inputText();
        Thread.sleep(1000);
        selfCase.inputNumber();

        //Upload File from C drive
        driver.findElement(By.className("resumable-browse-file")).sendKeys("C:\\Users\\Joshua Ayoade\\Pictures\\IP ss.PNG");
        //Thread.sleep(1000);
    }

    @Then("^results page is displayed with stages number$")
    public void resultsPageIsDisplayedWithStagesNumber() {
        Assert.assertFalse(testAssert.validateElementExistByXpath(driver, "//*[@id='heading3']/p"));
    }



}
