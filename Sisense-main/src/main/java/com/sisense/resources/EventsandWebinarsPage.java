package com.sisense.resources;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class EventsandWebinarsPage extends AbstractPage {

	public EventsandWebinarsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// ========== Events and Webinars Menu ==========

	@FindBy(xpath = "//a[normalize-space()='Events and webinars']")
	private WebElement eventsAndWebinarsMenuUnderResourcesTab;

	/**
	 * Click on 'Events and webinars' menu under the Resources tab.
	 */
	public void clickOnEventsAndWebinarsMenuUnderResourcesTab() {
		Common.waitForElementToBeVisible(driver, eventsAndWebinarsMenuUnderResourcesTab);
		Common.jsClick(driver, eventsAndWebinarsMenuUnderResourcesTab);
		log("Click on Events and webinars menu under the Resources tab successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify the page title of Events and Webinars.
	 */
	public void verifyEventsAndWebinarsPageTitle() {
		Assert.assertEquals("Events and Webinars Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.EVENTS_AND_WEBINARS_TITLE);
		log("Events and Webinars page title matched successfully.");
	}

	// ========== Form Section ==========

	@FindBy(xpath = "//label[@id='LblEmail']")
	private WebElement emailLabelUnderFormSection;

	/**
	 * Scroll to the Email label under the form section.
	 */
	public void scrollToEmailLabelUnderFormSection() {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, emailLabelUnderFormSection);
		Common.scrollUpToElement(driver, emailLabelUnderFormSection);
		log("Scroll to Email label under the form section.");
	}

	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailInputBoxUnderFormSection;

	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement firstNameInputBoxUnderFormSection;

	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement lastNameInputBoxUnderFormSection;

	// @FindBy(xpath = "//input[@id='Phone']")
	// private WebElement phoneNumberInputBoxUnderFormSection;

	@FindBy(xpath = "//input[@id='Company']")
	private WebElement companyNameInputBoxUnderFormSection;

	/**
	 * Fill up the form under the form section.
	 */
	public void fillUpTheForm(String emailId, String firstName, String lastName, String companyName) {

		Common.waitForElementToBeVisible(driver, emailInputBoxUnderFormSection);
		Common.clearAndSendKeys(emailInputBoxUnderFormSection, emailId);
		log("Entered Email ID : " + emailId);

		Common.waitForElementToBeVisible(driver, firstNameInputBoxUnderFormSection);
		Common.clearAndSendKeys(firstNameInputBoxUnderFormSection, firstName);
		log("Entered First Name : " + firstName);

		Common.waitForElementToBeVisible(driver, lastNameInputBoxUnderFormSection);
		Common.clearAndSendKeys(lastNameInputBoxUnderFormSection, lastName);
		log("Entered Last Name : " + lastName);

		// Common.waitForElementToBeVisible(driver,
		// phoneNumberInputBoxUnderFormSection);
		// Common.clearAndSendKeys(phoneNumberInputBoxUnderFormSection, phoneNumber);
		// Common.scrollUpToElement(driver, lastNameInputBoxUnderFormSection);
		// log("Entered Phone Number : " + phoneNumber);

		Common.waitForElementToBeVisible(driver, companyNameInputBoxUnderFormSection);
		Common.clearAndSendKeys(companyNameInputBoxUnderFormSection, companyName);

		log("Entered Company Name : " + companyName);

		Common.scrollUpToElement(driver, companyNameInputBoxUnderFormSection);
		Common.scrollUpToElement(driver, emailInputBoxUnderFormSection);
	}

	@FindBy(xpath = "//button[text()='Subscribe']")
	private WebElement subscribeButtonUnderFormSection;

	/**
	 * Click on the 'Subscribe' button under the form section.
	 */
	public void clickOnSubscribeButtonUnderFormSection() {
		try {
			Common.scrollUpToElement(driver, companyNameInputBoxUnderFormSection);
			Common.waitForElementToBeVisible(driver, subscribeButtonUnderFormSection);
			Common.jsClick(driver, subscribeButtonUnderFormSection);
			log("Click on Subscribe button under the form section successfully.");
		} catch (Exception e) {
			Common.scrollUpToElement(driver, companyNameInputBoxUnderFormSection);
			Common.waitForElementToBeVisible(driver, subscribeButtonUnderFormSection);
			Common.jsClick(driver, subscribeButtonUnderFormSection);
			log("Click on Subscribe button under the form section successfully.");

		}
	}

	@FindBy(xpath = "//form[text()='Thanks for submitting your request.']")
	private WebElement thankYouMessageAfterFormSubmit;

	/**
	 * Verify that the form was submitted successfully.
	 */
	public void verifyFormSubmit() {
		Common.waitForElementToBeVisible(driver, thankYouMessageAfterFormSubmit);
		Assert.assertEquals("Form is not submitting correctly.", thankYouMessageAfterFormSubmit.getText(),
				FrameworkConstants.THANKSFORSUBMIT_TITLE);
		log("Form submitted successfully.");
	}

	// ========== Privacy Policy ==========

	@FindBy(xpath = "//a[normalize-space()='Privacy Policy']")
	private WebElement privacyPolicyLinkUnderFormSection;

	/**
	 * Click on the 'Privacy Policy' link under the form section.
	 */
	public void clickOnPrivacyPolicyLinkUnderFormSection() {
		Common.scrollUpToBottom(driver);
		Common.scrollUpToElement(driver, privacyPolicyLinkUnderFormSection);
		Common.waitForElementToBeVisible(driver, privacyPolicyLinkUnderFormSection);
		Common.jsClick(driver, privacyPolicyLinkUnderFormSection);
		log("Click on Privacy Policy link under the form section successfully.");
		Common.switchToAnotherWindow(driver, 30);
	}

	/**
	 * Verify the page title of the Privacy Policy page.
	 */
	public void verifyPrivacyPolicyPageTitleUnderFormSection() {
		Common.checkTitleNull(driver);
		Assert.assertEquals("Privacy Policy Page Title does not match.", driver.getTitle(),
				FrameworkConstants.PRIVACYPOLICY_TITLE);
		log("Privacy Policy page title matched successfully.");
	}

	// ========== Terms of Service ==========

	@FindBy(xpath = "//a[normalize-space()='Terms of Service']")
	private WebElement termsOfServiceLinkUnderFormSection;

	/**
	 * Click on the 'Terms of Service' link under the form section.
	 */
	public void clickOnTermsOfServiceLinkUnderFormSection() {
		Common.scrollUpToBottom(driver);
		Common.scrollUpToElement(driver, termsOfServiceLinkUnderFormSection);
		Common.waitForElementToBeVisible(driver, termsOfServiceLinkUnderFormSection);
		Common.jsClick(driver, termsOfServiceLinkUnderFormSection);
		log("Click on Terms of Service link under the form section successfully.");
		Common.switchToAnotherWindow(driver, 20);
	}

	/**
	 * Verify the page title of the Terms of Service page.
	 */
	public void verifyTermsOfServicePageTitleUnderFormSection() {
		Common.checkTitleNull(driver);
		log("Switched window title: " + driver.getTitle());
		Assert.assertEquals("Terms of Service Page Title does not match.", driver.getTitle(),
				FrameworkConstants.TERMSOFUSE_TITLE);
		log("Terms of Service page title matched successfully.");
	}

	@FindBy(xpath = "//h3[contains(text(), 'Try Sisense, free for 7 days. Build, explore, and embed')]")
	private WebElement trySisenseFor7DaysSection;

	public void scrollToTrySisenseFor7DaysSection() {
		Common.waitForPageToLoad(driver, 10);
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, trySisenseFor7DaysSection);
		Common.scrollUpToElement(driver, trySisenseFor7DaysSection);
		log("Scroll to 'Try Sisense, free for 7 days. Build, explore, and embed with no setup, using your data or ours.' section");
		Common.waitForPageToLoad(driver, 10);
	}

	@FindBy(xpath = "//a[text()='Free trial']")
	private WebElement freeTrialButton;

	public void clickOnFreeTrialButton() {
		Common.scrollUpToElement(driver, freeTrialButton);
		Common.waitForElementToBeVisible(driver, freeTrialButton);
		Common.jsClick(driver, freeTrialButton);
		log("Click on Free trial button.");
	}

}
