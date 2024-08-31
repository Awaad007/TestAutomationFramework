package Pages;

import Common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailPage extends PageBase {
    public EmailPage(WebDriver driver) {
        super(driver);
    }


    //locators
    By friendEmail = By.id("FriendEmail");
    By personalMessage = By.id("PersonalMessage");
    By sendEmailBtn = By.name("send-email");
    By successMessage = By.cssSelector("div.result");
    String emailFriendData = "EmailAFriendData.json";
    //method
    public void userSetFriendEmail(){
        setElementText(friendEmail,jsonReader("friendEmail",emailFriendData));
    }
    public void userSetPersonalMessage(){
        setElementText(personalMessage,jsonReader("personalMessage",emailFriendData));
    }
    public void userClickOnSendEmailBtn(){
        clickOnButton(sendEmailBtn);
    }
    public boolean assertThatEmailSent(){
        find(successMessage).isDisplayed();
        return true;
    }


}
