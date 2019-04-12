package com.SelfTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FamSelfTricksTestsPO {

    private WebDriver driver;

    //To initialise web elements
    public FamSelfTricksTestsPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (xpath = "//*span[text()='Useful Tricks Manual Test']")
    public WebElement CtaTricksManual;

    @FindBy (xpath = "//*[text()='Useful Tricks Forms']")
    public WebElement TricksPage;

    @FindBy (id = "text1")
    public WebElement Firstname;

    @FindBy (id = "text2")
    public WebElement Lastname;

    @FindBy (id = "selectdisplay")
    public WebElement SelectField;

    @FindBy (id = "selectdisplay")
    public WebElement InsertText;

    @FindBy (id = "text3")
    public WebElement NumberField;

    @FindBy (id = "text4")
    public WebElement NumbersField;

    @FindBy (id = "dateOfBirth")
    public WebElement DOBField;

    @FindBy (id = "thisFieldHasAVal")
    public WebElement PostCode;

    @FindBy (id = "iShowWhenTheAbov")
    public WebElement ValidateField;

    public void tricksManual (){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(CtaTricksManual));

        CtaTricksManual.click();}

        public void formPage(){                                TricksPage.isDisplayed(); }

        public void fName(){                                   Firstname.sendKeys("David");}

        public void lName(){                                   Lastname.sendKeys("Daniel");}

        public void dropdownField(){                           SelectField.click();}

        public void texts(){                                    InsertText.sendKeys("Yes");}

        public void digit(){                                   NumberField.sendKeys("2");}

        public void digits(){                                  NumbersField.sendKeys("3");}

        public void dob(){                                     DOBField.sendKeys("20112018");}

        public void postal(){                                  PostCode.sendKeys("EC2A 2DT");}

        public void verifier(){                                ValidateField.sendKeys("Validity");}

}
