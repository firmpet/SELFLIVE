package com.SelfTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTestFamPO {

    private WebDriver driver;

    //To initialise web elements
    public LoginTestFamPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (linkText = "Home")
    public WebElement CtaHome;

    @FindBy (xpath = "//*[text()='Take charge of your world!']")
    public WebElement Homepage;

    @FindBy (linkText = "MyRequests V3")
    public WebElement CtaMyRequest;

    @FindBy (xpath = "//*[text()='My Requests']")
    public WebElement RequestCase;




    public void homeBtn () {                   CtaHome.click();       }

    public void dashboard(){                  Homepage.isDisplayed();  }

    public void myRequestBtn(){
        driver.switchTo().defaultContent();
    CtaMyRequest.click();}

    public void requestCaseTables(){          RequestCase.isDisplayed();   }


}
