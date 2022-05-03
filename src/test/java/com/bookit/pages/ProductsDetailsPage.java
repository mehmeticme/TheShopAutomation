package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsDetailsPage {
    public ProductsDetailsPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath="//a[text()='My Cart']")
    public WebElement myCartButton;

    @FindBy(xpath="//a[text()='My Favorites']")
    public WebElement myFavoritesButton;


    public void clickFilterByBrand(String brandName){
        Driver.getDriver().findElement(By.xpath("//div[@class='card']//div[@id='myBtnContainer']//span[contains(text(),'"+brandName+"')]")).click();
    }

    public int getListOfFilteredElementsSize(){
        return Driver.getDriver().findElements(By.xpath("//div[contains(@class,'show')]")).size();
    }

    public void clickOnBrandByTitle(String titleName){
        Driver.getDriver().findElement(By.xpath("//div[contains(@class,'show')]//h6[contains(text(),'"+titleName+"')]//..//../a")).click();
    }




}
