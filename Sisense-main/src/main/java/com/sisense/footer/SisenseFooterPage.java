package com.sisense.footer;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class SisenseFooterPage extends AbstractPage {

	public SisenseFooterPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// ===================== Footer - Platform Section =====================

	/** 'Cloud' link under the Footer > Platform section */
	@FindBy(xpath = "//ul[@id='menu-footer-platform']//a[text()='Cloud']")
	private WebElement cloudLinkUnderFooter;

	/** Clicks on the 'Cloud' link under the Footer > Platform section */
	public void clickOnCloudLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, cloudLinkUnderFooter);
		log("Click on Cloud link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/** 'Compose' link under the Footer > Platform section */
	@FindBy(xpath = "//ul[@id='menu-footer-platform']//a[text()='Compose']")
	private WebElement composeLinkUnderFooter;

	/** Clicks on the 'Compose' link under the Footer > Platform section */
	public void clickOnComposeLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, composeLinkUnderFooter);
		log("Click on Compose link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/** 'Embeddable' link under the Footer > Platform section */
	@FindBy(xpath = "//ul[@id='menu-footer-platform']//a[text()='Embedded analytics']")
	private WebElement embeddableLinkUnderFooter;

	/** Clicks on the 'Embeddable' link under the Footer > Platform section */
	public void clickOnEmbeddableLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, embeddableLinkUnderFooter);
		log("Click on Embeddable link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/** 'Connectivity' link under the Footer > Platform section */
	@FindBy(xpath = "//ul[@id='menu-footer-platform']//a[text()='Connectivity']")
	private WebElement connectivityLinkUnderFooter;

	/** Clicks on the 'Connectivity' link under the Footer > Platform section */
	public void clickOnConnectivityLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, connectivityLinkUnderFooter);
		log("Click on Connectivity link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/** 'Data modeling' link under the Footer > Platform section */
	@FindBy(xpath = "//ul[@id='menu-footer-platform']//a[text()='Data modeling']")
	private WebElement dataModelingLinkUnderFooter;

	/** Clicks on the 'Data modeling' link under the Footer > Platform section */
	public void clickOnDataModelingLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, dataModelingLinkUnderFooter);
		log("Click on Data modeling link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/** 'Sisense Intelligence' link under the Footer > Platform section */
	@FindBy(xpath = "//ul[@id='menu-footer-platform']//a[text()='Sisense Intelligence']")
	private WebElement sisenseIntelligenceLinkUnderFooter;

	/**
	 * Clicks on the 'Sisense Intelligence' link under the Footer > Platform section
	 */
	public void clickOnSisenseIntelligenceLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, sisenseIntelligenceLinkUnderFooter);
		log("Click on Sisense Intelligence link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/** 'Trust and security' link under the Footer > Platform section */
	@FindBy(xpath = "//ul[@id='menu-footer-platform']//a[text()='Trust and security']")
	private WebElement trustAndSecurityLinkUnderFooter;

	/**
	 * Clicks on the 'Trust and security' link under the Footer > Platform section
	 */
	public void clickOnTrustAndSecurityLinkUnderFooterPlatformSection() throws InterruptedException {
		Common.jsClick(driver, trustAndSecurityLinkUnderFooter);
		log("Click on Trust and security link under Footer Platform successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// ===================== Footer - Sisense Section =====================

	/** 'About' link under the Footer > Sisense section */
	@FindBy(xpath = "//ul[@id='menu-footer-sisense']//a[text()='About']")
	private WebElement aboutLink;

	/** Clicks on the 'About' link under the Footer > Sisense section */
	public void clickOnAboutLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, aboutLink);
		log("Click on About link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/** 'Customer Stories' link under the Footer > Sisense section */
	@FindBy(xpath = "//ul[@id='menu-footer-sisense']//a[text()='Customer stories']")
	private WebElement customerStoriesLink;

	/** Clicks on the 'Customer Stories' link under the Footer > Sisense section */
	public void clickOnCustomerStoriesLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, customerStoriesLink);
		log("Click on Customer Stories link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/** 'Pricing' link under the Footer > Sisense section */
	@FindBy(xpath = "//ul[@id='menu-footer-sisense']//a[text()='Pricing']")
	private WebElement pricingLink;

	/** Clicks on the 'Pricing' link under the Footer > Sisense section */
	public void clickOnPricingLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, pricingLink);
		log("Click on Pricing link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the title of the Pricing page opened via Footer > Sisense section
	 */
	public void verifyPricingPageTitleUnderFooter() {
		Assert.assertEquals("Sisense Pricing Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.PRICING_TITLE);
		log("Sisense Footer Pricing Page Title matched successfully.");
	}

	/** 'Newsroom' link under the Footer > Sisense section */
	@FindBy(xpath = "//ul[@id='menu-footer-sisense']//a[text()='Newsroom']")
	private WebElement newsroomLink;

	/** Clicks on the 'Newsroom' link under the Footer > Sisense section */
	public void clickOnNewsroomLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, newsroomLink);
		log("Click on Newsroom link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the title of the Newsroom page opened via Footer > Sisense section
	 */
	public void verifyNewsroomPageTitleUnderFooter() {
		Assert.assertEquals("Sisense Newsroom Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.NEWSROOM_TITLE);
		log("Sisense Footer Newsroom Page Title matched successfully.");
	}

	/** 'Careers' link under the Footer > Sisense section */
	@FindBy(xpath = "//ul[@id='menu-footer-sisense']//a[text()='Careers']")
	private WebElement careersLink;

	/** Clicks on the 'Careers' link under the Footer > Sisense section */
	public void clickOnCareersLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, careersLink);
		log("Click on Careers link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/** 'Trust and Security' link under the Footer > Sisense section */
	@FindBy(xpath = "//ul[@id='menu-footer-sisense']//a[text()='Trust and security']")
	private WebElement trustAndSecurityLink;

	/**
	 * Clicks on the 'Trust and Security' link under the Footer > Sisense section
	 */
	public void clickOnTrustAndSecurityLinkUnderFooterSisenseSection() throws InterruptedException {
		Common.jsClick(driver, trustAndSecurityLink);
		log("Click on Trust and Security link under Footer sisense section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the title of the Trust Center page opened via Footer > Sisense
	 * section
	 */
	public void verifyTrustCenterPageTitleUnderFooter() {
		Assert.assertEquals("Sisense Trust Center Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.TRUST_AND_SECURITY_TITLE);
		log("Sisense Footer Trust Center Page Title matched successfully.");
	}

	/** 'Awards' link under the Footer > Sisense section */
	@FindBy(xpath = "//ul[@id='menu-footer-sisense']//a[text()='Awards']")
	private WebElement awardsLink;

	/**
	 * Clicks on the 'Awards link under the Footer > Sisense section
	 */
	public void clickOnAwardsLinkUnderFooterSisenseSection() throws InterruptedException {
		Common.jsClick(driver, awardsLink);
		log("Click on Awards link under Footer sisense section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the title of the Trust Center page opened via Footer > Sisense
	 * section
	 */
	public void verifyAwardsPageTitleUnderFooter() {
		Assert.assertEquals("Sisense Awards Page Title Not Matched", driver.getTitle(),
				"Sisense Awards & Reviews | Recognized BI & Analytics Leader");
		log("Sisense Footer Awards Page Title matched successfully.");
	}

	/** 'Contact Us' link under the Footer > Sisense section */
	@FindBy(xpath = "//ul[@id='menu-footer-sisense']//a[text()='Contact us']")
	private WebElement contactUsLink;

	/** Clicks on the 'Contact Us' link under the Footer > Sisense section */
	public void clickOnContactUsLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, contactUsLink);
		log("Click on Contact Us link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the title of the Contact Us page opened via Footer > Sisense section
	 */
	public void verifyContactUsPageTitleUnderFooter() {
		Assert.assertEquals("Sisense Contact Us Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.GET_IN_TOUCH);
		log("Sisense Footer Contact Us Page Title matched successfully.");
	}

	// ===================== Footer - Support Section =====================

	// Support Portal
	// Locator for 'Support Portal' link under the Footer > Support section
	@FindBy(xpath = "//ul[@id='menu-footer-support']//a[text()='Support portal']")
	private WebElement supportPortalLink;

	// Method to click on 'Support Portal' link under the Footer
	public void clickOnSupportPortalLinkUnderFooter() throws InterruptedException {
		try {
			Common.jsClick(driver, supportPortalLink);
			log("Click on Support Portal link under Footer successfully.");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, supportPortalLink);
			Common.scrollUpToElement(driver, supportPortalLink);
			Common.jsClick(driver, supportPortalLink);
			log("Click on Support Portal link under Footer successfully.");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	// Community
	// Locator for 'Community' link under the Footer > Support section
	@FindBy(xpath = "//ul[@id='menu-footer-support']//a[text()='Community']")
	private WebElement communityLink;

	// Method to click on 'Community' link under the Footer
	public void clickOnCommunityLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, communityLink);
		log("Click on Community link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToLastWindow(driver);
	}

	// Method to verify the Support Portal page title under Footer
	public void verifySupportPortalPageTitleUnderFooter() {
		Assert.assertEquals("Sisense Support Portal Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.SIGN_IN_COMMUNITY);
		log("Sisense Footer Support Portal Page Title matched successfully.");
	}

	// Documentation
	// Locator for 'Documentation' link under the Footer > Support section
	@FindBy(xpath = "//ul[@id='menu-footer-support']//a[text()='Documentation']")
	private WebElement documentationLink;

	// Method to click on 'Documentation' link under the Footer
	public void clickOnDocumentationLinkUnderFooter() throws InterruptedException {
		try {
			Common.jsClick(driver, documentationLink);
			log("Click on Documentation link under Footer successfully.");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, documentationLink);
			Common.scrollUpToElement(driver, documentationLink);
			Common.jsClick(driver, documentationLink);
			log("Click on Documentation link under Footer successfully.");
		}
		Common.switchToAnotherWindow(driver, 10);
	}

	// Partner Resources
	// Locator for 'Partner Resources' link under the Footer > Support section
	@FindBy(xpath = "//ul[@id='menu-footer-support']//a[text()='Partner resources']")
	private WebElement partnerResourcesLink;

	// Method to click on 'Partner Resources' link under the Footer
	public void clickOnPartnerResourcesLinkUnderFooter() throws InterruptedException {
		try {
			Common.jsClick(driver, partnerResourcesLink);
			log("Click on Partner Resources link under Footer successfully.");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, partnerResourcesLink);
			Common.scrollUpToElement(driver, partnerResourcesLink);
			Common.jsClick(driver, partnerResourcesLink);
			log("Click on Partner Resources link under Footer successfully.");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	// Method to verify the Partner Resources page title under Footer
	public void verifyPartnerResourcesPageTitleUnderFooter() {
		Assert.assertEquals("Sisense Partner Resources Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.PARTNER_RESOURCES_TITLE);
		log("Sisense Footer Partner Resources Page Title matched successfully.");
	}

	// ===================== Footer - Resources Section =====================

	// Blog
	// Locator for 'Blog' link under the Footer > Resources section
	@FindBy(xpath = "//ul[@id='menu-footer-resources']//a[text()='Blog']")
	private WebElement blogLink;

	// Method to click on 'Blog' link under the Footer
	public void clickOnBlogLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, blogLink);
		log("Click on Blog link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Method to verify the Blog page title under Footer
	public void verifyBlogPageTitleUnderFooter() {
		Assert.assertEquals("Sisense Blog Page Title Not Matched", driver.getTitle(), FrameworkConstants.BLOG_TITLE);
		log("Sisense Footer Blog Page Title matched successfully.");
	}

	// Marketplace
	// Locator for 'Marketplace' link under the Footer > Resources section
	@FindBy(xpath = "//ul[@id='menu-footer-resources']//a[text()='Marketplace']")
	private WebElement marketplaceLink;

	// Method to click on 'Marketplace' link under the Footer
	public void clickOnMarketplaceLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, marketplaceLink);
		log("Click on Marketplace link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Sisense Academy
	// Locator for 'Sisense Academy' link under the Footer > Resources section
	@FindBy(xpath = "//ul[@id='menu-footer-resources']//a[text()='Sisense Academy']")
	private WebElement sisenseAcademyLinkUnderFooterResourcesSection;

	// Method to click on 'Sisense Academy' link under the Footer
	public void clickOnSisenseAcademyLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, sisenseAcademyLinkUnderFooterResourcesSection);
		log("Click on Sisense Academy link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Method to verify the Sisense Academy page title under Footer
	public void verifySisenseAcademyPageTitle() {
		Assert.assertEquals("Sisense Academy page title did not match.", driver.getTitle(),
				FrameworkConstants.SISENSE_ACADEMY_TITLE);
		log("Sisense Academy page title under Footer matched successfully.");
	}

	// Developer Portal
	// Locator for 'Developer Portal' link under the Footer > Resources section
	@FindBy(xpath = "//ul[@id='menu-footer-resources']//a[text()='Developer Portal']")
	private WebElement developerPortalLink;

	// Method to click on 'Developer Portal' link under the Footer
	public void clickOnDeveloperPortalLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, developerPortalLink);
		log("Click on Developer Portal link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Method to verify the Developer Portal page title under Footer
	public void verifyDeveloperPortalPageTitleUnderFooter() {
		Assert.assertEquals("Sisense Developer Portal Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.DEVELOPERSPAGE_TITLE);
		log("Sisense Footer Developer Portal Page Title matched successfully.");
	}

	// Brand Portal
	// Locator for 'Brand Portal' link under the Footer > Resources section
	@FindBy(xpath = "//ul[@id='menu-footer-resources']//a[text()='Brand Portal']")
	private WebElement brandPortalLink;

	// Method to click on 'Brand Portal' link under the Footer
	public void clickOnBrandPortalLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, brandPortalLink);
		log("Click on Brand Portal link under Footer successfully.");
		Common.waitForPageToLoad(driver, 20);
		Common.scrollUpToBottom(driver);
		Common.scrollUpTop(driver);
		Common.waitForPageToLoad(driver, 10);
		Common.waitForPageToLoad(driver, 10);
		Common.scrollUpTop(driver);
		Common.waitForPageToLoad(driver, 10);
	}

	// Method to verify the Brand Portal page title under Footer
	public void verifyBrandPortalPageTitleUnderFooter() {
		Assert.assertEquals("Sisense Brand Portal Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.BRAND_PORTAL_TITLE);
		log("Sisense Footer Brand Portal Page Title matched successfully.");
	}

	// Privacy Policy
	// Locator for 'Privacy Policy' link under the Footer > Resources section
	@FindBy(xpath = "//ul[@id='menu-footer-resources']//a[text()='Privacy policy']")
	private WebElement privacyPolicyLink;

	// Method to click on 'Privacy Policy' link under the Footer
	public void clickOnPrivacyPolicyLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, privacyPolicyLink);
		log("Click on Privacy Policy link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Method to verify the Privacy Policy page title under Footer
	public void verifyPrivacyPolicyPageTitleUnderFooter() {
		Assert.assertEquals("Sisense Privacy Policy Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.PRIVACY_POLICY_LINK);
		log("Sisense Footer Privacy Policy Page Title matched successfully.");
	}

	// Legal
	// Locator for 'Legal' link under the Footer > Resources section
	@FindBy(xpath = "//ul[@id='menu-footer-resources']//a[text()='Legal']")
	private WebElement legalLink;

	// Method to click on 'Legal' link under the Footer
	public void clickOnLegalLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, legalLink);
		log("Click on Legal link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Method to verify the Legal page title under Footer
	public void verifyLegalPageTitleUnderFooter() {
		Assert.assertEquals("Sisense Legal Page Title Not Matched", driver.getTitle(), FrameworkConstants.LEGAL_LINK);
		log("Sisense Footer Legal Page Title matched successfully.");
	}

	// ===================== Footer - Book a Live Demo Button =====================

	// Locator for 'Book a Live Demo' button under the Footer
	@FindBy(xpath = "//span[text()='Analytics that make sense.']//parent::div[@class='brand']//following-sibling::div//child::a[text()='Book a live demo']")
	private WebElement bookALiveDemoButtonUnderFooter;

	/**
	 * Clicks on the 'Book a Live Demo' button under the Footer section.
	 */
	public void clickOnBookaLiveDemoButtonUnderFooter() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, bookALiveDemoButtonUnderFooter);
		Common.jsClick(driver, bookALiveDemoButtonUnderFooter);
		log("Click on Book a Live Demo button under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Twitter Link under Footer
	// @FindBy(xpath =
	// "//a[@href='https://www.twitter.com/sisense/']//child::span[text()='Twitter /
	// X']")

	@FindBy(xpath = "//div[@class='social-links']//a[@href='https://x.com/sisense/' and @aria-label='Twitter / X (opens in a new tab)']")
	private WebElement twitterLink;

	/**
	 * Clicks on the Twitter link under the footer section.
	 */
	public void clickOnTwitterLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, twitterLink);
		log("Click on Twitter link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
		Thread.sleep(5000);
		Common.checkTitleNull(driver);
		Common.waitForPageToLoad(driver, 10);
		Thread.sleep(5000);

		if (!driver.getTitle().equals("Log in to X / X")) {
			Thread.sleep(5000);
			
		}
	}

	/**
	 * Verifies the title of the Twitter page.
	 */
	public void verifyTwitterPageTitleUnderFooter() {
		Assert.assertEquals("Sisense Twitter Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.TWITTER_TITLE);
		log("Sisense Footer Twitter page title matched successfully.");
	}

	// LinkedIn Link under Footer
	@FindBy(xpath = "//div[@class='social-links']//a[@href='https://www.linkedin.com/company/sisense' and @aria-label='LinkedIn (opens in a new tab)']")
	private WebElement linkedinLink;

	/**
	 * Clicks on the LinkedIn link under the footer section.
	 */
	public void clickOnLinkedinLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, linkedinLink);
		log("Click on LinkedIn link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToAnotherWindow(driver, 10);
	}

	/**
	 * Verifies the title of the LinkedIn page.
	 */
	public void verifyLinkedinPageTitleUnderFooter() {
		Common.checkTitleNull(driver);
		Assert.assertEquals("Sisense LinkedIn Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.LINKED_IN_TITLE);
		log("Sisense Footer LinkedIn page title matched successfully.");
	}

	// GitHub Link under Footer
	@FindBy(xpath = "//div[@class='social-links']//a[@href='https://github.com/sisense/' and @aria-label='Github (opens in a new tab)']")
	private WebElement githubLink;

	/**
	 * Clicks on the GitHub link under the footer section.
	 */
	public void clickOnGithubLinkUnderFooter() throws InterruptedException {
		Common.jsClick(driver, githubLink);
		log("Click on GitHub link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToAnotherWindow(driver, 10);
	}

	/**
	 * Verifies the title of the GitHub page.
	 */
	public void verifyGithubPageTitleUnderFooter() {
		Common.checkTitleNull(driver);
		Assert.assertEquals("Sisense GitHub Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.GITHUB_TITLE);
		log("Sisense Footer GitHub page title matched successfully.");
	}

	// Privacy Policy Link under Social Media section in Footer
	@FindBy(xpath = "//ul[@id='menu-legal-navigation-menu']//child::li//child::a[text()='Privacy policy']")
	private WebElement privacyPolicyLinkUnderSocialMedia;

	/**
	 * Clicks on the Privacy Policy link under the Social Media section in the
	 * Footer.
	 */
	public void clickOnPrivacyPolicyLinkUnderSocialMedia() throws InterruptedException {
		Common.jsClick(driver, privacyPolicyLinkUnderSocialMedia);
		log("Click on Privacy Policy link under Social Media section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the title of the Privacy Policy page opened from the Social Media
	 * section.
	 */
	public void verifyPrivacyPolicyPageTitleUnderSocialMedia() {
		Assert.assertEquals("Sisense Privacy Policy Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.PRIVACY_POLICY_LINK);
		log("Sisense Footer Privacy Policy page title matched successfully under Social Media section.");
	}

	// Legal Link under Social Media section in Footer
	@FindBy(xpath = "//ul[@id='menu-legal-navigation-menu']//child::li//child::a[text()='Legal']")
	private WebElement legalLinkUnderSocialMedia;

	/**
	 * Clicks on the Legal link under the Social Media section in the Footer.
	 */
	public void clickOnLegalLinkUnderSocialMedia() throws InterruptedException {
		Common.jsClick(driver, legalLinkUnderSocialMedia);
		log("Click on Legal link under Social Media section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the title of the Legal page opened from the Social Media section.
	 */
	public void verifyLegalPageTitleUnderSocialMedia() {
		Assert.assertEquals("Sisense Legal Page Title Not Matched", driver.getTitle(), FrameworkConstants.LEGAL_LINK);
		log("Sisense Footer Legal page title matched successfully under Social Media section.");
	}

	// Cookie Preferences Button (Floating button with cookie icon)
	@FindBy(xpath = "//a[@role='button']//child::img[@alt='Cookie Preferences']")
	private WebElement cookiePreferencesButton;

	/**
	 * Clicks on the Cookie Preferences button and switches to the iframe.
	 */
	public void clickOnCookiePreferencesButton() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, cookiePreferencesButton);
		Common.jsClick(driver, cookiePreferencesButton);
		log("Click on Cookie Preferences button.");
		Common.waitForPageToLoad(driver, 10);
		Common.waitForFrameAndSwitchToIt(driver, iframeElement, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	// TrustArc iframe for Cookie Preferences pop-up
	@FindBy(xpath = "//iframe[@title='TrustArc Cookie Consent Manager']")
	private WebElement iframeElement;

	// Cookie Preferences pop-up heading
	@FindBy(xpath = "//span[normalize-space()='Cookies and Related Technologies on This Site']")
	private WebElement cookiePreferencesPopUpHeading;

	/**
	 * Verifies that the Cookie Preferences pop-up is opened.
	 */
	public void verifyCookiePreferencesPopUp() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, cookiePreferencesPopUpHeading);
		Assert.assertEquals("Pop-up is not open", "Cookies and Related Technologies on This Site",
				cookiePreferencesPopUpHeading.getText());
		log("Cookie Preferences pop-up opened successfully.");
	}

	// Submit Preferences button
	@FindBy(xpath = "//a[normalize-space()='Submit Preferences']")
	private WebElement submitPreferencesButton;

	/**
	 * Clicks on the Submit Preferences button.
	 */
	public void clickOnSubmitPreferencesButton() throws InterruptedException {
		try {
			Common.waitForElementToBeVisible(driver, submitPreferencesButton);
			Common.scrollUpToElement(driver, submitPreferencesButton);
			Common.jsClick(driver, submitPreferencesButton);
			log("Click on Submit Preferences button.");
			Common.waitForPageToLoad(driver, 10);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, submitPreferencesButton);
			Common.scrollUpToElement(driver, submitPreferencesButton);
			Common.jsClick(driver, submitPreferencesButton);
			log("Click on Submit Preferences button.");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	// Accept All button
	@FindBy(xpath = "//a[normalize-space()='Accept All']")
	private WebElement acceptAllButton;

	/**
	 * Clicks on the Accept All button.
	 */
	public void clickOnAcceptAllButton() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, acceptAllButton);
		Common.scrollUpToElement(driver, acceptAllButton);
		try {
			Common.waitForElementToBeClickable(driver, acceptAllButton);
			Common.jsClick(driver, acceptAllButton);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, acceptAllButton);
			Common.scrollUpToElement(driver, acceptAllButton);
			Common.jsClick(driver, acceptAllButton);
		}
		log("Click on Accept All button.");
	}

	// Decline All button
	@FindBy(xpath = "//a[normalize-space()='Decline All']")
	private WebElement declineAllButton;

	/**
	 * Clicks on the Decline All button.
	 */
	public void clickOnDeclineAllButton() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, declineAllButton);
		Common.scrollUpToElement(driver, declineAllButton);
		try {
			Common.jsClick(driver, declineAllButton);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, declineAllButton);
			Common.scrollUpToElement(driver, declineAllButton);
			Common.jsClick(driver, declineAllButton);
		}
		log("Click on Decline All button.");
	}

	// Text shown after successful submission of cookie preferences
	@FindBy(xpath = "//p[contains(text(),'You have successfully updated your Cookie settings')]")
	private WebElement successfullyText;

	/**
	 * Verifies the success message after submitting cookie preferences.
	 */
	public void verifySettingsSubmittedText() {
		Common.waitForElementToBeVisible(driver, successfullyText);
		Assert.assertEquals("Settings not submitted", "You have successfully updated your Cookie settings.",
				successfullyText.getText());
		log("Cookie preferences submitted successfully.");
	}

}
