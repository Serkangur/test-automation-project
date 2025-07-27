package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constants.ConstantsHomePage.*;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickToProfileIcon(){
        clickToWebElement(profileIcon);
    }

    public void clickToCreateNewUserButton(){
        clickToWebElementWaitSvg(createNewAccountButton);
    }

    public void inputUserName(String username){
        inputTextMethodSvg(username,userNameField);
    }

    public void inputPassword(String password){
        inputTextMethod(password,passwordField);
    }
    public void clickToLoginButton(){
        clickToWebElement(signInButton);
    }

    public WebElement isDisplayedCreateButton() {
        return find(createNewAccountButton);
    }


}
