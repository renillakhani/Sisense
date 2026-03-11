package com.sisense.resources;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class BlogPage extends AbstractPage {

	public BlogPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Blog Menu under the header
	@FindBy(xpath = "//a[text()='Blog']")
	private WebElement blogMenuUnderResourcesTab;

	/**
	 * Click on Blog Menu under the header.
	 */
	public void clickOnBlogMenuUnderResourcesTab() {
		Common.waitForElementToBeVisible(driver, blogMenuUnderResourcesTab);
		Common.jsClick(driver, blogMenuUnderResourcesTab);
		log("Click on Blog Menu under the Resources Tab successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify the title of the Blog page.
	 */
	public void verifyBlogPageTitle() {
		Assert.assertEquals("Blog Page Title does not match.", driver.getTitle(), FrameworkConstants.BLOG_TITLE);
		log("Blog Page Title matched successfully.");
	}

	// Email label under the form section
	@FindBy(xpath = "//label[@id='LblEmail']")
	private WebElement emailLabelUnderForm;

	/**
	 * Scroll to Email label under the form section.
	 */
	public void scrollToEmailLabelUnderFormSection() {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, emailLabelUnderForm);
		Common.scrollUpToElement(driver, emailLabelUnderForm);
		log("Scroll to Email label under the form section.");
	}

	// Input elements under the form section
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailInputBoxUnderForm;

	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement firstNameInputBoxUnderForm;

	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement lastNameInputBoxUnderForm;

	// @FindBy(xpath = "//input[@id='Phone']")
	// private WebElement phoneNumberInputBoxUnderForm;

	@FindBy(xpath = "//input[@id='Company']")
	private WebElement companyNameInputBoxUnderForm;

	/**
	 * Fill in the subscription form with user data. above footer section
	 */
	public void fillUpTheForm(String emailId, String firstName, String lastName, String companyName) {

		Common.waitForElementToBeVisible(driver, emailInputBoxUnderForm);
		Common.clearAndSendKeys(emailInputBoxUnderForm, emailId);
		log("Entered Email ID : " + emailId);

		Common.waitForElementToBeVisible(driver, firstNameInputBoxUnderForm);
		Common.clearAndSendKeys(firstNameInputBoxUnderForm, firstName);
		log("Entered First Name : " + firstName);

		Common.waitForElementToBeVisible(driver, lastNameInputBoxUnderForm);
		Common.clearAndSendKeys(lastNameInputBoxUnderForm, lastName);
		log("Entered Last Name : " + lastName);

		// Common.waitForElementToBeVisible(driver, phoneNumberInputBoxUnderForm);
		// Common.clearAndSendKeys(phoneNumberInputBoxUnderForm, phoneNumber);
		// log("Entered Phone Number : " + phoneNumber);

		Common.scrollUpToElement(driver, lastNameInputBoxUnderForm);

		Common.waitForElementToBeVisible(driver, companyNameInputBoxUnderForm);
		Common.clearAndSendKeys(companyNameInputBoxUnderForm, companyName);
		log("Entered Company Name : " + companyName);

		Common.scrollUpToElement(driver, companyNameInputBoxUnderForm);
		Common.scrollUpToElement(driver, emailInputBoxUnderForm);
	}

	// Subscribe button under the form section
	@FindBy(xpath = "//button[text()='Subscribe']")
	private WebElement subscribeButtonUnderForm;

	/**
	 * Click on Subscribe button under the form section.
	 */
	public void clickOnSubscribeButtonUnderFormSection() {
		try {
			Common.scrollUpToElement(driver, companyNameInputBoxUnderForm);
			Common.waitForElementToBeVisible(driver, subscribeButtonUnderForm);
			Common.jsClick(driver, subscribeButtonUnderForm);
			log("Click on Subscribe button under the form section.");
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, companyNameInputBoxUnderForm);
			Common.jsClick(driver, subscribeButtonUnderForm);
			log("Click on Subscribe button under the form section.");

		}
	}

	// Confirmation message after form submission
	@FindBy(xpath = "//form[text()='Thanks for submitting your request.']")
	private WebElement formSubmissionConfirmationText;

	/**
	 * Verify successful form submission message.
	 */
	public void verifyFormSubmission() {
		Common.waitForElementToBeVisible(driver, formSubmissionConfirmationText);
		Assert.assertEquals("Form submission message does not match.", formSubmissionConfirmationText.getText(),
				FrameworkConstants.THANKSFORSUBMIT_TITLE);
		log("Form submitted successfully and confirmation message matched.");
	}

	// Privacy Policy link under footer
	@FindBy(xpath = "//a[normalize-space()='Privacy Policy']")
	private WebElement privacyPolicyLinkUnderFooter;

	/**
	 * Click on Privacy Policy link under the footer.
	 */
	public void clickOnPrivacyPolicyLinkUnderFormSection() {
		Common.scrollUpToBottom(driver);
		Common.scrollUpToElement(driver, privacyPolicyLinkUnderFooter);
		Common.waitForElementToBeVisible(driver, privacyPolicyLinkUnderFooter);
		Common.jsClick(driver, privacyPolicyLinkUnderFooter);
		log("Click on Privacy Policy link under the footer.");
		Common.switchToAnotherWindow(driver, 10);
	}

	/**
	 * Verify Privacy Policy page title.
	 */
	public void verifyPrivacyPolicyPageTitle() {
		log("Current title for Privacy Policy page: " + driver.getTitle());
		Assert.assertEquals("Privacy Policy Page Title does not match.", driver.getTitle(),
				FrameworkConstants.PRIVACYPOLICY_TITLE);
		log("Privacy Policy Page Title matched successfully.");
	}

	// Terms of Service link under footer
	@FindBy(xpath = "//a[normalize-space()='Terms of Service']")
	private WebElement termsOfServiceLinkUnderFooter;

	/**
	 * Click on Terms of Service link under the footer.
	 */
	public void clickOnTermsOfServiceLinkUnderFormSection() {
		Common.scrollUpToBottom(driver);
		Common.scrollUpToElement(driver, termsOfServiceLinkUnderFooter);
		Common.waitForElementToBeVisible(driver, termsOfServiceLinkUnderFooter);
		Common.jsClick(driver, termsOfServiceLinkUnderFooter);
		log("Click on Terms of Service link under the footer.");
		Common.switchToAnotherWindow(driver, 10);
	}

	/**
	 * Verify Terms of Service page title.
	 */
	public void verifyTermsOfServicePageTitle() {
		log("Current title for Terms of Service page: " + driver.getTitle());
		Assert.assertEquals("Terms of Service Page Title does not match.", driver.getTitle(),
				FrameworkConstants.TERMSOFUSE_TITLE);
		log("Terms of Service Page Title matched successfully.");
	}

	@FindBy(xpath = "//h3[contains(text(), 'Explore the AI-powered analytics platform designed')]")
	private WebElement exploreTheAI_PoweredAnalyticsPlatformDsignedSection;

	public void scrollToExploreTheAI_PoweredAnalyticsPlatformDsignedSection() {
		Common.waitForPageToLoad(driver, 10);
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, exploreTheAI_PoweredAnalyticsPlatformDsignedSection);
		Common.scrollUpToElement(driver, exploreTheAI_PoweredAnalyticsPlatformDsignedSection);
		log("Scroll to Explore the AI-powered analytics platform designed to integrate, scale, and evolve with your product section");
		Common.waitForPageToLoad(driver, 10);
	}

	@FindBy(xpath = "//a[text()='Explore the Sisense platform']")
	private WebElement exploreTheSisensePlatformButtonUnderAboveFooter;

	public void clickOnExploreTheSisensePlatformButtonUnderAboveFooter() {
		Common.scrollUpToElement(driver, exploreTheSisensePlatformButtonUnderAboveFooter);
		Common.waitForElementToBeVisible(driver, exploreTheSisensePlatformButtonUnderAboveFooter);
		Common.jsClick(driver, exploreTheSisensePlatformButtonUnderAboveFooter);
		log("Click on Explore the Sisense platform button above the footer.");

	}

	public void verifyPlatformPageTitle() {
		Assert.assertEquals("Sisense Platform Page title does not match", driver.getTitle(),
				FrameworkConstants.PLATFORMPAGE_TITLE);
		log("Sisense Platform page title matched successfully.");
	}
}
