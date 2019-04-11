package com.SelfTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FamSelfAssignmentPO {

    private WebDriver driver;

    //To initialise web elements
    public FamSelfAssignmentPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (xpath = "//*[text()='Dashboard and Assignment Process']")
    public WebElement CtaDashboardAndAssignmentProcess;

    @FindBy (className = "_formName")
    public WebElement DashboardPage;

    @FindBy (id = "summary_show")
    public WebElement SummaryField1;

    @FindBy (id = "summary_show")
    public WebElement SummaryField;

    @FindBy (id = "select1")
    public WebElement SpecificUserField;

    @FindBy (id = "select1")
    public WebElement UserEmail;

    @FindBy (id = "assignToSpecificG")
    public WebElement SpecificGroup;

    @FindBy (id = "assignToSpecificG")
    public WebElement SpecificGroupField;

    @FindBy (className = "btn btn-af submitbutton pull-right")
    public WebElement CtaSubmit;

    @FindBy (xpath = "//*[@id=\"page\"]/section/section/div/div[1]/p[2]")
    public WebElement SuccessfulSubmission;





    public void dashboardAndAssignmentProcessLink(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(CtaDashboardAndAssignmentProcess));

        CtaDashboardAndAssignmentProcess.click();     }

    public void formPage(){                                      DashboardPage.isDisplayed();                  }

    public void clearField(){                                    SummaryField1.clear();                   }

    public void enterText(){                                     SummaryField.sendKeys("Summary Test 2019-04-08");}

    public void userField(){                                     SpecificUserField.click();        }

    public void enterEmail(){                                    UserEmail.sendKeys("petermalt@firmstep.com");}

    public void groupField(){                                    SpecificGroup.click();         }

    public void groupName(){                                     SpecificGroupField.sendKeys("CSA");}

    public void submitBtn(){                                     CtaSubmit.click();     }

    public void formSubmit(){                                    SuccessfulSubmission.isDisplayed(); }




}
