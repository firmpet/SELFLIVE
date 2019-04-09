package com.SelfTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamSelfDateTestPO {

    private WebDriver driver;

    //To initialise web elements
    public FamSelfDateTestPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Define element locator
    @FindBy (linkText = "Date Fields Manual Test")
    public WebElement DateFieldsManual;

    @FindBy (xpath = "//*[@id=\"page\"]/section/header/h1")
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


    public void DateFieldsManual(){                  DateFieldsManual.click();          }

    public void DateFieldPage(){                     DateFieldPage.isDisplayed();    }

    public void DateFrom(){                          DateFrom.sendKeys("15012019");}

    public void DateTo(){                            DateTo.sendKeys("20022019");}

    public void Time(){                              Time.sendKeys("1530");}

    public void SubmitForm(){                        SubmitForm.click();    }

    public void SubmissionPage(){                    SubmissionPage.isDisplayed(); }

}


