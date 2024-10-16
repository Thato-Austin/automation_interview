package com.incredible.pages;

import com.incredible.test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void clickMyAccount(){
        BaseTest.driver.findElement(By.xpath("//header/div/div/div[3]/div[@role='button']")).click();
    }

    public void clickCreateAccount(){
        BaseTest.driver.findElement(By.linkText("Create an Account")).click();
    }

}
