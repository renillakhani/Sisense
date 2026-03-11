package com.sisense.resources;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class GlossaryPage extends AbstractPage {

	public GlossaryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Web element: Glossary menu under the Resources tab
	@FindBy(xpath = "//a[normalize-space()='Glossary']")
	private WebElement glossaryMenuUnderResourcesTab;

	/**
	 * Clicks on the Glossary menu under the Resources tab and waits for the page to
	 * load.
	 */
	public void clickOnGlossaryMenuUnderResourcesTab() {
		Common.waitForElementToBeVisible(driver, glossaryMenuUnderResourcesTab);
		Common.jsClick(driver, glossaryMenuUnderResourcesTab);
		log("Click on Glossary Menu under Resources Tab successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies that the Glossary page title matches the expected title.
	 */
	public void verifyGlossaryPageTitle() {
		Assert.assertEquals("Glossary Page Title Not Matched", driver.getTitle(), FrameworkConstants.GLOSSARY_TITLE);
		log("Glossary Page Title matched successfully.");
	}

	// Web element: Email label in the form section
	@FindBy(xpath = "//label[@id='LblEmail']")
	private WebElement emailLabel;

	/**
	 * Scrolls to the Email label in the form section.
	 */
	public void scrollToEmailLabelUnderFormSection() {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, emailLabel);
		Common.scrollUpToElement(driver, emailLabel);
		log("Scroll to Email label under form section.");
	}

	// Web elements: Input fields in the form section
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailInputBox;

	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement firstNameInputBox;

	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement lastNameInputBox;

	// @FindBy(xpath = "//input[@id='Phone']")
	// private WebElement phoneNumberInputBox;

	@FindBy(xpath = "//input[@id='Company']")
	private WebElement companyNameInputBox;

	/**
	 * Fills out the form with the provided email, full name, phone number, and
	 * company name.
	 */
	public void fillUpTheForm(String emailId, String firstName, String lastName, String companyName) {
		Common.waitForElementToBeVisible(driver, emailInputBox);
		Common.clearAndSendKeys(emailInputBox, emailId);
		log("Input Email ID: " + emailId);

		Common.waitForElementToBeVisible(driver, firstNameInputBox);
		Common.clearAndSendKeys(firstNameInputBox, firstName);
		log("Input First Name : " + firstName);

		Common.waitForElementToBeVisible(driver, lastNameInputBox);
		Common.clearAndSendKeys(lastNameInputBox, lastName);
		log("Input Last Name : " + lastName);

		// Common.waitForElementToBeVisible(driver, phoneNumberInputBox);
		// Common.clearAndSendKeys(phoneNumberInputBox, phoneNumber);
		// log("Input Phone Number : " + phoneNumber);

		Common.scrollUpToElement(driver, lastNameInputBox);

		Common.waitForElementToBeVisible(driver, companyNameInputBox);
		Common.clearAndSendKeys(companyNameInputBox, companyName);
		log("Input Company Name : " + companyName);

		Common.scrollUpToElement(driver, companyNameInputBox);
		Common.scrollUpToElement(driver, emailInputBox);

	}

	// Web element: Subscribe button under the form
	@FindBy(xpath = "//button[text()='Subscribe']")
	private WebElement subscribeButtonUnderForm;

	/**
	 * Clicks on the Subscribe button under the form.
	 */
	public void clickOnSubscribeButtonUnderForm() {
		try {
			Common.scrollUpToElement(driver, companyNameInputBox);
			Common.waitForElementToBeVisible(driver, subscribeButtonUnderForm);
			Common.jsClick(driver, subscribeButtonUnderForm);
			log("Click on Subscribe button under form.");
		} catch (Exception e) {
			Common.scrollUpToElement(driver, companyNameInputBox);
			Common.waitForElementToBeVisible(driver, subscribeButtonUnderForm);
			Common.jsClick(driver, subscribeButtonUnderForm);
			log("Click on Subscribe button under form.");
		}
	}

	// Web element: Confirmation message after form submission
	@FindBy(xpath = "//form[text()='Thanks for submitting your request.']")
	private WebElement thanksForSubmittingElement;

	/**
	 * Verifies that the form was submitted successfully.
	 */
	public void verifyFormSubmissionUnderGlossaryPage() {
		Common.waitForElementToBeVisible(driver, thanksForSubmittingElement);
		Assert.assertEquals("Form was not submitted successfully.", thanksForSubmittingElement.getText(),
				FrameworkConstants.THANKSFORSUBMIT_TITLE);
		log("Form submitted successfully on Glossary page.");
	}

	// Web element: Privacy Policy link under the Glossary page
	@FindBy(xpath = "//a[normalize-space()='Privacy Policy']")
	private WebElement privacyPolicyLinkUnderGlossaryPage;

	/**
	 * Clicks on the Privacy Policy link and switches to the new window.
	 */
	public void clickOnPrivacyPolicyLinkUnderFormSection() {
		Common.scrollUpToElement(driver, privacyPolicyLinkUnderGlossaryPage);
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, privacyPolicyLinkUnderGlossaryPage);
		Common.jsClick(driver, privacyPolicyLinkUnderGlossaryPage);
		log("Click on Privacy Policy link under Form Section.");
		Common.switchToAnotherWindow(driver, 40);
	}

	/**
	 * Verifies the title of the Privacy Policy page.
	 */
	public void verifyPrivacyPolicyPageTitle() {
		log("Privacy Policy Page Title: " + driver.getTitle());
		Assert.assertEquals("Privacy Policy Page Title does not match.", driver.getTitle(),
				FrameworkConstants.PRIVACYPOLICY_TITLE);
		log("Privacy Policy Page Title matched successfully.");
	}

	// Web element: Terms of Service link under the Glossary page
	@FindBy(xpath = "//a[normalize-space()='Terms of Service']")
	private WebElement termsOfServiceLinkUnderGlossaryPage;

	/**
	 * Clicks on the Terms of Service link and switches to the new window.
	 */
	public void clickOnTermsOfServiceLinkUnderFormSection() {
		Common.scrollUpToElement(driver, termsOfServiceLinkUnderGlossaryPage);
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, termsOfServiceLinkUnderGlossaryPage);
		Common.jsClick(driver, termsOfServiceLinkUnderGlossaryPage);
		log("Click on Terms of Service link under Form Section.");
		Common.switchToAnotherWindow(driver, 20);
	}

	/**
	 * Verifies the title of the Terms of Service page.
	 */
	public void verifyTermsOfServicePageTitle() {
		log("Terms of Service Page Title: " + driver.getTitle());
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
