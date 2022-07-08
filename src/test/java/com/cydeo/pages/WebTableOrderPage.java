package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPage extends BasePage{

    public WebTableOrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "select[name='product']")
    public WebElement productDropdown;

    @FindBy(css="input[name='quantity']")
    public WebElement quantityBox;

    @FindBy(css = "input[value='100']")
    public WebElement pricePerUnitBox;

    @FindBy(css = "input[value='8']")
    public WebElement discountBox;

    @FindBy(css = "input[value='0']")
    public WebElement totalBox;

    @FindBy(css = "button[type='button']")
    public WebElement calculateButton;

    @FindBy(name = "name")
    public WebElement customerNameBox;

    @FindBy(name = "street")
    public WebElement streetBox;

    @FindBy(name = "city")
    public WebElement cityBox;

    @FindBy(name = "state")
    public WebElement stateBox;

    @FindBy(name = "zip")
    public WebElement zipBox;

    @FindBy(name = "card")
    public List<WebElement> creditCardType;

//    @FindBy(css="input[value='MasterCard']")
//    public WebElement masterCardRadio;
//
//    @FindBy(css="input[value='American Express']")
//    public WebElement amexRadio;

    @FindBy(name = "cardNo")
    public WebElement cardnoInput;

    @FindBy(name = "cardExp")
    public WebElement cardexpBox;

    @FindBy(css = "button[type='submit']")
    public WebElement processButton;

    @FindBy(xpath = "//button[text()='Reset Fields']")
    public WebElement resetButton;








}
