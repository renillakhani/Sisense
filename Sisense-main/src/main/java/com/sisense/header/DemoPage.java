package com.sisense.header;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class DemoPage extends AbstractPage {

	public DemoPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = "//h1[contains(text(),'Transform your data into intuitive analytics experiences')]")
	private WebElement bannerSection;

	@FindBy(xpath = "//a[text()='Schedule a demo']")
	private WebElement scheduleADemoButton;

	public void clickOnScheduleADemoButton() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, bannerSection);
		Common.scrollUpToElement(driver, bannerSection);
		Common.checkIfElementIsDisplayedwithWait(driver, scheduleADemoButton, 30);
		Common.scrollUpToElement(driver, scheduleADemoButton);
		log("Scroll To Schedule A Demo Button");
		Common.waitForElementToBeVisible(driver, scheduleADemoButton);
		Common.jsClick(driver, scheduleADemoButton);
		log("Click On Schedule A Demo Button");

	}

	@FindBy(xpath = "//div[@role='dialog']")
	private WebElement formElement;

	public void verifyformIsOpen() {
		try {
			Common.waitForElementToBeVisible(driver, formElement);
		} catch (Exception e) {
			Assert.fail("Form is not opened");
		}
		log("Form is opened");

	}

	public void verifyWatchDemoFormIsOpen() {
		try {
			Common.waitForElementToBeVisible(driver, watchDemoFormEmailIdInputBox);
			Common.waitForElementToBeClickable(driver, watchDemoFormEmailIdInputBox);
		} catch (Exception e) {
			Assert.fail("Form is not opened");
		}
		log("Form is opened");

	}

	@FindBy(xpath = "//button[text()='Book live demo']//preceding::input[@id='Email']")
	private WebElement scheduleADemoFormEmailIdInputBox;

	@FindBy(xpath = "//button[text()='Book live demo']//preceding::input[@id='FirstName']")
	private WebElement scheduleADemoFormFirstNameInputBox;
	
	@FindBy(xpath = "//button[text()='Book live demo']//preceding::input[@id='LastName']")
	private WebElement scheduleADemoFormLastNameInputBox;

	@FindBy(xpath = "//button[text()='Book live demo']//preceding::input[@id='Phone']")
	private WebElement scheduleADemoFormPhoneNumberInputBox;

	@FindBy(xpath = "//button[text()='Book live demo']//preceding::input[@id='Company']")
	private WebElement scheduleADemoFormCompanyNameInputBox;

	@FindBy(xpath = "//button[text()='Book live demo']//preceding::input[@id='Title']")
	private WebElement scheduleADemoFormJobTitleInputBox;

	public void fillUpScheduleADemoForm(String emailId, String firstName, String lastName, String phoneNumber,
			String companyName, String jobTitleName) {

		Common.waitForElementToBeVisible(driver, scheduleADemoFormEmailIdInputBox);
		Common.clearAndSendKeys(scheduleADemoFormEmailIdInputBox, emailId);
		log("Entered Email Id : " + emailId);

		Common.waitForElementToBeVisible(driver, scheduleADemoFormFirstNameInputBox);
		Common.clearAndSendKeys(scheduleADemoFormFirstNameInputBox, firstName);
		log("Entered First Name : " + firstName);

		Common.waitForElementToBeVisible(driver, scheduleADemoFormLastNameInputBox);
		Common.clearAndSendKeys(scheduleADemoFormLastNameInputBox, lastName);
		log("Entered Last Name : " + lastName);

		Common.waitForElementToBeVisible(driver, scheduleADemoFormPhoneNumberInputBox);
		Common.scrollUpToElement(driver, scheduleADemoFormFirstNameInputBox);
		Common.clearAndSendKeys(scheduleADemoFormPhoneNumberInputBox, phoneNumber);
		log("Entered Phone Number : " + phoneNumber);

		Common.waitForElementToBeVisible(driver, scheduleADemoFormCompanyNameInputBox);
		Common.scrollUpToElement(driver, scheduleADemoFormPhoneNumberInputBox);
		Common.clearAndSendKeys(scheduleADemoFormCompanyNameInputBox, companyName);
		log("Entered Company Name : " + companyName);

		Common.waitForElementToBeVisible(driver, scheduleADemoFormJobTitleInputBox);
		Common.clearAndSendKeys(scheduleADemoFormJobTitleInputBox, jobTitleName);
		log("Entered Job Title : " + jobTitleName);
		Common.scrollUpToElement(driver, scheduleADemoFormJobTitleInputBox);

	}

	@FindBy(xpath = "//button[text()='Book live demo']")
	private WebElement bookliveDemoButton;

	public void clickOnBookliveDemoButton() {
		try {
			Common.scrollUpToElement(driver, scheduleADemoFormJobTitleInputBox);
			Common.waitForElementToBeVisible(driver, bookliveDemoButton);
			Common.jsClick(driver, bookliveDemoButton);
			log("Click On Book Live Demo Button ");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.scrollUpToElement(driver, scheduleADemoFormJobTitleInputBox);
			Common.waitForElementToBeVisible(driver, bookliveDemoButton);
			Common.jsClick(driver, bookliveDemoButton);
			log("Click On Book Live Demo Button ");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	/*
	 * @FindBy(xpath =
	 * "//form[text()='Thank you for your interest. Your request has been recieved.']"
	 * ) private WebElement thankYouMsg;
	 * 
	 * public void verifyScheduleADemoFormSubmit() {
	 * Common.waitForElementToBeVisible(driver, thankYouMsg);
	 * Assert.assertEquals("form is not submitted", thankYouMsg.getText(),
	 * "Thank you for your interest. Your request has been recieved.");
	 * log("form is submitted"); }
	 */
	
	@FindBy(xpath = "//div[@class='col-md-6']//p[contains(text(),'Thank you')]")
	private WebElement thankYouMsg;

	public void verifyScheduleADemoFormSubmit() {
		Common.waitForElementToBeVisible(driver, thankYouMsg);
		Assert.assertEquals("form is not submitted", thankYouMsg.getText(),"Thank you.");
		log("form is submitted");
	}

	@FindBy(xpath = "//h2[contains(text(),'Accelerate, automate, and simplify your data pipel')]//following-sibling::div//child::a[text()= 'Watch demo']")
	private WebElement watchDemoButton;

	@FindBy(xpath = "//h2[contains(text(),'Accelerate, automate, and simplify your data pipel')]")
	private WebElement accelerate_AutomateSection;

	@FindBy(xpath = "//h2[contains(text(),'Deliver the best analytics experience directly in ')]")
	private WebElement deliverTheBestAnalyticsExperienceDirectlyInSection;

	public void scrollToaccelerate_AutomateSection() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, deliverTheBestAnalyticsExperienceDirectlyInSection);
		Common.scrollToVertical(driver, deliverTheBestAnalyticsExperienceDirectlyInSection);
		Common.waitForElementToBeVisible(driver, accelerate_AutomateSection);
		Common.scrollUpToElement(driver, accelerate_AutomateSection);
		log("Scroll To Accelerate Automate Section");

	}

	public void scrollToaccelerate_AutomateSectionNewPage() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, accelerate_AutomateSection);
		Common.scrollToVertical(driver, accelerate_AutomateSection);
		Common.scrollUpToElement(driver, accelerate_AutomateSection);
		log("Scroll To Accelerate Automate Section");

	}

	public void clickOnWatchDemoButton() throws InterruptedException {
		Common.scrollUpToElement(driver, accelerate_AutomateSection);
		try {
			Common.scrollUpToElement(driver, accelerate_AutomateSection);

			Common.waitForElementToBeVisible(driver, watchDemoButton);
			Common.scrollUpToElement(driver, watchDemoButton);
			Common.jsClick(driver, watchDemoButton);
			log("Click On Watch Demo Button");
		} catch (Exception e) {
			Common.scrollUpToElement(driver, accelerate_AutomateSection);
			Common.waitForElementToBeVisible(driver, watchDemoButton);
			Common.scrollUpToElement(driver, watchDemoButton);
			Common.jsClick(driver, watchDemoButton);
			log("Click On Watch Demo Button");
		}
	}

	// Watch Demo Button Under The Form Element
	@FindBy(xpath = "//h2[text()='Watch demo']//following::button[normalize-space()='Watch demo']")
	private WebElement watchDemoButtonUnderTheForm;

	public void clickOnWatchDemoUnderTheForm() throws InterruptedException {
		try {
			Common.scrollUpToElement(driver, watchDemoFormJobTitleInputBox);
			Common.waitForElementToBeVisible(driver, watchDemoButtonUnderTheForm);
			Common.jsClick(driver, watchDemoButtonUnderTheForm);
			log("Click On Watch Demo Button");
		} catch (Exception e) {
			Common.scrollUpToElement(driver, watchDemoFormJobTitleInputBox);
			Common.waitForElementToBeVisible(driver, watchDemoButtonUnderTheForm);
			Common.jsClick(driver, watchDemoButtonUnderTheForm);
			log("Click On Watch Demo Button");
		}
		Common.waitForTitleToChange(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	@FindBy(xpath = "//h2[text()='Watch demo']//following::input[@id='Email']")
	private WebElement watchDemoFormEmailIdInputBox;

	@FindBy(xpath = "//h2[text()='Watch demo']//following::input[@id='FirstName']")
	private WebElement watchDemoFormFirstNameInputBox;

	@FindBy(xpath = "//h2[text()='Watch demo']//following::input[@id='LastName']")
	private WebElement watchDemoFormLastNameInputBox;

	@FindBy(xpath = "//h2[text()='Watch demo']//following::input[@id='Phone']")
	private WebElement watchDemoFormPhoneNumberInputBox;

	@FindBy(xpath = "//h2[text()='Watch demo']//following::input[@id='Company']")
	private WebElement watchDemoFormCompanyNameInputBox;

	@FindBy(xpath = "//h2[text()='Watch demo']//following::input[@id='Title']")
	private WebElement watchDemoFormJobTitleInputBox;

	public void fillUpWatchDemoForm(String emailId, String firstName, String lastName, String phoneNumber,
			String companyName, String jobTitleName) {

		Common.waitForElementToBeVisible(driver, watchDemoFormEmailIdInputBox);
		Common.clearAndSendKeys(watchDemoFormEmailIdInputBox, emailId);
		log("Entered Email Id : " + emailId);

		Common.waitForElementToBeVisible(driver, watchDemoFormFirstNameInputBox);
		Common.clearAndSendKeys(watchDemoFormFirstNameInputBox, firstName);
		log("Entered First Name : " + firstName);

		Common.waitForElementToBeVisible(driver, watchDemoFormLastNameInputBox);
		Common.clearAndSendKeys(watchDemoFormLastNameInputBox, lastName);
		log("Entered Last Name : " + lastName);

		Common.waitForElementToBeVisible(driver, watchDemoFormPhoneNumberInputBox);
		Common.scrollUpToElement(driver, watchDemoFormLastNameInputBox);
		Common.clearAndSendKeys(watchDemoFormPhoneNumberInputBox, phoneNumber);
		log("Entered Phone Number : " + phoneNumber);

		Common.waitForElementToBeVisible(driver, watchDemoFormCompanyNameInputBox);
		Common.scrollUpToElement(driver, watchDemoFormLastNameInputBox);
		Common.clearAndSendKeys(watchDemoFormCompanyNameInputBox, companyName);
		log("Entered Company Name : " + companyName);

		Common.waitForElementToBeVisible(driver, watchDemoFormJobTitleInputBox);
		Common.clearAndSendKeys(watchDemoFormJobTitleInputBox, jobTitleName);
		log("Entered Job Title : " + jobTitleName);
		Common.scrollUpToElement(driver, watchDemoFormJobTitleInputBox);
	}

	public void verifyWatchDemoFormSubmit() {
		Assert.assertEquals("form is not submitted", driver.getCurrentUrl(),
				"https://www.sisense.com/resources/recorded-demo-on-demand/");
		log("form is submitted");
	}

	// Contact Us Button Web Element
	@FindBy(xpath = "//h2[contains(text(),'Delight your users with AI-augmented self-service ')]//following-sibling::div//child::a[normalize-space()='Contact us']")
	private WebElement contactUsButton;

	// Contact Us Button Web Element
	@FindBy(xpath = "//h2[contains(text(),'Delight your users with AI-augmented self-service ')]")
	private WebElement delightYourUsersWithSection;

	public void clickOnContactUsButton() throws InterruptedException {

		Common.waitForElementToBeVisible(driver, delightYourUsersWithSection);
		Common.scrollUpToElement(driver, delightYourUsersWithSection);
		Common.waitForElementToBeVisible(driver, contactUsButton);
		Common.scrollUpToElement(driver, contactUsButton);
		Thread.sleep(1000);
		try {
			Common.jsClick(driver, contactUsButton);
			log("Click On Contact Us Button");
			// Common.waitForTitleToChange(driver, 10);
			Common.waitForPageToLoad(driver, 5);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, contactUsButton);
			Common.scrollUpToElement(driver, contactUsButton);
			Thread.sleep(1000);
			Common.jsClick(driver, contactUsButton);
			log("Click On Contact Us Button");
			// Common.waitForTitleToChange(driver, 10);
			Common.waitForPageToLoad(driver, 10);
		}

	}

	// Verification Of Get In Touch Page Title
	public void verifyGetInTouchPageTitle() {

		Assert.assertEquals("Get In Touch Page Title Not Matched", driver.getTitle(),
				"Contact Us - Get in Touch with Sisense");
		log("Get In Touch Page Title Matched");
	}

	@FindBy(xpath = "//a[text()='Test drive Sisense']")
	private WebElement testDriveSisenseButton;

	public void clickOnTestDriveSisenseButton() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, bannerSection);
		Common.scrollUpToElement(driver, bannerSection);
		Common.checkIfElementIsDisplayedwithWait(driver, testDriveSisenseButton, 30);
		Common.scrollUpToElement(driver, testDriveSisenseButton);
		log("Scroll To Test Drive Sisense Button");
		Common.waitForElementToBeVisible(driver, testDriveSisenseButton);
		try {
			Common.jsClick(driver, testDriveSisenseButton);
			log("Click On Test Drive Sisense Button");
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, bannerSection);
			Common.scrollUpToElement(driver, bannerSection);
			Common.jsClick(driver, testDriveSisenseButton);
			log("Click On Test Drive Sisense Button");
		}
		Common.waitForPageToLoad(driver, 10);
	}

	@FindBy(xpath = "//button[normalize-space()='Book live demo']//preceding::a[text()='Privacy Policy']")
	private WebElement privacyPolicyLink;

	public void clickOnPrivacyPolicyLink() throws InterruptedException {
		try {
			Common.waitForElementToBeVisible(driver, privacyPolicyLink);
			Common.scrollUpToElement(driver, privacyPolicyLink);
			Common.jsClick(driver, privacyPolicyLink);
			log("Click On Privacy Policy Link");
			Common.switchToAnotherWindow(driver, 10);
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, termsOfServiceLink);
			Common.scrollUpToElement(driver, termsOfServiceLink);
			Common.waitForElementToBeVisible(driver, privacyPolicyLink);
			Common.scrollUpToElement(driver, privacyPolicyLink);
			Common.jsClick(driver, privacyPolicyLink);
			log("Click On Privacy Policy Link");
			Common.switchToAnotherWindow(driver, 10);
			Common.waitForPageToLoad(driver, 10);
		}
	}

	@FindBy(xpath = "//button[normalize-space()='Book live demo']//preceding::a[text()='Terms of Service']")
	private WebElement termsOfServiceLink;

	public void clickOnTermsOfServiceLink() throws InterruptedException {
		try {
			Common.waitForElementToBeVisible(driver, termsOfServiceLink);
			Common.scrollUpToElement(driver, termsOfServiceLink);
			Common.jsClick(driver, termsOfServiceLink);
			log("Click On Terms Of Service Link");
			Common.switchToLastWindow(driver);
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, privacyPolicyLink);
			Common.scrollUpToElement(driver, privacyPolicyLink);
			Common.waitForElementToBeVisible(driver, termsOfServiceLink);
			Common.scrollUpToElement(driver, termsOfServiceLink);
			Common.jsClick(driver, termsOfServiceLink);
			log("Click On Terms Of Service Link");
			Common.switchToLastWindow(driver);
			Common.waitForPageToLoad(driver, 10);

		}
	}

	public void verifyformIsOpenNewPage() {
		try {
			Common.waitForElementToBeVisible(driver, watchDemoFormEmailIdInputBox);
			Common.waitForElementToBeClickable(driver, watchDemoFormEmailIdInputBox);
		} catch (Exception e) {
			Assert.fail("Form is not opened");
		}
		log("Form is opened");
	}

	@FindBy(xpath = "//h1[normalize-space()='Schedule a demo']//ancestor::div[@class='row']//child::input[@id='Email']")
	private WebElement bannerFormEmailIdInputBox;

	@FindBy(xpath = "//h1[normalize-space()='Schedule a demo']//ancestor::div[@class='row']//child::input[@id='FirstName']")
	private WebElement bannerFormFirstNameInputBox;

	@FindBy(xpath = "//h1[normalize-space()='Schedule a demo']//ancestor::div[@class='row']//child::input[@id='LastName']")
	private WebElement bannerFormLastNameInputBox;

	@FindBy(xpath = "//h1[normalize-space()='Schedule a demo']//ancestor::div[@class='row']//child::input[@id='Phone']")
	private WebElement bannerFormPhoneNumberInputBox;

	@FindBy(xpath = "//h1[normalize-space()='Schedule a demo']//ancestor::div[@class='row']//child::input[@id='Company']")
	private WebElement bannerFormCompanyNameInputBox;

	@FindBy(xpath = "//h1[normalize-space()='Schedule a demo']//ancestor::div[@class='row']//child::input[@id='Title']")
	private WebElement bannerFormJobTitleInputBox;

	public void fillUpBannerForm(String emailId, String firstName, String lastName, String phoneNumber,
			String companyName, String jobTitleName) {

		Common.waitForElementToBeVisible(driver, bannerFormEmailIdInputBox);
		Common.clearAndSendKeys(bannerFormEmailIdInputBox, emailId);
		log("Entered Email ID : " + emailId);

		Common.waitForElementToBeVisible(driver, bannerFormFirstNameInputBox);
		Common.clearAndSendKeys(bannerFormFirstNameInputBox, firstName);
		log("Entered First Name : " + firstName);

		Common.waitForElementToBeVisible(driver, bannerFormLastNameInputBox);
		Common.clearAndSendKeys(bannerFormLastNameInputBox, lastName);
		log("Entered Last Name : " + lastName);

		Common.waitForElementToBeVisible(driver, bannerFormPhoneNumberInputBox);
		Common.clearAndSendKeys(bannerFormPhoneNumberInputBox, phoneNumber);
		log("Entered Phone Number : " + phoneNumber);

		Common.scrollUpToElement(driver, bannerFormLastNameInputBox);

		Common.waitForElementToBeVisible(driver, bannerFormCompanyNameInputBox);
		Common.clearAndSendKeys(bannerFormCompanyNameInputBox, companyName);
		log("Entered Company Name : " + companyName);

		Common.scrollUpToElement(driver, bannerFormPhoneNumberInputBox);

		Common.waitForElementToBeVisible(driver, bannerFormJobTitleInputBox);
		Common.clearAndSendKeys(bannerFormJobTitleInputBox, jobTitleName);
		log("Entered Job Title : " + jobTitleName);

		Common.scrollUpToElement(driver, bannerFormCompanyNameInputBox);
	}

	@FindBy(xpath = "//button[text()='Book live demo']")
	private WebElement bookLiveDemoButton;

	public void clickOnBookLiveDemoButtonNewPage() throws InterruptedException {
		try {
			Common.scrollUpToElement(driver, bannerFormCompanyNameInputBox);
			Common.waitForElementToBeVisible(driver, bookLiveDemoButton);
			Common.scrollUpToElement(driver, bookLiveDemoButton);
			Common.jsClick(driver, bookLiveDemoButton);
			log("Click on Book Live Demo Button");

		} catch (Exception e) {
			Common.scrollUpToElement(driver, bannerFormCompanyNameInputBox);
			Common.waitForElementToBeVisible(driver, bookLiveDemoButton);
			Common.scrollUpToElement(driver, bannerFormCompanyNameInputBox);
			Common.scrollUpToElement(driver, bookLiveDemoButton);
			Common.jsClick(driver, bookLiveDemoButton);
			log("Click on Book Live Demo Button");
		}
		Common.waitForPageToLoad(driver, 10);

	}

	@FindBy(xpath = "//p[normalize-space()='Thank You.']")
	private WebElement bannerFormthankYouMsg;

	public void verifyBannerForSubmit() {
		Common.waitForElementToBeVisible(driver, bannerFormthankYouMsg);
		Assert.assertEquals("form is not submitted", bannerFormthankYouMsg.getText(), "Thank You.");
		log("form is submitted");
	}

}
