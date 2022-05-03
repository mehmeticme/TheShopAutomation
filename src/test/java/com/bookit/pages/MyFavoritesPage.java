package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class MyFavoritesPage {
    public MyFavoritesPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    public int getProductFromMyFavoritesList(String productName){
        return Driver.getDriver().findElements(By.xpath("//div[contains(@class,'container')]//span//strong[contains(text(),'"+productName+"')]")).size();
    }
}
