package com.incredible.pages;

import com.incredible.test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage  extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(String name) {
        BaseTest.driver.findElement(By.id("firstname")).click();
        BaseTest.driver.findElement(By.id("firstname")).sendKeys(name);
    }

    public void enterLastName(String lastName) {
        BaseTest.driver.findElement(By.id("lastname")).click();
        BaseTest.driver.findElement(By.id("lastname")).sendKeys(lastName);
    }

    public void enterCellPhoneNo(String cellphone) {
        BaseTest.driver.findElement(By.id("cellphone_number")).click();
        BaseTest.driver.findElement(By.id("cellphone_number")).sendKeys(cellphone);
    }

    public void enterEmail(String email) {
        BaseTest.driver.findElement(By.id("email_address")).click();
        BaseTest.driver.findElement(By.id("email_address")).sendKeys(email);
    }

    public void enterPassword(String password) {
        BaseTest.driver.findElement(By.id("password")).click();
        BaseTest.driver.findElement(By.id("password")).sendKeys(password);
    }

    public void enterPasswordConfirm(String passwordConfirm) {
        BaseTest.driver.findElement(By.id("password-confirmation")).click();
        BaseTest.driver.findElement(By.id("password-confirmation")).sendKeys(passwordConfirm);
    }

    public void clickCreateAccount() {
        BaseTest.driver.findElement(By.xpath("//div[1]/button[@type='submit']/span")).click();
    }


}
