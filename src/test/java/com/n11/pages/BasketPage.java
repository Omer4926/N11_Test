package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {

    public BasketPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='prodDescription']")
    public WebElement productInBasket;

    @FindBy(xpath = "//span[@class='removeProd svgIcon svgIcon_trash']")
    public WebElement removeButton;

    @FindBy(xpath = " //span[@id='deleteBtnDFLB']")
    public WebElement deleteButton;

    @FindBy(xpath = "  (//h2[@class='title'])[1]")
    public WebElement emptyBasketText;






}
