package com.mavenit.cucumber.PageObject;

import com.mavenit.cucumber.Driver.DriverManager;
import org.openqa.selenium.By;


public class trolleyPage extends DriverManager {

    public void addToTrolley() {
        driver.findElement(By.cssSelector("button[data-test='component-att-button']")).click();
    }
    public void goToTrolley(){
        driver.findElement(By.cssSelector("a[data-test='component-att-button-basket']")).click();
    }

    public String getProductInTrolley() {
     return driver.findElement(By.cssSelector(".ProductCard__content__9U9b1.xsHidden.lgFlex")).getText();
    }
    public void addQuantity(){
        driver.findElement(By.cssSelector("select[data-e2e='product-quantity'] option[value='2']")).click();
    }
    public String GetQuantityInTrolley(){
        return driver.findElement(By.cssSelector("select[data-e2e='product-quantity']")).getText();
    }
    public void continueShopping(){
        driver.findElement(By.cssSelector("button[data-test='component-att-button-continue']")).click();
    }
    public Integer trolleySize(){
        return Integer.valueOf(driver.findElement(By.cssSelector(".LQbCV")).getText());
    }
}


