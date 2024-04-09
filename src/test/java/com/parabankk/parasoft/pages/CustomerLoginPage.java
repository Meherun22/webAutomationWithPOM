package com.parabankk.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerLoginPage extends  BasePage {
    public CustomerLoginPage(WebDriver driver) {
        super(driver);
    }
    // input nibo testcases theke not page theke tai input ta method er parameter hisebe pass korte hoy
    public  CustomerLoginPage fillUsername(String username){//return type ei page hobe cz inpuut  near por page change hobe na
        getWebElement(By.cssSelector("input[name='username']")).sendKeys(username);
            return this;
    }
    public  CustomerLoginPage fillPassword(String password){
getWebElement(By.xpath("//input[@name='password']")).sendKeys(password);
        return this;
    }
    public  OverviewPage clickLoginBtn(){
        getWebElement(By.xpath("//input[@class='button']"));
        return getInstance(OverviewPage.class);
    }
}
