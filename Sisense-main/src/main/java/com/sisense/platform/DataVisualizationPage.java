package com.sisense.platform;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class DataVisualizationPage extends AbstractPage {

	public DataVisualizationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Data Visualization Menu under Platform
	@FindBy(xpath = "//a[text()='Capabilities']/following-sibling::ul//a[text()='Data visualization']")
	private WebElement dataVisualizationMenuUnderPlatformTab;

	/**
	 * Click on the 'Data Visualization' menu under the 'Platform' tab.
	 */
	public void clickOnDataVisualizationMenuUnderPlatformTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, dataVisualizationMenuUnderPlatformTab);
		Common.jsClick(driver, dataVisualizationMenuUnderPlatformTab);
		log("Click on 'Data visualization' menu under 'Platform' tab.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify the title of the 'Data Modeling' page.
	 */
	public void verifyDataVisualizationPageTitle() {
		Assert.assertEquals("Data Visualization Page Title did not match.", driver.getTitle(),
				FrameworkConstants.DATA_VISUALIZATION_PAGE_TITLE);
		log("Data Visualization Page Title matched successfully.");
	}

	// Banner Text Element
	@FindBy(xpath = "//h1[text()='Data visualization, simplified']")
	private WebElement bannerHeadingText;

	/**
	 * Scroll to banner section
	 */
	public void scrollToBannerSection() {
		Common.waitForElementToBeVisible(driver, bannerHeadingText);
		Common.scrollUpToElement(driver, bannerHeadingText);
		log("Scroll to banner heading");
	}

	// Get a 7-day free trial button under Hero banner
	@FindBy(xpath = "//a[text()='Get a 7-day free trial']")
	private WebElement getA7_DayFreeTrialButtonUnderHeroBanner;

	@FindBy(xpath = "//a[text()='Watch a demo']")
	private WebElement watchADemoButtonUnderHeroBanner;

	/**
	 * Click on the 'Get a 7-day free trial' Button under the Hero Banner
	 */
	public void clickOnGetA7_DayFreeTrialButtonUnderHeroBanner() throws InterruptedException {

		if (Common.checkIfElementIsDisplayedwithWait(driver, getA7_DayFreeTrialButtonUnderHeroBanner, 5)) {
			Common.waitForElementToBeVisible(driver, getA7_DayFreeTrialButtonUnderHeroBanner);
			Common.scrollUpToElement(driver, getA7_DayFreeTrialButtonUnderHeroBanner);
			Common.jsClick(driver, getA7_DayFreeTrialButtonUnderHeroBanner);
			log("Click on 'Get a 7-day free trial' Button Under Hero Banner");
			Common.waitForPageToLoad(driver, 10);
			commonMethods.verifySisense7_DayFreeTrialPageTitle();
		} else if (Common.checkIfElementIsDisplayedwithWait(driver, watchADemoButtonUnderHeroBanner, 5)) {

			Common.waitForElementToBeVisible(driver, watchADemoButtonUnderHeroBanner);
			Common.scrollUpToElement(driver, watchADemoButtonUnderHeroBanner);
			Common.jsClick(driver, watchADemoButtonUnderHeroBanner);
			log("Click on 'Watch a demo' Button Under Hero Banner");
			Common.waitForPageToLoad(driver, 10);
			dataVisualizationPage.verifyDataVisualizationPageTitle();

		} else {
			Assert.fail("Watch demo or Get a 7-day free trial button is not visible ");
		}
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

	/**
	 * Fills out the Contact Us form with provided data.
	 * @throws Exception 
	 */
	public void fillUpContactUsForm(String emailId, String firstName, String lastName, String phoneNumber,
			String companyName, String jobTitle) throws Exception {

		Common.waitForElementToBeVisible(driver, emailInputBox);
		Common.clearAndSendKeys(emailInputBox, emailId);
		log("Input Email Id : " + emailId);

		Common.waitForElementToBeVisible(driver, firstNameInputBox);
		Common.clearAndSendKeys(firstNameInputBox, firstName);
		log("Input First Name : " + firstName);

		Common.waitForElementToBeVisible(driver, lastNameInputBox);
		Common.clearAndSendKeys(lastNameInputBox, lastName);
		log("Input Last Name : " + lastName);

		Common.scrollUpToElement(driver, lastNameInputBox);

		Common.waitForElementToBeVisible(driver, companyNameInputBox);
		Common.clearAndSendKeys(companyNameInputBox, companyName);
		Common.scrollUpToElement(driver, lastNameInputBox);
		log("Input Company Name : " + companyName);

		Common.waitForElementToBeVisible(driver, jobTitleInputBox);
		Common.clearAndSendKeys(jobTitleInputBox, jobTitle);
		Common.scrollUpToElement(driver, phoneNumberInputBox);
		log("Input Job Title : " + jobTitle);
		
		Thread.sleep(7000);
		Common.waitForElementToBeVisible(driver, phoneNumberInputBox);
		Common.clearAndSendKeys(phoneNumberInputBox, phoneNumber);
		log("Input Phone Number : " + phoneNumber);
		Common.scrollUpToElement(driver, lastNameInputBox);
		
	}

	// Book live demo button under the 'Book a demo' section
	@FindBy(xpath = "//button[@type='submit' and text()='Watch demo']")
	private WebElement watchDemoButton;

	/**
	 * Clicks on the 'Book live demo' button under the 'Book a demo' section.
	 */
	public void clickOnWatchDemoButtonButtonUnderForm() {

		try {
			Common.waitForElementToBeVisible(driver, watchDemoButton);
			Common.scrollUpToElement(driver, jobTitleInputBox);
			Common.scrollUpToElement(driver, watchDemoButton);
			Common.jsClick(driver, watchDemoButton);
			log("Click on 'Watch Demo' button successfully.");
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, jobTitleInputBox);
			Common.scrollUpToElement(driver, jobTitleInputBox);
			Common.waitForElementToBeVisible(driver, watchDemoButton);
			Common.scrollUpToElement(driver, watchDemoButton);
			Common.jsClick(driver, watchDemoButton);
			log("Click on 'Watch Demo' button after retry.");
		}
		Common.waitForPageToLoad(driver, 10);
		Common.checkTitleNull(driver);
	}

	// Submission confirmation message
	@FindBy(xpath = "//p[text()='We will be in touch soon!']")
	private WebElement confirmationMessageText;

	/**
	 * Verifies the form was submitted successfully.
	 */
	public void verifyFormSubmissionSuccess() {
		Common.waitForTitleToChange(driver, 10);
		Common.checkTitleNull(driver);
		Common.waitForPageToLoad(driver, 10);
		Assert.assertEquals("Form was not submitted successfully", driver.getTitle(),
				FrameworkConstants.AI_ASSISTANT_DASHBOARD_DEMO_TITLE);
		log("Form submitted successfully.");
	}

	@FindBy(xpath = "//span[contains(text(),'The Sisense API-first architecture and robust SDKs')]")
	private WebElement aPlatformBuiltForScaleSection;

	@FindBy(xpath = "(//a[text()='Read the Story' and @href='https://www.sisense.com/success/usa-swimming-dives-into-data-to-empower-future-olympians/'])[1]")
	private WebElement readTheStory1Button;

	@FindBy(xpath = "(//a[text()='Read the Story' and @href='https://www.sisense.com/success/funraise-boosts-fundraising-7x-with-nonprofit-data-analytics/'])[3]")
	private WebElement readTheStory2Button;

	@FindBy(xpath = "(//a[text()='Read the Story' and @href='https://www.sisense.com/success/barrios-takes-analytics-to-new-heights/'])[2]")
	private WebElement readTheStory3Button;

	public void clickReadTheStoryButton() throws InterruptedException {
		Common.waitForPageToLoad(driver, 10);
		Common.scrollUpToBottom(driver);
		Thread.sleep(5000);
		Common.waitForElementToBeVisible(driver, aPlatformBuiltForScaleSection);
		Common.scrollUpToElement(driver, aPlatformBuiltForScaleSection);
		Common.waitForPageToLoad(driver, 10);
		Common.waitForPageToLoad(driver, 10);

		if (Common.checkIfElementIsDisplayedwithWait(driver, readTheStory1Button, 10)) {
			Common.waitForPageToLoad(driver, 10);

			Common.waitForElementToBeVisible(driver, readTheStory1Button);
			Common.scrollUpToElement(driver, readTheStory1Button);

			Common.jsClick(driver, readTheStory1Button);

			log("Click on 'Read The Story 1' Button Under Hero Banner");

			Common.waitForPageToLoad(driver, 10);

			Assert.assertEquals("Sisense 'Read The Story 1' page title not matched", driver.getTitle(),
					"USA Swimming dives into data With Sisense | Case Studies");
			log("Sisense 'Read The Story 1' page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, readTheStory2Button, 10)) {
			Common.waitForPageToLoad(driver, 10);

			Common.waitForElementToBeVisible(driver, readTheStory2Button);
			Common.scrollUpToElement(driver, readTheStory2Button);

			Common.jsClick(driver, readTheStory2Button);

			log("Click on 'Read The Story 2' Button Under Hero Banner");

			Common.waitForPageToLoad(driver, 10);

			Assert.assertEquals("Sisense 'Read The Story 2' page title not matched", driver.getTitle(),
					"Funraise boosts fundraising With Sisense | Case Studies");
			log("Sisense 'Read The Story 2' page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, readTheStory3Button, 10)) {
			Common.waitForPageToLoad(driver, 10);

			Common.waitForElementToBeVisible(driver, readTheStory3Button);
			Common.scrollUpToElement(driver, readTheStory3Button);

			Common.jsClick(driver, readTheStory3Button);

			log("Click on 'Read The Story 3' Button Under Hero Banner");

			Common.waitForPageToLoad(driver, 10);

			Assert.assertEquals("Sisense 'Read The Story 2' page title not matched", driver.getTitle(),
					"Barrios takes analytics to new heights | Case Studies");
			log("Sisense 'Read The Story 3' page title matched successfully.");

		} else {
			Assert.fail("No Button Found");
		}

	}

	@FindBy(xpath = "//h3[text()='Watch our demo']//parent::div//following-sibling::form//child::span//a[text()='Privacy Policy']")
	private WebElement privacyPolicyLinkUnderForm;

	public void clickOnPrivacyPolicyLinkUnderForm() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, privacyPolicyLinkUnderForm);
		Common.scrollUpToElement(driver, privacyPolicyLinkUnderForm);
		Common.waitForElementToBeVisible(driver, privacyPolicyLinkUnderForm);
		Common.scrollUpToElement(driver, privacyPolicyLinkUnderForm);
		Common.jsClick(driver, privacyPolicyLinkUnderForm);
		log("Click on Privacy Policy Link Under Form");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToAnotherWindow(driver, 10);

	}

	public void verifyPrivacyPolicyPageTitle() {
		Common.waitForPageToLoad(driver, 10);
		Assert.assertEquals("Privacy Policy Not Matched ", driver.getTitle(), FrameworkConstants.PRIVACYPOLICY_TITLE);
		log("Privacy Policy Matched  successfully.");
	}

	// Form Section: Job titleLabel
	@FindBy(xpath = "//label[@id='LblTitle']")
	private WebElement jobTitleLabel;

	public void scrollToJobTitleLableUnderFormSection() {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, jobTitleLabel);
		Common.scrollUpToElement(driver, jobTitleLabel);
		log("Scroll to Job title Label under Form Section.");
	}

	@FindBy(xpath = "//h3[text()='Watch our demo']//parent::div//following-sibling::form//child::span//a[text()='Terms of Service']")
	private WebElement termsOfServiceLinkUnderForm;

	public void clickOnTermsOfServiceLinkUnderForm() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, termsOfServiceLinkUnderForm);
		Common.scrollUpToElement(driver, termsOfServiceLinkUnderForm);
		Common.waitForElementToBeVisible(driver, termsOfServiceLinkUnderForm);
		Common.scrollUpToElement(driver, termsOfServiceLinkUnderForm);
		Common.jsClick(driver, termsOfServiceLinkUnderForm);
		log("Click on Terms of Service Link Under Form");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToAnotherWindow(driver, 10);
	}

	public void verifyTermsOfServicePageTitle() {
		Common.waitForPageToLoad(driver, 10);
		Assert.assertEquals("Terms of Service Title Not Matched", driver.getTitle(),
				FrameworkConstants.TERMSOFUSE_TITLE);
		log("Terms of Service Title Matched successfully.");
	}

}
