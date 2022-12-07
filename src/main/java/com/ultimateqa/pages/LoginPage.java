package com.ultimateqa.pages;

import com.ultimateqa.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {


    By loginButton = By.xpath("//li[@class='header__nav-item header__nav-sign-in']");

    By VerifyMessage = By.xpath("//h1[text()='Welcome Back!']");

    By emailField = By.id("user[email]");

    By passwordField = By.name("user[password]");

    By loginButton1 = By.xpath(" //input[@value='Sign in']");

    By errorMessage = By.xpath("//div[@id='notice']/ul/li");

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getMassege(){
        return getTextFromElement(VerifyMessage);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }
    public void clickOnLoginButton1(){
        clickOnElement(loginButton1);
    }
    public String getErrorMassege(){
        return getTextFromElement(errorMessage);
    }
}
