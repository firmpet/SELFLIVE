package com.SelfTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class MyRequestsStageLoopbackPO {
    ResourceBundle config;

    private WebDriver driver;

    //To initialise web elements
    public MyRequestsStageLoopbackPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config=ResourceBundle.getBundle("ConFig");
    }

    //Define element locator
    //@FindBy (xpath = "")



    public void stageLoop(String LoopbackURL){
        driver.navigate().to(config.getString(LoopbackURL));

        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));
    }
}
