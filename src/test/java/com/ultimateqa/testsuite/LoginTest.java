package com.ultimateqa.testsuite;

import com.ultimateqa.pages.LoginPage;
import com.ultimateqa.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        loginPage.clickOnLoginButton();
        String expecetedText = "Welcome Back!";
        String actualText = loginPage.getMassege();
        Assert.assertEquals(actualText, expecetedText, "Login page not displayed");

    }

    @Test
    public void verifyTheErrorMessage() {
        loginPage.clickOnLoginButton();
        loginPage.enterEmailId("prime123@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton1();
        String expectedMessage = "Invalid email or password.";
        String actualText = loginPage.getErrorMassege();
        Assert.assertEquals(expectedMessage,actualText, "Verify the text");

    }

}
