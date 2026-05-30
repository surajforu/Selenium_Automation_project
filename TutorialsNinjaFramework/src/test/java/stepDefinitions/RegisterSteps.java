package stepDefinitions;

import org.openqa.selenium.WebDriver;

import hooks.Hooks;

import io.cucumber.java.en.*;

import pages.RegisterPage;
import utils.TestData;

public class RegisterSteps {

    WebDriver driver = Hooks.driver;

    RegisterPage rp = new RegisterPage(driver);

    @Given("User opens browser")
    public void user_opens_browser() {

        System.out.println("Browser Opened");
    }

    @Given("User launches TutorialsNinja website")
    public void user_launches_website() {

        driver.get("https://tutorialsninja.com/demo/");
    }

    @When("User clicks My Account")
    public void user_clicks_my_account() {

        rp.clickMyAccount();
    }

    @When("User clicks Register")
    public void user_clicks_register() {

        rp.clickRegister();
    }

    @When("User enters registration details")
    public void user_enters_registration_details() {

        rp.enterRegistrationDetails();
    }

    @When("User clicks Continue button")
    public void user_clicks_continue_button() throws InterruptedException {

        rp.clickContinue();
        Thread.sleep(3000);
    }
}