package stepDefinitions;

import org.openqa.selenium.WebDriver;

import hooks.Hooks;

import io.cucumber.java.en.*;

import pages.LoginPage;

public class LoginSteps {

    WebDriver driver = Hooks.driver;

    LoginPage lp = new LoginPage(driver);

    @When("User clicks Logout")
    public void user_clicks_logout() throws InterruptedException {

        lp.clickLogout();
        Thread.sleep(3000);
    }

    @When("User clicks Login")
    public void user_clicks_login() throws InterruptedException {

        lp.clickMyAccount();

        lp.clickLogin();
        Thread.sleep(3000);
    }

    @When("User enters valid email and password")
    public void user_enters_login_details() throws InterruptedException {

        lp.enterLoginDetails();
        Thread.sleep(3000);
    }

    @When("User clicks Login button")
    public void user_clicks_login_button() throws InterruptedException {

        lp.clickLoginButton();
        Thread.sleep(3000);
    }
}