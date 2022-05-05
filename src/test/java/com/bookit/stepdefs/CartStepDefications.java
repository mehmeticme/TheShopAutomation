package com.bookit.stepdefs;

import com.bookit.pages.MyCartPage;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class CartStepDefications {
    MyCartPage myCartPage = new MyCartPage();



    @Then("I validate that {string} is added to my cart successfully")
    public void i_validate_that_is_added_to_my_cart_successfully(String productName) {
        boolean productIsDisplayed = myCartPage.getCartItemByName(productName)!=0;
        Assert.assertTrue("Validating if "+productName +" displayed in my Cart", productIsDisplayed);
    }

    @Then("I click on remove button for {string}")
    public void i_click_on_remove_button_for(String productName) throws InterruptedException {
        myCartPage.getRemoveButtonByItemName(productName).click();
        Thread.sleep(2000);
    }

    @Then("I validate that {string} is removed from my cart successfully")
    public void i_validate_that_is_removed_from_my_cart_successfully(String productName) {
        boolean productIsNotDisplayed = myCartPage.getCartItemByName(productName)==0;
        Assert.assertTrue("Validating if "+productName +" displayed in my Cart", productIsNotDisplayed);
    }
}
