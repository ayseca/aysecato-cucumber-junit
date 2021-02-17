package com.aysecato.pages;

import com.aysecato.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage extends BasePage {

    public GoogleSearchPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="q")
    public WebElement searchBar;

}
