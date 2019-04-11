package com.SelfTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPO {

    private WebDriver driver;

    //To initialise web elements
    public LoginPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
    @FindBy(id = "loginLink")
    public WebElement loginLink;

    @FindBy (xpath = "/html/body/div/div/div/div/div[4]/a")
    public WebElement trfButton;

    @FindBy (linkText = "Services")
    public WebElement servicesButton;

    //sign in
    public void Login(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(loginLink));
        loginLink.click();
        wait.until(ExpectedConditions.elementToBeClickable(trfButton));
        trfButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(servicesButton));
       servicesButton.click();
    }
}
