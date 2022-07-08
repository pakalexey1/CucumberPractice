package com.cydeo.steps_definitions;

import com.cydeo.pages.AdidasPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class Adidas_StepDefs {

    AdidasPage adidasPage = new AdidasPage();
    @Given("User is on the HomePage")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("adidasUrl"));
    }
    @Then("User should be able to see expected prices in following products")
    public void user_should_be_able_to_see_expected_prices_in_following_products(List<Map<String,String>> expectedProductDetails) {
        for (Map<String,String> eachProductDetail : expectedProductDetails){
            System.out.println("======Product Details======");
            System.out.println(eachProductDetail.get("Category"));
            adidasPage.clickCategory(eachProductDetail.get("Category"));
            System.out.println(eachProductDetail.get("Product"));
            String actualProductPrice = adidasPage.getProductPrice(eachProductDetail.get("Product"));

            //get me expectedPrice

            System.out.println(eachProductDetail.get("expectedPrice"));
            String expectedPrice = eachProductDetail.get("expectedPrice");

            Assert.assertEquals(expectedPrice,actualProductPrice);
        }
    }

    @Then("User should be able to see expected prices in following products with listOflist")
    public void user_should_be_able_to_see_expected_prices_in_following_products_with_list_oflist(List<List<String>> expectedProductDetails) {
        for (List<String> eachProductDetail : expectedProductDetails) {
            System.out.println("====Product Details====");
            System.out.println(eachProductDetail.get(0)); //Category

            //click category
            adidasPage.clickCategory(eachProductDetail.get(0));

            //get product price
            String actualPrice = adidasPage.getProductPrice(eachProductDetail.get(1));



            System.out.println(eachProductDetail.get(1)); // Product

            // get the expectedPrice
            String expectedPrice = eachProductDetail.get(2);
            System.out.println(eachProductDetail.get(2)); //Expected Price

            Assert.assertEquals(expectedPrice,actualPrice);


        }
    }

}
