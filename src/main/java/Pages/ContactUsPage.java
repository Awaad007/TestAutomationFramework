package Pages;

import Common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends PageBase {
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
    //locators
    By nameTxt = By.id("FullName");
    By emailTxt = By.id("Email");
    By enquiryTxt = By.id("Enquiry");
    By submitBtn = By.name("send-email");
    By successMessage = By.cssSelector("div.result");
    String contactUsData = "ContactUsData.json";

    //methods
    public void userAddFullName(){
        setElementText(nameTxt,jsonReader("fullName",contactUsData));
    }
    public void userAddEnquiry(){
        setElementText(enquiryTxt,jsonReader("enquiry",contactUsData));
    }
    public void userEnterEmail(){
        setElementText(emailTxt,jsonReader("emailAddress",contactUsData));
    }
    public void userClickOnSubmitBtn(){
        clickOnButton(submitBtn);
    }
    //assert
    public boolean successMessageDisplayed(){
        find(successMessage).isDisplayed();
        return true;
    }
}
