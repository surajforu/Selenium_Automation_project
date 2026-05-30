package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestData;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    By myAccount =   By.xpath("//span[text()='My Account']");

    By login = By.linkText("Login");

    By email = By.id("input-email");

    By password = By.id("input-password");

    By loginBtn = By.xpath("//input[@value='Login']");

    By logout = By.linkText("Logout");

    public void clickMyAccount() {

        driver.findElement(myAccount).click();
    }

    public void clickLogin() {

        driver.findElement(login).click();
    }

    public void enterLoginDetails() {

        driver.findElement(email)
        .sendKeys(TestData.email);

        driver.findElement(password)
        .sendKeys(TestData.password);
    }

    public void clickLoginButton() {

        driver.findElement(loginBtn).click();
    }

    public void clickLogout() {

        driver.findElement(logout).click();
    }
}