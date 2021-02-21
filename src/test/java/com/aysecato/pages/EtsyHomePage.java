package com.aysecato.pages;

import com.aysecato.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EtsyHomePage extends BasePage {

    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@data-id='gnav-search-submit-button']")
    public WebElement submitButton;


}
