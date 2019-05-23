package com.SelfTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class MyRequestDateCheckPO {
    ResourceBundle config;

    private WebDriver driver;

    //To initialise web elements
    public MyRequestDateCheckPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config= ResourceBundle.getBundle("ConFig");
    }


    //Define element locator
    @FindBy (id = "text1")
    private WebElement TextField;

    @FindBy (xpath = "//span[@class='submitText']")
    private WebElement CtaSubmit;

    @FindBy (xpath = "//*[text()='Continue']")
    private WebElement CtaContinue;

    @FindBy(linkText = "MyRequests V3")
    private WebElement CtaMyRequests;

    @FindBy (xpath = "//table[@id='MyRequestTable']")
    private WebElement RequestTableData;

    @FindBy (xpath = "//tr[@href='#']")
    private WebElement SearchBtn;

    @FindBy (xpath = "//tr[@class='case-table']")
    private WebElement ApplicationPage;





    public void requestDateCheck(String DateURL)   {
        driver.navigate().to(config.getString("DateURL"));
    }
    public void inputText() throws Throwable{
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        TextField.sendKeys("Testing");
    }
    public void submitBtnn()  {
        CtaSubmit.click();
    }
    public void continueBtnn ()  {
        CtaContinue.click();
    }
    public void myRequestV3Link ()  {
        CtaMyRequests.click();
    }
    public void requestTable()  {
        driver.switchTo().frame(driver.findElement(By.id("MyRequestsV3")));
        RequestTableData.isDisplayed();
    }
    public void numberColumn()  {
        SearchBtn.click();
    }
    public void requestDataPage()  {
        ApplicationPage.isDisplayed();
    }



}
