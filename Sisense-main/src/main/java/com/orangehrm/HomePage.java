package com.orangehrm;

import static com.kfast.constants.FrameworkConstants.LOW_TIMEOUT;
import static com.kfast.init.Common.checkIfElementIsDisplayedwithWait;
import static com.kfast.init.Common.waitAndClick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.init.AbstractPage;

public class HomePage extends AbstractPage {

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = "//h6[text()='Dashboard']")
	private WebElement dashboardHeader;

	public boolean verifyRedirectedToDashboard() {
		return checkIfElementIsDisplayedwithWait(driver, dashboardHeader, LOW_TIMEOUT);
	}

	@FindBy(xpath = "//a[.='Recruitment']")
	private WebElement recruitmentMenu;

	public HomePage goToRecruitment() {
		waitAndClick(driver, recruitmentMenu);
		return this;
	}

	@FindBy(xpath = "//a[.='PIM']")
	private WebElement pimMenu;

	public HomePage goToPIM() {
		waitAndClick(driver, pimMenu);
		return this;
	}
}
