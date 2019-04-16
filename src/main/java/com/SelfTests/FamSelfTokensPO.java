package com.SelfTests;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;


public class FamSelfTokensPO {
    private WebDriver driver;

    //To initialise web elements
    public FamSelfTokensPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (linkText = "Tokens Process")
    public WebElement CtaTokens;

    @FindBy (xpath = "//*[text()='All Tokens Form']")
    public WebElement TokensDashboard;

    @FindBy (xpath = "//*[text()='Next']")
    public WebElement Ctanext;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[2]/a")
    public WebElement AssignmentTokens;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/div/div/button[3]")
    public WebElement NextBtn;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[3]/a")
    public WebElement CaseTokens;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[4]/a")
    public WebElement CitizenAndCSATokens;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[5]/a")
    public WebElement DateTimeToken;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[6]/a")
    public WebElement EscalationToken;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[7]/a")
    public WebElement FormTokens;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[8]/a")
    public WebElement ProcessTokens;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[9]/a")
    public WebElement SubformTokens;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[10]/a")
    public WebElement TaskTokens;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[11]/a")
    public WebElement MapFieldTokens;

    @FindBy (xpath = "//*[@id='AF-Form-2fecdd17-ab4a-43ea-8e99-6ad3c39a14c8']/section[1]/ul/li[12]/a")
    public WebElement CtaOthers;



    public void tokensBtn() throws Throwable {
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("MyServices")));
        CtaTokens.click();          }

    public void tokenLists(){
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        TokensDashboard.isDisplayed();     }

    public void nextBtn(){                   Ctanext.click();  }
    public void assignmentColumn(){           AssignmentTokens.isDisplayed(); }
    public void nextbtn(){                    NextBtn.click();      }
    public void caseColumn(){                 CaseTokens.isDisplayed(); }
    public void citizenColumn(){              CitizenAndCSATokens.isDisplayed();    }
    public void dateTimeColumn(){              DateTimeToken.isDisplayed();   }
    public void escalationColumn(){             EscalationToken.isDisplayed();    }
    public void formColumn(){                   FormTokens.isDisplayed();    }
    public void processColumn(){                ProcessTokens.isDisplayed(); }
    public void subformColumn(){                SubformTokens.isDisplayed();  }
    public void taskColumn(){                   TaskTokens.isDisplayed();      }
    public void mapColumn(){                    MapFieldTokens.isDisplayed();   }
    public void othersColumn(){                 CtaOthers.isDisplayed();     }




}
