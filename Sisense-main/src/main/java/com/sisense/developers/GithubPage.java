package com.sisense.developers;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class GithubPage extends AbstractPage {

	public GithubPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/** “Developers” tab in the main header */
	@FindBy(xpath = "//a[text()='Developers']")
	private WebElement developersTab;

	/**
	 * Clicks on the Developers tab in the header.
	 */
	public void clickOnDevelopersTabUnderHeader() {
		Common.waitForElementToBeVisible(driver, developersTab);
		Common.jsClick(driver, developersTab);
		log("Click on Developers tab under header successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/** “GitHub” menu item under Developers tab */
	@FindBy(xpath = "//a[contains(text(),'Github')]")
	private WebElement githubMenuUnderDevelopersTab;

	/**
	 * Clicks on the GitHub menu item under Developers tab.
	 */
	public void clickOnGithubMenuUnderDevelopersTab() {
		Common.waitForElementToBeVisible(driver, githubMenuUnderDevelopersTab);
		Common.jsClick(driver, githubMenuUnderDevelopersTab);
		log("Click on GitHub menu under Developers tab successfully.");
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the GitHub page title after navigation.
	 */
	public void verifyGithubPageTitleUnderGithubPage() {
		Common.waitForPageToLoad(driver, 10);
		String actual = driver.getTitle();
		log("GitHub page title is: " + actual);
		Assert.assertEquals("GitHub Page Title did not match", FrameworkConstants.GITHUB_TITLE, actual);
		log("GitHub page title under GitHub page matched successfully.");
	}
}
