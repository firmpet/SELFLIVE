package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.MyRequestDateCheckPO;
import com.SelfTests.TestAssert;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;


public class MyRequestDateCheck_step extends DriverInstance {
    private TestAssert testAssert;
    private MyRequestDateCheckPO dateCheck = new MyRequestDateCheckPO(driver);


    @And("^I navigate to request Date check \"([^\"]*)\"$")
    public void iNavigateToRequestDateCheck(String DateURL) throws Throwable {
        Thread.sleep(3000);
        dateCheck.requestDateCheck(DateURL);
    }

    @When("^I enter text field$")
    public void iEnterTextField() throws Throwable{
        Thread.sleep(2000);
        dateCheck.inputText();
    }

    @And("^I clicked Cta Submit$")
    public void iClickedCtaSubmit()   {
        dateCheck.submitBtnn();
    }

    @Then("^Reference and submission successful message is displayed$")
    public void referenceAndSubmissionSuccessfulMessageIsDisplayed() throws Throwable {
        Thread.sleep(2000);
        String text = driver.findElement(By.xpath("//*[text()='Thank you for submitting Myrequests date check']")).getText();
        assertTrue(text.contains("Thank you for submitting Myrequests date check"));
    }

    @When("^I click Cta Continue$")
    public void iClickCtaContinue()  {
        dateCheck.continueBtnn();
    }

    @Then("^Survey page is displayed$")
    public void surveyPageIsDisplayed() throws Throwable{
        Thread.sleep(2000);
        String text = driver.findElement(By.xpath("//*[text()='How would you rate your experience today?']")).getText();
        assertTrue(text.contains("How would you rate your experience today?"));
    }

    @When("^I click top nav MyRequests VThree$")
    public void iClickTopNavMyRequestsVThree() throws Throwable {
        dateCheck.myRequestV3Link();
        Thread.sleep(2000);
    }

    @And("^Request data page is displayed$")
    public void requestDataPageIsDisplayed() throws Throwable{
        //Assert.assertFalse(testAssert.validateElementExistByXpath(driver, "//table[@id='MyRequestTable']"));
        dateCheck.requestTable();
        Thread.sleep(2000);
    }

    @And("^I clicked Case number column$")
    public void iClickedCaseNumberColumn() throws Throwable {
        Thread.sleep(2000);
        dateCheck.numberColumn();
    }

    @Then("^The result is displayed$")
    public void theResultIsDisplayed() throws Throwable{
        Thread.sleep(1000);
        dateCheck.requestDataPage();
    }

}
