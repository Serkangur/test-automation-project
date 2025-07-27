package tests;

import base.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SpekersPage;

public class DeleteProduct extends BaseTest {
    HomePage homePage;
    SpekersPage spekersPage;
    ProductPage productPage;
    CartPage cartPage;


    @Description("Deleting an product.")
    @Test
    public void deleteProduct() throws InterruptedException {

        homePage = new HomePage(driver);
        homePage.clickToSpekersImg();

        spekersPage = new SpekersPage(driver);
        spekersPage.clickToSecondProduct();

        productPage = new ProductPage(driver);
        productPage.clickToAddCardtButton();
        productPage.clickToCartButton();

        cartPage = new CartPage(driver);
        cartPage.clickToRemoveButton();
        Assert.assertEquals("Your shopping cart is empty",cartPage.getCartEmptyMessage(),"Your shopping cart is'nt empty");
    }
}
