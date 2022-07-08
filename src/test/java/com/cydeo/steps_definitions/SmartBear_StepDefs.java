package com.cydeo.steps_definitions;

import com.cydeo.pages.SmartBearPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectableChannel;

public class SmartBear_StepDefs {

    SmartBearPage smartBearPage = new SmartBearPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("smartBear.url"));
        smartBearPage.login("smartBear.user", "smartBear.password");
        smartBearPage.orderButton.click();
    }

    @When("User selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {
        Select select = new Select(smartBearPage.productDropdown);
        select.selectByVisibleText("FamilyAlbum");
    }

    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String quantity) {
        smartBearPage.quantityBox.clear();
        smartBearPage.quantityBox.sendKeys(quantity);
    }

    @When("User enters {string} to customer name")
    public void user_enters_to_customer_name(String customerName) {
        smartBearPage.customerNameBox.sendKeys(customerName);
    }

    @When("User enters {string} to street")
    public void user_enters_to_street(String streetName) {
        smartBearPage.streetBox.sendKeys(streetName);
    }

    @When("User enters {string} to city")
    public void user_enters_to_city(String cityName) {
        smartBearPage.cityBox.sendKeys(cityName);
    }

    @When("User enters {string} to state")
    public void user_enters_to_state(String stateName) {
        smartBearPage.stateBox.sendKeys(stateName);
    }

    @When("User enters {string}")
    public void user_enters(String zipCode) {
        smartBearPage.zipBox.sendKeys(zipCode);
    }

    @When("User selects Visa as card type")
    public void user_selects_visa_as_card_type() {
        smartBearPage.visaRadio.click();
    }

    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNumber) {
        smartBearPage.cardNumber.sendKeys(cardNumber);
    }

    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expDate) {
        smartBearPage.expirationDate.sendKeys(expDate);
    }

    @When("User clicks process button")
    public void user_clicks_process_button() {
        smartBearPage.processButton.click();
    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String expectedName) {
        smartBearPage.viewAllOrdersButton.click();
        Assert.assertEquals(expectedName, smartBearPage.customerNameAdded.getText());
    }

    @When("User selects {string} from product dropdown")
    public void userSelectsFromProductDropdown(String product) {
        Select select = new Select(smartBearPage.productDropdown);
        select.selectByVisibleText(product);
    }

    @When("User enters {string} to zip")
    public void userEntersToZip(String zipCode) {
        smartBearPage.zipBox.sendKeys(zipCode);
    }

    @And("User selects {string} as card type")
    public void userSelectsAsCardType(String cardType) {
        smartBearPage.visaRadio.click();
    }
}