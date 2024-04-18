package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Cart;
import pages.ThankYouPage;

public class CartTest extends Base {
    @Test
    public void SuccessfullyPurchaseTest() {
        Cart cart = homePage.clickCartButton();
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

    }

    @Test
    public void validateCityIsNullTest() throws InterruptedException {
        Thread.sleep(1000);
        Cart cart = homePage.clickCartButton();
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

    }

    @Test
    public void validateMonthIsNullTest() throws InterruptedException {
        Cart cart = homePage.clickCartButton();
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
        cart.clickCloseButton();

    }

    @Test
    public void validateNameIsNotNullTest() throws InterruptedException {
        Thread.sleep(1000);
        Cart cart = homePage.clickCartButton();
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

    }

    @Test
    public void validateCardIsNotNullTest() throws InterruptedException {
        Thread.sleep(1000);
        Cart cart = homePage.clickCartButton();
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

    }

    @Test
    public void validateCountryIsNullTest() {
        Cart cart = homePage.clickCartButton();
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

    }
}
