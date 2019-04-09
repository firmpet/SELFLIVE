package com.SelfTests;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EscalationsPO {

    private WebDriver driver;

    //To initialise web elements
    public EscalationsPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (xpath = "//*[@id=\"app-content\"]/div[4]/div[2]/div[2]/div[2]/ul/li/a")
    public WebElement EscalationTest;

    @FindBy (className = "Escalation Form One")
    public WebElement EscalationFormOne;

    @FindBy (id = "enterSomeText")
    public WebElement EnterTest;

    @FindBy (className = "submitText")
    public WebElement ClickSubmit;

    @FindBy (css = "#page>section>section>div>div.submission-message-content.clearfix>p:nth-child(2)")
    public WebElement SubmitSuccessfully;

    @FindBy (linkText = "MyRequests V3")
    public WebElement MyRequestsV3;

    @FindBy (id = "hello-title")
    public WebElement MyRequestPage;

    @FindBy (id = "MyRequestTable")
    public WebElement MyRequestTable;

    @FindBy (id = "search-input")
    public WebElement Search;

    @FindBy (id = "search-submit")
    public WebElement ClickSearch;

    @FindBy (xpath = "//*[@id=\"MyRequestTable\"]/tbody/tr[1]")
    public WebElement CaseLogs;



    public void EscalationTest(){                EscalationTest.click();   }

    public void EscalationFormOne(){             EscalationFormOne.isDisplayed();   }

    public void EnterTest(){                     EnterTest.sendKeys("Testing");  }

    public void ClickSubmit(){                   ClickSubmit.click();             }

    public void SubmitSuccessfully(){            SubmitSuccessfully.isDisplayed();         }

    public void MyRequestsV3(){                  MyRequestsV3.click();              }

    public void MyRequestPage(){                 MyRequestPage.isDisplayed();        }

    public void MyRequestTable(){                MyRequestTable.isDisplayed();         }

    public void Search(){                        Search.sendKeys("FS-Case-112975008");}

    public void ClickSearch(){                   ClickSearch.click();          }

    public void CaseLogs(){                      CaseLogs.isDisplayed();      }








}

