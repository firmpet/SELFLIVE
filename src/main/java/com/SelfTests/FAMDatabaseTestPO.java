package com.SelfTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FAMDatabaseTestPO {

    private WebDriver driver;

    //To initialise web elements
    public FAMDatabaseTestPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (xpath = "//*[text()='Database Integration Test']")
    private WebElement CtaDatabaseIntegration;

//    @FindBy (xpath = "//*[@id=\"page\"]/section/header/h1/span")
//    public WebElement DatabaseIntegrationPage;

    @FindBy (id = "select1")
    private WebElement Select1Field;

    @FindBy (className = "lookup-option")
    private WebElement CtaTest;

    @FindBy (id = "text1")
    private WebElement Email;

    @FindBy (className = "nextbutton")
    private WebElement Next;

    @FindBy (className = "sectionNameTab ")
    private WebElement ReadOnlySubformColumn;

    @FindBy (className = "fa-chevron-right")
    private WebElement CtaNext;

    @FindBy (xpath = "//*[@id=\"AF-Form-2193724e-7b47-44d7-bf73-03c8b98b7033\"]/section[1]/ul/li[3]/a")
    private WebElement CtaAddAEntry;

    @FindBy (id = "LastNameadd")
    private WebElement EnterName;

    @FindBy(id = "FirstNameadd")
    private WebElement FirstName;

    @FindBy(id = "emailadd")
    private WebElement EnterEmail;

    @FindBy (css = "#AF-Form-2193724e-7b47-44d7-bf73-03c8b98b7033 > div > div > button.btn.btn-af.submitbutton.pull-right")
    private WebElement Submit;

    @FindBy (xpath = "//*[@id=\"page\"]/section/section/div/div[1]/p[2]")
    private WebElement SubmissionPage;



    public void databaseIntegrationBtn() throws Throwable{
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(CtaDatabaseIntegration));

        CtaDatabaseIntegration.click();
    }

    //public void dataIntegrationPage(){           DatabaseIntegrationPage.isDisplayed();                     }

    public void enterText() throws InterruptedException {
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Select1Field.click();
    }
    public void testBtn(){
        CtaTest.click();
    }
    public void enterEmail(){
        Email.sendKeys("support@firmstep.com");
    }
    public void nextBtn(){
        Next.click();
    }
    public void readOnlySubform(){
        ReadOnlySubformColumn.isDisplayed();
    }
    public void nextLink(){
        CtaNext.click();
    }
    public void enterData(){
        CtaAddAEntry.isDisplayed();
    }
    public void textField(){
        EnterName.sendKeys("Dan");
    }
    public void nameField(){
        FirstName.sendKeys("David");
    }
    public void email(){
        EnterEmail.sendKeys("test@example.com");
    }
    public void submitBtn(){
        Submit.click();
    }
    public void successPage(){
        SubmissionPage.isDisplayed();
    }


}
