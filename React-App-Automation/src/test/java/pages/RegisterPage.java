package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.Random;

import static constants.ConstantsRegisterPage.*;



public class RegisterPage extends BasePage {
    String randomMail = generateRandomEmail();
    String randomUsername = generateRandomUsername();
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void generateUsername() {
       inputTextMethod(randomUsername,userName);
    }

    public void generateEmail() {
        inputTextMethod(randomMail,email);
    }

    public void inputPassword(String text) {
        inputTextMethod(text,password);
    }

    public void inputConfirmPassword(String text) {
        inputTextMethod(text,confirmPassword);
    }

    public void inputFirstName(String text) {
        inputTextMethod(text,firstName);
    }

    public void inputLastName(String text) {
        inputTextMethod(text,lastName);
    }

    public void inputPhoneNumber(String text) {
        inputTextMethod(text,phoneNumber);
    }

    public void inputCountry(String country) {
        selectDropDown(countryDropdown,country);
    }

    public void inputCity(String text) {
        inputTextMethod(text,city);
    }

    public void inputAdress(String text) {
        inputTextMethod(text,address);
    }

    public void inputState(String text) {
        inputTextMethod(text,state);
    }

    public void inputPostalCode(String text) {
        inputTextMethod(text,postalCode);
    }

    public void clickToPrivacyPolicy() {
        clickToWebElement(privacyPolicy);
    }
    public void clickToRegisterButton(){
        clickToWebElement(registerButton);
    }



}
