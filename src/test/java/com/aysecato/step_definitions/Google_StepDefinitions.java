package com.aysecato.step_definitions;

import com.aysecato.pages.GoogleSearchPage;
import com.aysecato.utilities.ConfigurationReader;
import com.aysecato.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @When("User searches for apple")
    public void user_searches_for_apple() {
        googleSearchPage.searchBar.sendKeys("apple" + Keys.ENTER);
    }
    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {
        String actualTitle = Driver.get().getTitle();
        String expectedInTitle = "apple";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

}
