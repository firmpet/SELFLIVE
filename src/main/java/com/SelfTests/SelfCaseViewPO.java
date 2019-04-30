package com.SelfTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class SelfCaseViewPO {
    ResourceBundle config;

    private WebDriver driver;

    //To initialise web elements
    public SelfCaseViewPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config=ResourceBundle.getBundle("ConFig");
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

//    @FindBy (xpath = "//*[@id=\"current-tasks\"]/div/div[1]/h4")
//    public WebElement Stage2Confirmation;

    @FindBy (xpath = "//*[@id='AllProcesses']/div[1]/div[2]/div/input")
    public WebElement SearchRef;

    @FindBy(xpath = "//*[@id='AllProcesses']/table/tbody/tr[2]/td[11]/button[2]")
    public WebElement ContinueCta;

    @FindBy (id = "text12")
    public WebElement Stage3Text;

    @FindBy(id = "number12")
    public WebElement Stage3Number;




    public void caseViewPage(String URLpage){
        driver.navigate().to(config.getString(URLpage));
    }

    public void casePage(){
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
    Stage1CaseView.isDisplayed();
    }

    public void caseName(){
        TextField.sendKeys("Lambeth");
    }

    public void numbers(){
        NumberField.sendKeys("4234");
    }

    public void submitOutcoume(){
        RefPage.isDisplayed();
    }

    public void requestV3Link(){
        driver.navigate().to("https://releasetesting-self.achieveservice.com/en");

        MyRequestsV3Cta.click();
    }

    public void refTable(){
        driver.switchTo().frame(driver.findElement(By.id("MyRequestsV3")));
    Reference.click();
    }

    public void continueBtn(){
        CtaContinue.click();
    }

    public void caseView(){
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
    Stage2CaseView.isDisplayed();
    }

    public void textField(){

//                driver.switchTo().frame("//body[@class='AF-Category-Hidden']");
//        driver.switchTo().defaultContent();
        //driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1"))).switchTo().frame(driver.findElement(By.xpath("//*[@id='5cc70b3632ae5']")));
        //driver.switchTo().frame(driver.findElement(By.xpath("//*[text()='iFrame Process - Section 2']")));
//       driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='achieveforms-iframe']")));
//        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='5cc70b3632ae5']")));

//        int size = driver.findElements(By.tagName("iframe")).size();
//        System.out.println("Total Frames --" + size);
        driver.switchTo().frame(1);

        Stage2NameField.sendKeys("Testing");
    }

    public void numberField(){
        Stage2NumberField.sendKeys("9870");
    }

//    public void refPage(){
//        Stage2Confirmation.isDisplayed();
//    }

    public void searchField()throws Throwable{

        driver.switchTo().frame(driver.findElement(By.id("CommonDashboard")));
        SearchRef.sendKeys("FS-Case-116247897");

        Thread.sleep(3000);
    }

    public void continues(){

        ContinueCta.click();
    }

    public void inputText()throws Throwable{
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(4);

//        int size = driver.findElements(By.tagName("iframe")).size();
//        System.out.println("Total Frames --" + size);
        driver.switchTo().frame(2);

        //Thread.sleep(3000);
        Stage3Text.sendKeys("FS-Case-116247897");
    }

    public void inputNumber(){
        Stage3Number.sendKeys("3526");
    }



}


