package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenAccountPage {

	WebDriver driver;

	public OpenAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	By openNewAccountLink = By.linkText("Open New Account");
	By accountTypeDropdown = By.id("type");
	By openAccountButton = By.xpath("//input[@value='Open New Account']");
	By newAccountNumber = By.id("newAccountId");

	public String openSavingsAccount() {

		driver.findElement(openNewAccountLink).click();

		Select accountType = new Select(driver.findElement(accountTypeDropdown));

		accountType.selectByVisibleText("SAVINGS");

		driver.findElement(openAccountButton).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement accountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(newAccountNumber));

		String accountNumber = accountElement.getText();

		System.out.println("Account Number = " + accountNumber);

		return accountNumber;
	}
}