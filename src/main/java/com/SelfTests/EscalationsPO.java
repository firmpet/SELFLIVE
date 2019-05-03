package com.SelfTests;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class EscalationsPO {

    private WebDriver driver;

    //To initialise web elements
    public EscalationsPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (linkText = "Escalation Test Process 23022018")
    private WebElement ctaEscalation;

    @FindBy (className = "Escalation Form One")
    private WebElement EscalationForm;

    @FindBy (xpath = "//*[@id='enterSomeText']")
    private WebElement testField;

    @FindBy (className = "submitText")
    private WebElement CtaSubmit;

    @FindBy (css = "#page>section>section>div>div.submission-message-content.clearfix>p:nth-child(2)")
    private WebElement SubmitSuccessfully;

    @FindBy (linkText = "MyRequests V3")
    private WebElement CtaMyRequestsV3;

    @FindBy (id = "hello-title")
    private WebElement MyRequestPage;

    @FindBy (id = "MyRequestTable")
    private WebElement MyRequestTable;

    @FindBy (id = "search-input")
    private WebElement Search;

    @FindBy (id = "search-submit")
    private WebElement CtaSearch;

    @FindBy (xpath = "//*[@id='hello-title']")
    private WebElement CaseLogs;



    public void escalations() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(ctaEscalation));
        ctaEscalation.click();
//        driver.switchTo().defaultContent();

//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("self-content")));
//    WebElement serviceList = driver.findElement(By.id("self-content"));
//        for (int i = 0; i < serviceList.findElements(By.tagName("a")).size(); i++) {
//        System.out.println(serviceList.findElements(By.tagName("a")).get(i).getAttribute("text"));
//    }


//        Thread.sleep(10000);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ctaEscalation);
//        Actions tClick = new Actions(driver);
//        tClick.moveToElement(ctaEscalation).click().perform();
//        ctaEscalation.click();
    }


    //public void escalationFormPage(){                   EscalationForm.isDisplayed();   }

    public void enterTest(){
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        testField.sendKeys("Testing");
    }
    public void submitBtn(){
        CtaSubmit.click();
    }
    public void submissionPage(){
        SubmitSuccessfully.isDisplayed();
    }
    public void myRequestsV3Link(){
        driver.switchTo().defaultContent();
    CtaMyRequestsV3.click();
    }
    //public void myRequestFormPage(){          MyRequestPage.isDisplayed();        }

    //public void myRequestFormTable(){         MyRequestTable.isDisplayed();         }

    public void searchField(){
        driver.switchTo().frame(driver.findElement(By.id("MyRequestsV3")));
        Search.sendKeys("FS-Case-112975008");
    }
    public void searchBtn(){
        CtaSearch.click();
    }
    public void caseLogsPage(){
        CaseLogs.isDisplayed();
    }




}

