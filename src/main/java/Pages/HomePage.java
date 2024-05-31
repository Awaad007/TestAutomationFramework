package Pages;

import Common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //locators
    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");

    By logoutLink = By.linkText("Log out");

    //methods
    public void openRegisterPage() {
        clickOnButton(registerLink);
    }
    public void openLoginPage(){
        clickOnButton(loginLink);
    }
    public boolean assertThatUserLoggedIn(){
        find(logoutLink).isDisplayed();
        return true;
    }
}
