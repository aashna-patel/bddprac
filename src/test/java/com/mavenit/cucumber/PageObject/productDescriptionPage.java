package com.mavenit.cucumber.PageObject;

import com.mavenit.cucumber.Driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class productDescriptionPage extends DriverManager {
    public void increaseQuantity(String expected) {
        driver.findElement(By.cssSelector("#add-to-trolley-quantity")).sendKeys(expected);
    }
}