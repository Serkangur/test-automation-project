package constants;

import org.openqa.selenium.By;

public class ConstantsCartPage {
    public static By editButton= By.xpath("//a[@class=\"edit ng-scope\"]");
    public static By removeButton = By.xpath("//a[@class=\"remove red ng-scope\"]");
    public static By cartEmptyMessageText = By.xpath("//label[@class=\"roboto-bold ng-scope\"]");
    public static By cartElementValue= By.xpath("(//span[@class=\"cart ng-binding\"])[2]");
}
