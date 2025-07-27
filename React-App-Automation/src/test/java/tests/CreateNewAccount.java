package tests;

import base.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

import static base.BasePage.delay;

public class CreateNewAccount extends BaseTest {

    HomePage homePage;
    RegisterPage registerPage;
    @Description("Creating a new user")
    @Test
    public void create_New_User() throws InterruptedException {

        homePage = new HomePage(driver);
        homePage.clickToProfileIcon();
        homePage.clickToCreateNewUserButton();

        registerPage = new RegisterPage(driver);
        registerPage.generateUsername();
        registerPage.generateEmail();
        registerPage.inputPassword("Serkan_23");
        registerPage.inputConfirmPassword("Serkan_23");
        registerPage.inputFirstName("Serkan");
        registerPage.inputLastName("Gür");
        registerPage.inputPhoneNumber("05314562578");
        registerPage.inputCountry("Turkey");
        registerPage.inputCity("İstanbul");
        registerPage.inputAdress("İstanbul");
        registerPage.inputState("İstanbul");
        registerPage.inputPostalCode("23156");
        registerPage.clickToPrivacyPolicy();
        registerPage.clickToRegisterButton();


    }
}
