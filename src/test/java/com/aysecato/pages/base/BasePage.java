package com.aysecato.pages.base;

import com.aysecato.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver = Driver.get();

    public BasePage(){
        PageFactory.initElements(driver, this);
    }


}
