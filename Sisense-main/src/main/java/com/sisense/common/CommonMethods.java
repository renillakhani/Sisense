package com.sisense.common;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class CommonMethods extends AbstractPage {

	public CommonMethods(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Accept Cookie button
	@FindBy(xpath = "//button[text()='Accept All']")
	private WebElement acceptCookieButton;

	/**
	 * Clicks on the Accept Cookie button.
	 */
	public void acceptCookie() throws InterruptedException {
		Common.waitForPageToLoad(driver, 15);
		try {
			Common.waitForElementToBeClickable(driver, acceptCookieButton, 30);
			Common.jsClick(driver, acceptCookieButton);
			log("Click on Accept Cookie button.");
		} catch (Exception e) {
			driver.navigate().refresh();
			Common.waitForElementToBeClickable(driver, acceptCookieButton, 30);
			Common.jsClick(driver, acceptCookieButton);
			log("Click on Accept Cookie button.");
		}
		Common.waitForPageToLoad(driver, 15);

	}

	// Platform tab in navigation
	@FindBy(xpath = "//a[text()='Platform']")
	private WebElement platformTab;

	/**
	 * Mouse hovers over the Platform tab in the navigation bar.
	 */
	public void mouseHoverToPlatformTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, platformTab);
		Common.hover(driver, platformTab);
		log("Mouse hovered on Platform tab.");
	}

	// Solutions tab
	@FindBy(xpath = "//a[text()='Solutions']")
	private WebElement solutionsTab;

	/**
	 * Mouse hovers over the Solutions tab in the navigation bar.
	 */
	public void mouseHoverToSolutionsTab() throws InterruptedException {
		Common.hover(driver, solutionsTab);
		log("Mouse hovered on Solutions tab.");
	}

	// Developers tab
	@FindBy(xpath = "//a[text()='Developers']")
	private WebElement developersTab;

	/**
	 * Mouse hovers over the Developers tab in the navigation bar.
	 */
	public void mouseHoverToDevelopersTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, developersTab);
		Common.hover(driver, developersTab);
		log("Mouse hovered on Developers tab.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Resources tab
	@FindBy(xpath = "//a[text()='Resources']")
	private WebElement resourcesTab;

	/**
	 * Mouse hovers over the Resources tab in the navigation bar.
	 */
	public void mouseHoverToResourcesTab() throws InterruptedException {
		Common.hover(driver, resourcesTab);
		log("Mouse hovered on Resources tab.");
	}
	
	// Pricing tab in navigation
		@FindBy(xpath = "//a[text()='Pricing']")
		private WebElement pricingTab;

		/**
		 * Mouse hovers over the Platform tab in the navigation bar.
		 */
		public void mouseHoverToPricingTab() throws InterruptedException {
			Common.waitForElementToBeVisible(driver, pricingTab);
			Common.hover(driver, pricingTab);
			log("Mouse hovered on pricing tab.");
		}

	// About tab
	@FindBy(xpath = "//nav[@class='primary-menu']//ul//li//a[text()='About']")
	private WebElement aboutTab;

	/**
	 * Mouse hovers over the About tab in the navigation bar.
	 */
	public void mouseHoverToAboutTab() throws InterruptedException {
		Common.hover(driver, aboutTab);
		log("Mouse hovered on About tab.");
	}

	// Footer section
	@FindBy(xpath = "//*[@id='page']/footer")
	private WebElement footerSection;

	/**
	 * Scrolls to the footer section of the page.
	 */
	public void scrollToFooter() throws InterruptedException {
		Common.waitForPageToLoad(driver, 10);
		Common.waitForElementToBeVisible(driver, footerSection);
		Common.scrollToHorizontal(driver, footerSection);
		log("Scroll to Footer section.");
	}

	// Home breadcrumb
	@FindBy(xpath = "//a[@href='https://www.sisense.com/' and text()='Home']")
	private WebElement homeBreadcrumb;

	/**
	 * Clicks on the Home breadcrumb link.
	 */
	public void clickOnHomeBreadcrumb() throws InterruptedException {
		try {
			Common.waitForElementToBeVisible(driver, homeBreadcrumb);
			Common.jsClick(driver, homeBreadcrumb);
			log("Click on Home breadcrumb.");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.scrollUpTop(driver);
			Common.waitForElementToBeVisible(driver, homeBreadcrumb);
			Common.scrollUpToElement(driver, homeBreadcrumb);
			Common.jsClick(driver, homeBreadcrumb);
			log("Click on Home breadcrumb.");
			Common.waitForPageToLoad(driver, 10);

		}
	}

	// Platform breadcrumb
	@FindBy(xpath = "//a[@href='https://www.sisense.com/ai-analytics-platform/' and text()='Platform']")
	private WebElement platformBreadcrumb;

	/**
	 * Clicks on the Platform breadcrumb link.
	 */
	public void clickOnPlatformBreadcrumb() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, platformBreadcrumb);
		Common.jsClick(driver, platformBreadcrumb);
		log("Click on Platform breadcrumb.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Solutions breadcrumb
	@FindBy(xpath = "//a[normalize-space()='Solutions']")
	private WebElement solutionsBreadcrumb;

	/**
	 * Clicks on the Solutions breadcrumb link.
	 */
	public void clickOnSolutionsBreadcrumb() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, solutionsBreadcrumb);
		Common.jsClick(driver, solutionsBreadcrumb);
		log("Click on Solutions breadcrumb.");
		Common.waitForPageToLoad(driver, 10);
	}

	// "Book a free demo" button and section
	@FindBy(xpath = "//h2[text()='Book a demo']//parent::div//a[text()='Book a free demo']")
	private WebElement bookAFreeDemoButton;

	@FindBy(xpath = "//h2[normalize-space()='Book a demo']")
	private WebElement bookADemoSection;

	/**
	 * Scrolls to the Book a Demo section and clicks on the "Book a free demo"
	 * button.
	 */
	public void clickOnBookAFreeDemoButton() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.checkIfElementIsDisplayedwithWait(driver, bookADemoSection, 30);
		Common.scrollUpToElement(driver, bookADemoSection);
		log("Scroll to Book a Demo section.");

		try {
			Common.waitForElementToBeVisible(driver, bookAFreeDemoButton);
			Common.jsClick(driver, bookAFreeDemoButton);
			log("Click on 'Book a free demo' button.");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.checkIfElementIsDisplayedwithWait(driver, bookADemoSection, 30);
			Common.scrollUpToElement(driver, bookADemoSection);
			Common.checkIfElementIsDisplayedwithWait(driver, bookADemoSection, 30);
			Common.scrollUpToElement(driver, bookADemoSection);
			Common.waitForElementToBeVisible(driver, bookAFreeDemoButton);
			Common.jsClick(driver, bookAFreeDemoButton);
			log("Click on 'Book a free demo' button.");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	// About breadcrumb
	@FindBy(xpath = "//a[@href='https://www.sisense.com/' and text()='Home']//parent::span//following-sibling::span//a[@href='https://www.sisense.com/about/' and text()='About']")
	private WebElement aboutBreadcrumb;

	/**
	 * Clicks on the About breadcrumb link.
	 */
	public void clickOnAboutBreadcrumb() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, aboutBreadcrumb);
		Common.jsClick(driver, aboutBreadcrumb);
		log("Click on About breadcrumb.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Developer Portal breadcrumb
	@FindBy(xpath = "//span[normalize-space()='Developer Portal']")
	private WebElement developerPortalBreadcrumb;

	/**
	 * Clicks on the Developer Portal breadcrumb link.
	 */
	public void clickOnDeveloperPortalBreadcrumb() throws InterruptedException {
		Common.waitForTitleToChange(driver, 10);
		Common.waitForElementToBeVisible(driver, developerPortalBreadcrumb);
		Common.actionsClick(driver, developerPortalBreadcrumb);
		log("Click on Developer Portal breadcrumb.");
		Common.waitForTitleToChange(driver, 10);
	}

	/**
	 * Verifies the title of the Developer Portal page.
	 */
	public void verifyDeveloperPortalPageTitle() {
		Assert.assertEquals("Sisense Developer Portal Page Title Not Matched", driver.getTitle(),
				"Sisense Developer Portal");
		log("Verified Developer Portal page title successfully.");
	}

	// Resource Hub breadcrumb
	@FindBy(xpath = "//a[normalize-space()='Resource hub']")
	private WebElement resourceHubBreadcrumb;

	/**
	 * Clicks on the Resource Hub breadcrumb link.
	 */
	public void clickOnResourcehubBreadcrumb() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, resourceHubBreadcrumb);
		Common.jsClick(driver, resourceHubBreadcrumb);
		log("Click on Resource Hub breadcrumb.");
		Common.waitForPageToLoad(driver, 10);
	}

	@FindBy(xpath = "//h2[normalize-space()='Start your free trial']")
	private WebElement startYourFreeTrialSection;

	public void scrollToStartYourFreeTrialSection() {
		Common.waitForPageToLoad(driver, 10);
		Common.scrollUpToBottom(driver);
		log("Scroll to footer section");
		try {
			Common.waitForElementToBeVisible(driver, startYourFreeTrialSection);
			Common.scrollUpToElement(driver, startYourFreeTrialSection);
			log("Scroll to 'Start your free trial' section above footer ");
		} catch (Exception e) {
			Common.scrollUpToBottom(driver);
			Common.waitForElementToBeVisible(driver, startYourFreeTrialSection);
			Common.scrollUpToElement(driver, startYourFreeTrialSection);
		}
		Common.waitForPageToLoad(driver, 10);
	}

	@FindBy(xpath = "//p[text()='Get a full-featured 7-day trial with guided sample data (or your own).']//parent::div//child::a[text()='Try free']")
	private WebElement tryFreeButtonAboveFooter;

	public void clickOnTryFreeButtonAboveFooter() throws InterruptedException {
		try {
			Common.waitForElementToBeVisible(driver, tryFreeButtonAboveFooter);
			Common.scrollUpToElement(driver, tryFreeButtonAboveFooter);
			Common.jsClick(driver, tryFreeButtonAboveFooter);
			// Common.click(tryFreeButtonAboveFooter);
			log("click on 'Try Free' button above footer");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.scrollUpToBottom(driver);
			Common.waitForElementToBeVisible(driver, startYourFreeTrialSection);
			Common.scrollUpToElement(driver, startYourFreeTrialSection);
			Common.waitForElementToBeVisible(driver, tryFreeButtonAboveFooter);
			Common.scrollUpToElement(driver, tryFreeButtonAboveFooter);
			Common.jsClick(driver, tryFreeButtonAboveFooter);
			Common.waitForPageToLoad(driver, 10);
		}
		Common.waitForPageToLoad(driver, 10);
		Thread.sleep(3000);

	}

	public void verifySignUpPageTitle() throws InterruptedException {
		Thread.sleep(3000);
		Common.waitForPageToLoad(driver, 10);
		Common.waitForPageToLoad(driver, 10);
		Common.waitForPageToLoad(driver, 10);
		Common.waitForPageToLoad(driver, 10);
		Thread.sleep(3000);
		Assert.assertEquals("Sisense Sign Up Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.SIGN_UP_TITLE);
		log("Verified Sign Up page title successfully.");
	}

	public void verifySisense7_DayFreeTrialPageTitle() throws InterruptedException {
		Thread.sleep(3000);
		Common.waitForPageToLoad(driver, 10);
		Assert.assertEquals("Sisense 7-day free trial Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.SISENSE7_DAYFREETRIAL_PAGE);
		log("Verified Sisense 7-day free trial page title successfully.");
	}
}
