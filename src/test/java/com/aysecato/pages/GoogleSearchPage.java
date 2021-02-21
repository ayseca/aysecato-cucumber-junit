package com.aysecato.pages;

import com.aysecato.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage extends BasePage {

    @FindBy(name="q")
    public WebElement searchBar;

}
