package com.mavenit.cucumber.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    public DriverManager() {
        PageFactory.initElements(driver, this);
    }

    public static WebDriver driver;
    private String browser = "";

    public void openBrowser() {
        switch (browser) {
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            // case "chrome":
            //   WebDriverManager.chromedriver().setup();
            // driver = new ChromeDriver();
            //break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:

                // try {
                //   remoteRun();
                //} catch (MalformedURLException e) {
                //   e.printStackTrace();
                //}

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            //  WebDriverManager.firefoxdriver().setup();
            //driver = new FirefoxDriver();
            //break;
        }
    }

    public void remoteRun() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        driver = new RemoteWebDriver(new URL("http://localhost:7777/grid/console/wd/hub"), cap);
    }

    public void maxBrowser() {
        driver.manage().window().maximize();
    }

    public void navigateTo(String Url) {
        driver.get(Url);
    }

    public void applyImplicitWait() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        driver.quit();
    }
}