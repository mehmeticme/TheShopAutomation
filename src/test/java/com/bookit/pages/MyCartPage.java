package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCartPage {
    public MyCartPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    public int getCartItemByName(String itemName){
        return Driver.getDriver().findElements(By.xpath("//div[@class='basket']//div[@class='basket-product']//div[@class='product-details']//h5[contains(text(),'"+itemName+"')]")).size();
    }

    public WebElement getRemoveButtonByItemName(String itemName){
        return Driver.getDriver().findElement(By.xpath("//div[@class='basket']//div[@class='basket-product']//div[@class='product-details']//h5[contains(text(),'"+itemName+"')]//..//..//..//button"));
    }

    @FindBy(xpath="//button[text()=' Add to Cart']")
    public WebElement addToCartButton;

    @FindBy(xpath="//button[text()=' Remove']")
    public WebElement removeButton;

    @FindBy(xpath="//button[text()=' Favorite']")
    public WebElement favoriteButton;

    @FindBy(xpath="//button[text()=' Unfavorite']")
    public WebElement unFavoriteButton;

    @FindBy(name="email")
    public WebElement emailField;

    @FindBy(name="nickname")
    public WebElement nameField;

    @FindBy(name="cardnumber")
    public WebElement cardNumber;

    @FindBy(name="exp-date")
    public WebElement expDate;

    @FindBy(name="cvc")
    public WebElement cvc;

    @FindBy(name="postal")
    public WebElement zipCode;


    @FindBy(xpath="//input[@value='Submit Payment']")
    public WebElement submitButton;

}
