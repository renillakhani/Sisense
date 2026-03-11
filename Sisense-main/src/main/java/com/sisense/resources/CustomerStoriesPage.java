package com.sisense.resources;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class CustomerStoriesPage extends AbstractPage {

	public CustomerStoriesPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Header Section: Customer Stories Menu

	@FindBy(xpath = "//a[normalize-space()='Customer stories']")
	private WebElement customerStoriesMenuUnderResourcesTab;

	// Click on Customer Stories Menu under Header
	public void clickOnCustomerStoriesMenuUnderResourcesTab() {
		Common.waitForElementToBeVisible(driver, customerStoriesMenuUnderResourcesTab);
		Common.jsClick(driver, customerStoriesMenuUnderResourcesTab);
		log("Click on Customer Stories Menu under Resources Tab successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Verify the page title for Customer Stories
	public void verifyCustomerStoriesPageTitle() {
		Assert.assertEquals("Customer Stories Page Title did not match", driver.getTitle(),
				FrameworkConstants.CUSTOMER_STORIES_TITLE);
		log("Customer Stories Page Title matched successfully.");
	}

	// Form Section: Email Label
	@FindBy(xpath = "//label[@id='LblEmail']")
	private WebElement emailLabel;

	// Scroll to Email Label under Form Section
	public void scrollToEmailLabelUnderFormSection() {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, emailLabel);
		Common.scrollUpToElement(driver, emailLabel);
		log("Scroll to Email Label under Form Section.");
	}

	// =====================================================
	// Form Section: Input Fields
	// =====================================================

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

	// Fill up the form under Form Section
	public void fillUpTheForm(String emailId, String firstName, String lastName, String phoneNumber, String companyName,
			String jobTitle) throws InterruptedException {

		Common.waitForElementToBeVisible(driver, emailInputBox);
		Common.clearAndSendKeys(emailInputBox, emailId);
		log("Entered Email ID : " + emailId);

		Common.waitForElementToBeVisible(driver, firstNameInputBox);
		Common.clearAndSendKeys(firstNameInputBox, firstName);
		log("Entered First Name : " + firstName);

		Common.waitForElementToBeVisible(driver, lastNameInputBox);
		Common.clearAndSendKeys(lastNameInputBox, lastName);
		log("Entered Last Name : " + lastName);

		Common.scrollUpToElement(driver, firstNameInputBox);

		Common.waitForElementToBeVisible(driver, phoneNumberInputBox);
		Common.clearAndSendKeys(phoneNumberInputBox, phoneNumber);
		log("Entered Phone Number : " + phoneNumber);

		Common.scrollUpToElement(driver, lastNameInputBox);

		Common.waitForElementToBeVisible(driver, companyNameInputBox);
		Common.clearAndSendKeys(companyNameInputBox, companyName);
		log("Entered Company Name : " + companyName);

		Common.scrollUpToElement(driver, companyNameInputBox);

		Common.waitForElementToBeVisible(driver, jobTitleInputBox);
		Common.clearAndSendKeys(jobTitleInputBox, jobTitle);
		log("Entered Job Title : " + jobTitle);

		Common.scrollUpToElement(driver, jobTitleInputBox);

		Thread.sleep(3000);
	}

	// Form Section: Watch Demo Button

	@FindBy(xpath = "//button[text()='Watch demo']")
	private WebElement watchDemoButton;

	// Click on Watch Demo Button under Form Section
	public void clickOnWatchDemoButtonUnderFormSection() {
		try {
			Common.scrollUpToElement(driver, jobTitleInputBox);
			Common.waitForElementToBeVisible(driver, watchDemoButton);
			Common.scrollUpToElement(driver, watchDemoButton);
			Common.waitForElementToBeClickable(driver, watchDemoButton);
			Common.jsClick(driver, watchDemoButton);
		} catch (Exception e) {
			Common.scrollUpToElement(driver, jobTitleInputBox);
			Common.waitForElementToBeVisible(driver, watchDemoButton);
			Common.scrollUpToElement(driver, watchDemoButton);
			Common.jsClick(driver, watchDemoButton);
		}
		log("Click on Watch Demo Button under Form Section.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Form Section: Submission Confirmation

	@FindBy(xpath = "//form[text()='Thanks for submitting your request.']")
	private WebElement thanksForSubmittingElement;

	// Verify Form Submission under Form Section
	public void verifyFormSubmit() {
		Common.waitForTitleToChange(driver, 10);
		Common.checkTitleNull(driver);
		Common.waitForPageToLoad(driver, 10);
		Assert.assertEquals("Form was not submitted successfully", driver.getTitle(),
				FrameworkConstants.AI_ASSISTANT_DASHBOARD_DEMO_TITLE);
		log("Form submitted successfully.");
	}

	// Footer Section: Privacy Policy Link

	@FindBy(xpath = "//a[normalize-space()='Privacy Policy']")
	private WebElement privacyPolicyLink;

	// Click on Privacy Policy Link under Footer
	public void clickOnPrivacyPolicyLinkUnderFormSection() {
		Common.scrollUpToBottom(driver);
		Common.scrollUpToElement(driver, privacyPolicyLink);
		Common.waitForElementToBeVisible(driver, privacyPolicyLink);
		Common.jsClick(driver, privacyPolicyLink);
		log("Click on Privacy Policy Link under Form section");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToAnotherWindow(driver, 20);
		Common.waitForPageToLoad(driver, 10);
	}

	// Verify Privacy Policy Page Title
	public void verifyPrivacyPolicyPageTitleUnderFormSection() {
		Assert.assertEquals("Privacy Policy Page Title did not match", driver.getTitle(),
				FrameworkConstants.PRIVACYPOLICY_TITLE);
		log("Privacy Policy Page Title matched successfully.");
	}

	// form Section: Terms of Service Link

	@FindBy(xpath = "//a[normalize-space()='Terms of Service']")
	private WebElement termsOfServiceLink;

	// Click on Terms of Service Link under Footer
	public void clickOnTermsOfServiceLinkUnderFormSection() {
		Common.scrollUpToBottom(driver);
		Common.scrollUpToElement(driver, termsOfServiceLink);
		Common.waitForElementToBeVisible(driver, termsOfServiceLink);
		Common.jsClick(driver, termsOfServiceLink);
		log("Click on Terms of Service Link under Form section.");
		Common.switchToAnotherWindow(driver, 20);
		Common.waitForPageToLoad(driver, 10);
	}

	// Verify Terms of Service Page Title
	public void verifyTermsOfServicePageTitleUnderFormSection() {
		Assert.assertEquals("Terms of Service Page Title did not match", driver.getTitle(),
				FrameworkConstants.TERMSOFUSE_TITLE);
		log("Terms of Service Page Title matched successfully.");
	}

	@FindBy(xpath = "(//a[@rel='next'])[1]")
	private WebElement nextButton;

	public void verifyCaseStudyCardsUnderCaseStudyPage() {
		Common.waitForPageToLoad(driver, 10);
		int cardsCount = 1;
		int pageCount = 0;
		while (true) {

			Common.waitForPageToLoad(driver, 10);
			log("Processing Page: " + (pageCount + 1));

			// Fetch fresh card elements on the current page
			List<WebElement> cardsOnCurrentPage = driver.findElements(By.xpath("//span[@class='author']"));
			Common.waitForAllElementsToBeVisible(driver, cardsOnCurrentPage);
			pageCount++;

			log("Found " + cardsOnCurrentPage.size() + " cards on Page " + pageCount);

			for (WebElement card : cardsOnCurrentPage) {
				Common.waitForElementToBeVisible(driver, card);
				String cardAuthorText = card.getText().trim();

				if (cardAuthorText.equals("Case Study")) {

					log("✅ Card " + cardsCount + ": Text matched - 'Case Study'");
					Common.scrollUpToElement(driver, card);
				} else {
					Assert.fail("❌ Card " + cardsCount + ": Text mismatch - Expected 'Case Study' but found: '"
							+ cardAuthorText + "'");
				}
				cardsCount++;
			}
			// Navigate to next page if available
			if (Common.checkIfElementIsDisplayedwithWait(driver, nextButton, 15)) {
				Common.waitForElementToBeVisible(driver, nextButton);
				Common.jsClick(driver, nextButton);
				log("Navigating to next page...");
			} else {
				log("✅ No more pages to process.");
				log("✅ Total pages verified: " + pageCount + ", Total cards verified: " + (cardsCount - 1));
				break;
			}
		}
		log("✅ All cards under the filter section were verified successfully.");
	}

	@FindBy(xpath = "//h1")
	private WebElement cardHeading;

	public void verifyCaseStudyCardsHeadingUnderCaseStudyPage() {
		Common.waitForPageToLoad(driver, 10);
		int cardsCount = 1;
		int pageCount = 0;

		while (true) {
			Common.waitForPageToLoad(driver, 10);
			log("Processing Page: " + (pageCount + 1));

			// Get all cards on the current page
			List<WebElement> cardsOnCurrentPage = driver.findElements(By.xpath("//div[@class='details']//child::h2"));
			Common.waitForAllElementsToBeVisible(driver, cardsOnCurrentPage);
			pageCount++;

			int cardIndex = 0;
			log("Found " + cardsOnCurrentPage.size() + " cards on Page " + pageCount);
			while (cardIndex < cardsOnCurrentPage.size()) {
				cardsOnCurrentPage = driver.findElements(By.xpath("//div[@class='details']//child::h2")); // REFRESH
				Common.waitForElementToBeVisible(driver, cardsOnCurrentPage.get(cardIndex));
				Common.scrollUpToElement(driver, cardsOnCurrentPage.get(cardIndex));
				String cardText = cardsOnCurrentPage.get(cardIndex).getText().trim();

				Common.jsClick(driver, cardsOnCurrentPage.get(cardIndex));
				Common.waitForPageToLoad(driver, 10);

				Common.waitForElementToBeVisible(driver, cardHeading);

				if (cardText.equals(cardHeading.getText().trim())) {
					log("✅ Card " + cardsCount + ": Text matched - '" + cardText + "'");
				} else {
					Assert.fail("❌ Card " + cardsCount + ": Text mismatch - Expected : '" + cardText + "' but found: '"
							+ cardHeading.getText() + "'");
				}

				driver.navigate().back();
				Common.waitForPageToLoad(driver, 10);
				cardsCount++;
				cardIndex++;
			}

			// Navigate to next page if available
			if (Common.checkIfElementIsDisplayedwithWait(driver, nextButton, 15)) {
				Common.waitForElementToBeVisible(driver, nextButton);
				Common.scrollUpToElement(driver, nextButton);
				Common.jsClick(driver, nextButton);
				log("Navigating to next page...");
			} else {
				log("✅ No more pages to process.");
				log("✅ Total pages verified: " + pageCount + ", Total cards verified: " + (cardsCount - 1));
				break;
			}
		}

		log("✅ All cards under the filter section were verified successfully.");
	}

}
