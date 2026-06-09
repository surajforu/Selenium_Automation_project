package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.parabank.base.BaseTest;

import pages.BillPayPage;
import pages.LoginPage;
import utilities.ExcelUtils;

public class BillPayTest extends BaseTest {

	@Test(priority = 6)
	public void verifyBillPayment() {

		String username = ExcelUtils.getCellData("LoginData", 1, 0);

		String password = ExcelUtils.getCellData("LoginData", 1, 1);

		LoginPage loginPage = new LoginPage(driver);

		loginPage.login(username, password);

		BillPayPage billPayPage = new BillPayPage(driver);

		billPayPage.payBill();

		Assert.assertTrue(billPayPage.getPaymentMessage().contains("Bill Payment"));
		System.out.println("✓ Bill Payment Successful");
		driver.findElement(By.linkText("Log Out")).click();

		Assert.assertTrue(driver.getCurrentUrl().contains("index"));

		System.out.println("✓ Logout Successful");
	}
}