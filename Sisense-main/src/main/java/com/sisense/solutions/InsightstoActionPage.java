package com.sisense.solutions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class InsightstoActionPage extends AbstractPage {

	public InsightstoActionPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// ========== Insights to Action Menu ==========
	@FindBy(xpath = "//a[text()='Insights to action']")
	private WebElement insightsToActionMenu;

	public void clickOnInsightsToActionMenuUnderSolutionTab() {
		Common.waitForElementToBeVisible(driver, insightsToActionMenu);
		Common.jsClick(driver, insightsToActionMenu);
		log("Click on Insights to Action menu under Solution Tab successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// ========== Page Title ==========
	public void verifyInsightsToActionPageTitle() {
		Assert.assertEquals("Sisense Insights to Action Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.INSIGHTS_TO_ACTION_TITLE);
		log("Sisense Insights to Action page title matched successfully.");
	}

	// ========== Banner Section ==========
	@FindBy(xpath = "//p[contains(text(),'Simplify and automate data modeling, storage, and ')]")
	private WebElement bannerSection;

	public void scrollToBannerSection() {
		Common.waitForElementToBeVisible(driver, bannerSection);
		Common.scrollUpToElement(driver, bannerSection);
		log("Scroll to banner section.");
	}

	// ========== Take a Tour Button ==========
	@FindBy(xpath = "//a[normalize-space()='Take a tour']")
	private WebElement takeATourButton;

	public void clickOnTakeATourButtonUnderBannerSection() {
		Common.waitForElementToBeVisible(driver, takeATourButton);
		Common.jsClick(driver, takeATourButton);
		log("Click on Take a Tour button under banner section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyTakeATourPageTitle() {
		Assert.assertEquals("Take A Tour Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.TAKE_A_TOUR_TITLE);
		log("Take a Tour page title matched successfully.");
	}

	// ========== Take the Sisense test drive Button under banner section ==========
	@FindBy(xpath = "//a[normalize-space()='Take the Sisense test drive']")
	private WebElement takeTheSisenseTestDriveButton;

	public void clickOnTakeTheSisenseTestDriveButtonUnderBannerSection() {
		Common.waitForElementToBeVisible(driver, takeTheSisenseTestDriveButton);
		Common.jsClick(driver, takeTheSisenseTestDriveButton);
		log("Click on Take the Sisense test drive button under banner section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// ========== Free trial Button under banner section ==========
	@FindBy(xpath = "//a[text()='Free trial']")
	private WebElement freeTrialButton;

	public void clickOnFreeTrialButtonUnderBannerSection() {
		Common.waitForElementToBeVisible(driver, freeTrialButton);
		Common.jsClick(driver, freeTrialButton);
		log("Click on Free Trial drive button under banner section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// ========== Request a Demo Button ==========
	@FindBy(xpath = "//a[text()='Request a demo']")
	private WebElement requestADemoButton;

	public void clickOnRequestADemoButtonUnderBannerSection() {
		Common.waitForElementToBeVisible(driver, requestADemoButton);
		Common.jsClick(driver, requestADemoButton);
		log("Click on Request a Demo button under header successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyRequestADemoPageTitle() {
		Assert.assertEquals("Sisense Request a Demo Page Title Not Matched", driver.getTitle(),
				"Request a Demo - See Sisense Transform Your Data Analytics");
		log("Sisense Request a Demo page title matched successfully.");
	}

	// ========== Connect All Your Data Section ==========
	@FindBy(xpath = "//h2[contains(text(),'Connect all your data, seamlessly')]")
	private WebElement connectAllDataSection;

	@FindBy(xpath = "//h2[contains(text(),'Connect all your data, seamlessly')]//following-sibling::div//child::a[text()='Learn more']")
	private WebElement learnMoreButtonUnderConnectAllDataSection;

	public void clickOnLearnMoreButtonUnderConnectAllDataSection() {
		Common.waitForElementToBeVisible(driver, connectAllDataSection);
		Common.scrollUpToElement(driver, connectAllDataSection);
		log("Scroll to Connect All Your Data, Seamlessly section.");
		Common.waitForElementToBeVisible(driver, learnMoreButtonUnderConnectAllDataSection);
		Common.jsClick(driver, learnMoreButtonUnderConnectAllDataSection);
		log("Click on Learn More button under Connect All Your Data section.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyLearnMorePageTitleUnderConnectAllDataSection() {
		Assert.assertEquals("Sisense Learn More Title Not Matched", driver.getTitle(),
				FrameworkConstants.MARKETPLACEPAGE_TITLE);
		log("Learn More page title under Connect All Your Data section matched successfully.");
	}

	// ========== Eliminate Barriers Section ==========
	@FindBy(xpath = "//h2[contains(text(),'Eliminate barriers to data modeling')]")
	private WebElement eliminateBarriersSection;

	@FindBy(xpath = "//h2[contains(text(),'Eliminate barriers to data modeling')]//following-sibling::div//child::a[text()='Learn more']")
	private WebElement learnMoreButtonUnderEliminateBarriersSection;

	public void clickOnLearnMoreButtonUnderEliminateBarriersSection() {
		Common.waitForElementToBeVisible(driver, eliminateBarriersSection);
		Common.scrollUpToElement(driver, eliminateBarriersSection);
		log("Scroll to Eliminate Barriers to Data Modeling section.");
		Common.waitForElementToBeVisible(driver, learnMoreButtonUnderEliminateBarriersSection);
		Common.jsClick(driver, learnMoreButtonUnderEliminateBarriersSection);
		log("Click on Learn More button under Eliminate Barriers section.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyLearnMorePageTitleUnderEliminateBarriersSection() {
		Assert.assertEquals("Sisense Learn More Title Not Matched", driver.getTitle(),
				FrameworkConstants.DATA_MODELINGPAGE_TITLE);
		log("Learn More page title under Eliminate Barriers section matched successfully.");
	}

	// ========== AI-assisted Data Exploration Section ==========
	@FindBy(xpath = "//h2[contains(text(),'AI-assisted data exploration')]")
	private WebElement aiAssistedExplorationSection;

	@FindBy(xpath = "//h2[contains(text(),'AI-assisted data exploration')]//following-sibling::div//child::a[text()='Learn more']")
	private WebElement learnMoreButtonUnderAIExplorationSection;

	public void clickOnLearnMoreButtonUnderAIExplorationSection() {
		Common.waitForElementToBeVisible(driver, aiAssistedExplorationSection);
		Common.scrollUpToElement(driver, aiAssistedExplorationSection);
		log("Scroll to AI-assisted Data Exploration section.");
		Common.waitForElementToBeVisible(driver, learnMoreButtonUnderAIExplorationSection);
		Common.jsClick(driver, learnMoreButtonUnderAIExplorationSection);
		log("Click on Learn More button under AI-assisted Data Exploration section.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyLearnMorePageTitleUnderAIExplorationSection() {
		Assert.assertEquals("Sisense Learn More Title Not Matched", driver.getTitle(),
				FrameworkConstants.SISENSE_INTELLIGENCE_PAGE_TITLE);
		log("Learn More page title under AI-assisted Data Exploration section matched successfully.");
	}

	// ========== Book a Free Demo ==========
	@FindBy(xpath = "//a[text()='Book a free demo']")
	private WebElement bookAFreeDemoButton;

	// Add corresponding method if required

}
