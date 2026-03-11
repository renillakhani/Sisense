package com.sisense.about;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class NewsroomPage extends AbstractPage {
	public NewsroomPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Newsroom Menu
	@FindBy(xpath = "//a[text()='Newsroom']")
	private WebElement newsroomMenu;

	/**
	 * Click on Newsroom menu under the About tab.
	 */
	public void clickOnNewsroomMenuUnderAboutTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, newsroomMenu);
		Common.jsClick(driver, newsroomMenu);
		log("Click on Newsroom menu successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify the Newsroom page title.
	 */
	public void verifyNewsroomPageTitle() {
		Assert.assertEquals("Sisense Newsroom Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.NEWSROOM_TITLE);
		log("Sisense Newsroom Page Title matched successfully.");
	}

	// Email Label
	@FindBy(xpath = "//label[@id='LblEmail']")
	private WebElement emailLabel;

	/**
	 * Scroll to the Email label on the Newsroom page.
	 */
	public void scrollToEmailLabel() {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, emailLabel);
		Common.scrollUpToElement(driver, emailLabel);
		log("Scroll to Email label.");
	}

	// Form Input Elements
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
	 * Fill out the subscription form.
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
	}

	// Subscribe Button
	@FindBy(xpath = "//button[text()='Subscribe']")
	private WebElement subscribeButton;

	/**
	 * Click on the Subscribe button.
	 */
	public void clickOnSubscribeButtonUnderForm() {
		try {
			Common.scrollUpToElement(driver, companyNameInputBox);
			Common.waitForElementToBeVisible(driver, subscribeButton);
			Common.jsClick(driver, subscribeButton);
			log("Click on Subscribe button successfully.");
		} catch (Exception e) {
			Common.scrollUpToElement(driver, companyNameInputBox);
			Common.waitForElementToBeVisible(driver, subscribeButton);
			Common.scrollUpToElement(driver, subscribeButton);
			Common.jsClick(driver, subscribeButton);
			log("Click on Subscribe button successfully.");
		}
	}

	// Form Submission Confirmation
	@FindBy(xpath = "//form[text()='Thanks for submitting your request.']")
	private WebElement thanksForSubmittingElement;

	/**
	 * Verify form submission confirmation message.
	 */
	public void verifyFormSubmit() {
		Common.waitForElementToBeVisible(driver, thanksForSubmittingElement);
		Assert.assertEquals("Form is not submitting", thanksForSubmittingElement.getText(),
				FrameworkConstants.THANKSFORSUBMIT_TITLE);
		log("Form submitted successfully.");
	}

	// Privacy Policy
	@FindBy(xpath = "//a[normalize-space()='Privacy Policy']")
	private WebElement privacyPolicyLink;

	/**
	 * Click on Privacy Policy link and verify title.
	 */
	public void clickOnPrivacyPolicyLinkUnderFormSection() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.scrollUpToElement(driver, privacyPolicyLink);
		Common.waitForElementToBeVisible(driver, privacyPolicyLink);
		Common.jsClick(driver, privacyPolicyLink);
		log("Click on Privacy Policy link.");
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify Privacy Policy page title.
	 */
	public void verifyPrivacyPolicyPageTitle() {
		Assert.assertEquals("Privacy Policy Page Title is not matching", driver.getTitle(),
				FrameworkConstants.PRIVACYPOLICY_TITLE);
		log("Privacy Policy Page Title matched successfully.");
	}

	// Terms of Service
	@FindBy(xpath = "//a[normalize-space()='Terms of Service']")
	private WebElement termsOfServiceLink;

	/**
	 * Click on Terms of Service link and verify title.
	 */
	public void clickOnTermsOfServiceLinkUnderFormSection() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.scrollUpToElement(driver, termsOfServiceLink);
		Common.waitForElementToBeVisible(driver, termsOfServiceLink);
		Common.jsClick(driver, termsOfServiceLink);
		log("Click on Terms of Service link.");
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify Terms of Service page title.
	 */
	public void verifyTermsOfServicePageTitle() {
		Assert.assertEquals("Terms of Service Page Title is not matching", driver.getTitle(),
				FrameworkConstants.TERMSOFUSE_TITLE);
		log("Terms of Service Page Title matched successfully.");
	}

	// Press Releases
	@FindBy(xpath = "//a[normalize-space()='Press Releases']")
	private WebElement pressReleasesLink;

	@FindBy(xpath = "//h1[normalize-space()='Press and News Coverage']")
	private WebElement bannerSection;

	/**
	 * Click on Press Releases link on the Newsroom page.
	 */
	public void clickOnPressReleasesLink() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, bannerSection);
		Common.scrollUpToElement(driver, bannerSection);
		Common.waitForElementToBeVisible(driver, pressReleasesLink);
		Common.jsClick(driver, pressReleasesLink);
		log("Click on Press Releases link successfully.");
		Common.waitForPageToLoad(driver, 10);
	}
}
