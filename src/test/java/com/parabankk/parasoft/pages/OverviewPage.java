package com.parabankk.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends  BasePage {
    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    public  boolean isLogout(){
        return getWebElements(By.linkText("Log Out")).size()>0;//elements use korar karon holo kono risk nei

    }
}
