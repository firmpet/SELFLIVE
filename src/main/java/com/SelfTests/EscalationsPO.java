package com.SelfTests;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EscalationsPO {

    private WebDriver driver;

    //To initialise web elements
    public EscalationsPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (xpath = "//*span[text()='Escalation Test Process 23022018']")
    public WebElement CtaEscalation;

    @FindBy (className = "Escalation Form One")
    public WebElement EscalationFormPage;

    @FindBy (id = "enterSomeText")
    public WebElement TestField;

    @FindBy (className = "submitText")
    public WebElement CtaSubmit;

    @FindBy (css = "#page>section>section>div>div.submission-message-content.clearfix>p:nth-child(2)")
    public WebElement SubmitSuccessfully;

    @FindBy (linkText = "MyRequests V3")
    public WebElement CtaMyRequestsV3;

    @FindBy (id = "hello-title")
    public WebElement MyRequestPage;

    @FindBy (id = "MyRequestTable")
    public WebElement MyRequestTable;

    @FindBy (id = "search-input")
    public WebElement Search;

    @FindBy (id = "search-submit")
    public WebElement CtaSearch;

    @FindBy (xpath = "//*[@id='MyRequestTable']/tbody/tr[1]")
    public WebElement CaseLogs;



    public void escalations(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(CtaEscalation));

        CtaEscalation.click();   }

    public void formPage(){                   EscalationFormPage.isDisplayed();   }

    public void enterTest(){                  TestField.sendKeys("Testing");  }

    public void submitBtn(){                  CtaSubmit.click();             }

    public void submissionPage(){             SubmitSuccessfully.isDisplayed();         }

    public void myRequestsV3Link(){           CtaMyRequestsV3.click();              }

    public void myRequestFormPage(){          MyRequestPage.isDisplayed();        }

    public void myRequestFormTable(){         MyRequestTable.isDisplayed();         }

    public void searchField(){                Search.sendKeys("FS-Case-112975008");}

    public void searchBtn(){                  CtaSearch.click();          }

    public void caseLogsPage(){               CaseLogs.isDisplayed();      }








}

