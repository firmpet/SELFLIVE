package com.SelfTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamSelfCalculationsPO {

    private WebDriver driver;

    //To initialise web elements
    public FamSelfCalculationsPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (xpath = "//*[@id=\"app-content\"]/div[1]/div/h1")
    public WebElement Dashboard;

    @FindBy (linkText = "Calculations Process")
    public WebElement CalculationsProcess_click;

    @FindBy(xpath = "//*[@id=\"page\"]/section/header/h1/span")
    public WebElement CalculationsForm;

    @FindBy (id = "comma")
    public  WebElement ContainsField;

    @FindBy (xpath = "//*[@id=\"AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417\"]/section[2]/section/div[2]/div/span/div")
    public WebElement PageTitle;

    @FindBy (id = "tree")
    public WebElement TreeDropdownField;

    @FindBy (id = "tree")
    public WebElement TreeDropdownField_click;

    @FindBy (id = "bench")
    public WebElement BenchDropdownField;

    @FindBy (id = "bench")
    public WebElement BenchDropdownField_click;

    @FindBy (id = "lamppost")
    public WebElement LamppostField;

    @FindBy (id = "lamppost")
    public WebElement LamppostField_click;

    @FindBy (xpath = "//*[@id=\"AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417\"]/section[1]/ul/li[3]")
    public WebElement StringManipulationColumn;

    @FindBy (css = "#AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417 > div > div > button.btn.btn-af.nextbutton.pull-right")
    public WebElement Next_click;

    @FindBy (xpath = "//*[@id=\"AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417\"]/section[1]/ul/li[4]")
    public WebElement SubformsColumn;

    @FindBy(linkText = "Add Record")
    public WebElement AddRecord;

    @FindBy (id = "amountToBeSummed")
    public WebElement AmountField;

    @FindBy (css = "#AF-Form-14e5cfb1-979c-45d8-90e2-4dd38d6a2b0c > div > div > button.btn.btn-af.submitbutton.pull-right")
    public WebElement ClickAddRecord;

    @FindBy (xpath = "//*[@id=\"AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417\"]/section[2]/section/div[2]/div/div[1]/table/tbody/tr/td[2]")
    public WebElement TotalSum;

    @FindBy (className = "submitbutton")
    public WebElement Submit;

    @FindBy (xpath = "//*[@id=\"page\"]/section/section/div/div[1]/p[2]")
    public WebElement SubmissionSuccessfulPage;


    public void Dashboard(){                             Dashboard.isDisplayed();                }

    public void CalculationsProcess_click(){             CalculationsProcess_click.click();      }

    public void CalculationsForm(){                      CalculationsForm.isDisplayed();         }

    public void ContainsField(){                         ContainsField.sendKeys("Footpath,Park,Road,Cycle Track");}

    public void PageTitle(){                             PageTitle.isDisplayed();      }

    public void TreeDropdownField(){                     TreeDropdownField.click();       }

    public void TreeDropdownField_click(){               TreeDropdownField_click.sendKeys("Yes");    }

    public void BenchDropdownField(){                    BenchDropdownField.click();      }

    public void BenchDropdownField_click(){              BenchDropdownField_click.sendKeys("Yes");  }

    public void LamppostField(){                         LamppostField.click();                }

    public void LamppostField_click(){                   LamppostField_click.sendKeys("Yes");}

    public void StringManipulationColumn(){              StringManipulationColumn.isDisplayed();    }

    public void Next_click(){                            Next_click.click();      }

    public void SubformsColumn(){                        SubformsColumn.isDisplayed();    }

    public void AddRecord(){                             AddRecord.click();       }

    public void AmountField(){                           AmountField.sendKeys("50");    }

    public void ClickAddRecord(){                        ClickAddRecord.click();    }

    public void TotalSum(){                              TotalSum.isDisplayed();        }

    public void Submit(){                                Submit.click();     }

    public void SubmissionSuccessfulPage(){              SubmissionSuccessfulPage.isDisplayed();   }



}
