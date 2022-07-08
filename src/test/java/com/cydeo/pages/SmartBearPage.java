package com.cydeo.pages;

import com.cydeo.steps_definitions.SmartBear_StepDefs;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPage {
    public SmartBearPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameBox;

    @FindBy(id="ctl00_MainContent_password")
    public WebElement passwordBox;

    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement loginButton;

    public void login (String username, String password){

        usernameBox.sendKeys(ConfigurationReader.getProperty(username));
        passwordBox.sendKeys(ConfigurationReader.getProperty(password));
        loginButton.click();
    }

    @FindBy(linkText = "Order")
    public WebElement orderButton;

    @FindBy(id ="ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement productDropdown;

    @FindBy (id="ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantityBox;

    @FindBy (id="ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerNameBox;

    @FindBy (id="ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetBox;

    @FindBy (id="ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement cityBox;

    @FindBy (id="ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement stateBox;

    @FindBy (id="ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipBox;

    @FindBy (id="ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visaRadio;

    @FindBy (id="ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;

    @FindBy (id="ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expirationDate;

    @FindBy (id="ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(linkText = "View all orders")
    public WebElement viewAllOrdersButton;

    @FindBy(xpath = "(//table[@class=\"SampleTable\"]//td)[2]")
    public WebElement customerNameAdded;
}
