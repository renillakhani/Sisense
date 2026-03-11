package com.orangehrm;

import static com.kfast.init.Common.waitAndClick;
import static com.kfast.init.Common.waitAndSendKeys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.init.AbstractPage;

public class LoginPage extends AbstractPage {

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(name = "username")
	private WebElement usenameTxtField;

	@FindBy(name = "password")
	private WebElement passwordTxtField;

	@FindBy(xpath = "//button[contains(.,'Login')]")
	private WebElement loginBtn;

	private LoginPage enterUsername(String username) {
		log("Enter Username: " + username);
		waitAndSendKeys(driver, usenameTxtField, username);
		return this;
	}

	private LoginPage enterPassword(String password) {
		log("Enter Password: " + password);
		waitAndSendKeys(driver, passwordTxtField, password);
		return this;
	}

	private LoginPage clickLoginBtn() {
		log("Click on Login button");
		waitAndClick(driver, loginBtn);
		return this;
	}

	public LoginPage login(String username, String password) {
		enterUsername(username).enterPassword(password);
		clickLoginBtn();
		return this;
	}
}
