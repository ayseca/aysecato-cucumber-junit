package com.aysecato.step_definitions;

import com.aysecato.pages.EtsyHomePage;
import com.aysecato.utilities.ConfigurationReader;
import com.aysecato.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinitions {

    EtsyHomePage etsyHomePage = new EtsyHomePage();

    @Given("User is on Etsy home page")
    public void user_is_on_etsy_home_page() {
        Driver.get().get(ConfigurationReader.getProperty("etsyUrl"));
    }

    @Then("User sees title is as expected")
    public void user_sees_title_is_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyHomePage.searchBox.sendKeys("Wooden Spoon");
    }

    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String string) {
        etsyHomePage.searchBox.sendKeys(string);
    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsyHomePage.submitButton.click();
    }

    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        String expectedTitle = "Wooden Spoon | Etsy";
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));
    }

    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String expectedInTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedInTitle+" | Etsy"));
    }

}
