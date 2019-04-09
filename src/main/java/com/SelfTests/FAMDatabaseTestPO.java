package com.SelfTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FAMDatabaseTestPO {

    private WebDriver driver;

    //To initialise web elements
    public FAMDatabaseTestPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (linkText = "Database Integration Test")
    public WebElement ClickDatabaseIntegration;

    @FindBy (xpath = "//*[@id=\"page\"]/section/header/h1/span")
    public WebElement DatabaseIntegrationPage;

    @FindBy (id = "select1")
    public WebElement Select1_click;

    @FindBy (className = "lookup-option")
    public WebElement Test_click;

    @FindBy (id = "text1")
    public WebElement Email_input;

    @FindBy (className = "nextbutton")
    public WebElement Next_click;

    @FindBy (className = "sectionNameTab ")
    public WebElement ReadOnlySubformPage;

    @FindBy (xpath = "//*[@id=\"AF-Form-2193724e-7b47-44d7-bf73-03c8b98b7033\"]/div/div/button[3]")
    public WebElement Next1_click;

    @FindBy (xpath = "//*[@id=\"AF-Form-2193724e-7b47-44d7-bf73-03c8b98b7033\"]/section[1]/ul/li[3]/a")
    public WebElement AddAEntryPage;

    @FindBy (id = "LastNameadd")
    public WebElement EnterText1;

    @FindBy (id = "FirstNameadd")
    public WebElement EnterFirstName;

    @FindBy(id = "emailadd")
    public WebElement EnterEmail;

    @FindBy (css = "#AF-Form-2193724e-7b47-44d7-bf73-03c8b98b7033 > div > div > button.btn.btn-af.submitbutton.pull-right")
    public WebElement Submit_click;

    @FindBy (xpath = "//*[@id=\"page\"]/section/section/div/div[1]/p[2]")
    public WebElement SubmissionSuccessfulPage;




    public void ClickDatabaseIntegration(){        ClickDatabaseIntegration.click();                         }

    public void DatabaseIntegrationPage(){         DatabaseIntegrationPage.isDisplayed();                     }

    public void Select1_click(){                   Select1_click.click();                                     }

    public void Test_click(){                      Test_click.click();                                       }

    public void Email_input(){                     Email_input.sendKeys("support@firmstep.com");}

    public void Next_click(){                      Next_click.click();                                        }

    public void ReadOnlySubformPage(){             ReadOnlySubformPage.isDisplayed();                      }

    public void Next1_click(){                     Next1_click.click();                                      }

    public void AddAEntryPage(){                   AddAEntryPage.isDisplayed();                             }

    public void EnterText1(){                      EnterText1.sendKeys("Dan");                 }

    public void EnterFirstName(){                  EnterFirstName.sendKeys("David");           }

    public void EnterEmail(){                      EnterEmail.sendKeys("test@example.com");    }

    public void Submit_click(){                    Submit_click.click();                                   }

    public void SubmissionSuccessfulPage(){        SubmissionSuccessfulPage.isDisplayed();                }


}
