package com.SelfTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyRequestDateCheckPO {

    private WebDriver driver;

    //To initialise web elements
    public MyRequestDateCheckPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Define element locator
}
