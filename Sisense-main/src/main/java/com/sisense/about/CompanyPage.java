package com.sisense.about;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class CompanyPage extends AbstractPage {
	public CompanyPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Company Menu under About tab
	@FindBy(xpath = "//a[text()='Company']")
	private WebElement companyMenu;

	/**
	 * Clicks on the Company menu under the About tab.
	 */
	public void clickOnCompanyMenuUnderAboutTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, companyMenu);
		Common.jsClick(driver,companyMenu);
		log("Click on Company Menu under About tab successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Explore Open Positions button under Our Values section
	@FindBy(xpath = "//a[normalize-space()='Explore open positions']")
	private WebElement exploreOpenPositionsButtonUnderOurValues;

	/**
	 * Clicks on the Explore Open Positions button under the Our Values section.
	 */
	public void clickOnExploreOpenPositionsButtonUnderOurValuesSection() throws InterruptedException {
		Common.scrollUpToElement(driver, exploreOpenPositionsButtonUnderOurValues);
		Common.waitForElementToBeVisible(driver, exploreOpenPositionsButtonUnderOurValues);
		try {
			Common.waitForElementToBeClickable(driver, exploreOpenPositionsButtonUnderOurValues);
			Common.jsClick(driver,exploreOpenPositionsButtonUnderOurValues);
			log("Click on Explore Open Positions button under Our Values section successfully.");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, exploreOpenPositionsButtonUnderOurValues);
			Common.scrollToVertical(driver, exploreOpenPositionsButtonUnderOurValues);
			Common.scrollUpToElement(driver, exploreOpenPositionsButtonUnderOurValues);
			Common.waitForElementToBeClickable(driver, exploreOpenPositionsButtonUnderOurValues);
			Common.jsClick(driver,exploreOpenPositionsButtonUnderOurValues);
			log("Click on Explore Open Positions button under Our Values section successfully (retry).");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	// Explore Careers at Sisense button under Our Culture and Careers section
	@FindBy(xpath = "//a[text()='Explore careers at Sisense']")
	private WebElement exploreCareersAtSisenseButtonUnderCultureAndCareers;

	@FindBy(xpath = "//h2[normalize-space()='Our culture and careers']")
	private WebElement ourCultureSection;

	/**
	 * Clicks on the Explore Careers at Sisense button under the Our Culture and
	 * Careers section.
	 */
	public void clickOnExploreCareersAtSisenseButtonUnderOurCultureAndCareersSection() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		try {
			Common.scrollUpToElement(driver, aboutOurInvestorsLinkUnderOurInvestors);
			Common.waitForElementToBeVisible(driver, aboutOurInvestorsLinkUnderOurInvestors);
			Common.waitForElementToBeVisible(driver, ourCultureSection);
			Common.scrollUpToElement(driver, ourCultureSection);
			Common.waitForElementToBeVisible(driver, exploreCareersAtSisenseButtonUnderCultureAndCareers);
			Common.scrollUpToElement(driver, exploreCareersAtSisenseButtonUnderCultureAndCareers);
			Common.scrollUpToElement(driver, exploreCareersAtSisenseButtonUnderCultureAndCareers);
			Common.jsClick(driver, exploreCareersAtSisenseButtonUnderCultureAndCareers);
			log("Click on Explore Careers at Sisense button under Our Culture and Careers section successfully.");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.scrollUpToElement(driver, aboutOurInvestorsLinkUnderOurInvestors);
			Common.waitForElementToBeVisible(driver, aboutOurInvestorsLinkUnderOurInvestors);
			Common.scrollToVertical(driver, aboutOurInvestorsLinkUnderOurInvestors);
			Common.waitForElementToBeVisible(driver, ourCultureSection);
			Common.scrollUpToElement(driver, ourCultureSection);
			Common.waitForElementToBeVisible(driver, aboutOurInvestorsLinkUnderOurInvestors);
			Common.scrollToVertical(driver, aboutOurInvestorsLinkUnderOurInvestors);
			Common.waitForElementToBeVisible(driver, exploreCareersAtSisenseButtonUnderCultureAndCareers);
			Common.scrollUpToElement(driver, exploreCareersAtSisenseButtonUnderCultureAndCareers);
			Common.jsClick(driver, exploreCareersAtSisenseButtonUnderCultureAndCareers);
			log("Click on Explore Careers at Sisense button under Our Culture and Careers section successfully (retry).");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	// About Our Investors link under Our Investors section
	@FindBy(xpath = "//a[normalize-space()='About our investors']")
	private WebElement aboutOurInvestorsLinkUnderOurInvestors;

	/**
	 * Clicks on the About Our Investors link under the Our Investors section.
	 */
	public void clickOnAboutOurInvestorsLinkUnderOurInvestorsSection() throws InterruptedException {
		Common.scrollUpToElement(driver, aboutOurInvestorsLinkUnderOurInvestors);
		Common.waitForElementToBeVisible(driver, aboutOurInvestorsLinkUnderOurInvestors);
		try {
			Common.jsClick(driver,aboutOurInvestorsLinkUnderOurInvestors);
			log("Click on About Our Investors link under Our Investors section successfully.");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, aboutOurInvestorsLinkUnderOurInvestors);
			Common.scrollUpToElement(driver, aboutOurInvestorsLinkUnderOurInvestors);
			Common.jsClick(driver,aboutOurInvestorsLinkUnderOurInvestors);
			log("Click on About Our Investors link under Our Investors section successfully (retry).");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	/**
	 * Verifies the page title of the About Our Investors link page.
	 */
	public void verifyAboutOurInvestorsLinkPageTitle() {
		Assert.assertEquals("Sisense About Our Investors Page title did not match.",
				FrameworkConstants.OUR_INVESTORS_TITLE, driver.getTitle());
		log("Sisense About Our Investors page title matched successfully.");
	}

	// Contact Us button under Get in Touch section
	@FindBy(xpath = "//a[normalize-space()='Contact us']")
	private WebElement contactUsButtonUnderGetInTouch;

	/**
	 * Clicks on the Contact Us button under the Get in Touch section.
	 */
	public void clickOnContactUsButtonUnderGetInTouchSection() throws InterruptedException {
		Common.scrollToVertical(driver, contactUsButtonUnderGetInTouch);
		Common.waitForElementToBeVisible(driver, contactUsButtonUnderGetInTouch);
		Common.scrollUpToElement(driver, contactUsButtonUnderGetInTouch);
		Common.waitForElementToBeVisible(driver, contactUsButtonUnderGetInTouch);

		try {
			Common.jsClick(driver, contactUsButtonUnderGetInTouch);
			log("Click on Contact Us button under Get in Touch section successfully.");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, contactUsButtonUnderGetInTouch);
			Common.scrollUpToElement(driver, contactUsButtonUnderGetInTouch);
			Common.jsClick(driver, contactUsButtonUnderGetInTouch);
			log("Click on Contact Us button under Get in Touch section successfully (retry).");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	/**
	 * Verifies the page title of the Contact Us page.
	 */
	public void verifyContactUsPageTitle() {
		Assert.assertEquals("Sisense Contact Us page title did not match.", driver.getTitle(),
				FrameworkConstants.GET_IN_TOUCH);
		log("Sisense Contact Us page title matched successfully.");
	}
}
