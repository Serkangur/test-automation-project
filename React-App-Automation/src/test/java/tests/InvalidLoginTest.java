package tests;

import base.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class InvalidLoginTest extends BaseTest {
    HomePage homePage;

    @Description("Login with invalid credentials")
    @Test
    public void validLogintTest() throws InterruptedException {

        homePage = new HomePage(driver);
        homePage.clickToProfileIcon();
        homePage.inputUserName("serkansjsjsj");
        homePage.inputPassword("123456789");
        homePage.clickToLoginButton();
        Assert.assertTrue(homePage.isDisplayedCreateButton().isDisplayed());


    }
}
