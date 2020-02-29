package com.mavenit.cucumber.PageObject;

import com.mavenit.cucumber.Driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ResultsPage extends DriverManager {
    @FindBy(css = ".findability-facet__rating-label")
    private List<WebElement> ratingWebElements;

    @FindBy(css = "div[data-test='component-ratings']")
    private List<WebElement> ratingStars;

    @FindBy(css = ".findability-facet__filter-text")
    private List<WebElement> filterWebElements;

    @FindBy(css = "a[data-test='component-product-card-title']")
    private List<WebElement> categorySelection;

    @FindBy(css = ".Checkboxstyles__LabelValue-e3lxpy-6.fOQrQk")
    //css= "label[data-test^='filter-type']")
    private List<WebElement> typeWebElements;

    @FindBy(css = "a[data-test='component-product-card-title']")
    private List<WebElement> typeSelection;

    @FindBy(css = ".Checkboxstyles__LabelValue-e3lxpy-6.fOQrQk")
    private List<WebElement> capacityWebElements;

    @FindBy(css = "a[data-test='component-product-card-title']")
    private List<WebElement> capacitySelection;

    @FindBy(css = ".Checkboxstyles__LabelValue-e3lxpy-6.fOQrQk")
    private List<WebElement> priceWebElements;

    @FindBy(css = ".ProductCardstyles__PriceText-l8f8q8-14.gHrEdF")
    private List<WebElement> priceSelection;

    public void selectFilter(String filterOption) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector(".findability-facet__rating-label"), 5));
        for (WebElement review : ratingWebElements) {
            String availableFilter = review.getText();
            if (availableFilter.equalsIgnoreCase(filterOption)) {
                review.click();
                break;
            }
        }
    }

    public List<Double> getProductRating() {
        List<Double> ratingList = new ArrayList<>();
        for (WebElement rating : ratingStars) {
            String ratingInString = rating.getAttribute("data-star-rating");
            double ratingInDouble = Double.parseDouble(ratingInString);
            ratingList.add(ratingInDouble);
        }
        return ratingList;
    }

    public void selectCategoryFilter(String categoryOption) {
        driver.findElement(By.cssSelector("div[data-facet='category']>.Accordionstyles__ButtonLink-pegw6j-3.bRQRVq")).click();
        for (WebElement categoryFilter : filterWebElements) {
            String availableCategory = categoryFilter.getText();
            if (availableCategory.equalsIgnoreCase(categoryOption)) {
                categoryFilter.click();
                break;
            }
        }
    }

    public List<String> getCategoryFilter() {
        List<String> categoryList = new ArrayList<>();
        for (WebElement category : categorySelection) {
            String categoryName = category.getText();
            categoryList.add(categoryName);
        }
        return categoryList;
    }

    public void selectTypeFilter(String typeOption) {
        driver.findElement(By.cssSelector("div[data-facet='type']>.Accordionstyles__ButtonLink-pegw6j-3.bRQRVq")).click();
        for (WebElement typeFilter : typeWebElements) {
            String availableTypes = typeFilter.getText();
            if (availableTypes.equalsIgnoreCase(typeOption)) {
                typeFilter.click();
                break;
            }
        }
    }

    public List<String> getTypeFilter() {
        List<String> typeList = new ArrayList<>();
        for (WebElement type : typeSelection) {
            String typeName = type.getText();
            typeList.add(typeName);
        }
        return typeList;
    }

    public void selectCapacityFilter(String capacityOption) {
        driver.findElement(By.cssSelector("div[data-facet='backpack capacity (l)']>.Accordionstyles__ButtonLink-pegw6j-3.bRQRVq")).click();
        for (WebElement capacityFilter : capacityWebElements) {
            String availableCapacity = capacityFilter.getText();
            if (availableCapacity.equalsIgnoreCase(capacityOption)) {
                capacityFilter.click();
                break;
            }
        }
    }

    public List<String> getCapacityFilter() {
        List<String> capacityList = new ArrayList<>();
        for (WebElement capacity : capacitySelection) {
            String capacityName = capacity.getText();
            capacityList.add(capacityName);
        }
        return capacityList;
    }

    public void selectPriceFilter(String priceOption) {
     //   driver.findElement(By.cssSelector("div[data-facet='price']>.Accordionstyles__ButtonLink-pegw6j-3.bRQRVq")).click();
        for (WebElement price : priceWebElements) {
            String availableFilter = price.getText();
            if (availableFilter.equalsIgnoreCase(priceOption)) {
                price.click();
                break;
            }
        }
    }

    public List<String> getPriceFilter() {
        List<String> priceList = new ArrayList<>();
        for (WebElement price : priceSelection) {
            String priceTag = price.getText();
            priceList.add(priceTag);
        }
        return priceList;
    }

    public void selectTwoFilters(String type, String price) {
        selectTypeFilter(type);
        selectPriceFilter(price);
    }
    public String TwoFilters(){
       return driver.findElement(By.cssSelector(".applied-filters__header.findability-facet__header")).getText();
    }

}

