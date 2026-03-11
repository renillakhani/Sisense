package com.sisense.platform;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class EmbeddablePage extends AbstractPage {
	public EmbeddablePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Embeddable Menu under Platform tab
	@FindBy(xpath = "//ul[@class='sub-menu']//a[normalize-space()='Embedded analytics']")
	private WebElement embeddableMenuUnderPlatformTab;

	public void clickOnEmbeddableMenuUnderPlatformTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, embeddableMenuUnderPlatformTab);
		Common.jsClick(driver, embeddableMenuUnderPlatformTab);
		log("Click on Embeddable Menu under Platform tab");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyEmbeddablePageTitleUnderPlatformTab() {
		Assert.assertEquals("Sisense Embeddable Page Title did not match", driver.getTitle(),
				FrameworkConstants.EMBEDDABLEPAGE_TITLE);
		log("Sisense Embeddable Page Title matched successfully");
	}

	// Book a live demo button
	@FindBy(xpath = "(//h2[contains(text(), 'Build and embed analytics with maximum')]//following-sibling::div//child::a[text()='Book a live demo'])")
	private WebElement bookALiveDemoButtonUnderEmbeddablePage;

	@FindBy(xpath = "//h2[contains(text(),'Natively embed dashboards and insights')]")
	private WebElement nativelyEmbedDashboardsSection;

	public void clickOnBookALiveDemoButtonUnderEmbeddablePage() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, nativelyEmbedDashboardsSection);
		Common.scrollToVertical(driver, nativelyEmbedDashboardsSection);
		log("Scroll to 'Natively embed dashboards and insights' section");
		Common.waitForElementToBeVisible(driver, bookALiveDemoButtonUnderEmbeddablePage);
		log("Clicking on 'Book a live demo' button under Embeddable page");
		Common.jsClick(driver, bookALiveDemoButtonUnderEmbeddablePage);
		log("Click on 'Book a live demo' button");
	}

	@FindBy(xpath = "//h2[text()='Book a live demo']//following::input[@id='Email']")
	private WebElement bookALiveDemoFormEmailIdInputBox;

	@FindBy(xpath = "//h2[text()='Book a live demo']//following::input[@id='FirstName']")
	private WebElement bookALiveDemoFormFirstNameInputBox;

	@FindBy(xpath = "//h2[text()='Book a live demo']//following::input[@id='LastName']")
	private WebElement bookALiveDemoFormLastNameInputBox;

	@FindBy(xpath = "//h2[text()='Book a live demo']//following::input[@id='Phone']")
	private WebElement bookALiveDemoFormPhoneNumberInputBox;

	@FindBy(xpath = "//h2[text()='Book a live demo']//following::input[@id='Company']")
	private WebElement bookALiveDemoFormCompanyNameInputBox;

	@FindBy(xpath = "//h2[text()='Book a live demo']//following::input[@id='Title']")
	private WebElement bookALiveDemoFormJobTitleInputBox;

	public void fillUpBookALiveDemoForm(String emailId, String firstName, String lastName, String phoneNumber,
			String companyName, String jobTitleName) {
		Common.waitForElementToBeVisible(driver, bookALiveDemoFormEmailIdInputBox);
		Common.clearAndSendKeys(bookALiveDemoFormEmailIdInputBox, emailId);
		log("Input Email id : " + emailId);

		Common.waitForElementToBeVisible(driver, bookALiveDemoFormFirstNameInputBox);
		Common.clearAndSendKeys(bookALiveDemoFormFirstNameInputBox, firstName);
		log("Input First Name : " + firstName);

		Common.waitForElementToBeVisible(driver, bookALiveDemoFormLastNameInputBox);
		Common.clearAndSendKeys(bookALiveDemoFormLastNameInputBox, lastName);
		log("Input Last Name : " + lastName);

		Common.waitForElementToBeVisible(driver, bookALiveDemoFormPhoneNumberInputBox);
		Common.scrollUpToElement(driver, bookALiveDemoFormLastNameInputBox);
		Common.clearAndSendKeys(bookALiveDemoFormPhoneNumberInputBox, phoneNumber);
		log("Input Phone Number : " + phoneNumber);

		Common.waitForElementToBeVisible(driver, bookALiveDemoFormCompanyNameInputBox);
		Common.scrollUpToElement(driver, bookALiveDemoFormLastNameInputBox);
		Common.clearAndSendKeys(bookALiveDemoFormCompanyNameInputBox, companyName);
		log("Input Company Name : " + companyName);

		Common.waitForElementToBeVisible(driver, bookALiveDemoFormJobTitleInputBox);
		Common.clearAndSendKeys(bookALiveDemoFormJobTitleInputBox, jobTitleName);
		log("Input Job Title : " + jobTitleName);

	}

	@FindBy(xpath = "//h2[text()='Book a live demo']//following::button[text()='Book live demo']")
	private WebElement bookliveDemoButton;

	public void clickOnBookliveDemoButtonUnderform() {
		try {
			Common.scrollUpToElement(driver, bookALiveDemoFormJobTitleInputBox);
			Common.waitForElementToBeVisible(driver, bookliveDemoButton);
			Common.jsClick(driver, bookliveDemoButton);
			log("Click On Book Live Demo Button Under Form ");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.scrollUpToElement(driver, bookALiveDemoFormJobTitleInputBox);
			Common.waitForElementToBeVisible(driver, bookliveDemoButton);
			Common.jsClick(driver, bookliveDemoButton);
			log("Click On Book Live Demo Button Under Form ");
			Common.waitForPageToLoad(driver, 10);

		}
	}

	@FindBy(xpath = "//form[text()='Thank you for your interest. Your request has been recieved.']")
	private WebElement thankYouMsg;

	public void verifyBookliveDemoFormSubmit() {
		Common.waitForElementToBeVisible(driver, thankYouMsg);
		Assert.assertEquals("form is not submitted", thankYouMsg.getText(),
				"Thank you for your interest. Your request has been recieved.");
		log("form is submitted");
	}

	// Quickstart guide button under 'Natively embed dashboards' section
	@FindBy(xpath = "//a[text()='Check out the quickstart guide']")
	private WebElement checkOutTheQuickstartGuideButtonUnderNativelyEmbedSection;

	public void clickOnCheckOutTheQuickstartGuideButtonUnderNativelyEmbedSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, nativelyEmbedDashboardsSection);
		Common.scrollUpToElement(driver, nativelyEmbedDashboardsSection);
		log("Scroll to 'Natively embed dashboards and insights' section");
		Common.waitForElementToBeVisible(driver, checkOutTheQuickstartGuideButtonUnderNativelyEmbedSection);
		Common.jsClick(driver, checkOutTheQuickstartGuideButtonUnderNativelyEmbedSection);
		log("Click on 'Check out the quickstart guide' button");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyQuickstartGuidePageTitleUnderNativelyEmbedSection() {
		Assert.assertEquals("Quickstart Guide Page Title did not match", driver.getTitle(),
				"Getting Started | Sisense Developers");
		log("Quickstart Guide Page Title matched successfully");
	}

	// Read our guide button under Quickly integrate section
	@FindBy(xpath = "//a[text()='Read our guide']")
	private WebElement readOurGuideButtonUnderQuicklyIntegrateSection;

	@FindBy(xpath = "//h2[contains(text(),'Quickly integrate')]")
	private WebElement quicklyIntegrateSection;

	public void clickOnReadOurGuideButtonUnderQuicklyIntegrateSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, quicklyIntegrateSection);
		Common.scrollUpToElement(driver, quicklyIntegrateSection);
		log("Scroll to 'Quickly integrate' section");
		Common.waitForElementToBeVisible(driver, readOurGuideButtonUnderQuicklyIntegrateSection);
		Common.jsClick(driver, readOurGuideButtonUnderQuicklyIntegrateSection);
		log("Click on 'Read our guide' button");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyReadOurGuidePageTitleUnderQuicklyIntegrateSection() {
		Assert.assertEquals("Read Our Guide Page Title did not match", driver.getTitle(),
				"Getting Started with Embed SDK | Sisense Developers");
		log("Read Our Guide Page Title matched successfully");
	}

	// Get Started button under 'Choose what to embed' section
	@FindBy(xpath = "//a[contains(text(),'Get started')]")
	private WebElement getStartedButtonUnderChooseWhatToEmbedSection;

	@FindBy(xpath = "//h2[contains(text(),'Choose what to embed')]")
	private WebElement chooseWhatToEmbedSection;

	public void clickOnGetStartedButtonUnderChooseWhatToEmbedSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, chooseWhatToEmbedSection);
		Common.scrollUpToElement(driver, chooseWhatToEmbedSection);
		log("Scroll to 'Choose what to embed' section");
		Common.waitForElementToBeVisible(driver, getStartedButtonUnderChooseWhatToEmbedSection);
		Common.jsClick(driver, getStartedButtonUnderChooseWhatToEmbedSection);
		log("Click on 'Get Started' button");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyGetStartedPageTitleUnderChooseWhatToEmbedSection() {
		Assert.assertEquals("Get Started Page Title did not match", driver.getTitle(),
				"Sisense.JS Getting Started | Sisense Developers");
		log("Get Started Page Title matched successfully");
	}

	// Embedding with iFrame button under 'Embed in a few clicks' section
	@FindBy(xpath = "//h2[contains(text(),'Embed in a few clicks')]")
	private WebElement embedInAFewClicksSection;

	@FindBy(xpath = "//a[contains(text(),'Embedding with iFrame')]")
	private WebElement embeddingWithIFrameButtonUnderEmbedInAFewClicksSection;

	public void clickOnEmbeddingWithIFrameButtonUnderEmbedInAFewClicksSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, embedInAFewClicksSection);
		Common.scrollUpToElement(driver, embedInAFewClicksSection);
		log("Scroll to 'Embed in a few clicks' section");
		Common.waitForElementToBeVisible(driver, embeddingWithIFrameButtonUnderEmbedInAFewClicksSection);
		Common.jsClick(driver, embeddingWithIFrameButtonUnderEmbedInAFewClicksSection);
		log("Click on 'Embedding with iFrame' button");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyEmbeddingWithIFramePageTitleUnderEmbedInAFewClicksSection() {
		Assert.assertEquals("Embedding with iFrame Page Title did not match", driver.getTitle(),
				"Getting Started with iFrames | Sisense Developers");
		log("Embedding with iFrame Page Title matched successfully");
	}

	// Learn More button under 'Bring analytics to your work apps' section
	@FindBy(xpath = "//h2[contains(text(),'Bring analytics to your work apps')]")
	private WebElement bringAnalyticsToWorkAppsSection;

	@FindBy(xpath = "//a[contains(text(),'Learn more')]")
	private WebElement learnMoreButtonUnderWorkAppsSection;

	public void clickOnLearnMoreButtonUnderWorkAppsSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, bringAnalyticsToWorkAppsSection);
		Common.scrollUpToElement(driver, bringAnalyticsToWorkAppsSection);
		log("Scroll to 'Bring analytics to your work apps' section");
		Common.waitForElementToBeVisible(driver, learnMoreButtonUnderWorkAppsSection);
		Common.jsClick(driver, learnMoreButtonUnderWorkAppsSection);
		log("Click on 'Learn More' button");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyLearnMorePageTitleUnderWorkAppsSection() {
		Assert.assertEquals("Learn More Page Title did not match", driver.getTitle(),
				FrameworkConstants.MARKETPLACEPAGE_TITLE);
		log("Learn More Page Title matched successfully");
	}
}
