package com.mavenit.cucumber.PageObject;

import com.mavenit.cucumber.Driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountPage extends DriverManager {
@FindBy (css = "select[data-bdd-test-id='titleInput'] option[value]")
private List<WebElement> titleWebElements;

    public void clickRegister() {
        driver.findElement(By.cssSelector("a[data-bdd-test-id='registerButton']")).click();
    }

    public void enterEmail(String email) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[data-bdd-test-id='emailAddressInputField']")).sendKeys(email);
    }
    public void clickEmailSubmit() throws InterruptedException {
        driver.findElement(By.cssSelector("button[data-bdd-test-id='yourEmailSubmitButton']")).click();
        Thread.sleep(4000);
    }
    public void title(String title) {
        for (WebElement titleOption : titleWebElements) {
            String availableTitle = titleOption.getText();
            if (availableTitle.equalsIgnoreCase(title)) {
                titleOption.click();
                break;
            }
        }
    }
    public void firstName(String firstName){
        driver.findElement(By.cssSelector("#first-name")).sendKeys(firstName);
    }
    public void lastName(String lastName){
        driver.findElement(By.cssSelector("#last-name")).sendKeys(lastName);
    }
    public void postcode(String postcode){
        driver.findElement(By.cssSelector("#postcode")).sendKeys(postcode);
    }
    public void saveAndContinue(){
        driver.findElement(By.cssSelector("button[data-bdd-test-id='submitPersonalDetailsButton']")).click();
    }
    public void enterNewPassword(String password){
        driver.findElement(By.cssSelector("#new-password")).sendKeys(password);
    }
    public void retypeNewPassword(String password){
        driver.findElement(By.cssSelector("retype-new-password")).sendKeys(password);
    }
    public void welcomeMessage(){
        System.out.println( driver.findElement(By.cssSelector("data-bdd-test-id=\"welcomeMessage\"")).getText());
    }
    public void enterPassword(String password){
        driver.findElement(By.cssSelector("#current-password")).sendKeys(password);
    }
    public void signInSecurely(){
        driver.findElement(By.cssSelector("button[data-bdd-test-id='yourEmailSubmitButton']")).click();
    }
    public void errorMessage(){
        System.out.println(driver.findElement(By.cssSelector(".alert__message")).getText());
    }
    public String getWelcomeName(){
       return driver.findElement(By.cssSelector("._2WxI4")).getText();
    }
}
