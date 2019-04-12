package com.SelfTests;

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
    @FindBy (xpath = "//*span[text()='Home']")
    public WebElement CtaHome;

    @FindBy (xpath = "//*span[text()='Take charge of your world!']")
    public WebElement Homepage;

    @FindBy (xpath = "//*span[text()='FAQs']")
    public WebElement CtaFAQs;

    @FindBy (xpath = "//*span[text()='Frequently Asked Questions']")
    public WebElement FAQsPage;

    @FindBy (xpath = "//*span[text()='MyRequests V3']")
    public WebElement CtaMyRequestsV3;

    @FindBy (xpath = "//*span[text()='My Requests']")
    public WebElement RequestDashboard;



    public void homeBtn (){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(CtaHome));

        CtaHome.click();       }

    public void dashboard(){                   Homepage.isDisplayed();  }

    public void faqsBtn(){                     CtaFAQs.click();     }

    public void faqsLink(){                    FAQsPage.isDisplayed(); }

    public void requestV3Page(){               CtaMyRequestsV3.click();  }

    public void requestTable(){                RequestDashboard.isDisplayed();  }
}
