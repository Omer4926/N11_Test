package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    public ProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@class='addBasketUnify'])[1]")
    public WebElement addToCart;

    @FindBy(xpath = "//i[@class='iconsBasketWhite']")
    public WebElement cart;

}
