package Pages;

import Common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
        jse = (JavascriptExecutor) driver;
    }

    //locators
    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");
    By logoutLink = By.linkText("Log out");
    By myAccountLink = By.linkText("My account");
    By contactUsLink = By.linkText("Contact us");

    //methods
    public void openRegisterPage() {
        clickOnButton(registerLink);
    }
    public void openLoginPage(){
        clickOnButton(loginLink);
    }
    public void openMyAccountPage(){
        clickOnButton(myAccountLink);
    }
    public void openContactUsPage(){
        scrollToBottom();
        clickOnButton(contactUsLink);
    }
    //assert
    public boolean assertThatUserLoggedIn(){
        find(logoutLink).isDisplayed();
        return true;
    }
}
