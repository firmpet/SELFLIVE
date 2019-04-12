package com.SelfTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelfInterfaceCheckPO {

    private WebDriver driver;

    //To initialise web elements
    public SelfInterfaceCheckPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (xpath = "//*[text()='FAQs']")
    public WebElement FAQsCta;

    @FindBy (xpath = "//*[text()='Frequently Asked Questions']")
    public WebElement FAQPage;

    @FindBy (xpath = "//*[text()='Services']")
    public WebElement CtaServices;

    @FindBy (xpath = "//*[text()='Services']")
    public WebElement ServicesPage;

    @FindBy (xpath = "//*[text()='Dashboard']")
    public WebElement CtaDashboard;

    @FindBy (xpath = "//*[text()='New Forms']")
    public WebElement DashboardPage;

    @FindBy (xpath = "//*[text()='MyRequests V3']")
    public WebElement CtaMyRequest;

    @FindBy (xpath = "//*[text()='My Requests']")
    public WebElement RequestCases;

    @FindBy (xpath = "//*[text()='Capita Connect v3']")
    public WebElement CtaCapitalConnect;

    @FindBy (id = "Online Services")
    public WebElement OnlineServices;




    public void faqsBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(FAQsCta));

        FAQsCta.click();        }

    public void contentPage(){                FAQPage.isDisplayed();    }

    public void serviceBtn(){                 CtaServices.click();  }

    public void pagecontents(){                ServicesPage.isDisplayed();   }

    public void dashbtn(){                    CtaDashboard.click();  }

    public void casesTable(){                 DashboardPage.isDisplayed()  ; }

    public void requestLink(){               CtaMyRequest.click();}

    public void casesLog(){                  RequestCases.isDisplayed(); }

    public void connectNav(){               CtaCapitalConnect.click();  }

    public void serviceLists(){             OnlineServices.isDisplayed(); }

}
