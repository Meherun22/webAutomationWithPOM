package com.parabankk.parasoft.pages;

import com.parabankk.parasoft.util.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.util.List;

public abstract class Page { // mother page of all pages and it should be abstract //


    WebDriver driver;
    WebDriverWait wait;//explicit wait

    public Page(WebDriver driver){// constructor and method is write only , setter
        this.driver=driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(General.WAIT_TIME));

    }

    public  abstract  String getPageTitle();

    public  abstract WebElement getWebElement(By locator);// for all actions

    public abstract List<WebElement> getWebElements(By selector);

    public <T extends  BasePage>  T getInstance(Class<T> tClass){
        try {
            return  tClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);//jei class pathabo tar webdriver instance create kore
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }


    public abstract void waitForWebElement(By locator);
}
