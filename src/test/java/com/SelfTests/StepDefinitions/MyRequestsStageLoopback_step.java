package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.MyRequestsStageLoopbackPO;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class MyRequestsStageLoopback_step extends DriverInstance {
    private MyRequestsStageLoopbackPO loopBack = new MyRequestsStageLoopbackPO(driver);


    @When("^I navigate to Stage \"([^\"]*)\"$")
    public void iNavigateToStage(String LoopbackURL) {
        loopBack.stageLoop(LoopbackURL);
    }

    @Then("^SELF TEST - Loopback page is displayed$")
    public void selfTESTLoopbackPageIsDisplayed() {
        String text = driver.findElement(By.xpath("//*[text()='[SELF TEST] - Loopback (1)']")).getText();
        assertTrue(text.contains("[SELF TEST] - Loopback (1)"));
    }

    @Then("^Displayed Reference Page$")
    public void referencePageIsDisplayed() {
        String text = driver.findElement(By.xpath("//*[text()='Thank you for submitting [SELF TEST] - Loopback (1)']")).getText();
        assertTrue(text.contains("Thank you for submitting [SELF TEST] - Loopback (1)"));
    }

    @And("^I click current Stage two$")
    public void iClickOnCurrentStageTwo() throws Throwable{
        loopBack.requestV3();
    }

    @Then("^click on Cta Continue$")
    public void clickOnCtaContinue() {
        loopBack.ctaContinue();
    }

    @When("^I clicks No radio button$")
    public void iClickNoRadioButton() throws Throwable{
        loopBack.selectOption();
    }

    @And("^click Submit Cta$")
    public void clickSubmitCta() {
        loopBack.submit();
    }
}
