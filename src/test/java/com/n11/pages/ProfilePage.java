package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    public ProfilePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//h1[.='Ömer Baki Güden']")
    public WebElement name;
}
