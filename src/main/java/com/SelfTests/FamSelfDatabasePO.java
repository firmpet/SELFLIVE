package com.SelfTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    public WebElement Test_Select;

    @FindBy (id = "text1")
    public WebElement Clear_Field;

    @FindBy (id = "text1")
    public WebElement EnterEmail;

    @FindBy (id = "LastNameadd")
    public WebElement LastName;

    @FindBy (id = "FirstNameadd")
    public WebElement FirstName;

    @FindBy (id = "emailadd")
    public WebElement Email;


    public void DropdownField(){                        DropdownField.click();                    }

    public void Test_Select(){                          Test_Select.sendKeys("test");}

    public void Clear_Field(){                          Clear_Field.clear();         }

    public void EnterEmail(){                           EnterEmail.sendKeys("support@example.com");}

    public void LastName(){                             LastName.sendKeys("David");}

    public void FirstName(){                            FirstName.sendKeys("Daniel");}

    public void Email(){                                Email.sendKeys("test@example.com");}
}
