package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Cart;
import pages.ThankYouPage;

public class CartTest extends Base {
    Cart cart;
    @Test
    public void SuccessfullyPurchaseTest() {
        cart = homePage.clickCartButton();
        cart.clickPlaceOrder();
        cart.fillNameField("ghada");
        cart.fillCountryField("egy");
        cart.fillCityField("cairo");
        cart.fillCardField("987654321");
        cart.fillMonthField("dec");
        cart.fillYearField("2024");
        ThankYouPage thankYouPage = cart.clickPurchaseButton();
        Assert.assertTrue(thankYouPage.checkThankYou().contains("Thank you for your purchase!"));
        homePage = thankYouPage.clickOkBtn();
        Assert.assertTrue(homePage.checkProductStore().contains("PRODUCT STORE"));
        cart.clickCloseButton();
        homePage.navigateToHomePage();

    }

    @Test
    public void validateCityIsNullTest() throws InterruptedException {
        cart = homePage.clickCartButton();
        Thread.sleep(1000);
        cart.clickPlaceOrder();
        cart.fillNameField("ghada");
        cart.fillCountryField("egy");
        cart.fillCardField("987654321");
        cart.fillMonthField("dec");
        cart.fillYearField("2024");
        ThankYouPage thankYouPage = cart.clickPurchaseButton();
        Assert.assertTrue(thankYouPage.checkThankYou().contains("Thank you for your purchase!"));
        homePage = thankYouPage.clickOkBtn();
        Assert.assertTrue(homePage.checkProductStore().contains("PRODUCT STORE"));
        cart.clickCloseButton();
        homePage.navigateToHomePage();

    }

    @Test
    public void validateMonthIsNullTest() throws InterruptedException {
        cart = homePage.clickCartButton();
        cart.clickPlaceOrder();
        cart.fillNameField("ghada");
        cart.fillCountryField("egy");
        cart.fillCityField("cairo");
        cart.fillCardField("987654321");
        cart.fillYearField("2024");
        ThankYouPage thankYouPage = cart.clickPurchaseButton();
        Assert.assertTrue(thankYouPage.checkThankYou().contains("Thank you for your purchase!"));
        Thread.sleep(1000);
        homePage = thankYouPage.clickOkBtn();
        Assert.assertTrue(homePage.checkProductStore().contains("PRODUCT STORE"));
        homePage.navigateToHomePage();

    }

    @Test
    public void validateNameIsNotNullTest() throws InterruptedException {
        cart = homePage.clickCartButton();
        Thread.sleep(1000);
        cart.clickPlaceOrder();
        cart.fillCountryField("egy");
        cart.fillCityField("cairo");
        cart.fillCardField("987654321");
        cart.fillMonthField("dec");
        cart.fillYearField("2024");
        cart.clickPurchaseButton();
        Assert.assertFalse(cart.checkAlertTxt().contains("please fill out Name and Creditcard"));
        cart.acceptAlert();
        Thread.sleep(1000);
        cart.clickCloseButton();
        homePage.navigateToHomePage();

    }

    @Test
    public void validateCardIsNotNullTest() throws InterruptedException {
        cart = homePage.clickCartButton();
        Thread.sleep(1000);
        cart.clickPlaceOrder();
        cart.fillNameField("doo");
        cart.fillCountryField("egy");
        cart.fillCityField("cairo");
        cart.fillMonthField("dec");
        cart.fillYearField("2024");
        cart.clickPurchaseButton();
        Assert.assertFalse(cart.checkAlertTxt().contains("please fill out Name and Creditcard"));
        cart.acceptAlert();
        Thread.sleep(1000);
        cart.clickCloseButton();
        homePage.navigateToHomePage();

    }

    @Test
    public void validateCountryIsNullTest() {
        cart = homePage.clickCartButton();
        cart.clickPlaceOrder();
        cart.fillNameField("ghada");
        cart.fillCityField("cairo");
        cart.fillCardField("987654321");
        cart.fillMonthField("dec");
        cart.fillYearField("2024");
        ThankYouPage thankYouPage = cart.clickPurchaseButton();
        Assert.assertTrue(thankYouPage.checkThankYou().contains("Thank you for your purchase!"));
        homePage = thankYouPage.clickOkBtn();
        Assert.assertTrue(homePage.checkProductStore().contains("PRODUCT STORE"));
        homePage.navigateToHomePage();

    }
}
