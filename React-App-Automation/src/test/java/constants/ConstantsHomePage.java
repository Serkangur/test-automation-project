package constants;

import org.openqa.selenium.By;

public class ConstantsHomePage {
    public static By profileIcon = By.id("menuUserSVGPath");
    public static By createNewAccountButton = By.xpath("//*[@class='create-new-account ng-scope']");
    public static By loadingSpinner =  By.xpath("//svg[contains(@class,'spinner')]");
    public static By userNameField = By.name("username");
    public static By passwordField = By.name("password");
    public static By signInButton= By.id("sign_in_btn");
    public static By getProfileIcon = By.cssSelector(".hi-user.containMiniTitle.ng-binding");
    public static By myAccount = By.xpath(".//label[contains(text(),'My account')]");
    public static By loginTittle = By.id("loginMiniTitle");
    public static By spekersImg = By.id("speakersImg");
    public static By cartElementValue= By.xpath("(//span[@class=\"cart ng-binding\"])[2]");
}
