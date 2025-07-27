package tests;

import base.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SpekersPage;

public class EditItemTest extends BaseTest {
    HomePage homePage;
    SpekersPage spekersPage;
    ProductPage productPage;
    CartPage cartPage;


    @Description("Editing an existing item.")
    @Test
    public void editItemTest() throws InterruptedException {

        homePage = new HomePage(driver);
        homePage.clickToSpekersImg();

        spekersPage = new SpekersPage(driver);
        spekersPage.clickToSecondProduct();

        productPage = new ProductPage(driver);
        productPage.clickToAddCardtButton();
        productPage.clickToCartButton();

        cartPage = new CartPage(driver);
        cartPage.clickToEditButton();
        productPage.clickToPlusButton();
        productPage.clickToAddCardtButton();






    }
}
