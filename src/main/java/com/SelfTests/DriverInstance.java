package com.SelfTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class DriverInstance {
    public static WebDriver driver;
    public static String targetBrowser;


    //This will open the browser
    public void openBrowser() {
        ResourceBundle conFig = ResourceBundle.getBundle("conFig");
        String  browserType = conFig.getString("browser");
        String headless = conFig.getString("headless");

        targetBrowser = System.getProperty("targetBrowser",browserType);


        //Check if parameter passed as 'Chrome'
        if (targetBrowser.equalsIgnoreCase("Chrome")) {
            //set path to Chrome.exe
            //System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();

            if(headless.equalsIgnoreCase("true")){

                chromeOptions.addArguments
                        ("--headless","--disable-gpu","window-size=1920,1200");
            }

            //create Chrome instance
            driver = new ChromeDriver(chromeOptions);

            //Check if parameter passed as 'Firefox'
        } else if (targetBrowser.equalsIgnoreCase("Firefox")) {
            //set path to Firefox.exe
            //System.setProperty("webdriver.gecko.driver", "src/Drivers/geckodriver.exe");
            WebDriverManager.firefoxdriver().setup();
            //create Firefox instance
            driver = new FirefoxDriver();
        }
        //Check if parameter passed as 'Edge'
        else if(targetBrowser.equalsIgnoreCase("Edge")){
            //set path to Edge.exe
            //System.setProperty("webdriver.edge.driver", "src/Drivers/MicrosoftWebDriver.exe");
            WebDriverManager.edgedriver().setup();
            //create Edge instance
            driver = new EdgeDriver();
        }
        //Check if parameter passed as 'IE'
        //else if(conFig.getString("browser").equalsIgnoreCase("IE")){
        else if(targetBrowser.equalsIgnoreCase("IE")){
            //set path to IE.exe
            //System.setProperty("webdriver.ie.driver", "src/Drivers/IEDriverServer.exe");
            WebDriverManager.iedriver().setup();
            //create IE instance
            driver = new InternetExplorerDriver();
        }
        else{

//            System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
////            driver = new ChromeDriver();            //Comment to run chrome headless

//            System.setProperty("webdriver.ie.driver", "src/Drivers/IEDriverServer.exe");
//            driver = new InternetExplorerDriver();

//            System.setProperty("webdriver.gecko.driver", "src/Drivers/geckodriver.exe");
//            driver = new FirefoxDriver();

//            System.setProperty("webdriver.edge.driver", "src/Drivers/MicrosoftWebDriver.exe");
//            driver = new EdgeDriver();


        }


        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
        capabilities.setCapability(InternetExplorerDriver.
                INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
        InternetExplorerOptions options = new InternetExplorerOptions();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);



        //DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("start-maximized");
        capabilities.setCapability(ChromeOptions.CAPABILITY, opts);


        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(conFig.getString("URL"));
        driver.manage().window().maximize();




    }

    //This will close the browser
    public void closeBrowser() {

        driver.quit();
    }
}
