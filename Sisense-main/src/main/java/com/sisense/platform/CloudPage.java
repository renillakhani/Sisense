package com.sisense.platform;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class CloudPage extends AbstractPage {

	public CloudPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Cloud menu navigation element
	@FindBy(xpath = "//a[text()='Cloud']")
	private WebElement cloudMenu;

	/**
	 * Clicks on the Cloud menu under the Platform section.
	 */
	public void clickOnCloudMenuUnderPlatformTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, cloudMenu);
		Common.jsClick(driver,cloudMenu);
		log("Click on Cloud menu under the Platform section.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies that the Cloud Page title matches the expected title.
	 */
	public void verifyCloudPageTitle() {
		Assert.assertEquals("Cloud Page title does not match.", driver.getTitle(), FrameworkConstants.CLOUDPAGE_TITLE);
		log("Cloud Page title verified successfully.");
	}

	// "Book a live demo" button
	@FindBy(xpath = "//h1[normalize-space()='Sisense Cloud']//parent::div//a[text()='Book a live demo']")
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

	// Feature Prioritization section and related button
	@FindBy(xpath = "//a[normalize-space()='Check out our release notes']")
	private WebElement checkOutReleaseNotesButton;

	@FindBy(xpath = "//h2[contains(text(),'Feature prioritization')]")
	private WebElement featurePrioritizationSection;

	/**
	 * Clicks on the 'Check out our release notes' button under the Feature
	 * Prioritization section.
	 */
	public void clickOnCheckOutReleaseNotesButtonUnderFeaturePrioritizationSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, featurePrioritizationSection);
		Common.scrollUpToElement(driver, featurePrioritizationSection);
		log("Scroll to Feature Prioritization section.");
		Common.waitForElementToBeVisible(driver, checkOutReleaseNotesButton);
		Common.jsClick(driver,checkOutReleaseNotesButton);
		log("Click on 'Check out our release notes' button under Feature Prioritization section.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies that the Release Notes Page title matches the expected title.
	 */
	public void verifyReleaseNotesPageTitle() {
		Assert.assertEquals("Release Notes Page title does not match.", driver.getTitle(),
				FrameworkConstants.DOC_RELEASE_NOTES);
		log("Release Notes Page title verified successfully.");
	}

	// Proactive Support section and related button
	@FindBy(xpath = "//a[normalize-space()='See our support resources']")
	private WebElement seeSupportResourcesButton;

	@FindBy(xpath = "//h2[contains(text(),'Proactive support')]")
	private WebElement proactiveSupportSection;

	/**
	 * Clicks on the 'See our support resources' button under the Proactive Support
	 * section.
	 */
	public void clickOnSeeSupportResourcesButtonUnderProactiveSupportSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, proactiveSupportSection);
		Common.scrollUpToElement(driver, proactiveSupportSection);
		log("Scroll to Proactive Support section.");
		Common.waitForElementToBeVisible(driver, seeSupportResourcesButton);
		Common.jsClick(driver,seeSupportResourcesButton);
		log("Click on 'See our support resources' button under Proactive Support section.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Secure Environment section and related button
	@FindBy(xpath = "//a[normalize-space()='Learn more about security and trust']")
	private WebElement learnMoreSecurityTrustButton;

	@FindBy(xpath = "//h2[contains(text(),'Secure environment')]")
	private WebElement secureEnvironmentSection;

	/**
	 * Clicks on the 'Learn more about security and trust' button under the Secure
	 * Environment section.
	 */
	public void clickOnLearnMoreSecurityTrustButtonUnderSecureEnvironmentSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, secureEnvironmentSection);
		Common.scrollUpToElement(driver, secureEnvironmentSection);
		log("Scroll to Secure Environment section.");
		Common.waitForElementToBeVisible(driver, learnMoreSecurityTrustButton);
		Common.jsClick(driver,learnMoreSecurityTrustButton);
		log("Click on 'Learn more about security and trust' button under Secure Environment section.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies that the Trust Center Page title matches the expected title.
	 */
	public void verifyTrustCenterPageTitle() {
		Assert.assertEquals("Trust Center Page title does not match.", driver.getTitle(),
				FrameworkConstants.TRUST_CENTER_TITLE);
		log("Trust Center Page title verified successfully.");
	}
}
