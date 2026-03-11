package com.sisense.platform;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

/**
 * Page Object class for Sisense Intelligence page under Platform section.
 */
public class SisenseIntelligencePage extends AbstractPage {

	public SisenseIntelligencePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// 'Sisense Intelligence' menu under Platform tab
	@FindBy(xpath = "//a[text()='Capabilities']//parent::li//child::li//a[text()='Sisense Intelligence']")
	private WebElement sisenseIntelligenceMenuUnderPlatformTab;

	/**
	 * Click on 'sisenseIntelligence' menu under Platform tab.
	 */
	public void clickOnSisenseIntelligenceMenuUnderPlatformTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, sisenseIntelligenceMenuUnderPlatformTab);
		Common.jsClick(driver, sisenseIntelligenceMenuUnderPlatformTab);
		log("Click on 'Sisense Intelligence' menu under 'Platform' tab.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify the Sisense Intelligence AI page title.
	 */
	public void verifySisenseIntelligencePageTitle() {
		Assert.assertEquals("Sisense Intelligence page title is not matched.", driver.getTitle(),
				FrameworkConstants.SISENSE_INTELLIGENCE_PAGE_TITLE);
		log("Sisense Intelligence page title matched successfully.");
	}

	// Banner section
	@FindBy(xpath = "//h1[contains(text(),'Sisense Intelligence: AI features for modern analy')]")
	private WebElement bannerSection;

	/**
	 * Scroll to Banner section.
	 */
	public void scrollToBannerSection() {
		Common.waitForElementToBeVisible(driver, bannerSection);
		Common.scrollUpToElement(driver, bannerSection);
		log("Scroll to 'Banner' section.");
	}

	@FindBy(xpath = "//p[contains(text(),'Use Sisense Intelligence to innovate, extract insi')]")
	private WebElement bannerSectionText;

	@FindBy(xpath = "//a[normalize-space()='Register for the webinar']")
	private WebElement registerForTheWebinarButtonUnderBannerSection;

	public void clickOnRegisterForTheWebinarButtonUnderBannerSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, bannerSectionText);
		Common.scrollUpToElement(driver, bannerSectionText);
		try {
			Common.waitForElementToBeVisible(driver, registerForTheWebinarButtonUnderBannerSection);
			Common.scrollUpToElement(driver, registerForTheWebinarButtonUnderBannerSection);
			Common.jsClick(driver, registerForTheWebinarButtonUnderBannerSection);
			log("Click on 'Register for the webinar' button under 'Banner' section.");
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, bannerSectionText);
			Common.scrollUpToElement(driver, bannerSectionText);
			Common.waitForElementToBeVisible(driver, registerForTheWebinarButtonUnderBannerSection);
			Common.scrollUpToElement(driver, registerForTheWebinarButtonUnderBannerSection);
			Common.jsClick(driver, registerForTheWebinarButtonUnderBannerSection);
			log("Click on 'Register for the webinar' button under 'Banner' section.");
		}
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyRegisterForTheWebinarButtonUnderBannerSection() {
		Assert.assertEquals("Sisense 'Register for the webinar' page title not matched", driver.getTitle(),
				"What’s new (and what’s next) in the Sisense platform | Webinar");
		log("Sisense 'Register for the webinar' page title matched successfully.");
	}

	// Transform charts into conversation starters section
	@FindBy(xpath = "//h2[normalize-space()='Transform charts into conversation starters']")
	private WebElement transformChartsSection;

	// Learn More Button under Transform charts into conversation starters Section
	@FindBy(xpath = "//h2[normalize-space()='Transform charts into conversation starters']//following-sibling::div//a[text()='Learn more']")
	private WebElement learnMoreButtonUnderTransformChartsSection;

	/**
	 * Click on the 'Learn more' button under the 'Transform charts into
	 * conversation starters' section.
	 */
	public void clickOnLearnMoreButtonUnderTransformChartsSection() throws InterruptedException {

		Common.waitForElementToBeVisible(driver, transformChartsSection);
		Common.scrollUpToElement(driver, transformChartsSection);
		log("Scroll to 'Transform charts into conversation starters' section");
		try {
			Common.jsClick(driver, learnMoreButtonUnderTransformChartsSection);
			log("Clicked on the 'Learn more' button under the 'Transform charts into conversation starters' section");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, transformChartsSection);
			Common.scrollUpToElement(driver, transformChartsSection);
			Common.waitForElementToBeVisible(driver, learnMoreButtonUnderTransformChartsSection);
			Common.scrollUpToElement(driver, learnMoreButtonUnderTransformChartsSection);
			Common.jsClick(driver, learnMoreButtonUnderTransformChartsSection);
			log("Clicked on the 'Learn more' button under the 'Transform charts into conversation starters' section");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	// Build once, embed everywhere section
	@FindBy(xpath = "//h2[normalize-space()='Build once, embed everywhere']")
	private WebElement buildOnceSection;

	// Compose SDK link under Build once, embed everywhere section
	@FindBy(xpath = "//span[normalize-space()='Compose SDK']")
	private WebElement composeSDKLinkUnderBuildOnceSection;

	/**
	 * Click on the 'Compose SDK' link under the 'Build once, embed everywhere'
	 * section.
	 */
	public void clickOnComposeSDKLinkUnderBuildOnceSection() throws InterruptedException {

		Common.waitForElementToBeVisible(driver, buildOnceSection);
		Common.scrollUpToElement(driver, buildOnceSection);
		log("Scroll to 'Build once, embed everywhere' section");
		try {
			Common.jsClick(driver, composeSDKLinkUnderBuildOnceSection);
			log("Clicked on the 'Compose SDK' link under the 'Build once, embed everywhere' section");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, buildOnceSection);
			Common.scrollUpToElement(driver, buildOnceSection);
			Common.waitForElementToBeVisible(driver, composeSDKLinkUnderBuildOnceSection);
			Common.scrollUpToElement(driver, composeSDKLinkUnderBuildOnceSection);
			Common.jsClick(driver, composeSDKLinkUnderBuildOnceSection);
			log("Clicked on the 'Compose SDK' link under the 'Build once, embed everywhere' section");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	// 'Book a Demo' button under Banner section
	@FindBy(xpath = "//a[contains(text(), 'Book a demo')]")
	private WebElement bookADemoButtonUnderBannerSection;

	/**
	 * Click on 'Book a Demo' button under Banner section.
	 */
	public void clickOnBookADemoButtonUnderBannerSection() throws InterruptedException {

		try {
			Common.waitForElementToBeVisible(driver, bannerSectionText);
			Common.scrollUpToElement(driver, bannerSectionText);
			Common.waitForElementToBeVisible(driver, bookADemoButtonUnderBannerSection);
			Common.jsClick(driver, bookADemoButtonUnderBannerSection);
			log("Click on 'Book a Demo' button under 'Banner' section.");
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, bannerSectionText);
			Common.scrollUpToElement(driver, bannerSectionText);
			Common.waitForElementToBeVisible(driver, bookADemoButtonUnderBannerSection);
			Common.jsClick(driver, bookADemoButtonUnderBannerSection);
			log("Click on 'Book a Demo' button under 'Banner' section.");
		}
		Common.waitForPageToLoad(driver, 10);
	}

	// 'Book a Live Demo' button under Banner section
	@FindBy(xpath = "//h1[contains(text(),'Sisense Intelligence: AI features for modern analy')]//parent::div//child::a[text()='Book a demo']")
	private WebElement bookALiveDemoButtonUnderBannerSection;

	/**
	 * Click on 'Book a Live Demo' button under Banner section.
	 */
	public void clickOnBookALiveDemoButtonUnderBannerSection() throws InterruptedException {

		try {
			Common.waitForElementToBeVisible(driver, bannerSectionText);
			Common.scrollUpToElement(driver, bannerSectionText);
			Common.waitForElementToBeVisible(driver, bookALiveDemoButtonUnderBannerSection);
			Common.jsClick(driver, bookALiveDemoButtonUnderBannerSection);
			log("Click on 'Book a Live Demo' button under 'Banner' section.");
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, bannerSectionText);
			Common.scrollUpToElement(driver, bannerSectionText);
			Common.waitForElementToBeVisible(driver, bookALiveDemoButtonUnderBannerSection);
			Common.jsClick(driver, bookALiveDemoButtonUnderBannerSection);
			log("Click on 'Book a Live Demo' button under 'Banner' section.");
		}
		Common.waitForPageToLoad(driver, 10);
	}

	// 'Intuitive data exploration for all, with GenAI' section
	@FindBy(xpath = "//h2[contains(text(), 'Intuitive data exploration for all, with GenAI')]")
	private WebElement intuitiveDataExplorationSection;

	/**
	 * Scroll to 'Intuitive Data Exploration for All with GenAI' section.
	 */
	public void scrollToIntuitiveDataExplorationSection() {
		Common.waitForElementToBeVisible(driver, intuitiveDataExplorationSection);
		Common.scrollUpToElement(driver, intuitiveDataExplorationSection);
		log("Scroll to 'Intuitive Data Exploration for All with GenAI' section.");
	}

	// First 'Learn More' button under 'Intuitive Data Exploration' section
	@FindBy(xpath = "//h2[contains(text(), 'Intuitive data exploration for all, with GenAI')]/following-sibling::div//a[text()='Learn more']")
	private WebElement firstLearnMoreButtonUnderIntuitiveDataExplorationSection;

	/**
	 * Click on the first 'Learn More' button under Intuitive Data Exploration
	 * section.
	 */
	public void clickOnFirstLearnMoreButtonUnderIntuitiveDataExplorationSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, firstLearnMoreButtonUnderIntuitiveDataExplorationSection);
		Common.jsClick(driver, firstLearnMoreButtonUnderIntuitiveDataExplorationSection);
		log("Click on the first 'Learn More' button under 'Intuitive Data Exploration' section.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify the 4 Strategies for Success page title.
	 */
	public void verify4StrategiesForSuccessPageTitle() {
		Assert.assertEquals("4 Strategies for Success page title is not matched.", driver.getTitle(),
				"AI, machine learning, and analytics Best Practices | Sisense");
		log("4 Strategies for Success page title matched successfully.");
	}

	// 'Integration with Compose SDK' section
	@FindBy(xpath = "//h2[contains(text(), 'Integration with Compose SDK')]")
	private WebElement integrationWithComposeSDKSection;

	/**
	 * Scroll to 'Integration with Compose SDK' section.
	 */
	public void scrollToIntegrationWithComposeSDKSection() {
		Common.waitForElementToBeVisible(driver, integrationWithComposeSDKSection);
		Common.scrollUpToElement(driver, integrationWithComposeSDKSection);
		log("Scroll to 'Integration with Compose SDK' section.");
	}

	// Second 'Learn More' button under 'Integration with Compose SDK' section
	@FindBy(xpath = "//h2[contains(text(), 'Integration with Compose SDK')]/following-sibling::div//a[text()='Learn more']")
	private WebElement secondLearnMoreButtonUnderIntegrationWithComposeSDKSection;

	/**
	 * Click on the second 'Learn More' button under Integration with Compose SDK
	 * section.
	 */
	public void clickOnSecondLearnMoreButtonUnderIntegrationWithComposeSDKSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, secondLearnMoreButtonUnderIntegrationWithComposeSDKSection);
		Common.jsClick(driver, secondLearnMoreButtonUnderIntegrationWithComposeSDKSection);
		log("Click on the second 'Learn More' button under 'Integration with Compose SDK' section.");
		Common.waitForPageToLoad(driver, 10);
	}

	// AI Assistant section
	@FindBy(xpath = "//h2[normalize-space()='AI Assistant (beta)']")
	private WebElement aiAssistantSection;

	// 'Watch Demo' button under AI Assistant section
	@FindBy(xpath = "//a[normalize-space()='Watch demo']")
	private WebElement watchDemoButtonUnderAIAssistantSection;

	/**
	 * Click on 'Watch Demo' button under AI Assistant section.
	 */
	public void clickOnWatchDemoButtonUnderAIAssistantSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, aiAssistantSection);
		Common.scrollUpToElement(driver, aiAssistantSection);
		log("Scroll to 'AI Assistant (beta)' section.");
		Common.waitForElementToBeVisible(driver, watchDemoButtonUnderAIAssistantSection);
		Common.jsClick(driver, watchDemoButtonUnderAIAssistantSection);
		log("Click on 'Watch Demo' button under 'AI Assistant (beta)' section.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify the Watch Demo page title.
	 */
	public void verifyWatchDemoPageTitle() {
		Assert.assertEquals("Watch Demo page title is not matched.", driver.getTitle(),
				FrameworkConstants.AI_ASSISTANT_DASHBOARD_DEMO_TITLE);
		log("Watch Demo page title matched successfully.");
	}
}
