package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = "button[class='button nav__item active']")
    public WebElement viewALlOrdersButton;

    @FindBy (xpath="//button[.='View all products']")
    public WebElement viewAllProductsButton;

    @FindBy (xpath = "//button[.='Order']")
    public WebElement ordersButton;

    @FindBy (css = "button[class='button __logout']")
    public WebElement logoutButton;
}
