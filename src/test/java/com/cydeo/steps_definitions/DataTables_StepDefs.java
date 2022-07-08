package com.cydeo.steps_definitions;

import com.cydeo.pages.DataTablesPage;
import com.cydeo.pages.VyTrackHomePage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class DataTables_StepDefs {
    DataTablesPage dataTablesPage = new DataTablesPage();
    VyTrackHomePage vyTrackHomePage = new VyTrackHomePage();
    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List <String> months) {
        Select select = new Select(dataTablesPage.dropDown);
        for (String each: months){
            List<WebElement> allOptions = select.getOptions();
        }

        List<WebElement> allOptions = select.getOptions();
        Assert.assertTrue(months.equals(allOptions));
    }

    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules) {

        BrowserUtils.waitFor(5);

        List<String> actualModulesNames = BrowserUtils.getElementsText(vyTrackHomePage.allModules); //allModules is an array of all modules on vyTrack Dashboard page

        Assert.assertEquals(expectedModules,actualModulesNames);
    }

    @Then("User should be able to see following names in their groups")
    public void user_should_be_able_to_see_following_names_in_their_groups(Map<String,List<String>> mapOfList ) {
        List<String> group1 = mapOfList.get("Group1");
        System.out.println(group1);

        System.out.println("===============");

        List<String> group2 = mapOfList.get("Group2");
        System.out.println(group2);

        System.out.println("===============");

        List<String>group3 = mapOfList.get("Group3");
        System.out.println(group3);
    }

}
