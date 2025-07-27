package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.ConstantsCartPage.*;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickToEditButton(){
        clickToWebElement(editButton);
    }

    public void clickToRemoveButton(){
        clickToWebElement(removeButton);
    }
    public String getCartEmptyMessage(){
      return getTextMethod(cartEmptyMessageText);
    }


}
