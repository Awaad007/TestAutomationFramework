package steps;

import Pages.EmailPage;
import Pages.ProductDetailsPage;
import connector.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC06_EmailProductToFriend {
    ProductDetailsPage productObject;
    EmailPage emailObject;
    @Given("user at the product screen and click on email a friend button")
    public void userAtTheProductScreenAndClickOnEmailAFriendButton() {
        productObject = new ProductDetailsPage(Hooks.driver);
        productObject.clickOnEmailFriendBtn();
    }

    @When("user enter friend email")
    public void userEnterFriendEmail() {
        emailObject = new EmailPage(Hooks.driver);
        emailObject.userSetFriendEmail();
    }

    @And("user enter personal message")
    public void userEnterPersonalMessage() {
        emailObject.userSetPersonalMessage();
    }
    @And("user click on send message button")
    public void userClickOnSendMessageButton() {
        emailObject.userClickOnSendEmailBtn();
    }

    @Then("friend should receive message successfully")
    public void friendShouldReceiveMessageSuccessfully() {
        boolean isDisplayed = emailObject.assertThatEmailSent();
        Assert.assertTrue(isDisplayed);
    }


}
