package Pages;

import Common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends PageBase {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    //locators
    By changePasswordLink = By.linkText("Change password");
    By oldPasswordTxt = By.id("OldPassword");
    By newPasswordTxt = By.id("NewPassword");
    By confirmPasswordTxt = By.id("ConfirmNewPassword");
    By changePasswordBtn = By.cssSelector(".button-1.change-password-button");
    By notificationBar = By.cssSelector(".bar-notification.success");
    By closeBtn = By.cssSelector("span.close");

    String changePasswordData = "ChangePassword.json";

    //Methods
    public void clickOnChangePasswordPage(){
        clickOnButton(changePasswordLink);
    }
    public void enterOldPassword(){
        setElementText(oldPasswordTxt,jsonReader("oldPassword",changePasswordData));
    }
    public void enterNewPassword(){
        setElementText(newPasswordTxt,jsonReader("newPassword",changePasswordData));
    }
    public void confirmNewPassword(){
        setElementText(confirmPasswordTxt,jsonReader("confirmPassword",changePasswordData));
    }
    public void clickOnChangePasswordBtn(){
        clickOnButton(changePasswordBtn);
    }
    public boolean assertThatPasswordChanged(){
        find(notificationBar).isDisplayed();
        clickOnButton(closeBtn);
        return true;
    }

}
