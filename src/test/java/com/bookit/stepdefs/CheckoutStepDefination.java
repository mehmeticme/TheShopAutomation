package com.bookit.stepdefs;

import com.bookit.pages.MyCartPage;
import com.bookit.utilities.Driver;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutStepDefination {
    MyCartPage myCartPage = new MyCartPage();
    WebDriver driver = Driver.getDriver();

    @Then("I enter {string} into email field")
    public void i_enter_into_email_field(String email) throws InterruptedException {
        myCartPage.emailField.sendKeys(email);
        Thread.sleep(1000);
    }

    @Then("I enter {string} into name field")
    public void i_enter_into_name_field(String name) throws InterruptedException{

        myCartPage.nameField.sendKeys(name);
        Thread.sleep(1000);
    }

    @Then("I enter {string} into zipCode field")
    public void i_enter_into_zipCode_field(String zipCode) throws InterruptedException{
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='container']//iframe")));
        myCartPage.zipCode.sendKeys(zipCode);
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
    }

    @Then("I enter {string} into card number field")
    public void i_enter_into_card_number_field(String cardNumber) throws InterruptedException{
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='container']//iframe")));
        myCartPage.cardNumber.sendKeys(cardNumber);
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
    }

    @Then("I enter {string} into expiration date field")
    public void i_enter_into_expiration_date_field(String expDate) throws InterruptedException{
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='container']//iframe")));
        myCartPage.expDate.sendKeys(expDate);
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
    }

    @Then("I enter {string} into cvs field")
    public void i_enter_into_cvs_field(String cvs) throws InterruptedException{
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='container']//iframe")));
        myCartPage.cvc.sendKeys(cvs);
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
    }

    @Then("I click on submit payment button")
    public void i_click_on_submit_payment_button() throws InterruptedException{

       myCartPage.submitButton.click();
    }

    @Then("I validate {string} text is being displayed after clicking on submit button")
    public void i_validate_text_is_being_displayed_after_clicking_on_submit_button(String text) throws InterruptedException {
        Thread.sleep(4000);
        try{
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4")));

            Assert.assertTrue("Validating if " + text + " is being displayed",Driver.getDriver().findElement(By.xpath("//h4")).getText().contains(text));

        }catch (Exception e){
            Assert.assertTrue("Validating if " + text + " is being displayed",Driver.getDriver().findElement(By.xpath("//h4")).getText().contains(text));
        }
    }
}
