package com.bookit.stepdefs;

import com.bookit.pages.LoginPage;
import com.bookit.pages.ProductsPage;
import com.bookit.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinations {

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();


    @Given("I am on the happy shop landing page")
    public void i_am_on_the_happy_shop_landing_page() {
        Driver.getDriver().get("http://127.0.0.1:8000/shopapp/");
    }

    @Given("I click on Login button")
    public void i_click_on_Login_button() {
        loginPage.homeLoginbutton.click();
    }

    @Then("I enter {string} into username field")
    public void i_enter_into_username_field(String username) throws InterruptedException {

        loginPage.usernameField.sendKeys(username);
        Thread.sleep(1000);
    }

    @Then("I enter {string} into password field")
    public void i_enter_into_password_field(String password) throws InterruptedException {

        loginPage.passwordField.sendKeys(password);
        Thread.sleep(1000);
    }

    @Then("I click on login button")
    public void i_click_on_login_button() throws InterruptedException {
      loginPage.loginButton.click();
      Thread.sleep(1000);
    }

    @Then("I land on Products page")
    public void i_land_on_Products_page() {
        String expectedText = "Filter By Brand";
        String actualText = productsPage.filterByBrandText.getText();
        Assert.assertEquals("Validating if Filter By Brand text is displayed",expectedText,actualText);
    }

    @Then("I see invalid login error message")
    public void i_see_invalid_login_error_message() {
        loginPage.invalidLoginErrorMessage.isDisplayed();
        String expectedErrorMessage = "Invalid login. Please try again.";
        String actualErrorMessage = loginPage.invalidLoginErrorMessage.getText();

        Assert.assertEquals("Validating if error message is displayed correctly",expectedErrorMessage,actualErrorMessage);
    }

}
