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

    //methods
    public void openRegisterPage() {
        clickOnButton(registerLink);
    }
}
