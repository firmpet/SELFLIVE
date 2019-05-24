package com.SelfTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class MyRequestsStageLoopbackPO {
    ResourceBundle config;

    private WebDriver driver;

    //To initialise web elements
    public MyRequestsStageLoopbackPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config=ResourceBundle.getBundle("ConFig");
    }

    //Define element locator
    @FindBy (xpath = "//*[@id='MyRequestTable']/tbody/tr[1]/td[1]")
    private WebElement Stage1;

    @FindBy (linkText = "Continue")
    private WebElement Continuelnk;

    @FindBy (xpath = "//*[text()='No']")
    private WebElement Answer;

    @FindBy (xpath = "//*[text()='Submit']")
    private WebElement Submission;



    public void stageLoop(String LoopbackURL){
        driver.navigate().to(config.getString("LoopbackURL"));
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
    }

    public void requestV3 ()  throws Throwable{
        Thread.sleep(1000);
        driver.switchTo().frame(driver.findElement(By.id("MyRequestsV3")));
        Thread.sleep(1000);
        Stage1.click();
    }
    public void ctaContinue(){
        Continuelnk.click();
    }
    public void selectOption() throws Throwable{
        Thread.sleep(1000);
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(1000);
        Answer.click();
    }
    public void submit() {
        Submission.click();
    }
}
