package com.SelfTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FamSelfDatabasePO {

    private WebDriver driver;

    //To initialise web elements
    public FamSelfDatabasePO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy (id = "select1")
    public WebElement DropdownField;

    @FindBy (id = "select1")
    public WebElement InputField;

    @FindBy (id = "text1")
    public WebElement Field;

    @FindBy (id = "text1")
    public WebElement Email;

    @FindBy (id = "LastNameadd")
    public WebElement LastName;

    @FindBy (id = "FirstNameadd")
    public WebElement FirstName;

    @FindBy (id = "emailadd")
    public WebElement InputEmail;


    public void optionsField() throws Throwable{
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(DropdownField));
        DropdownField.click();                    }

    public void insertText()                      {    InputField.sendKeys("test");}

    public void clear(){                          Field.clear();         }

    public void insertEmail(){                    Email.sendKeys("support@example.com");}

    public void lName(){                          LastName.sendKeys("David");}

    public void fName(){                          FirstName.sendKeys("Daniel");}

    public void emailField(){                     InputEmail.sendKeys("test@example.com");}
}
