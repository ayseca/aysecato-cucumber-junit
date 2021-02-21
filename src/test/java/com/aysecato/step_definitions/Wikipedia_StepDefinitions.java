package com.aysecato.step_definitions;

import com.aysecato.pages.WikipediaHomePage;
import com.aysecato.utilities.ConfigurationReader;
import com.aysecato.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia_StepDefinitions {

    WikipediaHomePage wikipediaHomePage = new WikipediaHomePage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.get().get(ConfigurationReader.getProperty("wikipediaUrl"));
    }

    @When("User types Steve Jobs in the wiki search box and clicks search button")
    public void user_types_steve_jobs_in_the_wiki_search_box_and_clicks_search_button() {
        wikipediaHomePage.searchSteveJobs();
    }

    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        String expectedInTitle = "Steve Jobs";
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    @Then("User sees Steve Jobs is in the main header")
    public void user_sees_steve_jobs_is_in_the_main_header() {
        Assert.assertTrue(wikipediaHomePage.mainHeader.isDisplayed());
    }

    @Then("User sees Steve Jobs is in the image header")
    public void user_sees_steve_jobs_is_in_the_image_header() {
        Assert.assertTrue(wikipediaHomePage.imageHeader.isDisplayed());
    }



}
