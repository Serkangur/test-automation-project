package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static constants.ConstantsHomePage.*;

public class HomePage extends BasePage {
    Actions actions = new Actions(driver);
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

    public void clickToSpekersImg(){
        clickToWebElement(spekersImg);
    }

    public void clickToProfileElement(){
        clickToWebElement(getProfileIcon);
    }

    public void clickToMyAccount(){
        find(loginTittle);
        clickToWebElement(myAccount);
    }


}
