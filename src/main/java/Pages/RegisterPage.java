package Pages;

import Common.PageBase;
import com.google.gson.JsonObject;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class RegisterPage extends PageBase {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    //locators
    By maleRadioButton = By.id("gender-male");
    By firstNameTxt = By.id("FirstName");
    By lastNameTxt = By.id("LastName");
    By emailAddressTxt = By.name("Email");
    By passwordTxt = By.id("Password");
    By confirmPasswordTxt = By.name("ConfirmPassword");
    By registerBtn = By.id("register-button");
   public By successMessage = By.cssSelector("div.result");

   String registerData = "RegisterCredentials.json";


   //methods
    public void userSetFirstName(){
        System.out.println(jsonReader("firstName",registerData));
        setElementText(firstNameTxt,jsonReader("firstName",registerData));
        clickOnButton(maleRadioButton);
    }

    public void userSetLastName(){
        setElementText(lastNameTxt,jsonReader("lastName",registerData));
    }

    public void userSetEmailAddress(){
        setElementText(emailAddressTxt,jsonReader("emailAddress",registerData));
    }
    public void userSetPassword(){
        System.out.println(jsonReader("password",registerData));
        setElementText(passwordTxt,jsonReader("password",registerData));
    }

    public void userSetConfirmationPassword(String password){
        setElementText(confirmPasswordTxt,jsonReader("password",registerData));
    }
    public void userClickOnRegisterBtn(){
        clickOnButton(registerBtn);

    }
}
