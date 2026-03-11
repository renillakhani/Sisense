package com.sisense.developers;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class DevelopersPage extends AbstractPage {

	public DevelopersPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/** “Developers” tab in the main header */
	@FindBy(xpath = "//a[text()='Developers']")
	private WebElement developersTab;

	/**
	 * Clicks on the Developers tab under header.
	 */
	public void clickOnDevelopersTabUnderHeaderSection() {
		Common.waitForElementToBeVisible(driver, developersTab);
		Common.jsClick(driver, developersTab);
		log("Click on Developers tab under header Section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/** First “Test drive Compose SDK” button in the banner section */
	@FindBy(xpath = "//h2[text()='Power up your apps with embedded analytics']//following-sibling::div//child::a[text()='Start your free trial']")
	private WebElement startYourFreeTrialButton;

	@FindBy(xpath = "//h2[text()='Power up your apps with embedded analytics']")
	private WebElement bannerSection;
	@FindBy(xpath = "//p[contains(normalize-space(.), 'With Compose SDK, build analytics into your products faster than ever.')]")
	private WebElement belowBannerSection;

	/**
	 * Clicks on the first Test drive Compose SDK button under banner section.
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnStartYourFreeTrialButtonUnderBannerSection() throws InterruptedException {
		Common.waitForPageToLoad(driver, 10);
		Common.waitForElementToBeVisible(driver, bannerSection);
		Common.scrollUpToElement(driver, bannerSection);
		log("Scroll to Banner Section");

		Common.waitForPageToLoad(driver, 10);
		Common.waitForElementToBeVisible(driver, belowBannerSection);
		Common.scrollUpToElement(driver, belowBannerSection);
		Common.waitForElementToBeVisible(driver, startYourFreeTrialButton);
		Common.scrollUpToElement(driver, startYourFreeTrialButton);
		Common.waitForElementToBeClickable(driver, startYourFreeTrialButton);
		Common.waitForElementToBeClickable(driver, startYourFreeTrialButton, 30);
		Thread.sleep(3000);
		Common.actionsClick(driver, startYourFreeTrialButton);
		log("Click on start Your Free Trial Button button under banner section successfully.");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToLastWindow(driver);

	}

	/**
	 * Verifies the “Get free 30‑day trial” page title under trial section.
	 */
	public void verifyGetFree30DayTrialPageTitleUnderTrialSection() {
		Common.waitForPageToLoad(driver, 10);
		String actual = driver.getTitle();
		log("Title is: " + actual);
		Assert.assertEquals("Get free 30-day trial Page Title Not Matched!!",
				FrameworkConstants.GETFREE_30DAY_TRAIL_TITLE, actual);
		log("Get free 30-day trial page title under trial section matched successfully.");
	}

	/** Second “Test drive Compose SDK” button under Compose SDK section */
	@FindBy(xpath = "//h2[text()='Build better and faster with Compose SDK.']//following-sibling::div//child::a[text()='Test drive Compose SDK']")
	private WebElement secondTestDriveComposeSDKButton;

	@FindBy(xpath = "//h2[text()='Choose the embedded analytics platform built for product teams. ']//following-sibling::div//child::a[text()='Watch a demo']")
	private WebElement watchADemoButtonAboveFooter;

	//

	/**
	 * Clicks on the second Test drive Compose SDK button under Compose SDK section.(clickOnSecondTestDriveComposeSDKButtonUnderBuildBetterAndFasterSection)
	 * SecondTestDriveComposeSDKButton is replaced with Watch a Demo button
	 */
	public void clickOnWatchaDemoButtonUnderChoosetheEmbeddedAnalyticsSection() {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, watchADemoButtonAboveFooter);
		Common.scrollUpToElement(driver, watchADemoButtonAboveFooter);
		log("Scroll to Choose the embedded analytics platform built for product teams section.");
		Common.jsClick(driver, watchADemoButtonAboveFooter);
		log("Click on Watch a demo button Choose the embedded analytics platform built for product teams section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyWatchADemoPageTitleUnderChooseTheEmbeddedSection() {
		Common.checkTitleNull(driver);
		Common.waitForPageToLoad(driver, 10);
		Common.waitForPageToLoad(driver, 10);
		Common.checkTitleNull(driver);
		Assert.assertEquals("Watch a demo page title not matched!!", driver.getCurrentUrl(),
				"https://www.sisense.com/watch-demo/");
		log("Watch a demo page title matched successfully.");
	}

	/**
	 * Verifies the “Get a 30‑day free trial” page title under Compose SDK section.
	 */
	public void verifyGetA30DayFreeTrialPageTitleUnderComposeSDKSection() {
		Common.waitForPageToLoad(driver, 10);
		String actual = driver.getTitle();
		log("Title is: " + actual);
		Assert.assertEquals("Get a 30-day free trial Page Title Not Matched!!",
				FrameworkConstants.GETFREE_30DAY_TRAIL_TITLE, actual);
		log("Get a 30-day free trial page title under Compose SDK section matched successfully.");
	}
}
