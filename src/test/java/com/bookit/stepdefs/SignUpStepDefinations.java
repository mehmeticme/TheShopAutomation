package com.bookit.stepdefs;

import com.bookit.pages.LandingPage;
import com.bookit.pages.SignUpPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.UUID;

public class SignUpStepDefinations {

    SignUpPage signUpPage = new SignUpPage();
    LandingPage landingPage = new LandingPage();

    @Given("I click on Sign Up button from  happy shop landing page")
    public void i_click_on_Sign_Up_button_from_happy_shop_landing_page() {
        signUpPage.signUpButton.click();
    }

    @Then("I generate username and enter it into username field for sign up page")
    public void i_generate_username_and_enter_it_into_username_field_for_sign_up_page() throws InterruptedException {
        String uniqueID = UUID.randomUUID().toString();
        signUpPage.usernameField.sendKeys(uniqueID);
        Thread.sleep(1000);
    }

    @Then("I enter {string} into email field for sign up page")
    public void i_enter_into_email_field_for_sign_up_page(String email) throws InterruptedException {
        signUpPage.emailField.sendKeys(email);
        Thread.sleep(1000);
    }

    @Then("I enter {string} into first name field for sign up page")
    public void i_enter_into_first_name_field_for_sign_up_page(String firstName) throws InterruptedException {
        signUpPage.firstNameField.sendKeys(firstName);
        Thread.sleep(1000);
    }

    @Then("I enter {string} into last name field for sign up page")
    public void i_enter_into_last_name_field_for_sign_up_page(String lastName) throws InterruptedException {
        signUpPage.lastNameField.sendKeys(lastName);
        Thread.sleep(1000);
    }

    @Then("I enter {string} into password field for sign up page")
    public void i_enter_into_password_field_for_sign_up_page(String password) throws InterruptedException {
        signUpPage.passwordField.sendKeys(password);
        Thread.sleep(1000);
    }

    @Then("I enter {string} into address field for sign up page")
    public void i_enter_into_address_field_for_sign_up_page(String address) throws InterruptedException {
        signUpPage.addressField.sendKeys(address);
        Thread.sleep(1000);
    }

    @Then("I enter {string} into phone field for sign up page")
    public void i_enter_into_phone_field_for_sign_up_page(String phoneNumber) throws InterruptedException {
        signUpPage.phoneField.sendKeys(Keys.CONTROL + "a" + Keys.CONTROL);
        signUpPage.phoneField.sendKeys(phoneNumber);
        Thread.sleep(1000);
    }

    @Then("I click on Sign Up button")
    public void i_click_on_Sign_Up_button() throws InterruptedException {
      signUpPage.signUpSubmitButton.click();
        Thread.sleep(1000);
    }

    @Then("I validate I am on landing page after sign up")
    public void i_validate_I_am_on_landing_page_after_sign_up() {
       boolean navigatedToLandingPage = landingPage.startShoppingButton.isDisplayed();
        Assert.assertTrue("Validating if Start Shopping button displayed after sign up process",navigatedToLandingPage);
    }


}
