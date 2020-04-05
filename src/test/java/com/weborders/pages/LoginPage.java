package com.weborders.pages;

import com.weborders.utilitites.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.security.auth.login.Configuration;

public class LoginPage extends AbstractBasePage {

    @FindBy(id = "ct100_MainContent_username")
    private WebElement userName;

    @FindBy(id = "ct100_MainContent_password")
    private WebElement password;

    public void login() {
        String usernameValue = ConfigurationReader.getProperty("username");
        String passwordValue = ConfigurationReader.getProperty("password");
        userName.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

    public void login(String usernameValue, String passwordValue) {
        userName.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);

    }
}