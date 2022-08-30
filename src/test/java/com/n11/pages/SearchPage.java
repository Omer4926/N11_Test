package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public SearchPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@data-page='2']")
    public WebElement number2Button;

    @FindBy(xpath = "(//img[@class='lazy cardImage'])[2]")
    public WebElement product;

}
