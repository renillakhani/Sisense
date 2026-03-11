package com.orangehrm;

import static com.kfast.constants.FrameworkConstants.LOW_TIMEOUT;
import static com.kfast.init.Common.checkIfElementIsDisplayedwithWait;
import static com.kfast.init.Common.waitAndClick;
import static com.kfast.init.Common.waitAndSendKeys;
import static com.kfast.init.Common.waitForElementToBeVisible;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.init.AbstractPage;

public class PIMPage extends AbstractPage {

	public PIMPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = "//h6[text()='PIM']")
	private WebElement pimHeader;

	public boolean verifyRedirectedToPIM() {
		return checkIfElementIsDisplayedwithWait(driver, pimHeader, LOW_TIMEOUT);
	}

	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
	private WebElement empNameTxt;
	@FindBy(xpath = "//div[@role='listbox']//div[1]")
	private WebElement dropdown;

	public PIMPage enterEmpName(String name) {
		log("Enter emp name " + name);
		waitAndSendKeys(driver, empNameTxt, name);
		waitForElementToBeVisible(driver, dropdown, 3);
		waitAndClick(driver, dropdown);
		return this;
	}

	@FindBy(xpath = "//button[normalize-space()='Search']")
	private WebElement searchBtn;

	public PIMPage clickSearch() {
		log("click on search button");
		waitAndClick(driver, searchBtn);
		return this;
	}

	public PIMPage checkEmpList(String empName) {
		log("*****Check employee list******");
		enterEmpName(empName);
		clickSearch();
		return this;
	}

	@FindBy(xpath = "//span[normalize-space()='(1) Record Found']")
	private WebElement recOption;

	public boolean verifyEmpName() {
		return checkIfElementIsDisplayedwithWait(driver, recOption, LOW_TIMEOUT);
	}

}
