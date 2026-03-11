package com.sisense.resources;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class SupportPage extends AbstractPage {
	public SupportPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Support menu under the header
	@FindBy(xpath = "//a[normalize-space()='Support']")
	private WebElement supportMenuUnderHeader;

	/**
	 * Clicks on the Support menu under Resources Tab.
	 */
	public void clickOnSupportMenuUnderResourcesTab() {
		Common.waitForElementToBeVisible(driver, supportMenuUnderHeader);
		Common.jsClick(driver,supportMenuUnderHeader);
		log("Click on Support Menu under Resources Tab successfully.");
		Common.waitForPageToLoad(driver, 10);
		Common.checkTitleNull(driver);
	}

	/**
	 * Verifies the Support page title.
	 */
	public void verifySupportPageTitle() {
		Assert.assertEquals("Support Page Title Not Matched", driver.getTitle(), FrameworkConstants.SUPPORT_TITLE);
		log("Support Page Title matched successfully.");
	}

	// ========================== Support Page ==========================

	// 'Support Portal' link under the Support page
	@FindBy(xpath = "//a[normalize-space()='Support Portal']")
	private WebElement supportPortalLinkUnderSupportPage;

	/**
	 * Clicks on the Support Portal link under the Support page.
	 */
	public void clickOnSupportPortalLinkUnderCustomerSuccessAndSupportSection() {
		Common.waitForElementToBeVisible(driver, supportPortalLinkUnderSupportPage);
		Common.jsClick(driver,supportPortalLinkUnderSupportPage);
		log("Click on Support Portal Link under Customer Success And Support Section successfully.");
		Common.waitForPageToLoad(driver, 10);
		Common.checkTitleNull(driver);
	}

	/**
	 * Verifies the “Sign In to Sisense Community” page title under Documentation
	 * section.
	 */
	public void verifySignInToSisenseCommunityPageTitleUnderDocumentation() {
		Assert.assertEquals("Sign In to Sisense Community Page Title Not Matched!!", driver.getTitle(),
				FrameworkConstants.SIGN_IN_COMMUNITY);
		log("Sign In to Sisense Community page title under Documentation section matched successfully.");
	}

	// ========================== Footer Section - Contact
	// ==========================

	// 'Get in touch' title section
	@FindBy(xpath = "//h3[normalize-space()='Get in touch']")
	private WebElement getInTouchTitleUnderFooter;

	// 'Contact us' button under the Get in Touch section
	@FindBy(xpath = "//h3[normalize-space()='Get in touch']//parent::div//child::div//child::a[text()='Contact us']")
	private WebElement contactUsButtonUnderFooter;

	/**
	 * Clicks on the 'Contact us' button under the Get in Touch section.
	 * 
	 */
	public void clickOnContactUsButtonUnderGetInTouchSection() throws Exception {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, getInTouchTitleUnderFooter);
		Common.scrollToVertical(driver, getInTouchTitleUnderFooter);
		Common.waitForElementToBeVisible(driver, contactUsButtonUnderFooter);
		Common.scrollToVertical(driver, contactUsButtonUnderFooter);

		try {
			Common.jsClick(driver,contactUsButtonUnderFooter);
			log("Click on Contact Us button under Get in Touch section successfully.");
		} catch (Exception e) {
			// Retry in case of exception
			Common.scrollUpToBottom(driver);
			Common.waitForElementToBeVisible(driver, getInTouchTitleUnderFooter);
			Common.scrollUpToElement(driver, getInTouchTitleUnderFooter);
			Common.waitForElementToBeVisible(driver, contactUsButtonUnderFooter);
			Common.scrollUpToElement(driver, contactUsButtonUnderFooter);
			Common.jsClick(driver,contactUsButtonUnderFooter);
			log("Click on Contact Us button under Get in Touch section after retry.");
		}

		Common.waitForPageToLoad(driver, 10);
		Common.checkTitleNull(driver);
	}

	/**
	 * Verifies the page title of the 'Get In Touch' page.
	 */
	public void verifyGetInTouchPageTitle() {
		Assert.assertEquals("Get In Touch Page Title Not Matched !!", driver.getTitle(),
				FrameworkConstants.GET_IN_TOUCH);
		log("Get In Touch Page Title matched successfully.");
	}
}