package com.sisense.platform;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class MarketplacePage extends AbstractPage {
	public MarketplacePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Marketplace Menu WebElement under Extensions section
	@FindBy(xpath = "//a[text()='Extensions']/following-sibling::ul//a[text()='Marketplace']")
	private WebElement marketplaceMenuUnderExtensionsSection;

	/**
	 * Click on Marketplace Menu under Platform section
	 */
	public void clickOnMarketplaceMenuUnderPlatformSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, marketplaceMenuUnderExtensionsSection);
		Common.jsClick(driver, marketplaceMenuUnderExtensionsSection);
		log("Click on Marketplace Menu under Platform tab successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify Marketplace Page Title
	 */
	public void verifyMarketplacePageTitle() {
		Assert.assertEquals("Sisense Marketplace Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.MARKETPLACEPAGE_TITLE);
		log("Verified Marketplace Page Title successfully.");
	}

	// Check Out Our Community Link under Banner section
	@FindBy(xpath = "//p[text()='For additional solutions, ']//child::a[contains(text(), 'Check out our')]")
	private WebElement checkOutOurCommunityLinkUnderBannerSection;

	/**
	 * Click on Check Out Our Community Link under Banner section
	 */
	public void clickOnCheckOutOurCommunityLinkUnderBannerSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, checkOutOurCommunityLinkUnderBannerSection);
		Common.jsClick(driver, checkOutOurCommunityLinkUnderBannerSection);
		log("Click on Check Out Our Community Link under Banner section.");
		Common.switchToAnotherWindow(driver, 10);
	}

	/**
	 * Verify Community Home Page Title
	 */
	public void verifyCommunitySiteHomePageTitle() {
		log("Community Site Title: " + driver.getTitle());
		Assert.assertEquals("Sisense Community Home Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.COMMUNITY_HOME_TITLE);
		log("Verified Community Home Page Title successfully.");
	}

	// Search Icon under Marketplace section
	@FindBy(xpath = "//input[@id='search']")
	private WebElement searchIconUnderFilterSection;

	/**
	 * Click on Search Icon under Filter Section
	 */
	public void clickOnSearchIconUnderFilterSection() {
		Common.waitForPageToLoad(driver, 10);
		Common.waitForElementToBeVisible(driver, searchIconUnderFilterSection);
		Common.scrollUpToElement(driver, searchIconUnderFilterSection);
		log("Scroll to Search Icon under Filter section successfully.");
		Common.jsClick(driver, searchIconUnderFilterSection);
		log("Click on Search Icon under  Filter section.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Enter 'Paldi' text in the search box under Filter Section
	 */
	public void enterPaldiTextUnderSearchBox() {
		String searchTerm = "paldi";
		searchIconUnderFilterSection.sendKeys(searchTerm);
		log("Entered text in Search Box: " + searchTerm);
		Common.actionsSendKeys(driver, Keys.ENTER);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies that all cards under the filter section across all pages display
	 * "Free" label. Logs page and card details, collects all mismatches, and fails
	 * at the end if needed.
	 * 
	 * 
	 * @FindBy(xpath = "//a[@rel='next']") private WebElement nextButton;
	 * 
	 *               public void verifySearchDataUnderFilterSection() {
	 *               Common.waitForPageToLoad(driver, 10); int cardsCount = 1; int
	 *               pageCount = 0; List<String> mismatchedCards = new
	 *               ArrayList<>(); while (true) { Common.waitForPageToLoad(driver,
	 *               10); log("Processing Page: " + (pageCount + 1)); // Fetch fresh
	 *               card elements on the current page List<WebElement>
	 *               cardsOnCurrentPage = driver
	 *               .findElements(By.xpath("//div[contains(@class, 'eyebrow') and
	 *               contains(@class, 'app-price')]"));
	 *               Common.waitForAllElementsToBeVisible(driver,
	 *               cardsOnCurrentPage); pageCount++; log("Found " +
	 *               cardsOnCurrentPage.size() + " cards on Page " + pageCount); for
	 *               (WebElement card : cardsOnCurrentPage) {
	 *               Common.waitForElementToBeVisible(driver, card); String cardText
	 *               = card.getText().trim();
	 * 
	 *               if (cardText.equals("Free")) { log("✅ Card " + cardsCount + ":
	 *               Text matched - 'Free'"); Common.scrollUpToElement(driver,
	 *               card); } else { String message = "❌ Card " + cardsCount + ":
	 *               Text mismatch - Expected 'Free' but found: '" + cardText + "'";
	 *               log(message); mismatchedCards.add(message); } cardsCount++; }
	 *               // Navigate to next page if available if
	 *               (Common.checkIfElementIsDisplayedwithWait(driver, nextButton,
	 *               15)) { Common.waitForElementToBeVisible(driver, nextButton);
	 *               Common.jsClick(driver, nextButton); log("Navigating to next
	 *               page..."); } else { log("✅ No more pages to process."); log("✅
	 *               Total pages verified: " + pageCount + ", Total cards verified:
	 *               " + (cardsCount - 1)); break; } } // Final assertion if
	 *               (!mismatchedCards.isEmpty()) { StringBuilder errorReport = new
	 *               StringBuilder(); errorReport.append("❌ Test failed with
	 *               ").append(mismatchedCards.size()).append(" mismatched
	 *               card(s):\n"); for (String message : mismatchedCards) {
	 *               errorReport.append(message).append("\n"); }
	 *               Assert.fail(errorReport.toString()); } else { log("✅ All cards
	 *               under the filter section were verified successfully with no
	 *               mismatches."); } }
	 */
	// Paldi Logo WebElement for Search Result Verification under Marketplace
	// section
	@FindBy(xpath = "//figure//img[@alt='paldi full']")
	private WebElement paldiLogoUnderFilterResultSection;

	/**
	 * Verify Search Result Data under Marketplace section
	 * 
	 * @throws InterruptedException
	 */

	@FindBy(xpath = "(//div[@class='post-title']//child::p)[2]")
	private WebElement cardBannerPladiText;

	@FindBy(xpath = "(//div[@class='row ajax-holder']//div//figure)[1]")
	private WebElement firstCard;

	public void verifySearchDataUnderFilterSection() throws InterruptedException {
		Thread.sleep(3000);
		Common.waitForPageToLoad(driver, 10);
		Common.waitForUrlToChange(driver, 10);

		Common.waitForElementToBeVisible(driver, firstCard);
		Common.scrollUpToElement(driver, firstCard);
		Common.waitForElementToBeClickable(driver, firstCard);
		Common.jsClick(driver, firstCard);

		Common.waitForPageToLoad(driver, 10);

		Common.waitForElementToBeVisible(driver, cardBannerPladiText);
		Common.scrollUpToElement(driver, cardBannerPladiText);

		if (cardBannerPladiText.getText().trim().equals("By Paldi Solutions")) {
			log("✅ Paldi Solutions text matched on card no : 1 ");
		} else {
			Assert.fail("❌ Expected Paldi Solutions text not found on card no : 1 ");
		}
		Common.waitForPageToLoad(driver, 10);
		// }
	}

	@FindBy(xpath = "(//a[@rel='next'])[1]")
	private WebElement nextButton;

	/**
	 * Verifies that all cards under the filter section across all pages display
	 * "Free" label. Logs page and card details, and fails the test on any mismatch.
	 */
	public void verifySearchDataUnderFreeFilterSection() {
		Common.waitForPageToLoad(driver, 10);
		int cardsCount = 1;
		int pageCount = 0;
		while (true) {
			Common.waitForPageToLoad(driver, 10);
			log("Processing Page: " + (pageCount + 1));
			// Fetch fresh card elements on the current page
			List<WebElement> cardsOnCurrentPage = driver
					.findElements(By.xpath("//div[contains(@class, 'eyebrow') and contains(@class, 'app-price')]"));
			Common.waitForAllElementsToBeVisible(driver, cardsOnCurrentPage);
			pageCount++;
			log("Found " + cardsOnCurrentPage.size() + " cards on Page " + pageCount);
			for (WebElement card : cardsOnCurrentPage) {
				Common.waitForElementToBeVisible(driver, card);
				String cardText = card.getText().trim();

				if (cardText.equals("Free")) {
					log("✅ Card " + cardsCount + ": Text matched - 'Free'");
					Common.scrollUpToElement(driver, card);
				} else {
					Assert.fail(
							"❌ Card " + cardsCount + ": Text mismatch - Expected 'Free' but found: '" + cardText + "'");
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

	public void verifySearchDataUnderPremiumFilterSection() {
		Common.waitForPageToLoad(driver, 10);
		int cardsCount = 1;
		int pageCount = 0;

		while (true) {
			Common.waitForPageToLoad(driver, 10);
			log("Processing Page: " + (pageCount + 1));
			// Fetch fresh card elements on the current page
			List<WebElement> cardsOnCurrentPage = driver
					.findElements(By.xpath("//div[contains(@class, 'eyebrow') and contains(@class, 'app-price')]"));
			Common.waitForAllElementsToBeVisible(driver, cardsOnCurrentPage);
			pageCount++;
			log("Found " + cardsOnCurrentPage.size() + " cards on Page " + pageCount);
			for (WebElement card : cardsOnCurrentPage) {
				Common.waitForElementToBeVisible(driver, card);
				String cardText = card.getText().trim();
				if (cardText.equals("Premium")) {
					log("✅ Card " + cardsCount + ": Text matched - 'Premium'");
					Common.scrollUpToElement(driver, card);
				} else {
					Assert.fail("❌ Card " + cardsCount + ": Text mismatch - Expected 'Premium' but found: '" + cardText
							+ "'");
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
		log("✅ All cards under the filter section were verified successfully with 'Premium' text.");
	}

	/**
	 * Verifies that all cards under the filter section across all pages display
	 * "Premium" label. Logs page and card details, collects all mismatches, and
	 * fails at the end if needed.
	 * 
	 * public void verifySearchDataUnderPremiumFilterSection1() {
	 * Common.waitForPageToLoad(driver, 10); int cardsCount = 1; int pageCount = 0;
	 * List<String> mismatchedCards = new ArrayList<>(); while (true) {
	 * Common.waitForPageToLoad(driver, 10); log("Processing Page: " + (pageCount +
	 * 1)); // Fetch fresh card elements on the current page List<WebElement>
	 * cardsOnCurrentPage = driver .findElements(By.xpath("//div[contains(@class,
	 * 'eyebrow') and contains(@class, 'app-price')]"));
	 * Common.waitForAllElementsToBeVisible(driver, cardsOnCurrentPage);
	 * pageCount++; log("Found " + cardsOnCurrentPage.size() + " cards on Page " +
	 * pageCount); for (WebElement card : cardsOnCurrentPage) {
	 * Common.waitForElementToBeVisible(driver, card); String cardText =
	 * card.getText().trim();
	 * 
	 * if (cardText.equals("Free")) { log("✅ Card " + cardsCount + ": Text matched -
	 * 'Premium'"); Common.scrollUpToElement(driver, card); } else { String message
	 * = "❌ Card " + cardsCount + ": Text mismatch - Expected 'Premium' but found:
	 * '" + cardText + "'"; log(message); mismatchedCards.add(message); }
	 * cardsCount++; } // Navigate to next page if available if
	 * (Common.checkIfElementIsDisplayedwithWait(driver, nextButton, 15)) {
	 * Common.waitForElementToBeVisible(driver, nextButton); Common.jsClick(driver,
	 * nextButton); log("Navigating to next page..."); } else { log("✅ No more pages
	 * to process."); log("✅ Total pages verified: " + pageCount + ", Total cards
	 * verified: " + (cardsCount - 1)); break; } }
	 * 
	 * // Final assertion if (!mismatchedCards.isEmpty()) { StringBuilder
	 * errorReport = new StringBuilder(); errorReport.append("❌ Test failed with
	 * ").append(mismatchedCards.size()).append(" mismatched card(s):\n"); for
	 * (String message : mismatchedCards) {
	 * errorReport.append(message).append("\n"); }
	 * Assert.fail(errorReport.toString()); } else { log("✅ All cards under the
	 * filter section were verified successfully with 'Premium' text and no
	 * mismatches."); } }
	 */

	/**
	 * Scroll to Cards under Marketplace section
	 */
	public void scrollToCardsUnderFilterSection() {
		Common.waitForPageToLoad(driver, 10);
		Common.waitForElementToBeVisible(driver, searchIconUnderFilterSection);
		Common.scrollUpToElement(driver, searchIconUnderFilterSection);
		log("Scroll to Cards under  Filter section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Publisher Filter Button under Marketplace section
	@FindBy(xpath = "//div[@class='pubfilter']//button[@class='dropdown-toggle']//child::i")
	private WebElement publisherFilterButtonUnderFilterSection;

	/**
	 * Click on Publisher Filter Button under Marketplace section
	 */
	public void clickOnPublisherFilterButtonUnderFilter() {
		Common.waitForElementToBeVisible(driver, searchIconUnderFilterSection);
		Common.scrollUpToElement(driver, searchIconUnderFilterSection);
		try {
			Common.waitForElementToBeVisible(driver, publisherFilterButtonUnderFilterSection);
			Common.waitForElementToBeClickable(driver, publisherFilterButtonUnderFilterSection);
			Common.waitForPageToLoad(driver, 10);
			Common.waitForPageToLoad(driver, 10);
			Common.jsClick(driver, publisherFilterButtonUnderFilterSection);
			Common.actionsClick(driver, publisherFilterButtonUnderFilterSection);
			Common.click(publisherFilterButtonUnderFilterSection);
			log("Click on Publisher Filter Button under  Filter section successfully.");
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, searchIconUnderFilterSection);
			Common.scrollUpToElement(driver, searchIconUnderFilterSection);
			Common.waitForElementToBeVisible(driver, publisherFilterButtonUnderFilterSection);
			Common.jsClick(driver, publisherFilterButtonUnderFilterSection);
			log("Click on Publisher Filter Button under  Filter section successfully.");
		}
		Common.waitForPageToLoad(driver, 10);
	}

	// Select Paldi Solutions Option under Marketplace section
	@FindBy(xpath = "//label[@for='Paldi Solutions']")
	private WebElement paldiSolutionsOptionUnderPublisherFilter;

	/**
	 * Select Paldi Solutions Option under Publisher Filter
	 */
	public void selectPaldiSolutionsOptionUnderPublisherFilter() {
		Common.waitForPageToLoad(driver, 10);
		Common.waitForElementToBeVisible(driver, paldiSolutionsOptionUnderPublisherFilter);
		Common.jsClick(driver, paldiSolutionsOptionUnderPublisherFilter);
		log("Selected Paldi Solutions Option under Publisher Filter successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Cost Filter Button under Marketplace section
	@FindBy(xpath = "//div[@class='costfilter']//button[@class='dropdown-toggle']")
	private WebElement costFilterButtonUnderMarketplaceSection;

	/**
	 * Click on Cost Filter Button under Marketplace section
	 */
	public void clickOnCostFilterButtonUnderFIlterSection() {
		Common.waitForPageToLoad(driver, 10);
		try {
			Common.waitForElementToBeVisible(driver, costFilterButtonUnderMarketplaceSection);
			Common.jsClick(driver, costFilterButtonUnderMarketplaceSection);
			log("Click on Cost Filter Button under Filter section successfully.");
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, searchIconUnderFilterSection);
			Common.scrollUpToElement(driver, searchIconUnderFilterSection);
			Common.waitForElementToBeVisible(driver, costFilterButtonUnderMarketplaceSection);
			Common.jsClick(driver, costFilterButtonUnderMarketplaceSection);
			log("Click on Cost Filter Button under Filter section successfully.");
		}
		Common.waitForPageToLoad(driver, 10);
	}

	// Select Free Option in Cost Filter under Marketplace section
	@FindBy(xpath = "//label[@for='free']")
	private WebElement freeOptionUnderMarketplaceSection;

	/**
	 * Select Free Option in Cost Filter under Marketplace section
	 */
	public void selectFreeOptionUnderCostFilter() {
		try {
			Common.waitForElementToBeVisible(driver, freeOptionUnderMarketplaceSection);
			Common.jsClick(driver, freeOptionUnderMarketplaceSection);
			log("Selected Free Option in Cost Filter under  Filter section successfully.");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, searchIconUnderFilterSection);
			Common.scrollUpToElement(driver, searchIconUnderFilterSection);
			Common.waitForElementToBeVisible(driver, costFilterButtonUnderMarketplaceSection);
			Common.scrollUpToElement(driver, costFilterButtonUnderMarketplaceSection);
			Common.jsClick(driver, costFilterButtonUnderMarketplaceSection);
			Common.waitForElementToBeVisible(driver, freeOptionUnderMarketplaceSection);
			Common.jsClick(driver, freeOptionUnderMarketplaceSection);
			log("Selected Free Option in Cost Filter under  Filter section successfully.");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	// Select Premium Option in Cost Filter under Marketplace section
	@FindBy(xpath = "//label[@for='premium']")
	private WebElement premiumOptionUnderMarketplaceSection;

	/**
	 * Select Premium Option in Cost Filter under Filter section
	 */
	public void selectPremiumOptionUnderCostFilter() {
		try {
			Common.waitForElementToBeVisible(driver, premiumOptionUnderMarketplaceSection);
			Common.jsClick(driver, premiumOptionUnderMarketplaceSection);
			log("Selected Premium Option in Cost Filter under  Filter section successfully.");
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, searchIconUnderFilterSection);
			Common.scrollUpToElement(driver, searchIconUnderFilterSection);
			Common.waitForElementToBeVisible(driver, costFilterButtonUnderMarketplaceSection);
			Common.scrollUpToElement(driver, costFilterButtonUnderMarketplaceSection);
			Common.jsClick(driver, costFilterButtonUnderMarketplaceSection);
			Common.waitForElementToBeVisible(driver, premiumOptionUnderMarketplaceSection);
			Common.jsClick(driver, premiumOptionUnderMarketplaceSection);
			log("Selected Premium Option in Cost Filter under  Filter section successfully.");
		}
	}

	// Email Label WebElement under Form section
	@FindBy(xpath = "//label[@id='LblEmail']")
	private WebElement emailLabelUnderFormSection;

	/**
	 * Scroll to Email Label under Form section
	 */
	public void scrollToEmailLabelUnderFormSection() {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, emailLabelUnderFormSection);
		Common.scrollUpToElement(driver, emailLabelUnderFormSection);
		log("Scroll to Email Label under Form section successfully.");
	}

	// Form Input fields under Marketplace section
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
	 * Fill up form with details under Form section
	 */
	public void fillUpForm(String emailId, String firstName, String lastName, String companyName) {
		Common.waitForElementToBeVisible(driver, emailInputBoxUnderFormSection);
		Common.clearAndSendKeys(emailInputBoxUnderFormSection, emailId);
		log("Input Email ID: " + emailId);

		Common.waitForElementToBeVisible(driver, firstNameInputBoxUnderFormSection);
		Common.clearAndSendKeys(firstNameInputBoxUnderFormSection, firstName);
		log("Input First Name : " + firstName);

		Common.waitForElementToBeVisible(driver, lastNameInputBoxUnderFormSection);
		Common.clearAndSendKeys(lastNameInputBoxUnderFormSection, lastName);
		log("Input Last Name : " + lastName);

		// Common.waitForElementToBeVisible(driver,
		// phoneNumberInputBoxUnderFormSection);
		// Common.clearAndSendKeys(phoneNumberInputBoxUnderFormSection, phoneNumber);
		// log("Input Phone Number : " + phoneNumber);

		Common.waitForElementToBeVisible(driver, companyNameInputBoxUnderFormSection);
		Common.clearAndSendKeys(companyNameInputBoxUnderFormSection, companyName);
		log("Input Company Name : " + companyName);
		Common.scrollUpToElement(driver, emailInputBoxUnderFormSection);
	}

	// Subscribe Button under Marketplace section
	@FindBy(xpath = "//button[text()='Subscribe']")
	private WebElement subscribeButtonUnderFormSection;

	/**
	 * Click on Subscribe Button under Form section
	 */
	public void clickOnSubscribeButtonUnderForm() {
		try {

			Common.scrollUpToElement(driver, companyNameInputBoxUnderFormSection);
			Common.scrollUpToElement(driver, emailInputBoxUnderFormSection);
			Common.waitForElementToBeVisible(driver, subscribeButtonUnderFormSection);
			Common.jsClick(driver, subscribeButtonUnderFormSection);
			log("Click on Subscribe Button under Form successfully.");
		} catch (Exception e) {
			Common.scrollUpToElement(driver, companyNameInputBoxUnderFormSection);
			Common.waitForElementToBeVisible(driver, subscribeButtonUnderFormSection);
			Common.jsClick(driver, subscribeButtonUnderFormSection);
			log("Click on Subscribe Button under Form successfully.");

		}
	}

	// Sign Up Button under Marketplace section
	@FindBy(xpath = "//button[normalize-space()='Sign up']")
	private WebElement signUpButtonUnderFormSection;

	/**
	 * Click on Sign Up Button under Form section
	 */
	public void clickOnSignUPButtonUnderForm() {
		try {
			Common.waitForElementToBeVisible(driver, signUpButtonUnderFormSection);
			Common.scrollUpToElement(driver, signUpButtonUnderFormSection);
			Common.jsClick(driver, signUpButtonUnderFormSection);
			log("Click on Sign Up Button under Form successfully.");
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, signUpButtonUnderFormSection);
			Common.scrollUpToElement(driver, signUpButtonUnderFormSection);
			Common.jsClick(driver, signUpButtonUnderFormSection);
			log("Click on Sign Up Button under Form successfully.");

		}
	}

	// Form submission verification under form section
	@FindBy(xpath = "//form[text()='Thanks for submitting your request.']")
	private WebElement thanksForSubmittingElementUnderMarketplaceSection;

	/**
	 * Verify form submission under Form section
	 */
	public void verifyFormSubmit() {
		Common.waitForElementToBeVisible(driver, thanksForSubmittingElementUnderMarketplaceSection);
		Assert.assertEquals("Form not submitted correctly", thanksForSubmittingElementUnderMarketplaceSection.getText(),
				"Thanks for submitting your request.");
		log("Form submitted successfully under Marketplace section.");
	}

	// Privacy Policy Link under Marketplace section
	@FindBy(xpath = "//a[normalize-space()='Privacy Policy']")
	private WebElement privacyPolicyLinkUnderMarketplaceSection;

	/**
	 * Click on Privacy Policy Link under Form section
	 */
	public void clickOnPrivacyPolicyLinkUnderFormSection() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.scrollUpToElement(driver, privacyPolicyLinkUnderMarketplaceSection);
		Common.waitForElementToBeVisible(driver, privacyPolicyLinkUnderMarketplaceSection);
		Common.jsClick(driver, privacyPolicyLinkUnderMarketplaceSection);
		log("Click on Privacy Policy Link under Marketplace section successfully.");
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify Privacy Policy Page Title under Form section
	 */
	public void verifyPrivacyPolicyPageTitleUnderFormSection() {
		Assert.assertEquals("Privacy Policy Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.PRIVACYPOLICY_TITLE);
		log("Verified Privacy Policy Page Title under Form successfully.");
	}

	// Terms of Service Link under Marketplace section
	@FindBy(xpath = "//a[normalize-space()='Terms of Service']")
	private WebElement termsOfServiceLinkUnderMarketplaceSection;

	/**
	 * Click on Terms of Service Link under Form section
	 */
	public void clickOnTermsOfServiceLinkUnderFormSection() throws InterruptedException {
		try {
			Common.scrollUpToBottom(driver);
			Common.scrollUpToElement(driver, termsOfServiceLinkUnderMarketplaceSection);
			Common.waitForElementToBeVisible(driver, termsOfServiceLinkUnderMarketplaceSection);
			Common.jsClick(driver, termsOfServiceLinkUnderMarketplaceSection);
			log("Click on Terms of Service Link under Form section successfully.");

		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, termsOfServiceLinkUnderMarketplaceSection);
			Common.jsClick(driver, termsOfServiceLinkUnderMarketplaceSection);
			log("Click on Terms of Service Link under Form section successfully.");
		}
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify Terms of Service Page Title under Form section
	 */
	public void verifyTermsOfServicePageTitleUnderFormSection() {
		Assert.assertEquals("Terms of Service Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.TERMSOFUSE_TITLE);
		log("Verified Terms of Service Page Title under Form section successfully.");
	}
}
