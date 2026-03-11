package com.sisense.common;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class TestDriveSignUpPage extends AbstractPage {

	public TestDriveSignUpPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// ========== Hero Section ==========

	/** Start your free trial button under the Hero section */
	@FindBy(xpath = "//a[normalize-space()='Start your free trial']")
	private WebElement startYourFreeTrialButtonUnderHeroSection;

	/** Clicks on the Start your free trial button under the Hero section */
	public void clickOnStartYourFreeTrialButtonUnderHeroSection() {
		Common.waitForElementToBeVisible(driver, startYourFreeTrialButtonUnderHeroSection);
		Common.jsClick(driver,startYourFreeTrialButtonUnderHeroSection);
		log("Click on Start your free trial button under the Hero section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies that the Start Your Test Drive button scrolls to the form section
	 */
	public void verifyStartYourFreeTrialButton() {
		try {
			Common.waitForElementToBeVisible(driver, emailInputBoxUnderFormSection);
			Common.waitForElementToBeClickable(driver, emailInputBoxUnderFormSection);
			log("Start Your Free Trail button Scroll to the Form section successfully.");
		} catch (Exception e) {
			Assert.fail("Start Your Test Drive button did not scroll to the Form section.");
		}
	}

	/**
	 * Verifies that the Start Your Test Drive button scrolls to the form section
	 */
	public void verifyStartYourTestDriveButton() {
		try {
			Common.waitForElementToBeVisible(driver, emailInputBoxUnderFormSection);
			Common.waitForElementToBeClickable(driver, emailInputBoxUnderFormSection);
			log("Start Your Test Drive button Scroll to the Form section successfully.");
		} catch (Exception e) {
			Assert.fail("Start Your Test Drive button did not scroll to the Form section.");
		}
	}

	// ========== Take Sisense for a Spin Section ==========

	/** Section header: Companies Breaking Data Barriers */
	@FindBy(xpath = "//h2[normalize-space()='Companies breaking data barriers']")
	private WebElement companiesBreakingDataBarriersSection;

	/** Start Your Test Drive button under Take Sisense for a Spin section */
	@FindBy(xpath = "//h2[text()='Take Sisense for a spin']//following-sibling::div//a[text()='Start your test drive']")
	private WebElement startYourTestDriveButtonUnderSpinSection;

	/**
	 * Clicks on the Start Your Test Drive button under Take Sisense for a Spin
	 * section
	 * @throws Exception 
	 */
	public void clickOnStartYourTestDriveButtonUnderSpinSection() throws Exception {
		Thread.sleep(3000);
		try {
			Common.waitForElementToBeVisible(driver, companiesBreakingDataBarriersSection);
			Common.scrollUpToElement(driver, companiesBreakingDataBarriersSection);
			log("Scroll to Companies Breaking Data Barriers section successfully.");
			Common.waitForElementToBeVisible(driver, startYourTestDriveButtonUnderSpinSection, 60);
			Common.scrollUpToElement(driver, startYourTestDriveButtonUnderSpinSection);
			Common.waitForElementToBeVisible(driver, startYourTestDriveButtonUnderSpinSection);
			Common.jsClick(driver, startYourTestDriveButtonUnderSpinSection);
			log("Click on Start Your Test Drive button under Take Sisense for a Spin section successfully.");
		} catch (Exception e) {
			Common.refresh(driver);
			Common.waitForPageToLoad(driver, 15);
			Common.waitForElementToBeVisible(driver, companiesBreakingDataBarriersSection, 60);
			Common.waitForElementToBeVisible(driver, companiesBreakingDataBarriersSection);
			Common.scrollUpToElement(driver, companiesBreakingDataBarriersSection);
			Common.waitForPageToLoad(driver, 15);
			Common.waitForElementToBeVisible(driver, startYourTestDriveButtonUnderSpinSection, 60);
			Common.waitForElementToBeVisible(driver, startYourTestDriveButtonUnderSpinSection);
			Common.scrollUpToElement(driver, startYourTestDriveButtonUnderSpinSection);
			Common.jsClick(driver, startYourTestDriveButtonUnderSpinSection);
			log("Click on Start Your Test Drive button under Take Sisense for a Spin section successfully.");
		}
		Common.waitForPageToLoad(driver, 10);
	}

	// ========== Terms of Service PDF ==========

	/** Verifies the Terms of Service PDF page is opened correctly */
	public void verifyTermsOfServicePageTitle() {
		Common.waitForPageToLoad(driver, 20);
		String pdfUrl = driver.getCurrentUrl();
		System.out.println("PDF URL: " + pdfUrl);

		if (pdfUrl.startsWith("chrome-extension://")) {
			System.out.println("PDF is opened via Chrome Extension viewer.");
			if (!pdfUrl.contains("index.html")) {
				Assert.fail("Terms of Service page title did not match.");
			} else {
				log("Terms of Service page title matched successfully.");
			}
		} else {
			if (!pdfUrl.contains("Mar2025.pdf")) {
				Assert.fail("Terms of Service page title did not match.");
			} else {
				log("Terms of Service page title matched successfully.");
			}
		}
	}

	// ========== Sign-Up Form Section ==========

	/** Email input box under the Form section */
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailInputBoxUnderFormSection;

	/** First Name input box under the Form section */
	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement firstNameInputBoxUnderFormSection;

	/** Last Name input box under the Form section */
	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement lastNameInputBoxUnderFormSection;

	/** Job Title input box under the Form section */
	@FindBy(xpath = "//input[@id='Title']")
	private WebElement jobTitleInputBoxUnderFormSection;

	/** Company Name input box under the Form section */
	@FindBy(xpath = "//input[@id='Company']")
	private WebElement companyNameInputBoxUnderFormSection;

	/**
	 * Fills up the Sign-Up form with given details
	 * 
	 * @param emailId     Email address
	 * @param fullName    Full name
	 * @param companyName Company name
	 * @param jobTitle    Job title
	 */
	public void fillUpTheForm(String emailId, String firstName, String lastName, String companyName, String jobTitle) {
		Common.waitForElementToBeVisible(driver, emailInputBoxUnderFormSection);
		Common.clearAndSendKeys(emailInputBoxUnderFormSection, emailId);
		log("Entered Email ID : " + emailId);

		Common.waitForElementToBeVisible(driver, firstNameInputBoxUnderFormSection);
		Common.clearAndSendKeys(firstNameInputBoxUnderFormSection, firstName);
		log("Entered First Name : " + firstName);

		Common.waitForElementToBeVisible(driver, lastNameInputBoxUnderFormSection);
		Common.clearAndSendKeys(lastNameInputBoxUnderFormSection, lastName);
		log("Entered Last Name : " + lastName);

		Common.scrollUpToElement(driver, firstNameInputBoxUnderFormSection);

		Common.waitForElementToBeVisible(driver, companyNameInputBoxUnderFormSection);
		Common.clearAndSendKeys(companyNameInputBoxUnderFormSection, companyName);
		log("Entered Company Name : " + companyName);

		Common.scrollUpToElement(driver, companyNameInputBoxUnderFormSection);

		Common.waitForElementToBeVisible(driver, jobTitleInputBoxUnderFormSection);
		Common.clearAndSendKeys(jobTitleInputBoxUnderFormSection, jobTitle);
		log("Entered Job Title : " + jobTitle);

		Common.scrollUpToElement(driver, jobTitleInputBoxUnderFormSection);
	}

	/** Sign-Up button under the Form section */
	@FindBy(xpath = "//button[@type='submit' and text()='Sign up for test drive']")
	private WebElement signUpForTestDriveButtonUnderFormSection;

	/** Clicks on the Sign Up For Test Drive button under the Form section */
	public void clickOnSignUpForTestDriveButtonUnderFormSection() {
		;
		try {
			Common.scrollUpToElement(driver, jobTitleInputBoxUnderFormSection);
			Common.waitForElementToBeVisible(driver, signUpForTestDriveButtonUnderFormSection);
			Common.jsClick(driver, signUpForTestDriveButtonUnderFormSection);
			log("Click on Sign Up For Test Drive button under the Form section successfully.");
		} catch (Exception e) {
			Common.scrollUpToElement(driver, jobTitleInputBoxUnderFormSection);
			Common.waitForElementToBeVisible(driver, signUpForTestDriveButtonUnderFormSection);
			Common.jsClick(driver, signUpForTestDriveButtonUnderFormSection);
			log("Click on Sign Up For Test Drive button under the Form section successfully.");
		}
	}

	/** Confirmation message displayed after form submission */
	@FindBy(xpath = "//p[text()='Thanks for signing up!']")
	private WebElement thanksForSubmittingMessageUnderFormSection;

	/**
	 * Verifies that the form was submitted and confirmation message is displayed
	 */
	public void verifyFormSubmissionUnderFormSection() {
		Common.waitForElementToBeVisible(driver, thanksForSubmittingMessageUnderFormSection);
		Assert.assertEquals("Form is not submitted successfully.", "Thanks for signing up!",
				thanksForSubmittingMessageUnderFormSection.getText());
		log("Form submitted successfully. Confirmation message is visible.");
	}

	public void fillUpTheForm(String emailId, String firstName) {
		Common.waitForElementToBeVisible(driver, emailInputBoxUnderFormSection);
		Common.clearAndSendKeys(emailInputBoxUnderFormSection, emailId);
		log("Entered Email ID : " + emailId);

		Common.waitForElementToBeVisible(driver, firstNameInputBoxUnderFormSection);
		Common.clearAndSendKeys(firstNameInputBoxUnderFormSection, firstName);
		// log("Entered First Name : " + firstName);

	}

	@FindBy(xpath = "//label[@for='Email']//following-sibling::div[@class='mktoError']//child::div[@role='alert']")
	private WebElement emailValidationMsg;

	public void verifyFormSubmissionWithEduEmailFormateUnderFormSection() {
		Common.waitForElementToBeVisible(driver, emailValidationMsg);
		Assert.assertEquals("above Email id domin or formate is allow",
				"This email domain is not allowed. Please use a different email address.",
				emailValidationMsg.getText());
		log("above Email id domin or formate is not allow");
	}
}
