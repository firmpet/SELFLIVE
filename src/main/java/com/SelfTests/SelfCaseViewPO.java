package com.SelfTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelfCaseViewPO {

    private WebDriver driver;

    //To initialise web elements
    public SelfCaseViewPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (xpath = "//*[text()='Stage 1 Case View']")
    public WebElement Stage1CaseView;

    @FindBy (id = "text")
    public WebElement TextField;

    @FindBy (id = "number1")
    public WebElement NumberField;

    @FindBy (xpath = "//*[text()='Thank you for submitting Stage 1 Case View']")
    public WebElement RefPage;

    @FindBy (linkText = "MyRequests V3")
    public WebElement MyRequestsV3Cta;

    @FindBy (xpath = "//*[@id='MyRequestTable']/tbody/tr[1]/td[1]")
    public WebElement Reference;

    @FindBy (linkText = "Continue")
    public WebElement CtaContinue;

    @FindBy (xpath = "//*[@id='current-tasks']/div/div[1]/h4")
    public WebElement Stage2CaseView;

    @FindBy (id = "text1")
    public WebElement Stage2NameField;

    @FindBy (id = "number11")
    public WebElement Stage2NumberField;




    public void casePage(){
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
    Stage1CaseView.isDisplayed();
    }

    public void caseName(){                                TextField.sendKeys("Lambeth");}

    public void numbers(){                                 NumberField.sendKeys("4234");}

    public void submitOutcoume(){                          RefPage.isDisplayed();        }

    public void requestV3Link(){
        driver.navigate().to("https://releasetesting-self.achieveservice.com/en");

        MyRequestsV3Cta.click();         }

    public void refTable(){
        driver.switchTo().frame(driver.findElement(By.id("MyRequestsV3")));
    Reference.click();    }

    public void continueBtn(){                             CtaContinue.click();   }

    public void caseView(){
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
    Stage2CaseView.isDisplayed();
    }

    public void textField(){
        driver.switchTo().frame(driver.findElement(By.id("5cc020963246e")));

        Stage2NameField.sendKeys("Testing");     }

    public void numberField(){                         Stage2NumberField.sendKeys("9870");}




}
