package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = " //input[@id='prependedInput'] ")
    public WebElement usernameBox;

    @FindBy(xpath = " //input[@id='prependedInput2'] ")
    public WebElement passwordBox;

    @FindBy(xpath = " //button[@id='_submit'] ")
    public WebElement submitButton;


    public void loginWithCredentials(String username, String password) {

        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        submitButton.click();
    }

    public void loginDynamic(String userType) {
        userType = userType.toLowerCase().replace(" ", "_");
        String username = ConfigurationReader.getProperty(userType + "_username");
        String password = ConfigurationReader.getProperty(userType + "_password");

        loginWithCredentials(username, password);

    }
}
