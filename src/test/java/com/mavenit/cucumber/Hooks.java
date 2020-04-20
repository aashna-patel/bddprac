package com.mavenit.cucumber;

import com.mavenit.cucumber.Driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {

    DriverManager driverManager = new DriverManager();

    @Before
    public void setUp() {
        driverManager.openBrowser();
        driverManager.maxBrowser();
        driverManager.navigateTo("https://www.argos.co.uk/");
        driverManager.applyImplicitWait();
    }

    @After
    public void tearDown() {
        driverManager.closeBrowser();
    }
}