package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.MyRequestDateCheckPO;
import com.SelfTests.TestAssert;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.apache.xpath.XPath;
import org.junit.Assert;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;
import static sun.plugin.javascript.navig.JSType.URL;

public class MyRequestDateCheck_step extends DriverInstance {
    private TestAssert testAssert;
    private MyRequestDateCheckPO dateCheck = new MyRequestDateCheckPO(driver);


    @And("^I navigate to request date check \"([^\"]*)\"$")
    public void iNavigateToRequestDateCheck(String DateURL) throws Throwable {
        Thread.sleep(3000);
        dateCheck.requestDateCheck(DateURL);
    }
    @When("^I enter text field$")
    public void iEnterTextField() throws Throwable{
        dateCheck.inputText();
    }

    @And("^I clicked Cta Submit$")
    public void iClickedCtaSubmit() {
        dateCheck.submitBtn();
    }

    @Then("^Reference and submission successful message is displayed$")
    public void referenceAndSubmissionSuccessfulMessageIsDisplayed() {
        String text = driver.findElement(By.xpath("//*[text()='Thank you for submitting Myrequests date check']")).getText();
        assertTrue(text.contains("Thank you for submitting Myrequests date check"));
    }

    @When("^I click Cta Continue$")
    public void iClickCtaContinue() {
        dateCheck.continueBtn();
    }

    @Then("^Survey page is displayed$")
    public void surveyPageIsDisplayed() {
        String text = driver.findElement(By.xpath("//*[text()='How would you rate your experience today?']")).getText();
        assertTrue(text.contains("How would you rate your experience today?"));
    }

    @When("^I click top nav MyRequests VThree$")
    public void iClickTopNavMyRequestsVThree() throws Throwable{
        dateCheck.myRequestLnk();
        Thread.sleep(4000);
    }

    @And("^my My Request page is displayed$")
    public void myMyRequestPageIsDisplayed() {
        Assert.assertFalse(testAssert.validateElementExistByXpath(driver, "//*[@id='MyRequestTable']/tbody/tr[1]/td[1]"));
    }

    @And("^I enter into searchField$")
    public void iEnterIntoSearchField() throws Throwable {
        Thread.sleep(2000);
        dateCheck.textRef();
        Thread.sleep(2000);
    }

    @And("^I clicked search$")
    public void iClickedSearch(){
        dateCheck.search();
    }

    @Then("^the result is displayed$")
    public void theResultIsDisplayed() {

    }



}
