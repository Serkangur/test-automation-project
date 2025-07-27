package tests;

import base.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class ValidLoginTest extends BaseTest {
    HomePage homePage;

    @Description("Login with valid credentials")
    @Test
    public void validLogintTest() throws InterruptedException {

        homePage = new HomePage(driver);
        homePage.clickToProfileIcon();
        homePage.inputUserName("serkangur");
        homePage.inputPassword("Serkan_23");
        homePage.clickToLoginButton();
        Assert.assertEquals("serkangur",homePage.getProfileIconText(),"Login was not successful");


    }
}
