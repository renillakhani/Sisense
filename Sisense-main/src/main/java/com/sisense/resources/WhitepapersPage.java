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

/**
 * This class contains web elements and methods related to the Whitepapers page
 * under the Resources tab of the Sisense website.
 */
public class WhitepapersPage extends AbstractPage {

	public WhitepapersPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Whitepapers menu under the Resources tab
	@FindBy(xpath = "//a[normalize-space()='Whitepapers']")
	private WebElement whitepapersMenuUnderResourcesTab;

	/**
	 * Clicks on the 'Whitepapers' menu under the Resources tab. Waits for the
	 * element to be visible, then performs the click.
	 */
	public void clickOnWhitepapersMenuUnderResourcesTab() {
		Common.waitForElementToBeVisible(driver, whitepapersMenuUnderResourcesTab);
		Common.jsClick(driver, whitepapersMenuUnderResourcesTab);
		log("Click on Whitepapers Menu under Resources tab successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies that the Whitepapers page title matches the expected value.
	 */
	public void verifyWhitepapersPageTitle() {
		Assert.assertEquals("Whitepapers Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.WHITRPAPERS_TITLE);
		log("Whitepapers Page Title matched successfully.");
	}

	@FindBy(xpath = "(//a[@rel='next'])[1]")
	private WebElement nextButton;

	@FindBy(xpath = "//h1")
	private WebElement cardHeading;

	public void verifyWhitepapersCardsHeadingUnderWhitepapersPage() {
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

	public void verifyWhitepapersCardsUnderWhitepapersPage() {
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

				if (cardAuthorText.equals("Whitepaper")) {

					log("✅ Card " + cardsCount + ": Text matched - 'Whitepaper'");
					Common.scrollUpToElement(driver, card);
				} else {
					Assert.fail("❌ Card " + cardsCount + ": Text mismatch - Expected 'Whitepaper' but found: '"
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

	@FindBy(xpath = "//h3[contains(text(), 'See how Sisense delivers fast, scalable insights inside real-world apps.')]")
	private WebElement seeHowSisenseDeliversFastScalableInsightsSection;

	public void scrollToSeeHowSisenseDeliversFastScalableInsightsSection() {
		Common.waitForPageToLoad(driver, 10);
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, seeHowSisenseDeliversFastScalableInsightsSection);
		Common.scrollUpToElement(driver, seeHowSisenseDeliversFastScalableInsightsSection);
		log("Scroll to 'See how Sisense delivers fast, scalable insights inside real-world apps.' section");
		Common.waitForPageToLoad(driver, 10);
	}

	@FindBy(xpath = "//a[text()='Watch a demo']")
	private WebElement watchADemoButton;

	public void clickOnWatchADemoButton() {
		Common.scrollUpToElement(driver, watchADemoButton);
		Common.waitForElementToBeVisible(driver, watchADemoButton);
		Common.jsClick(driver, watchADemoButton);
		log("Click on Watch a demo button.");
	}

	public void verifyWatchADemoPageTitle() {
		Common.checkTitleNull(driver);
		Common.waitForPageToLoad(driver, 10);
		Common.waitForPageToLoad(driver, 10);
		Common.checkTitleNull(driver);
		Assert.assertEquals("Watch a demo page title not matched!!", driver.getTitle(), "Watch demo | Sisense");
		log("Watch a demo page title matched successfully.");
	}

}
