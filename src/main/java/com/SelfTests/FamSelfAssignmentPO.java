package com.SelfTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamSelfAssignmentPO {

    private WebDriver driver;

    //To initialise web elements
    public FamSelfAssignmentPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (linkText = "Dashboard and Assignment Process")
    public WebElement CtaDashboardAndAssignmentProcess;

    @FindBy (className = "_formName")
    public WebElement FormPage;

    @FindBy (id = "summary_show")
    public WebElement SummaryField1;

    @FindBy (id = "summary_show")
    public WebElement SummaryField;

    @FindBy (id = "select1")
    public WebElement SpecificUserField;

    @FindBy (id = "select1")
    public WebElement EnterUserEmail;

    @FindBy (id = "assignToSpecificG")
    public WebElement SpecificGroup;

    @FindBy (id = "assignToSpecificG")
    public WebElement SpecificGroupField;

    @FindBy (className = "btn btn-af submitbutton pull-right")
    public WebElement Submit_click;

    @FindBy (xpath = "//*[@id=\"page\"]/section/section/div/div[1]/p[2]")
    public WebElement SuccessfulSubmissionPage;





    public void CtaDashboardAndAssignmentProcess(){                CtaDashboardAndAssignmentProcess.click();     }

    public void FormPage(){                                        FormPage.isDisplayed();                  }

    public void SummaryField1(){                                   SummaryField1.clear();                   }

    public void SummaryField(){                                    SummaryField.sendKeys("Summary Test 2019-04-08");}

    public void SpecificUserField(){                               SpecificUserField.click();        }

    public void EnterUserEmail(){                                  EnterUserEmail.sendKeys("petermalt@firmstep.com");}

    public void SpecificGroup(){                                   SpecificGroup.click();         }

    public void SpecificGroupField(){                              SpecificGroupField.sendKeys("CSA");}

    public void Submit_click(){                                    Submit_click.click();     }

    public void SuccessfulSubmissionPage(){                        SuccessfulSubmissionPage.isDisplayed(); }




}
