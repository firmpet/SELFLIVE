package com.SelfTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FamSelfHTTPLookUpPO {

    private WebDriver driver;

    //To initialise web elements
    public FamSelfHTTPLookUpPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (linkText = "HTTP Examples and Testing.")
    private WebElement CtaHTTPAndTesting;

    @FindBy (xpath = "//*[text()='HTTP Testing and Examples']")
    private WebElement HTTPDashboard;

    @FindBy (id = "clickMeImageShou")
    private WebElement CtaLookUp;

    @FindBy (xpath = "//*[@id=\"AF-Form-e4819683-7697-4063-91c9-5a213637a31b\"]/div/div/button[2]")
    private WebElement CtaNext;

    @FindBy (id = "breedname")
    private WebElement TextField;

    @FindBy (id = "breedname")
    private WebElement BreedNmae;

    @FindBy (id = "button1")
    private WebElement LookUpCta;

    @FindBy (className = "nextbutton")
    private WebElement NextButton;

    @FindBy (css = "#button2")
    private WebElement LookUpBtn;

    @FindBy (xpath = "//*[text()='Submit']")
    private WebElement CtaSubmit;

    @FindBy (xpath = "//*[text()='Thank you for submitting HTTP Testing and Examples']")
    private WebElement SubmissionResult;




    public void httpTesting() throws Throwable{
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(CtaHTTPAndTesting));

        CtaHTTPAndTesting.click();
    }
    public void testingPage(){
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
    HTTPDashboard.isDisplayed();
    }
    public void lookUpBtn(){
        CtaLookUp.click();
    }
    public void nextBtn(){
        CtaNext.click();
    }
    public void clearField(){
        TextField.clear();
    }
    public void insertname(){
        BreedNmae.sendKeys("BullDog");
    }
    public void lookUpbtn(){
        LookUpCta.click();
    }
    public void nextcta(){
        NextButton.click();
    }
    public void fillForm(){
        LookUpBtn.click();
    }
    public void submitLink(){
        CtaSubmit.click();
    }
    public void submitInfo(){
        SubmissionResult.isDisplayed();
    }




}
