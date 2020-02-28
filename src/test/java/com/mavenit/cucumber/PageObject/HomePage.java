package com.mavenit.cucumber.PageObject;

import com.mavenit.cucumber.Driver.DriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {
    @FindBy(css = "input[data-test='search-input']")
    private WebElement SearchBox;

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void doSearch(String item) {
        SearchBox.sendKeys(item);
        SearchBox.sendKeys(Keys.ENTER);
    }
}
