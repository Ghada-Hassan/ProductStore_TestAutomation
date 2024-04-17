package tests;

import org.testng.annotations.Test;
import base.Base;
import pages.*;
import pages.HomePage;
import pages.ProductDescription;
import static org.testng.AssertJUnit.assertTrue;

public class ProductTest extends Base  {
    private ProductDescription productDescriptionPage;
    @Test
    public void testGetAddToCart() {
        productDescriptionPage=homePage.chooseItem();
        productDescriptionPage.getAddToCart();

    }
}
