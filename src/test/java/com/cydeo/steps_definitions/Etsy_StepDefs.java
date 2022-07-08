package com.cydeo.steps_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefs {

    EtsyPage etsyPage = new EtsyPage();

    @Given("user is on the etsy homepage")
    public void user_is_on_the_etsy_homepage() {
        Driver.getDriver().get("https://www.etsy.com");
    }
    @Then("user sees the expected title {string}")
    public void user_sees_the_expected_title(String expectedTitle) {
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
    }

    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String searchPhrase) {
        etsyPage.searchBox.sendKeys(searchPhrase);
    }
    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsyPage.searchButton.click();
    }
    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String expectedTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }
}
