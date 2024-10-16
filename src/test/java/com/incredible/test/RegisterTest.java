package com.incredible.test;

import com.incredible.pages.HomePage;
import com.incredible.pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
    HomePage homePage;
    RegisterPage registerPage;

    @Test
    public void createAccount(){
        homePage = new HomePage(driver);
        homePage.clickMyAccount();
        homePage.clickCreateAccount();

        registerPage = new RegisterPage(driver);
        registerPage.enterFirstName("");
        registerPage.enterLastName("");
        registerPage.enterCellPhoneNo("");
        registerPage.enterEmail("");
        registerPage.enterPassword("IAmAustin");
        registerPage.enterPasswordConfirm("IAmAustin");

    }
}
