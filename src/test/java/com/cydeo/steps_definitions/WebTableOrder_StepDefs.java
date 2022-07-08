package com.cydeo.steps_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.pages.WebTableOrderPage;
import com.cydeo.pages.WebTableViewAllOrdersPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTableOrder_StepDefs {

    WebTableOrderPage webTableOrderPage = new WebTableOrderPage();
    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    BasePage basePage = new BasePage();

    WebTableViewAllOrdersPage webTableViewAllOrdersPage = new WebTableViewAllOrdersPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));
        webTableLoginPage.login("Test", "Tester");
        basePage.ordersButton.click();
    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String productType) {
        Select select = new Select(webTableOrderPage.productDropdown);
        select.selectByVisibleText(productType);
    }

    @When("user enters quantity {int}")
    public void user_enters_quantity(int qty) {
        webTableOrderPage.quantityBox.clear();
        webTableOrderPage.quantityBox.sendKeys(String.valueOf(qty));
    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String customerName) {
        webTableOrderPage.customerNameBox.sendKeys(customerName);
    }

    @When("user enters street {string}")
    public void user_enters_street(String street) {
        webTableOrderPage.streetBox.sendKeys(street);
    }

    @When("user enters city {string}")
    public void user_enters_city(String city) {
        webTableOrderPage.cityBox.sendKeys(city);
    }

    @When("user enters state {string}")
    public void user_enters_state(String state) {
        webTableOrderPage.stateBox.sendKeys(state);
    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zip) {
        webTableOrderPage.zipBox.sendKeys(zip);
    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String creditCardType) {
        List<WebElement> cardTypes = webTableOrderPage.creditCardType;

        for (WebElement each : cardTypes) {
            if (each.getAttribute("value").equalsIgnoreCase(creditCardType)) {
                each.click();
            }
        }
    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String ccNum) {
        webTableOrderPage.cardnoInput.sendKeys(ccNum);
    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String expDate) {
        webTableOrderPage.cardexpBox.sendKeys(expDate);
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
        webTableOrderPage.processButton.click();
    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String name) {
        Assert.assertEquals(name,webTableViewAllOrdersPage.customerNameInTable.getText());
    }


}