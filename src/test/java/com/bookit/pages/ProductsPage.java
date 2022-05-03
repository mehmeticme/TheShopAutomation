package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath="//h5[text()='Filter By Brand']")
    public WebElement filterByBrandText;

    @FindBy(xpath="//a[text()='Products']")
    public WebElement productsButton;
}
