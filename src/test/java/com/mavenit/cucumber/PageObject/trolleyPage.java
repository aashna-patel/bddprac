package com.mavenit.cucumber.PageObject;

import com.mavenit.cucumber.Driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class trolleyPage extends DriverManager {
    @FindBy (css = "a[data-e2e=\"product-name\"]")
    private List<WebElement> trolleySelection;

    public void addToTrolley() {
        driver.findElement(By.cssSelector("button[data-test='component-att-button']")).sendKeys(Keys.ENTER);
    }

    public void goToTrolley() {
        driver.findElement(By.cssSelector("a[data-test='component-att-button-basket']")).click();
    }

    public String getProductInTrolley() {
        return driver.findElement(By.cssSelector(".ProductCard__content__9U9b1.xsHidden.lgFlex")).getText();
    }

    public void addQuantity(String expected) {
        driver.findElement(By.cssSelector("select[data-e2e='product-quantity']")).sendKeys(expected);
    }

    public String getQuantityInTrolley() {
        return driver.findElement(By.cssSelector("select[data-e2e='product-quantity']")).getText();
    }

    public void continueShopping() {
        driver.findElement(By.cssSelector("button[data-test='component-att-button-continue']")).click();
    }

    public Integer trolleySize() {
        return Integer.valueOf(driver.findElement(By.cssSelector(".LQbCV")).getText());
    }

    public String productList() {
        return driver.findElement(By.cssSelector(".product-list-container")).getText();
    }

    public void enterPostcode(String expected) {
        driver.findElement(By.cssSelector(".lg-5--none [placeholder=\"Enter postcode or town\"]")).sendKeys(expected);
    }

    public void clickCollection() {
        driver.findElement(By.cssSelector(".lg-5--none [placeholder='Enter postcode or town']")).sendKeys(Keys.ENTER);
    }

    public void selectStore() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> reserve = driver.findElements(By.cssSelector("button[data-el^='store-selector-result__select-store-button--']"));
        reserve.get(0).click();
    }

    public void clickContinueWithCollection() {
        driver.findElement(By.cssSelector(".FulfilmentConfirmationForm__extendedText__2t8LV")).click();
    }

    public void payInStore() {
        driver.findElement(By.cssSelector("a[data-test='pay-in-store-button']")).click();
    }

    public void checkAvailability(String postcode) {
        driver.findElement(By.cssSelector(".lg-5--none [placeholder='Enter postcode or town']")).sendKeys(postcode);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public List<String> getTrolleyList(){
        List <String> trolleyList = new ArrayList<>();
        for (WebElement trolley: trolleySelection){
            String trolleyName = trolley.getText();
            trolleyList.add(trolleyName);
        }
        return trolleyList;
    }
}
//.lg-5--none [placeholder="Enter postcode or town"] for enter postcode