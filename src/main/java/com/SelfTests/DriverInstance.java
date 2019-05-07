package com.SelfTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class DriverInstance {
    public static WebDriver driver;



    //This will open the browser
    public void openBrowser() {
        ResourceBundle conFig = ResourceBundle.getBundle("conFig");
        //Check if parameter passed as 'Chrome'
        if (conFig.getString("browser").equalsIgnoreCase("Chrome")) {
            //set path to Chrome.exe
            System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
            //create Chrome instance
            driver = new ChromeDriver();

            //Check if parameter passed as 'Firefox'
        } else if (conFig.getString("browser").equalsIgnoreCase("Firefox")) {
            //set path to Firefox.exe
            System.setProperty("webdriver.gecko.driver", "src/Drivers/geckodriver.exe");
            //create Firefox instance
            driver = new FirefoxDriver();
        }
        //Check if parameter passed as 'Edge'
        else if(conFig.getString("browser").equalsIgnoreCase("Edge")){
            //set path to Edge.exe
            System.setProperty("webdriver.edge.driver", "src/Drivers/MicrosoftWebDriver.exe");
            //create Edge instance
            driver = new EdgeDriver();
        }
        //Check if parameter passed as 'IE'
        else if(conFig.getString("browser").equalsIgnoreCase("Edge")){
            //set path to IE.exe
            System.setProperty("webdriver.ie.driver", "src/Drivers/IEDriverServer.exe");
            //create IE instance
            driver = new InternetExplorerDriver();
        }
        else {

            System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
            driver = new ChromeDriver();            //Comment to run chrome headless

//            System.setProperty("webdriver.ie.driver", "src/Drivers/IEDriverServer.exe");
//            driver = new InternetExplorerDriver();

//            System.setProperty("webdriver.gecko.driver", "src/Drivers/geckodriver.exe");
//            driver = new FirefoxDriver();

//            System.setProperty("webdriver.edge.driver", "src/Drivers/MicrosoftWebDriver.exe");
//            driver = new EdgeDriver();

            //############## Uncomment to run chrome headless ###################

            /*
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            options.addArguments("window-size=1200x600");
            driver = new ChromeDriver(options);

             */


        }

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("start-maximized");
        capabilities.setCapability(ChromeOptions.CAPABILITY, opts);


        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(conFig.getString("URL"));
        driver.manage().window().maximize();

        //Sign In
//        driver.findElement(By.id("loginLink")).click();
//        driver.findElement(By.xpath("/html/body/div/div/div/div/div[4]/a")).click();
//        driver.findElement(By.linkText("Services")).click();

    }

    //This will close the browser
    public void closeBrowser() {

        driver.quit();
    }
}
