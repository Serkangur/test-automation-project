package constants;

import org.openqa.selenium.By;

public class ConstantsHomePage {
    public static By profileIcon = By.id("menuUserSVGPath");
    public static By createNewAccountButton = By.xpath("//*[@class='create-new-account ng-scope']");
    public static By loadingSpinner =  By.xpath("//svg[contains(@class,'spinner')]");
    public static By userNameField = By.name("username");
    public static By passwordField = By.name("password");
    public static By signInButton= By.id("sign_in_btn");
    public static By getProfileIconText = By.cssSelector(".hi-user.containMiniTitle.ng-binding");
}
