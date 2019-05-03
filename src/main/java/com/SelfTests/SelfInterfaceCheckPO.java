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
    private WebElement FAQsCta;

    @FindBy (xpath = "//*[text()='Frequently Asked Questions']")
    private WebElement FAQPage;

    @FindBy (linkText = "Services")
    private WebElement CtaServices;

    @FindBy (name = "search")
    private WebElement ServicesPage;

    @FindBy (linkText = "Dashboard")
    private WebElement CtaDashboard;

    @FindBy (xpath = "//*[text()='New Forms']")
    private WebElement DashboardPage;

    @FindBy (linkText = "MyRequests V3")
    private WebElement CtaMyRequest;

    @FindBy (xpath = "//*[text()='My Requests']")
    private WebElement RequestCases;

    @FindBy (linkText = "Capita Connect v3")
    private WebElement CtaCapitalConnect;

    @FindBy (xpath = "//*[text()='Online Services']")
    private WebElement OnlineServices;



    public void faqsBtn() {
        FAQsCta.click();
    }
    public void contentPage(){
        driver.switchTo().frame(driver.findElement(By.id("NewFAQs")));
    FAQPage.isDisplayed();
    }
    public void serviceBtn(){
        driver.switchTo().defaultContent();
        CtaServices.click();
    }
    public void pagecontents(){
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
    ServicesPage.isDisplayed();
        driver.switchTo().defaultContent();
    }
    public void dashbtn(){
        CtaDashboard.click();
    }
    public void casesTable(){
        driver.switchTo().frame(driver.findElement(By.id("CommonDashboard")));
    DashboardPage.isDisplayed()  ;
    driver.switchTo().defaultContent();
    }
    public void requestLink() {
        CtaMyRequest.click();
    }
    public void casesLog()  {
        RequestCases.isDisplayed();
    }
    public void connectNav()  {
        CtaCapitalConnect.click();
    }
    public void serviceLists(){
        driver.switchTo().frame(driver.findElement(By.id("CapitaConnect")));
    OnlineServices.isDisplayed();
    }

}
