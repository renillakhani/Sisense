package com.sisense.solutions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class BuildYourWayPage extends AbstractPage {

	public BuildYourWayPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// ========== Build Your Way Menu ==========
	@FindBy(xpath = "//a[text()='Build your way']")
	private WebElement buildYourWayMenuUnderSolutionsTab;

	/**
	 * Click on Build Your Way menu under Solutions tab.
	 */
	public void clickOnBuildYourWayMenuUnderSolutionsTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, buildYourWayMenuUnderSolutionsTab);
		Common.jsClick(driver,buildYourWayMenuUnderSolutionsTab);
		log("Click on Build Your Way menu under Solutions tab.");
		Common.waitForPageToLoad(driver, 10);
		Common.checkTitleNull(driver);
	}

	/**
	 * Verify Build Your Way page title.
	 */
	public void verifyBuildYourWayPageTitle() {
		Assert.assertEquals("Build Your Way Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.BUILD_YOUR_WAY_TITLE);
		log("Build Your Way page title matched successfully.");
	}

	// ========== Banner Section ==========
	@FindBy(xpath = "//p[contains(text(),'Create data experiences that look and feel like yo')]")
	private WebElement bannerSection;

	@FindBy(xpath = "//a[normalize-space()='Request a demo']")
	private WebElement requestADemoButtonUnderBannerSection;

	/**
	 * Scroll to the Banner section.
	 */
	public void scrollToBannerSection() {
		Common.waitForElementToBeVisible(driver, bannerSection);
		Common.scrollUpToElement(driver, bannerSection);
		log("Scroll to the Banner section.");
	}

	/**
	 * Click on Request a Demo button under Banner section.
	 */
	public void clickOnRequestADemoButtonUnderBannerSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, bannerSection);
		Common.scrollUpToElement(driver, bannerSection);
		log("Scroll to the Request a Demo button under Banner section.");
		Common.waitForElementToBeVisible(driver, requestADemoButtonUnderBannerSection);
		Common.jsClick(driver, requestADemoButtonUnderBannerSection);
		log("Click on Request a Demo button under Banner section.");
		Common.waitForPageToLoad(driver, 10);
	}

	// ========== Customize Analytics Effortlessly Section ==========
	@FindBy(xpath = "//h2[normalize-space()='Customize analytics effortlessly']")
	private WebElement customizeAnalyticsEffortlesslySection;

	@FindBy(xpath = "//a[normalize-space()='Learn more']")
	private WebElement learnMoreButtonUnderCustomizeAnalyticsEffortlesslySection;

	/**
	 * Click on Learn More button under Customize Analytics Effortlessly section.
	 */
	public void clickOnLearnMoreButtonUnderCustomizeAnalyticsEffortlesslySection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, customizeAnalyticsEffortlesslySection);
		Common.scrollUpToElement(driver, customizeAnalyticsEffortlesslySection);
		log("Scroll to Customize Analytics Effortlessly section.");
		Common.waitForElementToBeVisible(driver, learnMoreButtonUnderCustomizeAnalyticsEffortlesslySection);
		Common.jsClick(driver,learnMoreButtonUnderCustomizeAnalyticsEffortlesslySection);
		log("Click on Learn More button under Customize Analytics Effortlessly section.");
		Common.waitForPageToLoad(driver, 10);
	}

	// ========== Built-in Analytics Section ==========
	@FindBy(xpath = "//h2[normalize-space()='Built-in analytics using your design principles']")
	private WebElement builtInAnalyticsUsingYourDesignPrinciplesSection;

	@FindBy(xpath = "//a[normalize-space()='Check out the playground']")
	private WebElement checkOutThePlaygroundButtonUnderBuiltInAnalyticsSection;

	/**
	 * Click on Check Out the Playground button under Built-in Analytics section.
	 */
	public void clickOnCheckOutThePlaygroundButtonUnderBuiltInAnalyticsSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, builtInAnalyticsUsingYourDesignPrinciplesSection);
		Common.scrollUpToElement(driver, builtInAnalyticsUsingYourDesignPrinciplesSection);
		log("Scroll to Built-in Analytics section.");
		Common.waitForElementToBeVisible(driver, checkOutThePlaygroundButtonUnderBuiltInAnalyticsSection);
		Common.jsClick(driver,checkOutThePlaygroundButtonUnderBuiltInAnalyticsSection);
		log("Click on Check Out the Playground button under Built-in Analytics section.");
		Common.waitForPageToLoad(driver, 10);
	}

	// ========== Integrate AI Experiences Section ==========
	@FindBy(xpath = "//h2[normalize-space()='Integrate AI experiences throughout']")
	private WebElement integrateAIExperiencesThroughoutSection;

	@FindBy(xpath = "//a[normalize-space()='Watch a demo']")
	private WebElement watchADemoButtonUnderAIExperiencesSection;

	/**
	 * Click on Watch a Demo button under Integrate AI Experiences section.
	 */
	public void clickOnWatchADemoButtonUnderAIExperiencesSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, integrateAIExperiencesThroughoutSection);
		Common.scrollUpToElement(driver, integrateAIExperiencesThroughoutSection);
		log("Scroll to Integrate AI Experiences Throughout section.");
		Common.waitForElementToBeVisible(driver, watchADemoButtonUnderAIExperiencesSection);
		Common.jsClick(driver,watchADemoButtonUnderAIExperiencesSection);
		log("Click on Watch a Demo button under Integrate AI Experiences section.");
		Common.waitForPageToLoad(driver, 10);
	}
}
