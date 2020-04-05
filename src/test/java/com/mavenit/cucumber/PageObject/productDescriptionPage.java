package com.mavenit.cucumber.PageObject;

import com.mavenit.cucumber.Driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class productDescriptionPage extends DriverManager {
    @FindBy(css = "input[name='searchTerm']")
    private WebElement searchItem;

    public void increaseQuantity(String expected) {
        driver.findElement(By.cssSelector("#add-to-trolley-quantity")).sendKeys(expected);
    }
    public void searchAnotherTerm(String item){
        searchItem.sendKeys(item);
        searchItem.sendKeys(Keys.ENTER);
    }
}