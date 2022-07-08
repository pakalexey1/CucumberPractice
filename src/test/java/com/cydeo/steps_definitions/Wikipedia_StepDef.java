package com.cydeo.steps_definitions;

import com.cydeo.pages.WikipediaPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia_StepDef {

    WikipediaPage wikipediaPage = new WikipediaPage();
    @Given("user is on Wikipedia home page")
    public void userIsOnWikipediaHomePage() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("user types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String searchEntry) {
        wikipediaPage.searchBox.sendKeys(searchEntry);
    }
    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaPage.searchButton.click();
    }
    @Then("user sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String expectedTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }

    @Then("user sees {string} in the header")
    public void userSeesInTheHeader(String expectedHeader) {
        Assert.assertEquals(expectedHeader,wikipediaPage.header.getText());
    }


    @Then("user sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String expectedImageHeader) {
        Assert.assertEquals(expectedImageHeader,wikipediaPage.imageHeader.getText());
    }
}
