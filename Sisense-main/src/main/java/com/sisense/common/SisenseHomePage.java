package com.sisense.common;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class SisenseHomePage extends AbstractPage {
	public SisenseHomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Banner Heading Element
	@FindBy(xpath = "//h2[normalize-space()='Analytics that make sense']")
	WebElement bannerHeading;

	/**
	 * Scroll to the Banner Heading on the page.
	 */
	public void scrollToBanner() {
		Common.waitForElementToBeInvisible(driver, bannerHeading);
		Common.scrollUpToElement(driver, bannerHeading);
		log("Scrollto the Banner heading successfully.");
	}

	// Schedule Demo Button under banner
	@FindBy(xpath = "//a[text()='Schedule demo']")
	WebElement scheduleDemoButton;

	// Free Trial Button under Banner Section -> Changed to Try free, updating on 23rd jan  
	@FindBy(xpath = "//a[text()='Try free']")
	WebElement freeTrialButtonUnderBanner;

	@FindBy(xpath = "//a[text()='Free 7-day trial']")
	WebElement free7DayTrialButtonUnderBanner;

	@FindBy(xpath = "//a[text()= 'Get started for free']")
	WebElement getStartedForFreeButtonUnderBanner;

	// Take a Tour Button under banner Section
	@FindBy(xpath = "//a[normalize-space()='Take a tour']")
	WebElement takeATourButtonUnderHeroSection;

	@FindBy(xpath = "//a[text()='Start a trial today']")
	WebElement startATrialTodayButtonUnderHeroSection;

	@FindBy(xpath = "//a[normalize-space()='Book a demo']")
	WebElement bookADemoButtonUnderHeroSection;

	@FindBy(xpath = "//a[text()='Start your free 7-day trial now']")
	WebElement startYourFree7_DayTrialNowButtonUnderHeroSection;

	@FindBy(xpath = "//p[span[contains(text(),'Sisense delivers an AI-powered analytics platform that makes modeling')]]//following-sibling::div//a[text()='Try free']")
	WebElement tryFreeButtonUnderHeroSection;

	public void clickOnTryFreeButtonUnderBannerSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, bannerHeading);
		Common.scrollUpToElement(driver, bannerHeading);
		if (Common.checkIfElementIsDisplayedwithWait(driver, freeTrialButtonUnderBanner, 5)) {
			Common.waitForElementToBeVisible(driver, freeTrialButtonUnderBanner);
			Common.scrollUpToElement(driver, freeTrialButtonUnderBanner);
			try {
				Common.scrollUpToElement(driver, freeTrialButtonUnderBanner);
				Common.jsClick(driver, freeTrialButtonUnderBanner);
				log("Click on the Free Trial button under the Banner section.");
			} catch (Exception e) {
				Common.scrollUpToElement(driver, freeTrialButtonUnderBanner);
				Common.jsClick(driver, freeTrialButtonUnderBanner);
				log("Click on the Free Trial button under the Banner section");
			}
			Common.waitForPageToLoad(driver, 10);
			//Common.switchToAnotherWindow(driver, 10);
			Common.checkTitleNull(driver);
			Common.waitForPageToLoad(driver, 10);
			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Sisense Sisense 7-day free trial Page Title Not Matched", driver.getTitle(),
					FrameworkConstants.SISENSE7_DAYFREETRIAL_PAGE);
			log("Sisense 7-day free trial page title matched successfully.");
		} else if (Common.checkIfElementIsDisplayedwithWait(driver, tryFreeButtonUnderHeroSection, 5)) {
			Common.waitForElementToBeVisible(driver, tryFreeButtonUnderHeroSection);
			Common.scrollUpToElement(driver, tryFreeButtonUnderHeroSection);
			try {
				Common.scrollUpToElement(driver, tryFreeButtonUnderHeroSection);
				Common.jsClick(driver, tryFreeButtonUnderHeroSection);
				log("Click on the Try Free button under the Hero section.");
			} catch (Exception e) {
				Common.scrollUpToElement(driver, tryFreeButtonUnderHeroSection);
				Common.jsClick(driver, tryFreeButtonUnderHeroSection);
				log("Click on the Try Free button under the Hero section.");
			}
			Common.waitForPageToLoad(driver, 10);
			Common.switchToAnotherWindow(driver, 10);
			Common.checkTitleNull(driver);
			Common.waitForPageToLoad(driver, 10);
			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Try free Page Title Not Matched", driver.getTitle(),
					FrameworkConstants.SISENSE7_DAYFREETRIAL_PAGE);
			log("Try free page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, startYourFree7_DayTrialNowButtonUnderHeroSection,
				5)) {
			Common.waitForElementToBeVisible(driver, startYourFree7_DayTrialNowButtonUnderHeroSection);
			Common.scrollUpToElement(driver, startYourFree7_DayTrialNowButtonUnderHeroSection);
			try {
				Common.scrollUpToElement(driver, startYourFree7_DayTrialNowButtonUnderHeroSection);
				Common.jsClick(driver, startYourFree7_DayTrialNowButtonUnderHeroSection);
				log("Click on the Start your free 7-day trial now button under the Hero section.");
			} catch (Exception e) {
				Common.scrollUpToElement(driver, startYourFree7_DayTrialNowButtonUnderHeroSection);
				Common.jsClick(driver, startYourFree7_DayTrialNowButtonUnderHeroSection);
				log("Click on the Start your free 7-day trial now button under the Hero section.");
			}
			Common.waitForPageToLoad(driver, 10);
			Common.switchToAnotherWindow(driver, 10);
			Common.checkTitleNull(driver);
			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Sisense Sisense 7-day free trial Page Title Not Matched", driver.getTitle(),
					FrameworkConstants.SISENSE7_DAYFREETRIAL_PAGE);
			log("Sisense 7-day free trial page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, startATrialTodayButtonUnderHeroSection, 5)) {
			Common.waitForElementToBeVisible(driver, startATrialTodayButtonUnderHeroSection);
			Common.scrollUpToElement(driver, startATrialTodayButtonUnderHeroSection);
			try {
				Common.scrollUpToElement(driver, startATrialTodayButtonUnderHeroSection);
				Common.jsClick(driver, startATrialTodayButtonUnderHeroSection);
				log("Click on the Start a trial today button under the Hero section.");
			} catch (Exception e) {
				Common.scrollUpToElement(driver, startATrialTodayButtonUnderHeroSection);
				Common.jsClick(driver, startATrialTodayButtonUnderHeroSection);
				log("Click on the Start a trial today button under the Hero section.");
			}
			Common.waitForPageToLoad(driver, 10);
			Common.switchToAnotherWindow(driver, 10);
			Common.checkTitleNull(driver);
			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Sisense Sisense 7-day free trial Page Title Not Matched", driver.getTitle(),
					FrameworkConstants.SISENSE7_DAYFREETRIAL_PAGE);
			log("Sisense 7-day free trial page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, getStartedForFreeButtonUnderBanner, 5)) {
			Common.waitForElementToBeVisible(driver, getStartedForFreeButtonUnderBanner);
			Common.scrollUpToElement(driver, getStartedForFreeButtonUnderBanner);
			try {
				Common.scrollUpToElement(driver, getStartedForFreeButtonUnderBanner);
				Common.jsClick(driver, getStartedForFreeButtonUnderBanner);
				log("Click on the Get Started For Free button under the Hero section.");
			} catch (Exception e) {
				Common.scrollUpToElement(driver, getStartedForFreeButtonUnderBanner);
				Common.jsClick(driver, getStartedForFreeButtonUnderBanner);
				log("Click on the Get Started For Free button under the Hero section.");
			}
			Common.waitForPageToLoad(driver, 10);
			Common.switchToAnotherWindow(driver, 10);
			Common.checkTitleNull(driver);
			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Sisense Sisense 7-day free trial Page Title Not Matched", driver.getTitle(),
					FrameworkConstants.SISENSE7_DAYFREETRIAL_PAGE);
			log("Sisense 7-day free trial page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, free7DayTrialButtonUnderBanner, 5)) {
			Common.waitForElementToBeVisible(driver, free7DayTrialButtonUnderBanner);
			Common.scrollUpToElement(driver, free7DayTrialButtonUnderBanner);
			try {
				Common.scrollUpToElement(driver, free7DayTrialButtonUnderBanner);
				Common.jsClick(driver, free7DayTrialButtonUnderBanner);
				log("Click on the free 7 day trial button under the Hero section.");
			} catch (Exception e) {
				Common.scrollUpToElement(driver, free7DayTrialButtonUnderBanner);
				Common.jsClick(driver, free7DayTrialButtonUnderBanner);
				log("Click on the free 7 day trial button under the Hero section.");
			}
			Common.waitForPageToLoad(driver, 10);
			Common.switchToAnotherWindow(driver, 10);
			Common.checkTitleNull(driver);
			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Sisense Sisense 7-day free trial Page Title Not Matched", driver.getTitle(),
					FrameworkConstants.SISENSE7_DAYFREETRIAL_PAGE);
			log("Sisense 7-day free trial page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, takeATourButtonUnderHeroSection, 5)) {
			Common.waitForElementToBeVisible(driver, takeATourButtonUnderHeroSection);
			Common.scrollUpToElement(driver, takeATourButtonUnderHeroSection);
			try {
				Common.scrollUpToElement(driver, takeATourButtonUnderHeroSection);
				Common.jsClick(driver, takeATourButtonUnderHeroSection);
				log("Click on the Take a Tour button under the Hero section.");
			} catch (Exception e) {
				Common.scrollUpToElement(driver, takeATourButtonUnderHeroSection);
				Common.jsClick(driver, takeATourButtonUnderHeroSection);
				log("Click on the Take a Tour button under the Hero section.");
			}
			Common.checkTitleNull(driver);
			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Sisense Take a tour Page Title Not Matched", driver.getTitle(),
					FrameworkConstants.TAKE_A_TOUR_TITLE);
			log("Sisense 'Take a tour' page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, scheduleDemoButton, 5)) {
			Common.waitForElementToBeVisible(driver, scheduleDemoButton);
			try {
				Common.jsClick(driver, scheduleDemoButton);
				log("Click on the Schedule Demo button.");
			} catch (Exception e) {
				Common.scrollUpToElement(driver, scheduleDemoButton);
				Common.jsClick(driver, scheduleDemoButton);
				log("Click on the Schedule Demo button");
			}
			Common.checkTitleNull(driver);
			Common.waitForPageToLoad(driver, 10);
			sisenseHeaderPage.verifyDemoPageTitle();

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, bookADemoButtonUnderHeroSection, 5)) {
			Common.waitForElementToBeVisible(driver, bookADemoButtonUnderHeroSection);
			try {
				Common.jsClick(driver, bookADemoButtonUnderHeroSection);
				log("Click on the Book A Demo button.");
			} catch (Exception e) {
				Common.scrollUpToElement(driver, bookADemoButtonUnderHeroSection);
				Common.jsClick(driver, bookADemoButtonUnderHeroSection);
				log("Click on the Book A Demo button");
			}
			Common.checkTitleNull(driver);
			Common.waitForPageToLoad(driver, 10);
			sisenseHeaderPage.verifyDemoPageTitle();

		} else {
			Assert.fail(
					"None of the buttons (Free Trial, Take a Tour, Schedule Demo, Book A Demo , free 7 day trial, Get Started For Free) are displayed.");

		}
	}

	@FindBy(xpath = "//p[span[contains(text(),'Sisense is an AI-powered analytics platform that helps teams model, visualize, and embed data experiences—now with tools like assistant and MCP server to speed up creation and deliver insights where users work.')]]//following-sibling::div//a[text()='Learn more']")
	WebElement learnMoreButtonUnderHeroSection;

	public void clickOnLearnmoreButtonUnderHeroSection() throws InterruptedException {

		Common.waitForElementToBeVisible(driver, learnMoreButtonUnderHeroSection);
		Common.scrollUpToElement(driver, learnMoreButtonUnderHeroSection);
		Common.jsClick(driver, learnMoreButtonUnderHeroSection);
		log("Click on the 'Learn more' button under Hero banner");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyLearnMorePageTitleUnderHeroBanner() {
		Common.waitForPageToLoad(driver, 10);
		log("driver.getTitle():::::::::::"+driver.getTitle());
		Assert.assertEquals("Learn More page title not matched", driver.getTitle(), "Introducing agentic AI | Sisense assistant and MCP");
		log("Learn More page title matched successfully");
	}

	@FindBy(xpath = "//a[@class='btn white_btn']")
	private WebElement forButtontext;

	// Learn How Button Below Hero Section
	@FindBy(xpath = "//a[text()='Learn how']")
	private WebElement learnHowButton;

	// Start Learning Button Below Hero Section
	@FindBy(xpath = "//a[text()='Start learning']")
	private WebElement startLearningButton;

	// See How They Did It Button Below Hero Section
	@FindBy(xpath = "//a[text()='See how they did it']")
	private WebElement seeHowTheyDidItButton;

	@FindBy(xpath = "//a[text()='Register now']")
	private WebElement registerNowButton;

	@FindBy(xpath = "//a[text()='Download report']")
	private WebElement downloadReportButton;

	@FindBy(xpath = "//a[text()='Watch now']")
	private WebElement watchNowButton;

	@FindBy(xpath = "//a[text()='Get the report']")
	private WebElement getTheReportButton;

	@FindBy(xpath = "//a[text()='Read now']")
	private WebElement readNowButton;

	@FindBy(xpath = "//p[text()='Supercharging developer productivity with Cursor, the AI code editor, and Sisense']//following-sibling::div//child::a[text()='Read more']")
	private WebElement readMoreButton1;

	@FindBy(xpath = "//p[text()='Harnessing multisource reporting and analytics for better business decisions']//following-sibling::div//child::a[text()='Read more']")
	private WebElement readMoreButton2;

	@FindBy(xpath = "//p[text()='From digital friction to embedded insights: What the state of analytics in 2025 means for builders']//following-sibling::div//child::a[text()='Read more']")
	private WebElement readMoreButton3;

	@FindBy(xpath = "//p[contains(text(),'Embed analytics faster and smarter. Join our June 5th Sisense')]")
	private WebElement bannerBelowSection;

	@FindBy(xpath = "//h2[normalize-space()='Bridge the gap between insights and action']")
	private WebElement bridgeTheGapSection;

	public void clickOnLearnHowButtonBelowHeroSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, buildSmarterSection);
		Common.scrollUpToElement(driver, buildSmarterSection);
		Common.waitForPageToLoad(driver, 10);
		if (Common.checkIfElementIsDisplayedwithWait(driver, startLearningButton, 5)) {
			Common.waitForElementToBeVisible(driver, startLearningButton);
			Common.scrollUpToElement(driver, startLearningButton);
			Common.jsClick(driver, startLearningButton);
			log("Click on the 'Start learning' button Below the Hero section.");
			Common.switchToAnotherWindow(driver, 10);
			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Sisense 'Start learning' page title not matched", driver.getTitle(),
					FrameworkConstants.DATA_DESIGNERS_TITLE);
			log("Sisense 'Start learning' page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, watchNowButton, 5)) {
			Common.waitForElementToBeVisible(driver, watchNowButton);
			Common.scrollUpToElement(driver, watchNowButton);
			Common.jsClick(driver, watchNowButton);
			log("Click on the 'Watch now' button Below the Hero section.");

			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Sisense 'Watch now' page title not matched", driver.getTitle(),
					"Gartner® Tech Impact Radar: Data & Analytics Insights");
			log("Sisense 'Watch now' page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, getTheReportButton, 5)) {
			Common.waitForElementToBeVisible(driver, getTheReportButton);
			Common.scrollUpToElement(driver, getTheReportButton);
			Common.jsClick(driver, getTheReportButton);
			log("Click on the 'Get the report' button Below the Hero section.");

			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Sisense 'Get the report' page title not matched", driver.getTitle(),
					"Gartner® Tech Impact Radar: Data & Analytics Insights");
			log("Sisense 'Get the report' page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, readNowButton, 5)) {
			Common.waitForElementToBeVisible(driver, readNowButton);
			Common.scrollUpToElement(driver, readNowButton);
			Common.actionsClick(driver, accelerateSection);
			log("Click on the 'Read now' button Below the Hero section.");

			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Sisense 'Read now' page title not matched", driver.getTitle(),
					"Gartner® Tech Impact Radar: Data & Analytics Insights");
			log("Sisense 'Read now' page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, learnHowButton, 5)) {
			Common.waitForElementToBeVisible(driver, learnHowButton);
			Common.scrollUpToElement(driver, learnHowButton);
			Common.jsClick(driver, learnHowButton);
			log("Click on the 'Learn how' button Below the Hero section.");
			Common.switchToAnotherWindow(driver, 10);
			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Sisense 'Learn how' page title not matched", driver.getTitle(),
					FrameworkConstants.LEARN_HOW_TITLE);
			log("Sisense 'Learn how' page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, readMoreButton1, 5)) {
			Common.waitForElementToBeVisible(driver, readMoreButton1);
			Common.scrollUpToElement(driver, readMoreButton1);
			Common.jsClick(driver, readMoreButton1);
			log("Blue banner Text : Supercharging developer productivity with Cursor, the AI code editor, and Sisense");
			log("Click on the 'Read More' button Below the Hero section.");
			Common.waitForPageToLoad(driver, 10);
			Common.switchToAnotherWindow(driver, 10);
			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Sisense 'Read More' page title not matched", driver.getTitle(),
					"Boost developer productivity with Cursor AI inside Sisense");
			log("Sisense 'Read More' page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, readMoreButton2, 5)) {
			Common.waitForElementToBeVisible(driver, readMoreButton2);
			Common.scrollUpToElement(driver, readMoreButton2);
			Common.jsClick(driver, readMoreButton2);
			log("Blue banner Text : Harnessing multisource reporting and analytics for better business decisions");
			log("Click on the 'Read More' button Below the Hero section.");
			Common.waitForPageToLoad(driver, 10);
			Common.switchToAnotherWindow(driver, 10);
			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Sisense 'Read More' page title not matched", driver.getTitle(),
					"Multisource Reporting and Analytics for Smarter Insights");
			log("Sisense 'Read More' page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, readMoreButton3, 5)) {
			Common.waitForElementToBeVisible(driver, readMoreButton3);
			Common.scrollUpToElement(driver, readMoreButton3);
			Common.jsClick(driver, readMoreButton3);
			log("Blue banner Text : From digital friction to embedded insights: What the state of analytics in 2025 means for builders");
			log("Click on the 'Read More' button Below the Hero section.");
			Common.waitForPageToLoad(driver, 10);
			Common.switchToAnotherWindow(driver, 10);
			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Sisense 'Read More' page title not matched", driver.getTitle(),
					"State of analytics 2025: Key takeaways | Sisense");
			log("Sisense 'Read More' page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, seeHowTheyDidItButton, 5)) {
			Common.waitForElementToBeVisible(driver, seeHowTheyDidItButton);
			Common.scrollUpToElement(driver, seeHowTheyDidItButton);
			Common.jsClick(driver, seeHowTheyDidItButton);
			log("Click on the 'See how they did it' button Below the Hero section.");
			Common.switchToAnotherWindow(driver, 10);
			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Sisense 'See how they did it' page title not matched", driver.getTitle(),
					"How Bigtincan achieved a 215% ROI with Sisense » Sisense");
			log("Sisense 'See how they did it' page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, registerNowButton, 5)) {
			Common.waitForElementToBeVisible(driver, registerNowButton);
			Common.scrollUpToElement(driver, registerNowButton);
			Common.jsClick(driver, registerNowButton);
			log("Click on the 'Register Now' button Below the Hero section.");
			Common.switchToAnotherWindow(driver, 10);
			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Sisense 'Register Now' page title not matched", driver.getTitle(),
					"What’s new (and what’s next) in the Sisense platform | Webinar");
			log("Sisense 'Register Now' page title matched successfully.");

		} else if (Common.checkIfElementIsDisplayedwithWait(driver, downloadReportButton, 5)) {
			Common.waitForElementToBeVisible(driver, downloadReportButton);
			Common.scrollUpToElement(driver, downloadReportButton);
			Common.jsClick(driver, downloadReportButton);
			log("Click on the 'Download report' button Below the Hero section.");
			Common.switchToAnotherWindow(driver, 10);
			Common.waitForPageToLoad(driver, 10);
			Assert.assertEquals("Sisense 'Download report' page title not matched", driver.getTitle(),
					"Gartner® Tech Impact Radar: Data & Analytics Insights");
			log("Sisense 'Download report' page title matched successfully.");
		}
		// else if (Common.checkIfElementIsDisplayedwithWait(driver, readMoreButton, 5))
		// {
//			Common.waitForElementToBeVisible(driver, readMoreButton);
//			Common.waitForElementToBeClickable(driver, readMoreButton);
//			Common.scrollUpToElement(driver, readMoreButton);
//			Common.actionsClick(driver, accelerateSection);
//			log("Click on the 'Read More' button Below the Hero section.(second time)");
//			Common.waitForPageToLoad(driver, 10);
//			Common.switchToAnotherWindow(driver, 10);
//			Common.waitForPageToLoad(driver, 10);
//			Assert.assertEquals("Sisense 'Read More' page title not matched", driver.getTitle(),
//					"State of analytics 2025: Key takeaways | Sisense");
//			log("Sisense 'Read More' page title matched successfully.");
//
//		} 
		else {
			Common.scrollUpTop(driver);
			Common.waitForElementToBeVisible(driver, forButtontext);
			Common.scrollUpToElement(driver, forButtontext);
			log("New Button is : " + forButtontext.getText());

			Thread.sleep(3000);
			Assert.fail(
					"None of the buttons (Start learning, Watch now, Get the report, Read now, Learn how, See how they did it, Register Now, Download report) are displayed below the Hero section.");
		}
	}

	// Build smarter, in less time Section
	@FindBy(xpath = "//h2[contains(text(),'Build smarter, in less time')]")
	private WebElement buildSmarterSection;

	@FindBy(xpath = "//h2[contains(text(),'Build smarter, in less time')]//following-sibling::div//child::a[text()='Learn more']")
	private WebElement learnMoreButtonUnderBuildSmarterSection;

	public void clickOnLearnMoreButtonUnderBuildSmarterSection() throws InterruptedException {

		Common.waitForElementToBeVisible(driver, buildSmarterSection);
		Common.scrollUpToElement(driver, buildSmarterSection);
		log("Scroll to 'Build smarter, in less time section");
		try {
			Common.jsClick(driver, learnMoreButtonUnderBuildSmarterSection);
			log("Click on the 'Learn more' button under the Compose SDK section");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, buildSmarterSection);
			Common.scrollUpToElement(driver, buildSmarterSection);
			Common.waitForElementToBeVisible(driver, learnMoreButtonUnderBuildSmarterSection);
			Common.scrollUpToElement(driver, learnMoreButtonUnderBuildSmarterSection);
			Common.jsClick(driver, learnMoreButtonUnderBuildSmarterSection);
			log("Click on the 'Learn more' button under 'Build smarter, in less time section");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	// Learn More Button under Go from data to insights Section
	@FindBy(xpath = "//h2[contains(text(),'Go from data to insights in minutes')]//following-sibling::div//child::a[text()='Learn more']")
	private WebElement learnMoreButtonUnderGoFromDataSection;

	@FindBy(xpath = "//h2[contains(text(),'Go from data to insights in minutes')]")
	private WebElement goFromDataSection;

	public void clickOnLearnMoreButtonUnderGoFromDataSection() throws InterruptedException {

		Common.scrollUpToBottom(driver);

		Common.waitForElementToBeVisible(driver, goFromDataSection);
		Common.scrollUpToElement(driver, goFromDataSection);
		log("Scroll to go From Data section");
		try {
			Common.jsClick(driver, learnMoreButtonUnderGoFromDataSection);
			log("Click on the 'Learn more' button under the go From Data section");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, goFromDataSection);
			Common.scrollUpToElement(driver, goFromDataSection);
			Common.waitForElementToBeVisible(driver, learnMoreButtonUnderGoFromDataSection);
			Common.scrollUpToElement(driver, learnMoreButtonUnderGoFromDataSection);
			Common.jsClick(driver, learnMoreButtonUnderGoFromDataSection);
			log("Click on the 'Learn more' button under the go From Data section");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	// Learn More Button under Embed with Precision and Flexibility Section
	@FindBy(xpath = "//h2[normalize-space()='Embed with precision and flexibility']//following-sibling::div//child::a[text()='Learn more']")
	private WebElement learnMoreButtonUnderEmbedWithPrecisionSection;

	@FindBy(xpath = "//h2[normalize-space()='Embed with precision and flexibility']")
	private WebElement embedWithPrecisionSection;

	/**
	 * Clicks on the 'Learn more' button under the Embed with Precision and
	 * Flexibility section.
	 */
	public void clickOnLearnMoreButtonUnderEmbedWithPrecisionSection() throws InterruptedException {

		Common.waitForElementToBeVisible(driver, embedWithPrecisionSection);
		Common.scrollUpToElement(driver, embedWithPrecisionSection);
		log("Scrolled to Embed with Precision and Flexibility section.");

		try {
			Common.jsClick(driver, learnMoreButtonUnderEmbedWithPrecisionSection);
			log("Clicked on the 'Learn more' button under the Embed with Precision and Flexibility section.");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, embedWithPrecisionSection);
			Common.scrollUpToElement(driver, embedWithPrecisionSection);
			Common.waitForElementToBeVisible(driver, learnMoreButtonUnderEmbedWithPrecisionSection);
			Common.scrollUpToElement(driver, learnMoreButtonUnderEmbedWithPrecisionSection);
			Common.jsClick(driver, learnMoreButtonUnderEmbedWithPrecisionSection);
			log("Clicked on the 'Learn more' button under the Embed with Precision and Flexibility section using JavaScript.");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	// Get Started Today Button
	@FindBy(xpath = "//a[normalize-space()='Get started today']")
	private WebElement getStartedTodayButtonUnderAccelerateSection;

	@FindBy(xpath = "//h2[normalize-space()='Accelerate innovation with predictive analytics']")
	private WebElement accelerateSection;

	public void clickOnGetStartedTodayButtonUnderAccelerateSection() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, accelerateSection);

		Common.scrollUpToElement(driver, accelerateSection);
		log("Scroll to Accelerate Section");
		try {
			Common.jsClick(driver, getStartedTodayButtonUnderAccelerateSection);
			log("Click on the 'Get started today' button under the main section");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, accelerateSection);
			Common.scrollUpToElement(driver, accelerateSection);
			Common.waitForElementToBeVisible(driver, getStartedTodayButtonUnderAccelerateSection);
			Common.scrollUpToElement(driver, getStartedTodayButtonUnderAccelerateSection);
			Common.jsClick(driver, getStartedTodayButtonUnderAccelerateSection);
			log("Click on the 'Get started today' button under the Accelerate Section");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	// Read the Barrios Case Study Button
	@FindBy(xpath = "//div[@class='owl-item active']//a[@class='btn dark_btn wow fadeIn'][normalize-space()='Read the Barrios case study']")
	private WebElement readTheBarriosCaseStudyButton;

	@FindBy(xpath = "//h2[contains(text(),'The leader in embedded analytics with 500+ 5-star ')]")
	private WebElement theleaderlSection;

	@FindBy(xpath = "//div[@class='owl-item active']//p[contains(text(),'We went from custom application development to th')]")
	private WebElement weWentFromCard;

	// h2[contains(text(),'The leader in embedded analytics with 500+ 5-star ')]
	public void clickOnReadTheBarriosCaseStudyButton() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, accelerateSection);
		Common.scrollUpToElement(driver, accelerateSection);
		Common.waitForElementToBeVisible(driver, weWentFromCard);
		Common.scrollUpToElement(driver, weWentFromCard);
		Common.waitForElementToBeVisible(driver, readTheBarriosCaseStudyButton);
		Common.scrollUpToElement(driver, readTheBarriosCaseStudyButton);
		try {
			Common.jsClick(driver, readTheBarriosCaseStudyButton);
			log("Click on the 'Read the Barrios case study' button ");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, accelerateSection);
			Common.scrollUpToElement(driver, accelerateSection);
			Common.waitForElementToBeVisible(driver, weWentFromCard);
			Common.scrollUpToElement(driver, weWentFromCard);
			Common.waitForElementToBeVisible(driver, readTheBarriosCaseStudyButton);
			Common.scrollUpToElement(driver, readTheBarriosCaseStudyButton);
			Common.jsClick(driver, readTheBarriosCaseStudyButton);
			log("Click on the 'Read the Barrios case study' button ");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	public void verifyReadTheBarriosCaseStudyPageTitle() {
		Assert.assertEquals("Read the Barrios case study page title not matched", driver.getTitle(),
				FrameworkConstants.BARRIOS_TAKES_ANALYTICS_TITLE);
		log("'Read the Barrios case study' page title matched successfully");
	}

	// Read the Barrios Case Study Button
	@FindBy(xpath = "//div[@class='owl-item active']//a[@class='btn dark_btn wow fadeIn'][normalize-space()='Read the Bigtincan case study']")
	private WebElement readTheBigtincanCaseStudyButton;

	@FindBy(xpath = "//div[@class='owl-item']//p[contains(text(),'\"At the end of the day, we aren’t in the analytics')]")
	private WebElement atTheEndOfTheDayCardHeading;

	public void clickOnReadTheBigtincanCaseStudyButton() throws InterruptedException {
		Common.scrollUpToBottom(driver);

		try {
			Common.waitForElementToBeVisible(driver, readTheBigtincanCaseStudyButton);
			Common.scrollUpToElement(driver, readTheBigtincanCaseStudyButton);
			Common.jsClick(driver, readTheBigtincanCaseStudyButton);
			log("Click on the 'Read the Bigtincan case study' button ");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForPageToLoad(driver, 10);
			commonMethods.scrollToFooter();
			Common.waitForPageToLoad(driver, 10);
			Common.scrollUpTop(driver);
			// Common.waitForElementToBeVisible(driver, atTheEndOfTheDayCardHeading);
			// Common.scrollUpToElement(driver, atTheEndOfTheDayCardHeading);
			Common.waitForElementToBeVisible(driver, readTheBigtincanCaseStudyButton);
			Common.scrollUpToElement(driver, readTheBigtincanCaseStudyButton);
			Common.jsClick(driver, readTheBigtincanCaseStudyButton);
			log("Click on the 'Read the Bigtincan case study' button ");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	public void verifyReadTheBigtincanCaseStudyPageTitle() {
		Assert.assertEquals("Read the Bigtincan case study page title not matched", driver.getTitle(),
				"How Bigtincan achieved a 215% ROI with Sisense | Sisense");
		log("'Read the Bigtincan case study' page title matched successfully");
	}

	// Join the Sisense Community Button
	@FindBy(xpath = "//a[text()='Join the Sisense Community']")
	private WebElement joinTheSisenseCommunityButtonUnderConnectSection;

	@FindBy(xpath = "//h2[text()='Connect, collaborate, and exchange ideas']")
	private WebElement connectSection;

	public void clickOnJoinTheSisenseCommunityButtonUnderFooterSection() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		try {
			Common.waitForElementToBeVisible(driver, connectSection);
			Common.scrollUpToElement(driver, connectSection);

			Common.waitForElementToBeVisible(driver, joinTheSisenseCommunityButtonUnderConnectSection);
			Common.scrollUpToElement(driver, joinTheSisenseCommunityButtonUnderConnectSection);
			Common.jsClick(driver, joinTheSisenseCommunityButtonUnderConnectSection);
			log("Click on the 'Join the Sisense Community' button under the footer section");
			Common.waitForPageToLoad(driver, 10);
			Common.switchToAnotherWindow(driver, 15);
		} catch (Exception e) {
			Common.scrollUpToBottom(driver);
			Common.waitForElementToBeVisible(driver, connectSection);
			Common.scrollUpToElement(driver, connectSection);
			Common.waitForElementToBeVisible(driver, joinTheSisenseCommunityButtonUnderConnectSection);
			Common.scrollUpToElement(driver, joinTheSisenseCommunityButtonUnderConnectSection);
			Common.jsClick(driver, joinTheSisenseCommunityButtonUnderConnectSection);
			log("Click on the 'Join the Sisense Community' button under Connect Section");
			Common.waitForPageToLoad(driver, 10);
			Common.switchToAnotherWindow(driver, 15);
		}
	}

	public void verifyJoinTheSisenseCommunityPageTitle() {
		Common.checkTitleNull(driver);
		Assert.assertEquals("Sisense 'Join the Sisense Community' page title not matched", driver.getTitle(),
				FrameworkConstants.COMMUNITY_HOME_TITLE);
		log("Sisense 'Join the Sisense Community' page title matched successfully");
	}

	// Book a Free Demo Button
	@FindBy(xpath = "//a[text()='Book a free demo']")
	private WebElement bookAFreeDemoButtonUnderBottomSection;

	@FindBy(xpath = "//h2[normalize-space()='See Sisense in action']")
	private WebElement seeSisenseSection;

	public void clickOnBookAFreeDemoButtonUnderBottomSection() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, seeSisenseSection);
		Common.scrollUpToElement(driver, seeSisenseSection);
		log("Scroll to the See Sisense in action");
		Common.waitForElementToBeVisible(driver, bookAFreeDemoButtonUnderBottomSection);
		Common.scrollUpToElement(driver, bookAFreeDemoButtonUnderBottomSection);
		Common.jsClick(driver, bookAFreeDemoButtonUnderBottomSection);
		log("Click on the 'Book a free demo' button under the See Sisense section");
		Common.waitForPageToLoad(driver, 20);
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

	@FindBy(xpath = "//div[text()='Get a full-featured 7-day trial with guided sample data, or bring your own. No setup required. Seamless analytics, right in your workflow.']//parent::div//child::a[text()='Try free']")
	private WebElement tryFreeButtonAboveFooter;

	public void clickOnTryFreeButtonAboveFooter() {
		try {
			Common.waitForElementToBeVisible(driver, tryFreeButtonAboveFooter);
			Common.scrollUpToElement(driver, tryFreeButtonAboveFooter);
			Common.jsClick(driver, tryFreeButtonAboveFooter);
			log("click on 'Try Free' button above footer");
		} catch (Exception e) {
			Common.scrollUpToBottom(driver);
			Common.waitForElementToBeVisible(driver, startYourFreeTrialSection);
			Common.scrollUpToElement(driver, startYourFreeTrialSection);
			Common.waitForElementToBeVisible(driver, tryFreeButtonAboveFooter);
			Common.scrollUpToElement(driver, tryFreeButtonAboveFooter);
			Common.jsClick(driver, tryFreeButtonAboveFooter);
		}
		Common.scrollUpToBottom(driver);
	}

}
