package com.bookit.stepdefs;

import com.bookit.pages.MyCartPage;
import com.bookit.pages.MyFavoritesPage;
import com.bookit.pages.ProductsDetailsPage;
import com.bookit.pages.ProductsPage;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class FavoriteStepDefinations {

    MyCartPage myCartPage = new MyCartPage();
    ProductsDetailsPage productsDetailsPage = new ProductsDetailsPage();
    MyFavoritesPage myFavoritesPage = new MyFavoritesPage();
    ProductsPage productsPage = new ProductsPage();

    @Then("I click on favorite button to add it to my favorite")
    public void i_click_on_favorite_button_to_add_it_to_my_favorite() throws InterruptedException {
       myCartPage.favoriteButton.click();
       Thread.sleep(2000);
    }

    @Then("I click on My Favorites from navigation bar")
    public void i_click_on_My_Favorites_from_navigation_bar() throws InterruptedException {
        productsDetailsPage.myFavoritesButton.click();
        Thread.sleep(1000);
    }

    @Then("I validate that {string} is added to my favorite successfully")
    public void i_validate_that_is_added_to_my_favorite_successfully(String productName) {
        boolean itemDisplayed = myFavoritesPage.getProductFromMyFavoritesList(productName)!=0;

        Assert.assertTrue("Validating if "+productName+" displayed correctly in my Favorite list", itemDisplayed);
    }

    @Then("I click on unFavorite button to remove it to my favorite")
    public void i_click_on_unFavorite_button_to_remove_it_to_my_favorite() throws InterruptedException {
        myCartPage.unFavoriteButton.click();
        Thread.sleep(1000);
    }

    @Then("I validate that {string} is removed from my favorites list successfully")
    public void i_validate_that_is_removed_from_my_favorites_list_successfully(String productName) {
        boolean itemNotDisplayed = myFavoritesPage.getProductFromMyFavoritesList(productName)==0;

        Assert.assertTrue("Validating if "+productName+" is not displayed in my Favorite list", itemNotDisplayed);
    }

    @Then("I click on Products from navigation bar")
    public void i_click_on_Products_from_navigation_bar() throws InterruptedException {
        productsPage.productsButton.click();
        Thread.sleep(1000);
    }

}
