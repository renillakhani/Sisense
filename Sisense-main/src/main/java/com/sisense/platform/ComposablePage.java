package com.sisense.platform;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class ComposablePage extends AbstractPage {

	public ComposablePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Composable menu under Platform tab
	@FindBy(xpath = "//a[normalize-space()='Composable']")
	private WebElement composableMenuUnderPlatformTab;

	public void clickOnComposableMenuUnderPlatformTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, composableMenuUnderPlatformTab);
		Common.jsClick(driver,composableMenuUnderPlatformTab);
		log("Click on Composable Menu under Platform Tab");
		Common.waitForPageToLoad(driver, 10);
	}

	// Verification of Compose SDK Page title
	public void verifyComposeSDKPageTitle() {
		Assert.assertEquals("Sisense Compose SDK Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.COMPOSABLEPAGE_TITLE);
		log("Sisense Compose SDK Page Title Matched !!");
	}

	// Try Now button under Compose SDK Banner
	@FindBy(xpath = "//p[contains(text(),'Build and integrate AI-powered analytics into your products with ultimate flexibility, while saving development time.')]//following-sibling::div//child::a[text()='Try now']")
	private WebElement tryNowButtonUnderComposeSDKBannerSection;

	public void clickOnTryNowButtonUnderComposeSDKBanner() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, tryNowButtonUnderComposeSDKBannerSection);
		Common.jsClick(driver,tryNowButtonUnderComposeSDKBannerSection);
		log("Click on Try Now Button under Compose SDK Banner Section");
		Common.waitForPageToLoad(driver, 10);
	}

	// Verification of Compose SDK Free Trial Page
	public void verifyComposeSDKFreeTrialPageTitle() {
		Assert.assertEquals("Sisense Compose SDK Free Trial Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.GETFREE_30DAY_TRAIL_TITLE);
		log("Sisense Compose SDK Free Trial Page Title Matched !!");
	}

	// Compose SDK Section
	@FindBy(xpath = "//h2[contains(text(),'Compose SDK - the composable analytics solution')]")
	private WebElement composeSDKTheComposableAnalyticsSolutionSection;

	public void scrollToComposeSDKTheComposableAnalyticsSolutionSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, composeSDKTheComposableAnalyticsSolutionSection);
		Common.scrollUpToElement(driver, composeSDKTheComposableAnalyticsSolutionSection);
		log("Scroll to Compose SDK - the composable analytics solution Section");
	}

	// "Book a live demo" button
	@FindBy(xpath = "//h2[normalize-space()='Compose SDK - the composable analytics solution']//parent::div//a[text()='Book a live demo']")
	private WebElement bookALiveDemoButton;

	/**
	 * Clicks on the "Book a live demo" button in the footer.
	 */
	public void clickOnBookaLiveDemoButton() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, bookALiveDemoButton);
		Common.jsClick(driver,bookALiveDemoButton);
		log("Click on 'Book a live demo' button in Footer.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Download solution brief button under Swift, code-first analytics section
	@FindBy(xpath = "//a[normalize-space()='Download solution brief']")
	private WebElement downloadSolutionBriefButtonUnderSwiftCodeFirstAnalyticsSection;

	@FindBy(xpath = "//h2[contains(text(),'Swift, code-first analytics')]")
	private WebElement swiftCodeFirstAnalyticsSection;

	public void clickOnDownloadSolutionBriefButtonUnderSwiftCodeFirstAnalyticsSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, swiftCodeFirstAnalyticsSection);
		Common.scrollUpToElement(driver, swiftCodeFirstAnalyticsSection);
		log("Scroll to Swift, code-first analytics Section");
		Common.waitForElementToBeVisible(driver, downloadSolutionBriefButtonUnderSwiftCodeFirstAnalyticsSection);
		Common.jsClick(driver,downloadSolutionBriefButtonUnderSwiftCodeFirstAnalyticsSection);
		log("Click on Download Solution Brief Button under Swift, code-first analytics Section");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyComposeSdkSolutionBriefPdf() {
		Assert.assertEquals("Sisense Developers Compose Sdk Solution Brief Pdf Not Matched", driver.getCurrentUrl(),
				"https://www.sisense.com/wp-content/uploads/2024/10/compose-sdk-solution-brief.pdf");
		log("Sisense Developers Compose Sdk Solution Brief Pdf Matched !!");
	}

	// Try Now Second Button under Try it free for 30 days Section
	@FindBy(xpath = "//h2[contains(text(),'Try it free for 7 days')]//following-sibling::div//child::a[text()='Try now']")
	private WebElement tryNowSecondButtonUnderTryItFreeFor7DaysSection;

	@FindBy(xpath = "//h2[contains(text(),'Try it free for 7 days')]")
	private WebElement tryItFreeFor7DaysSection;

	public void clickOnTryNowSecondButtonUnderTryItFreeFor30DaysSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, tryItFreeFor7DaysSection);
		Common.scrollUpToElement(driver, tryItFreeFor7DaysSection);
		log("Scroll to Try it free for 7 days Section");
		Common.waitForElementToBeVisible(driver, tryNowSecondButtonUnderTryItFreeFor7DaysSection);
		Common.jsClick(driver,tryNowSecondButtonUnderTryItFreeFor7DaysSection);
		log("Click on Try Now Button under Try it free for 7 days Section");
		Common.waitForPageToLoad(driver, 10);
	}

	// Explore Playground Button under By Developers Section
	@FindBy(xpath = "//a[normalize-space()='Explore Playground']")
	private WebElement explorePlaygroundButtonUnderByDevelopersSection;

	@FindBy(xpath = "//h2[contains(text(),'By developers, for developers')]")
	private WebElement byDevelopersSection;

	public void clickOnExplorePlaygroundButtonUnderByDevelopersSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, byDevelopersSection);
		Common.scrollUpToElement(driver, byDevelopersSection);
		log("Scroll to By Developers Section");
		Common.waitForElementToBeVisible(driver, explorePlaygroundButtonUnderByDevelopersSection);
		Common.jsClick(driver,explorePlaygroundButtonUnderByDevelopersSection);
		log("Click on Explore Playground Button under By Developers Section");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyDevelopersPlaygroundPageTitle() {
		Assert.assertEquals("Sisense Developers Playground Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.PLAYGROUND_TITLE);
		log("Sisense Developers Playground Page Title Matched !!");
	}

	// Learn More Button under Powered by Fusion Section
	@FindBy(xpath = "//a[@href='/ai-analytics-platform/embeddable-analytics/']")
	private WebElement learnMoreButtonUnderPoweredByFusionSection;

	@FindBy(xpath = "//h2[contains(text(),'Powered by Fusion')]")
	private WebElement poweredByFusionSection;

	public void clickOnLearnMoreButtonUnderPoweredByFusionSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, poweredByFusionSection);
		Common.scrollUpToElement(driver, poweredByFusionSection);
		log("Scroll to Powered by Fusion Section");
		Common.waitForElementToBeVisible(driver, learnMoreButtonUnderPoweredByFusionSection);
		Common.jsClick(driver,learnMoreButtonUnderPoweredByFusionSection);
		log("Click on Learn More Button under Powered by Fusion Section");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyEmbeddableAnalyticsPageTitle() {
		Assert.assertEquals("Sisense Embeddable Analytics Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.EMBEDDABLEPAGE_TITLE);
		log("Sisense Embeddable Analytics Page Title Matched");
	}
}
