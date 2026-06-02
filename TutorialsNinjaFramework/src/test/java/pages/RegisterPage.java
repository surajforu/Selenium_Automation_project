package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utils.TestData;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {

        this.driver = driver;
    }

    By myAccount =
            By.xpath("//span[text()='My Account']");

    By register =  By.linkText("Register");

    By firstName = By.id("input-firstname");

    By lastName =  By.id("input-lastname");

    By email = By.id("input-email");

    By telephone = By.id("input-telephone");

    By password = By.id("input-password");

    By confirmPassword = By.id("input-confirm");

    By privacyPolicy =  By.name("agree");

    By continueBtn = By.xpath("//input[@value='Continue']");

    public void clickMyAccount() {

    driver.findElement(myAccount);

    ((JavascriptExecutor) driver)
            .executeScript("arguments[0].click();",
                    driver.findElement(myAccount));
}

    public void clickRegister() {

        driver.findElement(register).click();
    }

    public void enterRegistrationDetails() {

        driver.findElement(firstName).sendKeys("Suraj");

        driver.findElement(lastName).sendKeys("Shaw");


        TestData.email ="suraj" + System.currentTimeMillis() + "@gmail.com";

        driver.findElement(email) .sendKeys(TestData.email);

        driver.findElement(telephone) .sendKeys("9876543210");

        driver.findElement(password) .sendKeys(TestData.password);

        driver.findElement(confirmPassword).sendKeys(TestData.password);

        driver.findElement(privacyPolicy) .click();


        System.out.println(TestData.email);
    }

    public void clickContinue() {

        driver.findElement(continueBtn).click();
    }
}
