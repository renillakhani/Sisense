package com.sisense.solutions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class SolutionsPage extends AbstractPage {

	public SolutionsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Banner section element
	@FindBy(xpath = "//h1[normalize-space()='Bridge the gap between insights and action']")
	private WebElement bannerSection;

	/**
	 * Scrolls to the Banner section on the Solutions page.
	 */
	public void scrollToBannerSection() {
		Common.waitForElementToBeVisible(driver, bannerSection);
		Common.scrollUpToElement(driver, bannerSection);
		log("Scroll to Banner section successfully.");
	}

	// Request a Demo button under Banner section
	@FindBy(xpath = "//a[text()='Request a demo']")
	private WebElement requestDemoButtonUnderBannerSection;

	/**
	 * Clicks on the 'Request a Demo' button under the Banner section.
	 */
	public void clickOnRequestDemoButtonUnderBannerSection() {
		log("Attempting to click on 'Request a Demo' button.");
		Common.jsClick(driver, requestDemoButtonUnderBannerSection);
		log("Click on 'Request a Demo' button under Banner section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Connect all your data, seamlessly section element
	@FindBy(xpath = "//h2[contains(text(), 'Connect all your data, seamlessly')]")
	private WebElement connectAllYourDataSection;

	/**
	 * Scrolls to the 'Connect all your data, seamlessly' section.
	 */
	public void scrollToConnectAllYourDataSection() {
		Common.waitForElementToBeVisible(driver, connectAllYourDataSection);
		Common.scrollUpToElement(driver, connectAllYourDataSection);
		log("Scroll to 'Connect all your data, seamlessly' section successfully.");
	}

	// Contact Us button under the 'Connect all your data' section
	@FindBy(xpath = "//button[@type='submit' and text()='Contact us']")
	private WebElement contactUsButton;

	/**
	 * Clicks on the 'Contact us' button under the 'Connect all your data' section.
	 */
	public void clickOnContactUsButtonUnderForm() {

		try {
			Common.waitForElementToBeVisible(driver, contactUsButton);
			Common.scrollUpToElement(driver, jobTitleInputBox);
			Common.scrollUpToElement(driver, contactUsButton);
			Common.click(contactUsButton);
			log("Click on 'Contact us' button successfully.");
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, jobTitleInputBox);
			Common.scrollUpToElement(driver, jobTitleInputBox);
			Common.waitForElementToBeVisible(driver, contactUsButton);
			Common.scrollUpToElement(driver, contactUsButton);
			Common.jsClick(driver, contactUsButton);
			log("Click on 'Contact us' button after retry.");
		}
		Common.waitForPageToLoad(driver, 10);
		Common.checkTitleNull(driver);
	}

	// Form fields
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailInputBox;

	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement firstNameInputBox;

	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement lastNameInputBox;

	@FindBy(xpath = "//input[@id='Phone']")
	private WebElement phoneNumberInputBox;

	@FindBy(xpath = "//input[@id='Company']")
	private WebElement companyNameInputBox;

	@FindBy(xpath = "//input[@id='Title']")
	private WebElement jobTitleInputBox;

	@FindBy(xpath = "//textarea[@id='Comment__c']")
	private WebElement howMayWeHelpInputBox;

	/**
	 * Fills out the Contact Us form with provided data.
	 * @throws InterruptedException 
	 */
	public void fillUpContactUsForm(String emailId, String firstName, String lastName, String phoneNumber,
			String companyName, String jobTitle, String howMayWeHelpText) throws InterruptedException {

		Common.waitForElementToBeVisible(driver, emailInputBox);
		Common.clearAndSendKeys(emailInputBox, emailId);
		log("Input Email Id : " + emailId);

		Common.waitForElementToBeVisible(driver, firstNameInputBox);
		Common.clearAndSendKeys(firstNameInputBox, firstName);
		log("Input First Name : " + firstName);

		Common.waitForElementToBeVisible(driver, lastNameInputBox);
		Common.clearAndSendKeys(lastNameInputBox, lastName);
		log("Input Last Name : " + lastName);

		Common.waitForElementToBeVisible(driver, phoneNumberInputBox);
		Common.clearAndSendKeys(phoneNumberInputBox, phoneNumber);
		log("Input Phone Number : " + phoneNumber);
		Common.scrollUpToElement(driver, lastNameInputBox);

		Common.waitForElementToBeVisible(driver, companyNameInputBox);
		Common.clearAndSendKeys(companyNameInputBox, companyName);
		Common.scrollUpToElement(driver, lastNameInputBox);
		log("Input Company Name : " + companyName);

		Common.waitForElementToBeVisible(driver, jobTitleInputBox);
		Common.clearAndSendKeys(jobTitleInputBox, jobTitle);
		Common.scrollUpToElement(driver, phoneNumberInputBox);
		log("Input Job Title : " + jobTitle);

		Common.waitForElementToBeVisible(driver, howMayWeHelpInputBox);
		Common.clearAndSendKeys(howMayWeHelpInputBox, howMayWeHelpText);
		Common.scrollUpToElement(driver, jobTitleInputBox);
		log("Inmput how May We Help Text : " + howMayWeHelpText);
		Thread.sleep(3000);
	}

	// Submission confirmation message
	@FindBy(xpath = "//p[normalize-space()='Thank You.']")
	private WebElement thankYouMessageAfterFormSubmit;

	/**
	 * Verifies the form was submitted successfully.
	 */
	public void verifyFormSubmissionSuccess() {
		Common.waitForElementToBeVisible(driver, thankYouMessageAfterFormSubmit);
		Common.scrollUpToElement(driver, thankYouMessageAfterFormSubmit);
		Assert.assertEquals("Form was not submitted successfully.", "Thank You.",
				thankYouMessageAfterFormSubmit.getText());
		log("Form submitted successfully.");
	}

}