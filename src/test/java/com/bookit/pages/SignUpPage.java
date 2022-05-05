package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    public SignUpPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath="//a[text()='Sign Up']")
    public WebElement signUpButton;

    @FindBy(id="id_username")
    public WebElement usernameField;

    @FindBy(id="id_email")
    public WebElement emailField;

    @FindBy(id="id_first_name")
    public WebElement firstNameField;

    @FindBy(id="id_last_name")
    public WebElement lastNameField;

    @FindBy(id="id_password")
    public WebElement passwordField;

    @FindBy(id="id_address")
    public WebElement addressField;

    @FindBy(id="id_phone")
    public WebElement phoneField;

    @FindBy(xpath="//input[@value='Sign Up']")
    public WebElement signUpSubmitButton;



}
