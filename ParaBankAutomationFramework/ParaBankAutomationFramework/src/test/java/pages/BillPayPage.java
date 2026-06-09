package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BillPayPage {

	WebDriver driver;

	public BillPayPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators
	By billPayLink = By.linkText("Bill Pay");

	By payeeName = By.name("payee.name");
	By address = By.name("payee.address.street");
	By city = By.name("payee.address.city");
	By state = By.name("payee.address.state");
	By zipCode = By.name("payee.address.zipCode");
	By phone = By.name("payee.phoneNumber");

	By accountNumber = By.name("payee.accountNumber");
	By verifyAccount = By.name("verifyAccount");

	By amount = By.name("amount");

	By sendPaymentButton = By.xpath("//input[@value='Send Payment']");

	public void payBill() {

		driver.findElement(billPayLink).click();

		driver.findElement(payeeName).sendKeys("Electricity Board");
		driver.findElement(address).sendKeys("Park Street");
		driver.findElement(city).sendKeys("Kolkata");
		driver.findElement(state).sendKeys("West Bengal");
		driver.findElement(zipCode).sendKeys("700001");
		driver.findElement(phone).sendKeys("9876543210");

		driver.findElement(accountNumber).sendKeys("12345");
		driver.findElement(verifyAccount).sendKeys("12345");

		driver.findElement(amount).sendKeys("100");

		driver.findElement(sendPaymentButton).click();
	}

	public String getPaymentMessage() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1"))).getText();
	}
}