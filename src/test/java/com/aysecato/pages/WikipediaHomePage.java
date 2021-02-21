package com.aysecato.pages;

import com.aysecato.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikipediaHomePage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Search Wikipedia']")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@id='searchButton']")
    public WebElement submitButton;

    @FindBy(xpath = "//h1[.='Steve Jobs']")
    public WebElement mainHeader;

    @FindBy(xpath = "//div[.='Steve Jobs']")
    public WebElement imageHeader;

    public void searchSteveJobs(){
        searchBox.sendKeys("Steve Jobs");
        submitButton.click();
    }




}
