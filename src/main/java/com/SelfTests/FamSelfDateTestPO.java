package com.SelfTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FamSelfDateTestPO {

    private WebDriver driver;

    //To initialise web elements
    public FamSelfDateTestPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Define element locator
    @FindBy (linkText = "Date Fields Manual Test")
    public WebElement CtaDateFieldsManual;

    @FindBy (xpath = "//*[@id='page']/section/header/h1")
    public WebElement DateFieldPage;

    @FindBy (id = "date1")
    public WebElement DateFrom;

    @FindBy ( id = "date2")
    public WebElement DateTo;

    @FindBy (id = "time1")
    public WebElement Time;

    @FindBy (xpath = "//*[@id=\"AF-Form-8f081991-face-4e9b-9b24-f3cbe02f7bdb\"]/div/div/button[2]")
    public WebElement SubmitForm;

    @FindBy (xpath = "//*[@id=\"page\"]/section/section/div/div[1]/p[2]")
    public WebElement SubmissionPage;


    public void dateFieldLink() throws Throwable{
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(CtaDateFieldsManual));

        CtaDateFieldsManual.click();          }

    public void dashboard(){
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
    DateFieldPage.isDisplayed();    }

    public void dateField(){                     DateFrom.sendKeys("15012019");}

    public void dateField1(){                    DateTo.sendKeys("20022019");}

    public void timeField(){                     Time.sendKeys("1530");}

    public void submitBtn(){                     SubmitForm.click();    }

    public void submit(){                        SubmissionPage.isDisplayed(); }

}


