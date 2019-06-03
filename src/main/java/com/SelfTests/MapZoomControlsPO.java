package com.SelfTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class MapZoomControlsPO {
    ResourceBundle config;
    private WebDriver driver;

    //To initialise web elements
    public MapZoomControlsPO(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
        config= ResourceBundle.getBundle("ConFig");
    }


    //Define element locator
    @FindBy (xpath = "//img[@src='https://b.tile.openstreetmap.org/12/2050/1362.png']")
    private WebElement ZoomIn;

    @FindBy (xpath = "//img[@src='https://c.tile.openstreetmap.org/16/32790/21794.png']")
    private WebElement ZoomOut;




    public void mapZoomPage(String MapZoom) throws Throwable{
        Thread.sleep(1000);
        driver.navigate().to(config.getString("MapZoom"));
        Thread.sleep(2000);
    }
    public void enlarge () throws Throwable{
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.id("fillform-frame-1")));

        ZoomIn.click();
    }
    public void reduced () throws Throwable {
        Thread.sleep(1000);
        ZoomOut.click();
    }

}
