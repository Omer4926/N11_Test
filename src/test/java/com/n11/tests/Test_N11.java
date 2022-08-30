package com.n11.tests;

import com.n11.pages.*;
import com.n11.utilities.ConfigurationReader;
import com.n11.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_N11 {

    @Test
    public void test() throws InterruptedException {

        BasePage basePage = new BasePage();
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        SearchPage searchPage = new SearchPage();
        ProductPage productPage = new ProductPage();
        BasketPage basketPage = new BasketPage();
        ProfilePage profilePage = new ProfilePage();


        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);

        WebElement cokies = Driver.getDriver().findElement(By.xpath("//*[@id='cookieUsagePopIn']//span[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(cokies));
        cokies.click();

        basePage.loginButton.click();



        wait.until(ExpectedConditions.visibilityOf(loginPage.userName));
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("username"));

        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));


        wait.until(ExpectedConditions.elementToBeClickable(loginPage.loginButton));

        loginPage.loginButton.click();


        wait.until(ExpectedConditions.visibilityOf(homePage.profileImage));
        homePage.profileImage.click();

        String expectedName = "Ömer Baki Güden";
        String actualName = profilePage.name.getText();

        Assert.assertEquals(actualName,expectedName);


        basePage.searchBox.sendKeys("telefon"+ Keys.ENTER);


        searchPage.number2Button.click();


        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.endsWith("2"));

        searchPage.product.click();


        Thread.sleep(2000);
        productPage.addToCart.click();

        productPage.cart.click();

        Assert.assertTrue(basketPage.productInBasket.isDisplayed());

        basketPage.removeButton.click();

        basketPage.deleteButton.click();

        String actualText = basketPage.emptyBasketText.getText();
        String expectedText ="Sepetin Boş Görünüyor";

        Assert.assertEquals(actualText ,expectedText);











    }



}
