package com.SelfTests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FamSelfAssignmentPO {

    private WebDriver driver;

    //To initialise web elements
    public FamSelfAssignmentPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (xpath = "//*[text()='Dashboard and Assignment Process']")
    private WebElement CtaDashboardAndAssignmentProcess;

    @FindBy (className = "_formName")
    private WebElement DashboardPage;

    @FindBy (id = "summary_show")
    private WebElement SummaryField1;

    @FindBy (id = "summary_show")
    private WebElement SummaryField;

    @FindBy (id = "select1")
    private WebElement SpecificUserField;

    @FindBy (id = "select1")
    private WebElement UserEmail;

    @FindBy (id = "assignToSpecificG")
    private WebElement SpecificGroup;

    @FindBy (id = "assignToSpecificG")
    private WebElement SpecificGroupField;

    @FindBy (className = "submitbutton")
    private WebElement CtaSubmit;

    @FindBy (xpath = "//*[@id='page']/section/section/div/div[1]/p[2]")
    private WebElement SuccessfulSubmission;




    public void dashboardAndAssignmentProcessLink() throws Throwable{
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(CtaDashboardAndAssignmentProcess));

        CtaDashboardAndAssignmentProcess.click();
    }
    public void formPage(){
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
    DashboardPage.isDisplayed();
    }
    public void clearField(){
        SummaryField1.clear();
    }
    public void enterText(){
        SummaryField.sendKeys("Summary Test 2019-04-08");
    }
    public void userField(){
        SpecificUserField.click();
    }
    public void enterEmail(){
        UserEmail.sendKeys("petermalt@firmstep.com");
    }
    public void groupField(){
        SpecificGroup.click();
    }
    public void groupName(){
        SpecificGroupField.sendKeys("CSA");
    }
    public void submitBtn(){
        CtaSubmit.click();
    }
    public void formSubmit(){
        SuccessfulSubmission.isDisplayed();
    }




}
