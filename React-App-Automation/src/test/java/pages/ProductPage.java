package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.ConstantsHomePage.cartElementValue;
import static constants.ConstantsProductPage.*;

public class ProductPage extends BasePage {
    public String cartCount ="2";
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickToAddCardtButton(){
        clickToWebElement(addCardtButton);
    }

    public void clickToCartButton(){
        clickToWebElement(CartButton);
    }
    public void clickToPlusButton(){
        clickToWebElement(plusButton);
    }

    public String getTextCartCount(){
        return getTextMethod(cartElementValue);
    }


}
