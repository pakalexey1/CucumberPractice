package com.cydeo.steps_definitions;

import com.cydeo.pages.NextBaseLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class NextBaseCRMLogin_StepDefs {

    NextBaseLoginPage nextBaseLoginPage = new NextBaseLoginPage();

//    @Given("User is on the login page of CRM")
//    public void user_is_on_the_login_page_of_crm() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("nextbase.url"));
//    }
////    @When("user enters below credentials")
////    public void user_enters_below_credentials(Map<String,String> credentials) {
////        nextBaseLoginPage.loginNextBase(credentials.get("username"),credentials.get("password"));
////
////    }
//    @Then("User should see CRM homepage")
//    public void user_should_see_crm_homepage() {
//        Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));
//    }
}
