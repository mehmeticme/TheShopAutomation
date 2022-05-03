package com.bookit.stepdefs;

import com.bookit.pages.MyCartPage;
import com.bookit.pages.ProductsDetailsPage;
import com.bookit.pages.ProductsPage;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class ProductDetailsStepDefination {

    ProductsDetailsPage productsDetailsPage = new ProductsDetailsPage();
    MyCartPage myCartPage = new MyCartPage();

    @Then("I click on {string} from Filter By Brand field")
    public void i_click_on_from_Filter_By_Brand_field(String filterName) {
        productsDetailsPage.clickFilterByBrand(filterName);
    }

    @Then("I validate products displayed correctly")
    public void i_validate_products_displayed_correctly() {
        int filteredProductsSize = productsDetailsPage.getListOfFilteredElementsSize();
        Assert.assertTrue("Validating if filter by brand shows filtered products correctly", filteredProductsSize>0);
    }

    @Then("I click on {string} from products list")
    public void i_click_on_from_products_list(String productTitle) throws InterruptedException {
        productsDetailsPage.clickOnBrandByTitle(productTitle);
        Thread.sleep(1000);
    }

    @Then("I click on Add to Cart")
    public void i_click_on_Add_to_Cart() throws InterruptedException {
      myCartPage.addToCartButton.click();
        Thread.sleep(1000);
    }

    @Then("I click on My Cart from navigation bar")
    public void i_click_on_My_Cart_from_navigation_bar() throws InterruptedException {
      productsDetailsPage.myCartButton.click();
        Thread.sleep(1000);
    }



}
