package com.sisense.resources;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class CommunityPage extends AbstractPage {

	public CommunityPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Web element: Community menu under the Resources tab
	@FindBy(xpath = "//a[normalize-space()='Community']")
	private WebElement communityMenuUnderResourcesTab;

	/**
	 * Clicks on the Community menu under the Resources tab. Waits for the element
	 * to be visible and then switches to the new window. Validates that the title
	 * is not null after switching.
	 */
	public void clickOnCommunityMenuUnderResourcesTab() {
		Common.waitForElementToBeVisible(driver, communityMenuUnderResourcesTab);
		Common.jsClick(driver,communityMenuUnderResourcesTab);
		log("Click on Community Menu under Resources Tab successfully.");

		Common.waitForPageToLoad(driver, 10);
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
		Common.checkTitleNull(driver);
	}

	/**
	 * Verifies that the Community page title matches the expected value.
	 */
	public void verifyCommunityPageTitle() {
		Assert.assertEquals("Community Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.COMMUNITY_HOME_TITLE);
		log("Community Page Title matched successfully.");
	}
}
