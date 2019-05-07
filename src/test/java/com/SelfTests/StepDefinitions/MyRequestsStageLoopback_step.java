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
    public void iNavigateToStage(String LoopbackURL) throws Throwable {
        Thread.sleep(2000);
        loopBack.stageLoop(LoopbackURL);
    }

    @Then("^SELF TEST - Loopback page is displayed$")
    public void selfTESTLoopbackPageIsDisplayed() {
        String text = driver.findElement(By.xpath("//*[text()='[SELF TEST] - Loopback (1)']")).getText();
        assertTrue(text.contains("[SELF TEST] - Loopback (1)"));
    }

    @Then("^Displayed Reference Page$")
    public void referencePageIsDisplayed() {

    }

    @And("^I click current Stage two$")
    public void iClickOnCurrentStageTwo() {

    }

    @Then("^click on Cta Continue$")
    public void clickOnCtaContinue() {

    }

    @When("^I clicks No radio button$")
    public void iClickNoRadioButton() {
    }


    @And("^click Submit Cta$")
    public void clickSubmitCta() {
    }
}
