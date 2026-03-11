package com.sisense.resources;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class SisenseAcademyPage extends AbstractPage {

	public SisenseAcademyPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/**
	 * WebElement for Sisense Academy menu under Resources tab
	 */
	@FindBy(xpath = "//a[normalize-space()='Sisense Academy']")
	private WebElement sisenseAcademyMenuUnderResourcesTab;

	/**
	 * Clicks on the Sisense Academy menu under the Resources tab. This opens the
	 * Sisense Academy in a new window and switches to it.
	 */
	public void clickOnSisenseAcademyMenuUnderResourcesTab() {
		Common.waitForElementToBeVisible(driver, sisenseAcademyMenuUnderResourcesTab);
		Common.jsClick(driver,sisenseAcademyMenuUnderResourcesTab);
		log("Click on Sisense Academy menu under Resources tab successfully.");
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
		Common.checkTitleNull(driver);
	}

	/**
	 * Verifies the title of the Sisense Academy page.
	 */
	public void verifySisenseAcademyPageTitle() {
		Assert.assertEquals("Sisense Academy Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.SISENSE_ACADEMY_TITLE);
		log("Sisense Academy page title matched successfully.");
	}
}
