package com.sisense.solutions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class AnalyticsforEveryonePage extends AbstractPage {

	public AnalyticsforEveryonePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Analytics for Everyone Menu under Header
	@FindBy(xpath = "//a[text()='Analytics for everyone']")
	private WebElement analyticsForEveryoneMenu;

	public void clickOnAnalyticsForEveryoneMenuUnderSolutionsTab() {
		Common.waitForElementToBeVisible(driver, analyticsForEveryoneMenu);
		Common.jsClick(driver,analyticsForEveryoneMenu);
		log("Click on Analytics for Everyone Menu under Solutions Tab successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyAnalyticsForEveryonePageTitle() {
		Assert.assertEquals("Sisense Analytics for Everyone Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.ANALYTICS_FOR_EVERYONE_TITLE);
		log("Sisense Analytics for Everyone Page Title Matched!");
	}

	// Banner section scroll reference text
	@FindBy(xpath = "//p[contains(text(),'Democratize analytics across your users. Sisense a')]")
	private WebElement bannerSectionText;

	public void scrollToBannerSection() {
		Common.waitForElementToBeVisible(driver, bannerSectionText);
		Common.scrollUpToElement(driver, bannerSectionText);
		log("Scroll to Banner Section under successfully.");
	}

	// Request a Demo button under Banner section
	@FindBy(xpath = "//a[text()='Request a demo']")
	private WebElement requestADemoButton;

	public void clickOnRequestADemoButtonUnderBannerSection() {
		Common.jsClick(driver, requestADemoButton);
		log("Click on Request a Demo Button under Banner Section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyRequestADemoPageTitle() {
		Assert.assertEquals("Sisense Request a Demo Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.DEMOPAGE_TITLE);
		log("Sisense Request a Demo Page Title Matched!");
	}

	// Enable truly self-service analytics section
	@FindBy(xpath = "//h2[contains(text(),'Enable truly self-service analytics')]")
	private WebElement selfServiceAnalyticsSection;

	// Watch a Demo button under Self-Service section
	@FindBy(xpath = "//a[text()='Watch a demo']")
	private WebElement watchADemoButton;

	public void clickOnWatchADemoButtonUnderSelfServiceSection() {
		Common.waitForElementToBeVisible(driver, selfServiceAnalyticsSection);
		Common.scrollUpToElement(driver, selfServiceAnalyticsSection);
		log("Scroll to Self-Service Analytics Section successfully.");
		Common.waitForElementToBeVisible(driver, watchADemoButton);
		Common.jsClick(driver,watchADemoButton);
		log("Click on Watch a Demo Button under Self-Service Section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyWatchADemoPageTitle() {
		Assert.assertEquals("Sisense Watch a Demo Title Not Matched", driver.getTitle(),
				FrameworkConstants.DEMOPAGE_TITLE);
		log("Sisense Watch a Demo Page Title Matched!");
	}

	// Provide Actionable insights section
	@FindBy(xpath = "//h2[contains(text(),'Provide actionable insights, not static stats')]")
	private WebElement actionableInsightsSection;

	// Learn More button under Actionable Insights section
	@FindBy(xpath = "//h2[contains(text(),'Provide actionable insights, not static stats')]//following-sibling::div//child::a[text()='Learn more']")
	private WebElement learnMoreButton;

	public void clickOnLearnMoreButtonUnderProvideActionableInsightsSection() {
		Common.waitForElementToBeVisible(driver, actionableInsightsSection);
		Common.scrollUpToElement(driver, actionableInsightsSection);
		log("Scroll to Actionable Insights Section successfully.");
		Common.waitForElementToBeVisible(driver, learnMoreButton);
		Common.jsClick(driver,learnMoreButton);
		log("Click on Learn More Button under Actionable Insights Section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyLearnMorePageTitle() {
		Assert.assertEquals("Sisense Learn More Title Not Matched", driver.getTitle(),
				FrameworkConstants.ANALYTICS_FOR_EVERYONE_TITLE);
		log("Sisense Learn More Page Title under Actionable Insights Section Matched!");
	}

	// Boost engagement with AI section
	@FindBy(xpath = "//h2[contains(text(),'Boost user engagement with AI-driven experiences')]")
	private WebElement boostEngagementSection;

	// Second Learn More button under Boost Engagement section
	@FindBy(xpath = "//h2[contains(text(),'Boost user engagement with AI-driven experiences')]//following-sibling::div//child::a[text()='Learn more']")
	private WebElement secondLearnMoreButton;

	public void clickOnLearnMoreButtonUnderBoostEngagementSection() {
		Common.waitForElementToBeVisible(driver, boostEngagementSection);
		Common.scrollUpToElement(driver, boostEngagementSection);
		log("Scroll to Boost Engagement Section successfully.");
		Common.waitForElementToBeVisible(driver, secondLearnMoreButton);
		Common.jsClick(driver,secondLearnMoreButton);
		log("Click on Learn More Button under Boost Engagement Section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifySecondLearnMorePageTitle() {
		Assert.assertEquals("Sisense Learn More Title Not Matched", driver.getTitle(),
				FrameworkConstants.SISENSE_INTELLIGENCE_PAGE_TITLE);
		log("Sisense Learn More Page Title under Boost Engagement Section Matched!");
	}

}
