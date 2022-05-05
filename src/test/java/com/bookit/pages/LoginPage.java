package com.bookit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bookit.utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath="//a[text()='Login']")
    public WebElement homeLoginbutton;

    @FindBy(id ="id_username" )
    public WebElement usernameField;

    @FindBy(id = "pass")
    public  WebElement passwordField;

    @FindBy(xpath = "//input[@value='Sign In']")
    public  WebElement loginButton;

    @FindBy(xpath = "//div[@class='sign-in-htm']//strong")
    public  WebElement invalidLoginErrorMessage;
}

