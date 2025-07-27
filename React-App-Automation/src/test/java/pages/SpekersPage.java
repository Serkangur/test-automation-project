package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.ConstantsSpekersPage.*;

public class SpekersPage extends BasePage {
    public SpekersPage(WebDriver driver) {
        super(driver);
    }

    public void clickToSecondProduct(){
        clickToWebElement(secondProduct);
    }


}
