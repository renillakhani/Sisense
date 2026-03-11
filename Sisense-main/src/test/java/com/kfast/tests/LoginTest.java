package com.kfast.tests;

import static com.kfast.init.DriverManager.getDriver;
import static com.kfast.init.ITestStatus.FAILED;
import static com.kfast.init.ITestStatus.PASSED;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;
import com.kfast.utils.DataUtils;
import com.login.LoginPage;

/**
 * The Class LoginTest.
 */
public class LoginTest extends SeleniumInit {

	/**
	 * Test TC 01.
	 *
	 * @param testData the test data
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@Test
	public void testTC01(Map<String, String> testData) throws IOException {
		int numOfFailure = 0;
		WebDriver driver = getDriver();
		LoginPage loginIndexPage = new LoginPage(driver);

		loginIndexPage.startTest();
		//getting data from json file
		String username = testData.get("username");
		String password = testData.get("password");

		loginIndexPage.enterLoginDetails(username, password);
		log("Verifying user has been logged in.");
		if (loginIndexPage.verifyNameOnHeader()) {
			logStatus(PASSED, "Login Successful");
		} else {
			logStatus(FAILED, "Login Unsuccessful.");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

	/**
	 * Test TC 02.
	 *
	 * @param testData the test data
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@Test
	public void testTC02() throws IOException {
		int numOfFailure = 0;
		WebDriver driver = getDriver();
		LoginPage loginIndexPage = new LoginPage(driver);

		loginIndexPage.startTest();
		//here you can use different DataUtils  method as per your requirement
		List<String> getUserName=DataUtils.getColumnData("WebUILoginSheet.xlsx","Login" ,"username");
		List<String> getPassword=DataUtils.getColumnData("WebUILoginSheet.xlsx","Login" ,"password");
		
		loginIndexPage.enterLoginDetails(getUserName.get(0), getPassword.get(0));
		
		log("Verifying user has been logged in.");
		if (loginIndexPage.verifyNameOnHeader()) {
			logStatus(PASSED, "Login Successful");
		} else {
			logStatus(FAILED, "Login Unsuccessful.");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}
}