package com.cydeo.steps_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.VyTrackHomePage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin {
    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    VyTrackHomePage vyTrackHomePage = new VyTrackHomePage();

    @When("user enters username {string}, password {string} and login")
    public void user_enters_username_password_and_login(String username, String password) {
        webTableLoginPage.login(username, password);
    }

    @Given("user is on the web table login page")
    public void user_is_on_the_web_table_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        webTableLoginPage.inputUsername.sendKeys(username);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        webTableLoginPage.inputPassword.sendKeys(password);
    }

    @And("user clicks login button")
    public void user_clicks_login_button() {
        webTableLoginPage.loginButton.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("order"));
    }

    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {
        webTableLoginPage.login(credentials.get("username"), credentials.get("password"));
    }

    @When("User enters below credentials")
    public void userEntersBelowCredentials(Map<String,String>credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");

        new LoginPage().loginWithCredentials(username,password);
        BrowserUtils.waitFor(10);
    }


    @Then("user should be able to see following information")
    public void userShouldBeAbleToSeeFollowingInformation(Map<String,String> userInfo) {
        BrowserUtils.waitFor(10);
        String actualUserInfo = vyTrackHomePage.username.getText();
        String expectedUserInfo = userInfo.get("firstname")+" "+userInfo.get("lastname");
        BrowserUtils.waitFor(5);
        Assert.assertEquals(expectedUserInfo,actualUserInfo);
    }
}


//# TC #: Login scenario
//        # 1- Open a chrome browser
//        # 2- Go to: https://web-table-2.cydeo.com/login
//        # 3- Enter username: Test
//        # 4- Enter password: Tester
//        # 5- Verify URL:
//        # Expected: URL should end with “orders”
//        #
//        # Note: Follow POM
//        # Try different ways of implementing this step: