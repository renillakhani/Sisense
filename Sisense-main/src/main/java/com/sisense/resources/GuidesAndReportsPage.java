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

public class GuidesAndReportsPage extends AbstractPage {

	public GuidesAndReportsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Header Section: Guides and Reports Menu

	@FindBy(xpath = "//a[normalize-space()='Guides and reports']")
	private WebElement guidesAndReportsMenuUnderResourcesTab;

	/**
	 * Click on the 'Guides and Reports' menu under the Resources tab.
	 */
	public void clickOnGuidesAndReportsMenuUnderResourcesTab() {
		Common.waitForElementToBeVisible(driver, guidesAndReportsMenuUnderResourcesTab);
		Common.jsClick(driver, guidesAndReportsMenuUnderResourcesTab);
		log("Click on Guides and Reports menu under the Resources tab successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify the page title of Guides and Reports.
	 */
	public void verifyGuidesAndReportsPageTitle() {
		Assert.assertEquals("Guides and Reports Page Title does not match.", driver.getTitle(),
				FrameworkConstants.REPORTS_TITLE);
		log("Guides and Reports page title matched successfully.");
	}

	@FindBy(xpath = "(//a[@rel='next'])[1]")
	private WebElement nextButton;

	@FindBy(xpath = "//h1")
	private WebElement cardHeading;

	public void verifyReportCardsHeadingUnderReportPage() throws InterruptedException {
		Common.waitForPageToLoad(driver, 10);
		int cardsCount = 1;
		int pageCount = 0;
		Boolean checkViewReport = true;
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
					Common.waitForPageToLoad(driver, 10);
					if (checkViewReport) {
						Common.waitForElementToBeVisible(driver, cardHeading);
						Common.scrollUpToElement(driver, cardHeading);
						Common.waitForPageToLoad(driver, 10);
						clickOnViewReport();
						fillUpTheViewReportForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni",
								"1111111111", "KiwiQA", "QA");
						clickViewReportButtonUnderForm();
						verifyViewReportFormSubmit();
						log("Checked View Report Functionality For Card No : " + cardsCount + " , Card Heading : '"
								+ cardText + "'");
						driver.navigate().back();
						Common.waitForPageToLoad(driver, 10);
						checkViewReport = false;
						driver.navigate().back();
						Common.waitForPageToLoad(driver, 10);
					} else {
						log("View Report Functionality Already Checked With One Card");

					}

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
				Common.waitForPageToLoad(driver, 10);
			} else {
				log("✅ No more pages to process.");
				log("✅ Total pages verified: " + pageCount + ", Total cards verified: " + (cardsCount - 1));
				break;
			}
		}

		log("✅ All cards under the filter section were verified successfully.");
	}

	@FindBy(xpath = "//a[@id='viewReportBtn']")
	private WebElement viewReportButton;

	public void clickOnViewReport() throws InterruptedException {
		try {
			Common.waitForPageToLoad(driver, 10);
			Common.scrollUpToElement(driver, cardHeading);
			Common.waitForElementToBeVisible(driver, viewReportButton);
			Common.waitForElementToBeClickable(driver, viewReportButton);
			Common.waitForPageToLoad(driver, 10);
			Common.waitForPageToLoad(driver, 10);
			Common.jsClick(driver, viewReportButton);
			Common.actionsClick(driver, viewReportButton);
			Common.click(viewReportButton);
			log("Click on view report button under card");
		} catch (Exception e) {
			Common.waitForPageToLoad(driver, 10);
			Common.scrollUpToElement(driver, cardHeading);
			Common.scrollUpToElement(driver, viewReportButton);
			Common.waitForElementToBeVisible(driver, viewReportButton);
			Common.jsClick(driver, viewReportButton);
			log("Click on view report button under card");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	@FindBy(xpath = "//h2[text()='Get the report']//following::input[@id='Email']")
	private WebElement getTheReportFormEmailIdInputBox;

	@FindBy(xpath = "//h2[text()='Get the report']//following::input[@id='FirstName']")
	private WebElement getTheReportFormFirstNameInputBox;

	@FindBy(xpath = "//h2[text()='Get the report']//following::input[@id='LastName']")
	private WebElement getTheReportFormLastNameInputBox;

	@FindBy(xpath = "//h2[text()='Get the report']//following::input[@id='Phone']")
	private WebElement getTheReportFormPhoneNumberInputBox;

	@FindBy(xpath = "//h2[text()='Get the report']//following::input[@id='Company']")
	private WebElement getTheReportFormCompanyNameInputBox;

	@FindBy(xpath = "//h2[text()='Get the report']//following::input[@id='Title']")
	private WebElement getTheReportFormJobTitleInputBox;

	public void fillUpTheViewReportForm(String emailId, String firstName, String lastName, String phoneNumber,
			String companyName, String jobTitleName) {

		Common.waitForPageToLoad(driver, 10);

		Common.waitForElementToBeVisible(driver, getTheReportFormEmailIdInputBox);
		Common.clear(getTheReportFormEmailIdInputBox);
		Common.sendKeys(getTheReportFormEmailIdInputBox, emailId);
		log("Input Email id : " + emailId);

		Common.waitForElementToBeVisible(driver, getTheReportFormFirstNameInputBox);
		Common.clearAndSendKeys(getTheReportFormFirstNameInputBox, firstName);
		log("Input First Name : " + firstName);

		Common.waitForElementToBeVisible(driver, getTheReportFormLastNameInputBox);
		Common.clearAndSendKeys(getTheReportFormLastNameInputBox, lastName);
		log("Input Last Name : " + lastName);

		Common.waitForElementToBeVisible(driver, getTheReportFormPhoneNumberInputBox);
		Common.scrollUpToElement(driver, getTheReportFormLastNameInputBox);
		Common.clearAndSendKeys(getTheReportFormPhoneNumberInputBox, phoneNumber);
		log("Input Phone Number : " + phoneNumber);

		Common.waitForElementToBeVisible(driver, getTheReportFormCompanyNameInputBox);
		Common.scrollUpToElement(driver, getTheReportFormLastNameInputBox);
		Common.clearAndSendKeys(getTheReportFormCompanyNameInputBox, companyName);
		log("Input Company Name : " + companyName);

		Common.waitForElementToBeVisible(driver, getTheReportFormJobTitleInputBox);
		Common.clearAndSendKeys(getTheReportFormJobTitleInputBox, jobTitleName);
		log("Input Job Title : " + jobTitleName);

	}

	@FindBy(xpath = "//h2[text()='Get the report']//following::button[text()='View report']")
	private WebElement viewReportButtonUnderForm;

	public void clickViewReportButtonUnderForm() {
		try {
			Common.waitForPageToLoad(driver, 10);
			Common.scrollUpToElement(driver, getTheReportFormJobTitleInputBox);
			Common.waitForElementToBeVisible(driver, viewReportButtonUnderForm);
			Common.jsClick(driver, viewReportButtonUnderForm);
			log("Click On View report Button Under Form ");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForPageToLoad(driver, 10);
			Common.scrollUpToElement(driver, getTheReportFormJobTitleInputBox);
			Common.waitForElementToBeVisible(driver, viewReportButtonUnderForm);
			Common.jsClick(driver, viewReportButtonUnderForm);
			log("Click On View report Demo Button Under Form ");
			Common.waitForPageToLoad(driver, 10);

		}
	}

	@FindBy(xpath = "//h1[normalize-space()='Thank you!']")
	private WebElement thankYouMsg;

	public void verifyViewReportFormSubmit() {
		Common.waitForPageToLoad(driver, 10);
		Common.waitForElementToBeVisible(driver, thankYouMsg);
		Assert.assertEquals("form is not submitted", thankYouMsg.getText().trim(), "Thank you!");
		log("form is submitted");
	}

	public void verifyReportCardsUnderReportPage() {
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

				if (cardAuthorText.equals("Report")) {

					log("✅ Card " + cardsCount + ": Text matched - 'Report'");
					Common.scrollUpToElement(driver, card);
				} else {
					Assert.fail("❌ Card " + cardsCount + ": Text mismatch - Expected 'Report' but found: '"
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

	@FindBy(xpath = "//h3[contains(text(), 'See how Sisense fits your tech stack,')]")
	private WebElement seeHowSisenseFitsYourTechStackSection;

	public void scrollToSeeHowSisenseFitsYourTechStackSection() {
		Common.waitForPageToLoad(driver, 10);
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, seeHowSisenseFitsYourTechStackSection);
		Common.scrollUpToElement(driver, seeHowSisenseFitsYourTechStackSection);
		log("Scroll to 'See how Sisense fits your tech stack, use case, and product vision, live with an expert' section");
		Common.waitForPageToLoad(driver, 10);
	}

	@FindBy(xpath = "//a[text()='Book a demo']")
	private WebElement bookADemoButton;

	public void clickOnBookADemoButton() {
		Common.scrollUpToElement(driver, bookADemoButton);
		Common.waitForElementToBeVisible(driver, bookADemoButton);
		Common.jsClick(driver, bookADemoButton);
		log("Click on Book a demo button.");
	}

}
