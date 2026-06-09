package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.parabank.base.BaseTest;

import pages.LoginPage;
import utilities.ExcelUtils;

public class LoginTest extends BaseTest {

	@Test(priority = 2)
	public void verifyValidLogin() {

		String username = ExcelUtils.getCellData("LoginData", 1, 0);

		String password = ExcelUtils.getCellData("LoginData", 1, 1);

		LoginPage loginPage = new LoginPage(driver);

		loginPage.login(username, password);

		Assert.assertTrue(driver.getPageSource().contains("Accounts Overview"));

		System.out.println("✓ Login Successful");
	}
}