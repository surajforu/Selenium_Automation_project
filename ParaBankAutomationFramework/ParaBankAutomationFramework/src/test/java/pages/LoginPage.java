package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.name("username");
	By password = By.name("password");
	By loginButton = By.xpath("//input[@value='Log In']");

	public void login(String userName, String passWord) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOfElementLocated(username));

		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(userName);

		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(passWord);

		driver.findElement(loginButton).click();
	}
}