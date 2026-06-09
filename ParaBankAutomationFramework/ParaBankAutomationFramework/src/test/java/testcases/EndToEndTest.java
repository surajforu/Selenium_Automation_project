/*
 * package testcases;
 * 
 * import org.openqa.selenium.By; import org.testng.Assert; import
 * org.testng.annotations.Test;
 * 
 * import com.parabank.base.BaseTest;
 * 
 * import pages.BillPayPage; import pages.LoginPage; import
 * pages.OpenAccountPage; import pages.RegistrationPage; import
 * pages.TransferFundsPage;
 * 
 * 
 * public class EndToEndTest extends BaseTest {
 * 
 * @Test public void registerAndLoginFlow() {
 * 
 * String username = "suraj" + System.currentTimeMillis(); String password =
 * "Test@123";
 * 
 * RegistrationPage registrationPage = new RegistrationPage(driver);
 * 
 * registrationPage.registerUser(username, password);
 * 
 * Assert.assertTrue( driver.getPageSource()
 * .contains("Your account was created successfully"));
 * 
 * System.out.println("Registered Username : " + username);
 * 
 * // Logout after successful registration
 * driver.findElement(By.linkText("Log Out")).click();
 * 
 * LoginPage loginPage = new LoginPage(driver);
 * 
 * loginPage.login(username, password);
 * 
 * Assert.assertTrue( driver.getPageSource() .contains("Accounts Overview"));
 * 
 * System.out.println("Login Successful"); OpenAccountPage openAccountPage = new
 * OpenAccountPage(driver);
 * 
 * String accountNumber = openAccountPage.openSavingsAccount();
 * 
 * System.out.println( "Generated Account Number : " + accountNumber);
 * 
 * Assert.assertFalse(accountNumber.isEmpty());
 * 
 * TransferFundsPage transferPage = new TransferFundsPage(driver);
 * 
 * 
 * 
 * transferPage.transferFunds("100");
 * 
 * String actualMessage = transferPage.getTransferMessage();
 * 
 * System.out.println( "Transfer Message = " + actualMessage);
 * 
 * Assert.assertTrue( actualMessage.contains("Transfer")); BillPayPage
 * billPayPage = new BillPayPage(driver);
 * 
 * billPayPage.payBill();
 * 
 * String paymentMessage = billPayPage.getPaymentMessage();
 * 
 * System.out.println( "Payment Message = " + paymentMessage);
 * 
 * Assert.assertTrue( paymentMessage.contains("Bill Payment")); } }
 */