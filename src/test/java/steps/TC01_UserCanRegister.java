package steps;

import Pages.HomePage;
import Pages.RegisterPage;
import connector.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static connector.Hooks.driver;

public class TC01_UserCanRegister{
    HomePage homeObject;
    RegisterPage registerObject;

    @Given("user at register screen")
    public void user_at_register_screen() {
        homeObject = new HomePage(Hooks.driver);
        homeObject.openRegisterPage();
    }
    @When("user enter frist name")
    public void user_enter_frist_name() {
        registerObject= new RegisterPage(Hooks.driver);
        registerObject.userSetFirstName();
    }
    @And("user enter last name")
    public void user_enter_last_name() {
        registerObject.userSetLastName();
    }
    @And("user enter email address")
    public void user_enter_email_address() {
        registerObject.userSetEmailAddress();
    }
    @And("user enter password")
    public void user_enter_password() {
        registerObject.userSetPassword();

    }
    @And("user confrim password")
    public void user_confrim_password() {
        registerObject.userSetPassword();
    }
    @And("click on rigster button")
    public void click_on_rigster_button() {
        registerObject.userClickOnRegisterBtn();
    }
    @Then("user should be registered successfully")
    public void user_should_be_registered_successfully() {
    }

}
