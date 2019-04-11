package com.SelfTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FamSelfCalculationsPO {

    private WebDriver driver;

    //To initialise web elements
    public FamSelfCalculationsPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (linkText = "//*[text()='Calculations Process']")
    public WebElement CtaCalculationsProcess;

    @FindBy(xpath = "//*[@id=\"page\"]/section/header/h1/span")
    public WebElement CalculationsForm;

    @FindBy (id = "comma")
    public  WebElement InputField;

    @FindBy (xpath = "//*[@id=\"AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417\"]/section[2]/section/div[2]/div/span/div")
    public WebElement Title;

    @FindBy (id = "tree")
    public WebElement TreeField;

    @FindBy (id = "tree")
    public WebElement TreeDropdownField;

    @FindBy (id = "bench")
    public WebElement BenchField;

    @FindBy (id = "bench")
    public WebElement BenchDropdownField;

    @FindBy (id = "lamppost")
    public WebElement LamppostField;

    @FindBy (id = "lamppost")
    public WebElement LamppostDropdownField;

    @FindBy (linkText = "Next")
    public WebElement BtnNext;

    @FindBy (xpath = "//*[@id=\"AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417\"]/section[1]/ul/li[3]")
    public WebElement StringManipulationColumn;

    @FindBy (css = "#AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417 > div > div > button.btn.btn-af.nextbutton.pull-right")
    public WebElement CtaNext;

    @FindBy (xpath = "//*[@id=\"AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417\"]/section[1]/ul/li[4]")
    public WebElement SubformsColumn;

    @FindBy(linkText = "Add Record")
    public WebElement AddRecord;

    @FindBy (id = "amountToBeSummed")
    public WebElement AmountField;

    @FindBy (css = "#AF-Form-14e5cfb1-979c-45d8-90e2-4dd38d6a2b0c > div > div > button.btn.btn-af.submitbutton.pull-right")
    public WebElement CtaAddRecord;

    @FindBy (xpath = "//*[@id=\"AF-Form-03d61b5e-1366-4d86-ae3b-82548965e417\"]/section[2]/section/div[2]/div/div[1]/table/tbody/tr/td[2]")
    public WebElement TotalSum;

    @FindBy (className = "submitbutton")
    public WebElement CtaSubmit;

    @FindBy (xpath = "//*[@id=\"page\"]/section/section/div/div[1]/p[2]")
    public WebElement SuccessfulPage;


    public void calculationsProcessLink(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(CtaCalculationsProcess));

        CtaCalculationsProcess.click();      }

    public void calculationsColumn(){                  CalculationsForm.isDisplayed();         }

    public void insertText(){                          InputField.sendKeys("Footpath,Park,Road,Cycle Track");}

    public void pageTitle(){                           Title.isDisplayed();      }

    public void inputField(){                          TreeField.click();       }

    public void insertText1(){                         TreeDropdownField.sendKeys("Yes");    }

    public void inputField1(){                         BenchDropdownField.click();      }

    public void insertText2(){                         BenchField.sendKeys("Yes");  }

    public void inputField2(){                         LamppostField.click();                }

    public void insertText3(){                         LamppostDropdownField.sendKeys("Yes");}

    public void nextbtn(){                             BtnNext.click();            }

    public void stringManSection(){                    StringManipulationColumn.isDisplayed();    }

    public void nextBtn(){                             CtaNext.click();      }

    public void subforms(){                            SubformsColumn.isDisplayed();    }

    public void recordBtn(){                           AddRecord.click();       }

    public void textField(){                           AmountField.sendKeys("50");    }

    public void addRecordBtn(){                        CtaAddRecord.click();    }

    public void sum(){                                 TotalSum.isDisplayed();        }

    public void submitBtn(){                           CtaSubmit.click();     }

    public void submitPage(){                          SuccessfulPage.isDisplayed();   }



}
