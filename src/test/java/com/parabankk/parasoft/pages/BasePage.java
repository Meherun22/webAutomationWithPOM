package com.parabankk.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BasePage extends Page {//normal class abstract class k extendn korlo tai body likhte hobe
    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageTitle() {
        return driver.getTitle();
    }

    @Override
    public WebElement getWebElement(By locator) {
        WebElement webElement =null;
        try {
            waitForWebElement(locator);//element ta paise kina setar jonno wait korbe
            webElement= driver.findElement(locator);
        }catch (Exception exception){
            System.out.println(locator.toString()+ "Selector or locator not found");
        }
       return webElement;
    }

    @Override
    public List<WebElement> getWebElements(By selector) {
        List<WebElement> webElements = null;
        try {
            waitForWebElement(selector);
            webElements =driver.findElements(selector);
        }catch (Exception exception){
            System.out.println(selector.toString()+ "Selector or locator not found");
        }
        return webElements;
    }

    @Override
    public void waitForWebElement(By locator) {

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        }catch (Exception exception){
            System.out.println(locator.toString()+ "Selector or locator not found");
        }



    }





}
