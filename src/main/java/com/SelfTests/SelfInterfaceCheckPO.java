package com.SelfTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SelfInterfaceCheckPO {

    private WebDriver driver;

    //To initialise web elements
    public SelfInterfaceCheckPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (linkText = "FAQs")
    public WebElement FAQsCta;

    @FindBy (xpath = "//*[text()='Frequently Asked Questions']")
    public WebElement FAQPage;

    @FindBy (linkText = "Services")
    public WebElement CtaServices;

    @FindBy (name = "search")
    public WebElement ServicesPage;

    @FindBy (linkText = "Dashboard")
    public WebElement CtaDashboard;

    @FindBy (xpath = "//*[text()='New Forms']")
    public WebElement DashboardPage;

    @FindBy (linkText = "MyRequests V3")
    public WebElement CtaMyRequest;

    @FindBy (xpath = "//*[text()='My Requests']")
    public WebElement RequestCases;

    @FindBy (linkText = "Capita Connect v3")
    public WebElement CtaCapitalConnect;

    @FindBy (xpath = "//*[text()='Online Services']")
    public WebElement OnlineServices;



    public void faqsBtn() {                 FAQsCta.click();        }

    public void contentPage(){
        driver.switchTo().frame(driver.findElement(By.id("NewFAQs")));
    FAQPage.isDisplayed();    }

    public void serviceBtn(){
        driver.switchTo().defaultContent();
        CtaServices.click();  }

    public void pagecontents(){
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
    ServicesPage.isDisplayed();

        driver.switchTo().defaultContent();
    }

    public void dashbtn(){                   CtaDashboard.click();  }

    public void casesTable(){
        driver.switchTo().frame(driver.findElement(By.id("CommonDashboard")));
    DashboardPage.isDisplayed()  ;

    driver.switchTo().defaultContent();
    }

    public void requestLink(){               CtaMyRequest.click();}

    public void casesLog(){                  RequestCases.isDisplayed(); }

    public void connectNav(){               CtaCapitalConnect.click();  }

    public void serviceLists(){
        driver.switchTo().frame(driver.findElement(By.id("CapitaConnect")));
    OnlineServices.isDisplayed(); }

}
