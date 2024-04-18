package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Base;
import pages.Cart;
import pages.ProductDescription;

public class ProductTest extends Base  {
    @Test
    public void testGetAddToCartSuccessfully() {
        ProductDescription productDescriptionPage;
        By choosenProduct= By.xpath("//a[text()='Samsung galaxy s6']");
        productDescriptionPage=homePage.chooseItem(choosenProduct);
        Assert.assertEquals(productDescriptionPage.getProductName(), "Samsung galaxy s6","product name mismatch");
        Assert.assertTrue(productDescriptionPage.getPrice().contains("$360"),"price mismatch");
        Assert.assertTrue(productDescriptionPage.getProductDescription().contains("The Samsung Galaxy S6"),"product description mismatch");
        productDescriptionPage.getAddToCart();
        Assert.assertEquals(productDescriptionPage.checkAlertTxt(),"Product added");
        productDescriptionPage.acceptAlert();
    }
   /* @Test
    public void testIncorrectProductDetails() {
        By choosenProduct= By.xpath("//a[text()='Samsung galaxy s6']");
        productDescriptionPage=homePage.chooseItem(choosenProduct);
        Assert.assertNotEquals(productDescriptionPage.getProductName(), "Nokia lumia 1520", "Product name mismatch");
        Assert.assertFalse(productDescriptionPage.getPrice().contains("$330"), "Price mismatch");
        Assert.assertFalse(productDescriptionPage.getProductDescription().contains("Nokia lumia 1520"), "Product description mismatch");
    }*/
   @Test
   public void checkDeleteProduct() throws InterruptedException {
       ProductDescription productDescriptionPage;
       By choosenProduct= By.xpath("//a[text()='Samsung galaxy s6']");
       productDescriptionPage=homePage.chooseItem(choosenProduct);
       productDescriptionPage.getAddToCart();
       Thread.sleep(2000);
       Assert.assertEquals(productDescriptionPage.checkAlertTxt(),"Product added");
       productDescriptionPage.acceptAlert();
       Cart cart = homePage.clickCartButton();
       Thread.sleep(2000);
       cart.clickDeleteProduct();
       Thread.sleep(2000);
       Assert.assertFalse(cart.getProductName().contains("Samsung galaxy s6"),"the product not deleted");
   }
}