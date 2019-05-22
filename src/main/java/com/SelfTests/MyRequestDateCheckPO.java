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

    @FindBy (xpath = "//*[text()='Submit']")
    private WebElement CtaSubmit;

    @FindBy (xpath = "//*[text()='Continue']")
    private WebElement CtaContinue;

    @FindBy(linkText = "MyRequests V3")
    private WebElement CtaMyRequests;

    @FindBy (xpath = "//*[@id='search-input']")
    private WebElement SearchField;

    @FindBy (id = "search-submit")
    private WebElement SearchBtn;





    public void requestDateCheck(String DateURL)   {
        driver.navigate().to(config.getString("DateURL"));
    }
    public void inputText() throws Throwable{
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        Thread.sleep(2000);
        TextField.sendKeys("Testing");
    }
    public void submitBtn()  {
        CtaSubmit.click();
    }
    public void continueBtn()  {
        CtaContinue.click();
    }
    public void myRequestLnk(){
        CtaMyRequests.click();

        driver.switchTo().defaultContent();
    }
    public void textRef()throws Throwable{
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("MyRequestsV3")));
        Thread.sleep(2000);
        SearchField.sendKeys("FS-Case-117107182");
    }
    public void search()  {
        SearchBtn.click();
    }
}
