package com.sisense.header;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

/**
 * This class handles all actions and verifications related to the header
 * section of the Sisense website.
 */
public class SisenseHeaderPage extends AbstractPage {

	public SisenseHeaderPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/**
	 * Verifies the Sisense home page title.
	 */
	public void verifySisenseHomePageTitle() {
		Assert.assertEquals("Sisense Home Page title does not match", driver.getTitle(),
				FrameworkConstants.HOMEPAGE_TITLE);
		log("Sisense Home Page title matched successfully.");
	}

	// Header Navigation Tabs

	@FindBy(xpath = "//a[normalize-space()='Platform']")
	private WebElement platformTab;

	/**
	 * Clicks on the Platform tab in the header.
	 */
	public void clickOnPlatformTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, platformTab);
		Common.jsClick(driver,platformTab);
		log("Click on the Platform tab.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Platform page title.
	 */
	public void verifyPlatformPageTitle() {
		Assert.assertEquals("Sisense Platform Page title does not match", driver.getTitle(),
				FrameworkConstants.PLATFORMPAGE_TITLE);
		log("Sisense Platform page title matched successfully.");
	}

	@FindBy(xpath = "//a[normalize-space()='Solutions']")
	private WebElement solutionsTab;

	/**
	 * Clicks on the Solutions tab in the header.
	 */
	public void clickOnSolutionsTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, solutionsTab);
		Common.jsClick(driver,solutionsTab);
		log("Click on the Solutions tab.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Solutions page title.
	 */
	public void verifySolutionsPageTitle() {
		Assert.assertEquals("Sisense Solutions Page title does not match", driver.getTitle(),
				FrameworkConstants.SOLUTIONSPAGE_TITLE);
		log("Sisense Solutions page title matched successfully.");
	}

	@FindBy(xpath = "//a[normalize-space()='Developers']")
	private WebElement developersTab;

	/**
	 * Clicks on the Developers tab in the header.
	 */
	public void clickOnDevelopersTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, developersTab);
		Common.jsClick(driver,developersTab);
		log("Click on the Developers tab.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Developers page title.
	 */
	public void verifyDevelopersPageTitle() {
		Assert.assertEquals("Sisense Developers Page title does not match", driver.getTitle(),
				FrameworkConstants.DEVELOPERSPAGE_TITLE);
		log("Sisense Developers page title matched successfully.");
	}

	@FindBy(xpath = "//a[normalize-space()='Resources']")
	private WebElement resourcesTab;

	/**
	 * Clicks on the Resources tab in the header.
	 */
	public void clickOnResourcesTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, resourcesTab);
		Common.jsClick(driver,resourcesTab);
		log("Click on the Resources tab.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Resources page title.
	 */
	public void verifyResourcesPageTitle() {
		Assert.assertEquals("Sisense Resources Page title does not match", driver.getTitle(),
				FrameworkConstants.RESOURCESPAGE_TITLE);
		log("Sisense Resources page title matched successfully.");
	}

	@FindBy(xpath = "//a[normalize-space()='Resources']//parent::li//following-sibling::li//child::a[normalize-space()='About']")
	private WebElement aboutTab;

	/**
	 * Clicks on the About tab in the header.
	 */
	public void clickOnAboutTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, aboutTab);
		Common.jsClick(driver,aboutTab);
		log("Click on the About tab.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the About page title.
	 */
	public void verifyAboutPageTitle() {
		Assert.assertEquals("Sisense About Page title does not match", driver.getTitle(),
				FrameworkConstants.ABOUTPAGE_TITLE);
		log("Sisense About page title matched successfully.");
	}

	@FindBy(xpath = "//a[normalize-space()='Watch demo now']")
	private WebElement watchDemoNowButton;

	@FindBy(xpath = "//a[normalize-space()='Demo']")
	private WebElement demoButton;

	@FindBy(xpath = "//a[normalize-space()='Watch demo']")
	private WebElement watchDemoButton;

	@FindBy(xpath = "//a[normalize-space()='Schedule demo']")
	private WebElement scheduleDemoButton;

	/**
	 * Clicks on the Demo button. If not found, tries the Watch Demo Now button.
	 */
	public void clickOnDemoButton() throws InterruptedException {
		if (Common.checkIfElementIsDisplayedWithWait(driver, demoButton, 6)) {
			Common.waitForElementToBeVisible(driver, demoButton);
			try {
				Common.jsClick(driver,demoButton);
				log("Click on the Demo button.");
			} catch (Exception e) {
				Common.jsClick(driver, demoButton);
				log("Click on the Demo button using JavaScript.");
			}
		} else if (Common.checkIfElementIsDisplayedWithWait(driver, watchDemoButton, 6)) {
			Common.waitForElementToBeVisible(driver, watchDemoButton);
			try {
				Common.jsClick(driver,watchDemoButton);
				log("Click on the Watch Demo button.");
			} catch (Exception e) {
				Common.jsClick(driver, watchDemoButton);
				log("Click on the Watch Demo button using JavaScript.");
			}
		}

		else if (Common.checkIfElementIsDisplayedWithWait(driver, scheduleDemoButton, 6)) {
			Common.waitForElementToBeVisible(driver, scheduleDemoButton);
			try {
				Common.jsClick(driver,scheduleDemoButton);
				log("Click on the schedule Demo button.");
			} catch (Exception e) {
				Common.jsClick(driver, scheduleDemoButton);
				log("Click on the schedule Demo button using JavaScript.");
			}
		} else if (Common.checkIfElementIsDisplayedWithWait(driver, watchDemoNowButton, 6)) {
			Common.waitForElementToBeVisible(driver, watchDemoNowButton);
			try {
				Common.jsClick(driver,watchDemoNowButton);
				log("Click on the Watch Demo Now button.");
			} catch (Exception e) {
				Common.jsClick(driver, watchDemoNowButton);
				log("Click on the Watch Demo Now button using JavaScript.");
			}
		} else {
			Assert.fail("Button not found under header section");
		}

		Common.checkTitleNull(driver);
		Common.waitForPageToLoad(driver, 10);
		log("Url : " + driver.getCurrentUrl());

	}

	/**
	 * Verifies the Demo page title.
	 */
	public void verifyDemoPageTitle() {
		Assert.assertEquals("Sisense Demo Page title does not match", driver.getTitle(),
				FrameworkConstants.DEMOPAGE_TITLE);
		log("Sisense Demo page title matched successfully.");
	}

	@FindBy(xpath = "//a[normalize-space()='Try free']")
	private WebElement tryFreeButton;

	/**
	 * Clicks on the Try Free button in the header.
	 */
	public void clickOnTryFreeButton() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, tryFreeButton);
		Common.jsClick(driver, tryFreeButton);
		log("Click on the Try Free button.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Test Drive page title.
	 */
	public void verifyTryFreePageTitle() {
		Assert.assertEquals("Sisense Test Drive Page title does not match", driver.getTitle(),
				FrameworkConstants.TEST_DRIVE_TITLE);
		log("Sisense Test Drive page title matched successfully.");
	}
}
