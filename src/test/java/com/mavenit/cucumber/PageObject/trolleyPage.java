package com.mavenit.cucumber.PageObject;

import com.mavenit.cucumber.Driver.DriverManager;
import org.openqa.selenium.By;


public class trolleyPage extends DriverManager {

    public void addToTrolley() {
        driver.findElement(By.cssSelector("button[data-test='component-att-button']")).click();
        driver.findElement(By.cssSelector("a[data-test='component-att-button-basket']")).click();
    }

    public String getProductInTrolley() {
     return driver.findElement(By.cssSelector(".ProductCard__content__9U9b1.xsHidden.lgFlex")).getText();
    }
}


