package com.sisense.about;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class PartnersPage extends AbstractPage {
	public PartnersPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Partners Menu under About tab
	@FindBy(xpath = "//a[text()='Partners']")
	private WebElement partnersMenu;

	// Click on Partners menu under About tab
	public void clickOnPartnersMenuUnderAboutTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, partnersMenu);
		Common.jsClick(driver, partnersMenu);
		log("Click on the Partners menu under the About tab successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Verify Partners page title
	public void verifyPartnersPageTitle() {
		Assert.assertEquals("Sisense Partners Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.PARTNERS_TITLE);
		log("Sisense Partners page title matched successfully.");
	}

	// Become a Partner button under banner section
	@FindBy(xpath = "//a[text()='Become a Partner']")
	private WebElement becomeAPartnerButton;

	// Click on Become a Partner button under the banner section
	public void clickOnBecomeAPartnerButtonUnderBanner() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, becomeAPartnerButton);
		Common.waitForElementToBeClickable(driver,becomeAPartnerButton);
		Common.waitForPageToLoad(driver, 10);
		//Common.actionsClick(driver,becomeAPartnerButton);
		Common.click(becomeAPartnerButton);
		Common.click(becomeAPartnerButton);
		
		log("Click on the Become a Partner button under the banner section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Partner form dialog box
	@FindBy(xpath = "//div[@role='dialog']")
	private WebElement partnerFormDialog;

	// Verify that the partner form dialog has opened
	public void verifyPartnerFormIsOpened() {
		try {
			Common.waitForElementToBeVisible(driver, partnerFormDialog);
		} catch (Exception e) {
			Assert.fail("The Become a Partner form is not open");
		}

		log("The Become a Partner form opened successfully.");
	}

	// Form input fields under the partner form
	@FindBy(xpath = "//h2[text()='Become a Partner']//following::input[@id='Email']")
	private WebElement formEmailInput;

	@FindBy(xpath = "//h2[text()='Become a Partner']//following::input[@id='FirstName']")
	private WebElement formFirstNameInput;

	@FindBy(xpath = "//h2[text()='Become a Partner']//following::input[@id='LastName']")
	private WebElement formLastNameInput;

	@FindBy(xpath = "//h2[text()='Become a Partner']//following::input[@id='Phone']")
	private WebElement formPhoneInput;

	@FindBy(xpath = "//h2[text()='Become a Partner']//following::input[@id='Company']")
	private WebElement formCompanyInput;

	@FindBy(xpath = "//h2[text()='Become a Partner']//following::input[@id='Title']")
	private WebElement formJobTitleInput;

	@FindBy(xpath = "//h2[text()='Become a Partner']//following::select[@id='Primary_Project_Type__c']")
	private WebElement formPartnerTypeDropdown;

	// Click on Partner Type dropdown under the form
	public void clickOnPartnerTypeDropdownUnderForm() {
		Common.waitForElementToBeVisible(driver, formPartnerTypeDropdown);
		Common.jsClick(driver, formPartnerTypeDropdown);
		log("Click on the Partner Type dropdown under the form.");
	}

	// Option element under Partner Type dropdown
	@FindBy(xpath = "//select[@value='Partner - Platform']")
	private WebElement partnerPlatformOption;

	// Select 'Partner - Platform' from dropdown
	public void selectPartnerPlatformOptionUnderDropdown() {
		Common.waitForElementToBeVisible(driver, partnerPlatformOption);
		Common.jsClick(driver, partnerPlatformOption);
		log("Selected the 'Partner - Platform' option from the dropdown.");
	}

	// Comment text area under partner form
	@FindBy(xpath = "//h2[text()='Become a Partner']//following::textarea[@id='Comment__c']")
	private WebElement formCommentInput;

	// Fill up the Become a Partner form
	public void fillUpBecomeAPartnerForm(String emailId, String firstName, String lastName, String phoneNumber,
			String companyName, String jobTitle, String partnerType, String comments) {

		Common.waitForElementToBeVisible(driver, formEmailInput);
		Common.clearAndSendKeys(formEmailInput, emailId);
		log("Input Email ID: " + emailId);

		Common.waitForElementToBeVisible(driver, formFirstNameInput);
		Common.clearAndSendKeys(formFirstNameInput, firstName);
		log("Input First Name : " + firstName);

		Common.waitForElementToBeVisible(driver, formLastNameInput);
		Common.clearAndSendKeys(formLastNameInput, lastName);
		log("Input Last Name : " + lastName);

		Common.waitForElementToBeVisible(driver, formPhoneInput);
		Common.clearAndSendKeys(formPhoneInput, phoneNumber);
		log("Input Phone Number : " + phoneNumber);

		Common.scrollUpToElement(driver, formPhoneInput);

		Common.waitForElementToBeVisible(driver, formCompanyInput);
		Common.clearAndSendKeys(formCompanyInput, companyName);
		log("Input Company Name : " + companyName);

		Common.scrollUpToElement(driver, formCompanyInput);

		Common.waitForElementToBeVisible(driver, formJobTitleInput);
		Common.clearAndSendKeys(formJobTitleInput, jobTitle);
		log("Input Job Title : " + jobTitle);

		Common.scrollUpToElement(driver, formJobTitleInput);

		Common.waitForElementToBeVisible(driver, formPartnerTypeDropdown);
		Common.selectFromCombo(formPartnerTypeDropdown, partnerType);
		log("Input Partner Type : " + partnerType);

		Common.scrollUpToElement(driver, formPartnerTypeDropdown);

		Common.waitForElementToBeVisible(driver, formCommentInput);
		Common.clearAndSendKeys(formCommentInput, comments);
		log("Input Comments : " + comments);

		Common.scrollUpToElement(driver, formCommentInput);
	}

	// Submit button under form
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitButton;

	// Click on Submit button under the form
	public void clickOnSubmitButtonUnderForm() {
		try {
			Common.scrollUpToElement(driver, formCommentInput);
			Common.waitForElementToBeVisible(driver, submitButton);
			Common.jsClick(driver, submitButton);
			log("Click on the Submit button under the form.");
		} catch (Exception e) {
			Common.scrollUpToElement(driver, formCommentInput);
			Common.waitForElementToBeVisible(driver, submitButton);
			Common.jsClick(driver, submitButton);
			log("Click on the Submit button under the form.");

		}
	}

	// Heading to verify form submission
	@FindBy(xpath = "//h2[text()='Become a Partner']")
	private WebElement becomeAPartnerHeading;

	// Verify form submission using heading text
	public void verifyFormSubmissionUnderBecomeAPartner() {
		Common.waitForElementToBeVisible(driver, becomeAPartnerHeading);
		Assert.assertEquals("Form is not submitting", becomeAPartnerHeading.getText(),
				FrameworkConstants.BECOME_A_PARTNER_TITLE);
		log("The Become a Partner form was submitted successfully.");
	}

	// View All Partners button under banner section
	@FindBy(xpath = "//a[text()='View all Partners']")
	private WebElement viewAllPartnersButton;

	// Click on View All Partners button under banner
	public void clickOnViewAllPartnersButtonUnderBanner() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, viewAllPartnersButton);
		Common.scrollUpToElement(driver, viewAllPartnersButton);
		Common.jsClick(driver, viewAllPartnersButton);
		log("Click on the View All Partners button under the banner.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Verify View All Partners page title
	public void verifyViewAllPartnersPageTitle() {
		Assert.assertEquals("Sisense View All Partners Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.PARTNERS_TITLE);
		log("Sisense View All Partners page title matched successfully.");
	}

	// Email label element in footer form
	@FindBy(xpath = "//label[@id='LblEmail']")
	private WebElement emailLabel;

	// Scroll to Email label in footer form
	public void scrollToEmailLabel() {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, emailLabel);
		Common.scrollUpToElement(driver, emailLabel);
		log("Scroll to the Email label under the footer.");
	}

	// Footer form input fields
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement footerEmailInput;

	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement footerFirstNameInput;

	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement footerLastNameInput;

	//@FindBy(xpath = "//input[@id='Phone']")
	//private WebElement footerPhoneInput;

	@FindBy(xpath = "//input[@id='Company']")
	private WebElement footerCompanyInput;

	// Fill up the Subscribe form in the footer
	public void fillUpSubscribeForm(String emailId, String firstName, String lastName, String companyName)
			throws InterruptedException {

		Common.waitForElementToBeVisible(driver, footerEmailInput);
		Common.clearAndSendKeys(footerEmailInput, emailId);
		log("Input Email ID: " + emailId);

		Common.waitForElementToBeVisible(driver, footerFirstNameInput);
		Common.clearAndSendKeys(footerFirstNameInput, firstName);
		log("Input First Name : " + firstName);

		Common.waitForElementToBeVisible(driver, footerLastNameInput);
		Common.clearAndSendKeys(footerLastNameInput, lastName);
		log("Input Last Name : " + lastName);

		// Common.waitForElementToBeVisible(driver, footerPhoneInput);
		// Common.clearAndSendKeys(footerPhoneInput, phoneNumber);
		// log("Input Phone Number : " + phoneNumber);

		Common.scrollUpToElement(driver, footerLastNameInput);

		Common.waitForElementToBeVisible(driver, footerCompanyInput);
		Common.clearAndSendKeys(footerCompanyInput, companyName);
		log("Input Company Name : " + companyName);

		Common.scrollUpToElement(driver, footerCompanyInput);
		Common.scrollUpToElement(driver, footerEmailInput);
	}
	// Subscribe button under footer
	@FindBy(xpath = "//button[text()='Subscribe']")
	private WebElement subscribeButton;

	// Click on Subscribe button under footer
	public void clickOnSubscribeButtonUnderFooter() throws InterruptedException {

		try {
			Common.scrollUpToElement(driver, footerCompanyInput);
			Common.waitForElementToBeVisible(driver, subscribeButton);
			Common.jsClick(driver, subscribeButton);
			log("Click on the Subscribe button under the footer.");
		} catch (Exception e) {
			Common.scrollUpToElement(driver, footerCompanyInput);
			Common.waitForElementToBeVisible(driver, subscribeButton);
			Common.jsClick(driver, subscribeButton);
			log("Click on the Subscribe button under the footer.");
		}
	}

	// Privacy Policy link under form section
	@FindBy(xpath = "//a[normalize-space()='Privacy Policy']")
	private WebElement privacyPolicyLink;

	// Click on Privacy Policy link under form section
	public void clickOnPrivacyPolicyLinkUnderFormSection() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.scrollUpToElement(driver, privacyPolicyLink);
		Common.waitForElementToBeVisible(driver, privacyPolicyLink);
		Common.jsClick(driver, privacyPolicyLink);
		log("Click on the Privacy Policy link under the form section.");
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	// Verify Privacy Policy page title
	public void verifyPrivacyPolicyPageTitle() {
		Assert.assertEquals("Privacy Policy Page Title is not matched", driver.getTitle(),
				FrameworkConstants.PRIVACYPOLICY_TITLE);
		log("Privacy Policy page title matched successfully.");
	}

	// Terms of Service link under form section
	@FindBy(xpath = "//a[normalize-space()='Terms of Service']")
	private WebElement termsOfServiceLink;

	// Click on Terms of Service link under form section
	public void clickOnTermsOfServiceLinkUnderFormSection() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.scrollUpToElement(driver, termsOfServiceLink);
		Common.waitForElementToBeVisible(driver, termsOfServiceLink);
		Common.jsClick(driver, termsOfServiceLink);
		log("Click on the Terms of Service link under the form section.");
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	// Verify Terms of Service page title
	public void verifyTermsOfServicePageTitle() {
		Assert.assertEquals("Terms of Service Page Title is not matched", driver.getTitle(),
				FrameworkConstants.TERMSOFUSE_TITLE);
		log("Terms of Service page title matched successfully.");
	}

	// Confirmation message element after footer form submission
	@FindBy(xpath = "//form[text()='Thanks for submitting your request.']")
	private WebElement formSubmissionConfirmation;

	// Verify footer form submission confirmation message
	public void verifyFormSubmission() {
		Common.waitForElementToBeVisible(driver, formSubmissionConfirmation);
		Assert.assertEquals("Footer form is not submitting", formSubmissionConfirmation.getText(),
				FrameworkConstants.THANKSFORSUBMIT_TITLE);
		log("Footer form was submitted successfully.");
	}
}
