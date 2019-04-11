package com.SelfTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FAMDatabaseTestPO {

    private WebDriver driver;

    //To initialise web elements
    public FAMDatabaseTestPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (xpath = "//*[text()='Database Integration Test']")
    public WebElement CtaDatabaseIntegration;

    @FindBy (xpath = "//*[@id=\"page\"]/section/header/h1/span")
    public WebElement DatabaseIntegrationPage;

    @FindBy (id = "select1")
    public WebElement Select1Field;

    @FindBy (className = "lookup-option")
    public WebElement CtaTest;

    @FindBy (id = "text1")
    public WebElement Email;

    @FindBy (className = "nextbutton")
    public WebElement Next;

    @FindBy (className = "sectionNameTab ")
    public WebElement ReadOnlySubformColumn;

    @FindBy (xpath = "//*[@id=\"AF-Form-2193724e-7b47-44d7-bf73-03c8b98b7033\"]/div/div/button[3]")
    public WebElement CtaNext;

    @FindBy (xpath = "//*[@id=\"AF-Form-2193724e-7b47-44d7-bf73-03c8b98b7033\"]/section[1]/ul/li[3]/a")
    public WebElement CtaAddAEntry;

    @FindBy (id = "LastNameadd")
    public WebElement EnterName;

    @FindBy (id = "FirstNameadd")
    public WebElement FirstName;

    @FindBy(id = "emailadd")
    public WebElement EnterEmail;

    @FindBy (css = "#AF-Form-2193724e-7b47-44d7-bf73-03c8b98b7033 > div > div > button.btn.btn-af.submitbutton.pull-right")
    public WebElement Submit;

    @FindBy (xpath = "//*[@id=\"page\"]/section/section/div/div[1]/p[2]")
    public WebElement SubmissionPage;




    public void databaseIntegrationBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(CtaDatabaseIntegration));

        CtaDatabaseIntegration.click();                         }

    public void dataIntegrationPage(){           DatabaseIntegrationPage.isDisplayed();                     }

    public void enterText(){                     Select1Field.click();                                     }

    public void testBtn(){                       CtaTest.click();                                       }

    public void enterEmail(){                    Email.sendKeys("support@firmstep.com");}

    public void nextBtn(){                       Next.click();                                        }

    public void readOnlySubform(){               ReadOnlySubformColumn.isDisplayed();                      }

    public void nextLink(){                      CtaNext.click();                                      }

    public void enterData(){                     CtaAddAEntry.isDisplayed();                             }

    public void textField(){                     EnterName.sendKeys("Dan");                 }

    public void nameField(){                     FirstName.sendKeys("David");           }

    public void email(){                         EnterEmail.sendKeys("test@example.com");    }

    public void submitBtn(){                     Submit.click();                                   }

    public void successPage(){                   SubmissionPage.isDisplayed();                }


}
