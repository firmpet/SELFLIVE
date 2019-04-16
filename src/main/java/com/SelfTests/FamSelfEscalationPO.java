package com.SelfTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FamSelfEscalationPO {
    private WebDriver driver;

    //To initialise web elements
    public FamSelfEscalationPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
}
