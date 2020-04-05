package com.weborders.pages;

import com.weborders.utilitites.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * it meant to be extended
 */
public abstract class AbstractBasePage {
    protected WebDriver driver = Driver.getDriver();

    public AbstractBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
